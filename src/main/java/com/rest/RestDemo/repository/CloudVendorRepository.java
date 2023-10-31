package com.rest.RestDemo.repository;

import com.rest.RestDemo.entity.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
}
