package com.donal.csv_reader.csvimporter.message;

public class ResponseMessage {
    private String message;

    public static String IMPORT_SUCCESS_MESSAGE = "The CSV file '%s' has been successfully uploaded to the server.";
    public static String CSV_FORMAT_NOT_SUPPORTED = "Sorry, only CSV files are supported!";
    public static String BAD_REQUEST_MESSAGE = "Sorry, the request could not be processed due to invalid or missing parameters. Please check your input and try again.";

    public ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}