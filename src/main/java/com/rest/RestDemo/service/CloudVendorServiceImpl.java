package com.rest.RestDemo.service;

import com.rest.RestDemo.entity.CloudVendor;
import com.rest.RestDemo.exception.CloudVendorNotFoundException;
import com.rest.RestDemo.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService{
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "successfully Done!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully Updated!";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Deleted Successfully:";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        if (cloudVendorRepository.findById(vendorId).isEmpty())
        throw new CloudVendorNotFoundException("Requested Cloud Vendor does not Existed.");
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllVendors() {
        return cloudVendorRepository.findAll();
    }
}
