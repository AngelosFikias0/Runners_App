Run Management API
==================

This is a Spring Boot-based RESTful API to manage "Run" data, which can be used to store and retrieve information about various runs, such as the title, start and end times, miles covered, and location. The application uses an embedded **H2 database** for storage and provides full CRUD (Create, Read, Update, Delete) functionality.

Features
--------

-   Create, read, update, and delete runs.
-   Access and manage runs via a RESTful API.
-   Use H2 as an in-memory database or persist data to a file.
-   Access H2 console via the browser to view or manipulate database contents.

Prerequisites
-------------

To run this project, ensure you have the following installed:

-   **Java 17** or higher
-   **Apache Maven** 3.8.1 or higher

Getting Started
---------------

### Clone the Repository
`git clone https://github.com/your-username/run-management-api.git
cd run-management-api`

### Build and Run the Application

To build and run the application, use the following Maven commands:

`mvn clean install`
# Run the project
`mvn spring-boot:run`

Once the application starts, the REST API will be available at `http://localhost:8080`.

API Endpoints
-------------

You can interact with the API using tools like **Postman**, **curl**, or directly from the browser.

### Run Endpoints

#### Get All Runs

-   **Endpoint**: `GET /api/runs`
-   **Description**: Retrieves a list of all runs.

#### Get a Run by ID

-   **Endpoint**: `GET /api/runs/{id}`
-   **Description**: Retrieves the details of a specific run by its ID.

#### Create a New Run

-   **Endpoint**: `POST /api/runs`
-   **Description**: Creates a new run.
-   **Payload**:
- 
    `{
      "title": "Morning Run",
      "startedOn": "2024-05-01T06:00:00",
      "completedOn": "2024-05-01T08:00:00",
      "miles": 10,
      "location": "OUTDOOR"
    }`

#### Update a Run

-   **Endpoint**: `PUT /api/runs/{id}`
-   **Description**: Updates the details of a specific run.
-   **Payload**: Same as the POST request.

#### Delete a Run

-   **Endpoint**: `DELETE /api/runs/{id}`
-   **Description**: Deletes a specific run by its ID.

Database Access
---------------

### H2 Database Console

The application uses an embedded **H2 database**. You can access the H2 database console via the following URL:

-   **URL**: `http://localhost:8080/h2-console`

#### H2 Console Configuration

-   **JDBC URL**: `jdbc:h2:mem:testdb`
-   **Username**: `sa`
-   **Password**: *(leave blank)*

You can manage and view the database data from this web interface.

### Persisting Data to File

By default, the H2 database is in-memory, meaning that all data will be lost once the application is stopped. To persist the data, change the database URL in the `application.properties`:

`spring.datasource.url=jdbc:h2:file:./data/runnerzdb`

This will store the database in a file in the `./data/` directory.

License
-------

This project is licensed under the MIT License. See the LICENSE file for details.
