### Build-time image used to build spring boot app
FROM amazoncorretto:11 AS java-build

WORKDIR /app/

# Copy application and dependencies
COPY build/unpackedBootJar ./unpackedBootJar

### Run-time image using Google's hardened Distroless base image
FROM gcr.io/distroless/java:11

# Copy application and dependencies as separate layers
ARG DEPENDENCY=/app/unpackedBootJar
# Dependency layer
COPY --from=java-build ${DEPENDENCY}/BOOT-INF/lib /app/lib
# Application metadata layer
COPY --from=java-build ${DEPENDENCY}/META-INF /app/META-INF
# Application class layer
COPY --from=java-build ${DEPENDENCY}/BOOT-INF/classes /app

# Run Java with classpath definition
ENTRYPOINT ["java","-cp","app:app/lib/*","com.triplewill.skore.roundsbackend.RoundsBackendApplication"]
EXPOSE 8080