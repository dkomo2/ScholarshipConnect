# ScholarshipConnect

Search for Scholarships that apply to SUNY/CUNY Universities

##How To Run

###How to Run the Backend:

1. Make sure your machine has Oracle JDK 8, NodeJS, and NPM installed
2. To build the backend project, run `./gradlew build`
 * If you need to clean the backend project, run `./gradlew clean`
3. To run the backend project on your local machine:
 * Run the ScholarshipConnect-0.0.1.jar file in the build/libs subdirectory
4. If you have Docker installed:
 * Build a Docker image of the project with `docker build -t ScholarshipConnect_backend .`
 * Run your image with `docker run -p 3000:8080 ScholarshipConnect_backend`
 * This will have it run on port 3000 instead of 8080. Change the port number if you need to
 * Add a `-d` flag before `-p` to run it detached
5. Swagger Docs are located at `[dockerMachineIp or hostMachine]:[portnumber]/swagger-ui.html`
 * i.e. `localhost:8080/swagger-ui.html`

###How to Run the Frontend:
1. Make sure your machine has NodeJS and NPM installed
2. To install all node modules, go to the `website_files` directory and run `npm install`
 * If you need to clean the dependencies, just remove the `node_modules` folder
3. To run the frontend on your local machine, run `node server.js`
4. If you have Docker installed:
 * Build a Docker image of the project with `docker build -t ScholarshipConnect_frontend .`
 * Run your image with `docker run -p 80:5000 ScholarshipConnect_backend`
 * Change port number if you need to
 * Add a `-d` flag before `-p` to run it detached
5. You can connect to the Frontend at `[dockerMachineIp or localhost]:[chosenPortNumber or 5000]`
 * i.e. `localhost/` if its running on port 80

###Running with Docker-Compose:
1. Install Docker-Compose:
2. Do a gradle build on the backend in the same way as in the above "How to Run the Backend" section
3. Install the node modules for the frontend in the same away as the "How to Run the Frontend" section
4. Run `docker-compose up` or `docker-compose up -d` to run it detached
 * Backend will be on port 3000 instead of 8080, due to the docker-compose file
 * Frontend will be on port 80 instead of 5000, due to the docker-compose file
 * Change these port numbers if needed
5. If you change code, rebuild the project you changed, then run `docker-compose up --build` or `docker-compose up -d --build` to rebuild the respective docker image

##Frontend Features
Frontend is simple for now. Just executes a `GET /scholarships` call to the backend and displays the Scholarships in the backend.

Backend has much more functionality.

##Backend REST Calls

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
 * `mySchoolRank` a `SchoolRank` enum
 * `myGpa` a Double
 * `myIncome` a Double
 * `myLatitude` a Double
 * `myLongitude` a Double
 * `myDesiredRadiusInMiles` a Double
 * `mustBeInState` a Boolean
2. `GET /scholarships/{id}`
 * `id` a UUID String
 
##Backend Models

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
    "mustBeInState": false,
    "name": "Sample Scholarship",
    "scholarshipId": "123e4567-e89b-12d3-a456-426655440000"
  }
]
```
