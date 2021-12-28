CREATE DATABASE skoredb;
GRANT ALL PRIVILEGES ON DATABASE skoredb TO postgres;

\connect skoredb;

CREATE ROLE rounds CREATEROLE LOGIN PASSWORD 'secret';
GRANT CONNECT ON DATABASE skoredb TO rounds;
GRANT rounds TO postgres;
CREATE SCHEMA rounds AUTHORIZATION rounds;
