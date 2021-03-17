# scooterscout_backend
tbz projekt M426
### 1. create postgres db with docker
docker run --name scooterscout -e POSTGRES_USER=scooter -e POSTGRES_PASSWORD=scout -e POSTGRES_DB=scooterscout -p 5432:5432 -d postgres

### 2. bootRun