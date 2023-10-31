package com.rest.RestDemo.controller;

import com.rest.RestDemo.entity.CloudVendor;
import com.rest.RestDemo.response.ResponseHandler;
import com.rest.RestDemo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendor(@PathVariable("vendorId") String vendorId){
        return ResponseHandler.responseBuilder("requested vendor details is given here",
                HttpStatus.OK,
         cloudVendorService.getCloudVendor(vendorId));
    }
    @GetMapping("/getAll")
    public List<CloudVendor>getAllCloudVendor(){
        return cloudVendorService.getAllVendors();
    }
    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully:";
    }
    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping("{vendorId}")
public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully.";
    }
}
