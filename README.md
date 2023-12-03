# **_CSV Importer Assignment_**

# Project Brief

# CSV to REST API Integration

## Contents
This Java console application reads customer data from a CSV file, converts it to JSON, and sends it to a REST API. The API stores data in a SQL database and It will provide filtered results based on customer reference if the parameter is present otherwise, it will return all the data in JSON format.

## Features
1. Read CSV file with customer details.
2. Convert CSV rows to JSON and send to REST API.
3. REST API stores data in SQL database.
4. Implement API endpoint for retrieving customer data by reference.

## Getting Started
1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Configure the application properties, including the REST API endpoint and database connection details.
4. Execute the script for creating the data table [Data Table Creation Script](src/main/resources/Customer_Details_Table).
5. Run the Java console application to read and send data.
6. A test file in CSV format has been generated for this purpose. [CSV Test File](src/main/resources/Dummy_Data).

## Usage
- Run the Java application to process the CSV file and interact with the REST API.
- Check the provided documentation for detailed instructions and API endpoints.

## Documentation
For more information on the project, architecture, and usage instructions, refer to the [Documentation](src/main/resources).

## Author
Erhan Aksu

## License
This project is licensed under the MIT LIcence - see the [LICENSE.md](LICENSE.md) file for details.