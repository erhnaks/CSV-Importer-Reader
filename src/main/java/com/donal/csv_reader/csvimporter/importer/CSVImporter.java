package com.donal.csv_reader.csvimporter.importer;

import com.donal.csv_reader.csvimporter.model.CustomerDetail;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSVImporter {
    public static String TYPE = "text/csv";
    static String[] HEADERs = {"customer_reference", "customer_name", "address_line_one", "address_line_two", "town", "county", "country", "postcode"};


    public static boolean hasCSVFormat(MultipartFile file) {
        return TYPE.equals(file.getContentType());
    }

    public static List<CustomerDetail> customerDetails(InputStream in) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
             CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT
                     .withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<CustomerDetail> customers = new ArrayList<>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord record : csvRecords) {
                CustomerDetail customer = new CustomerDetail();
                customer.setCustomerReference(record.get("customer_reference"));
                customer.setCustomerName(record.get("customer_name"));
                customer.setAddressLineOne(record.get("address_line_one"));
                customer.setAddressLineTwo(record.get("address_line_two"));
                customer.setTown(record.get("town"));
                customer.setCounty(record.get("county"));
                customer.setCountry(record.get("country"));
                customer.setPostCode(record.get("postcode"));

                customers.add(customer);
            }
            return customers;
        } catch (IOException e) {
            throw new RuntimeException("Failed to convert CSV file: " + e.getMessage());
        }
    }

}