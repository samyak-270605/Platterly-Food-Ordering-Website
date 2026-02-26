package com.platterly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platterly.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
