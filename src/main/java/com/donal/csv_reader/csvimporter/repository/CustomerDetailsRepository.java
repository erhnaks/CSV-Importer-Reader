package com.donal.csv_reader.csvimporter.repository;

import com.donal.csv_reader.csvimporter.model.CustomerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerDetailsRepository extends JpaRepository <CustomerDetail, Integer> {
    List<CustomerDetail> findByCustomerReference(String customerReference);
}