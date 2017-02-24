# ScholarshipConnect

Search for Scholarships that apply to SUNY/CUNY Universities

##How to Run:

1. Make sure your machine has Oracle JDK 8 installed
2. To build the project, run `./gradlew build`
 * If you need to clean the project, run `./gradlew clean`
3. To run the project on your local machine:
 * Run the ScholarshipConnect-0.0.1.jar file in the build/libs subdirectory
4. If you have Docker installed:
 * Build a Docker image of the project with `docker build -t ScholarshipConnect .`
 * Run your image with `docker run -p 3000:8080 ScholarshipConnect`
 * This will have it run on port 3000 instead of 8080. Change it if you need to
 * Add a `-d` flag before `-p` to run it detached
5. If you have Docker-Compose installed:
 * Run `docker-compose up` or `docker-compose up -d` to run it detached
 * This will have it run on port 3000 instead of 8080, due to the docker-compose file. Change it if you need to.
6. Swagger Docs are located at `[hostmachine]:[portnumber]/swagger-ui.html`
 * i.e. `localhost:8080/swagger-ui.html`

##REST Calls

###Schools
1. `GET /schools` with the following query params
 * `latitude` a Double
 * `longitude` a Double
 * `radiusInMiles` a Double
2. `GET /schools/{id}`
 * `id` a UUID String

###Scholarships

1. `GET /scholarships`
 * `myDesiredAwardAmount` a Double representing the minimum amount of award a user is searching for
 * `myDesiredProgram` an `AcademicProgram` enum
 * `myGpa` a Double
 * `myIncome` a Double
 * `myLatitude` a Double
 * `myLongitude` a Double
 * `myDesiredRadiusInMiles` a Double
 * `mustBeInState` a Boolean
2. `GET /scholarships/{id}`
 * `id` a UUID String
 
##Models

###School

Example Value:

```
[
  {
    "latitude": 40.9257,
    "longitude": -73.1409,
    "name": "State University In a JSON",
    "schoolId": "123e4567-e89b-12d3-a456-426655440000"
  }
]
```

###Scholarship

Example Value:

```
[
  {
    "applicableAcademicPrograms": [
      "ACCOUNTING"
    ],
    "applicableSchoolRanks": [
      "INCOMING_FRESHMAN"
    ],
    "applicableSchools": [
      {
        "latitude": 40.9257,
        "longitude": -73.1409,
        "name": "State University In a JSON",
        "schoolId": "123e4567-e89b-12d3-a456-426655440000"
      }
    ],
    "awardAmount": 10000,
    "description": "Sample Description",
    "maximumIncomeRequirement": 80000,
    "minimumGpaRequirement": 3.5,
    "mustBeInstate": false,
    "name": "Sample Scholarship",
    "scholarshipId": "123e4567-e89b-12d3-a456-426655440000"
  }
]
```
