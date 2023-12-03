package com.donal.csv_reader.csvimporter.controller;

import com.donal.csv_reader.csvimporter.importer.CSVImporter;
import com.donal.csv_reader.csvimporter.message.ResponseMessage;
import com.donal.csv_reader.csvimporter.model.CustomerDetail;
import com.donal.csv_reader.csvimporter.service.CSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import static com.donal.csv_reader.csvimporter.message.ResponseMessage.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin("http://localhost:8080")
@Controller
@RequestMapping("/api")
public class CSVController {

    @Autowired
    CSVService service;
    @PostMapping("/import")
    public ResponseEntity<ResponseMessage> importCSVFile(@RequestParam("file") MultipartFile file) {
        try {
            if (CSVImporter.hasCSVFormat(file)) {
                service.save(file);
                return ResponseEntity.status(HttpStatus.CREATED)
                        .body(new ResponseMessage(String.format(IMPORT_SUCCESS_MESSAGE, file.getOriginalFilename())));
            } else {
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(CSV_FORMAT_NOT_SUPPORTED));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseMessage(BAD_REQUEST_MESSAGE));
        }
    }

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerDetail>> getCustomer(@RequestParam(required = false) String customerReference) {

        try {
            List<CustomerDetail> customers = new ArrayList<CustomerDetail>();

            if (customerReference == null || customerReference.isEmpty()) {
                customers = new ArrayList<>(service.getAllCustomers());
            } else {
                customers = new ArrayList<>(service.getCustomerByReference(customerReference));
            }

            if (customers.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}