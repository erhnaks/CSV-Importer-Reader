package com.donal.csv_reader.csvimporter.service;

import com.donal.csv_reader.csvimporter.importer.CSVImporter;
import com.donal.csv_reader.csvimporter.model.CustomerDetail;
import com.donal.csv_reader.csvimporter.repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CSVService {

    @Autowired
    private CustomerDetailsRepository repository;

    public void save(MultipartFile file) {
        try {
            List<CustomerDetail> customerDetails = CSVImporter.customerDetails(file.getInputStream());
            repository.saveAll(customerDetails);
        } catch (IOException e) {
            throw new RuntimeException("Failed to store data: " + e.getMessage());
        }
    }

    public List<CustomerDetail> getAllCustomers() {
        return repository.findAll();
    }

    public List<CustomerDetail> getCustomerByReference(String reference) {
        return repository.findByCustomerReference(reference);
    }
}