package com.donal.csv_reader.csvimporter.repository;

import com.donal.csv_reader.csvimporter.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerDetailsRepository extends JpaRepository <CustomerDetails, Integer> {

    List<CustomerDetails> findByCustomerReference(String customerReference);
}