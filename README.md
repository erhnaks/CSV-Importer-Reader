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

## Screenshots
### Succesful Import PostMan Response
![Screenshot 2023-12-03 110242](https://github.com/erhnaks/CSV-Importer-Reader/assets/97620234/7591d496-33cf-44ab-bf96-7149a049a481)

### Not a CSV format Import PostMan Response
![Screenshot 2023-12-03 110001](https://github.com/erhnaks/CSV-Importer-Reader/assets/97620234/57a3ab55-c318-4794-80f4-2d3ffd56cfce)

### Fetch all information from the database and format it in JSON.
![Screenshot 2023-12-03 110326](https://github.com/erhnaks/CSV-Importer-Reader/assets/97620234/3b18c601-8b88-43b9-9a17-f73899824e77)

### Fetch information from the database by Customer Reference and format it in JSON.
![Screenshot 2023-12-03 104631](https://github.com/erhnaks/CSV-Importer-Reader/assets/97620234/81c69bfe-e135-4d83-9531-691619c1944b)

## Documentation
For more information on the project, architecture, and usage instructions, refer to the [Documentation](src/main/resources).

## Author
Erhan Aksu

## License
This project is licensed under the MIT LIcence - see the [LICENSE.md](LICENSE.md) file for details.