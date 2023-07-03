package com.sreeramtraders.repository;

import com.sreeramtraders.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    //derived method name Query
    List<Customer> findByEmail(String email);
}
