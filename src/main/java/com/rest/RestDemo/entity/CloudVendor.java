package com.rest.RestDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Vendor_Info")
public class CloudVendor {
    @Id
    private String vendorId;
    private String vendorName;
    private String address;
    private String phoneNumber;
}
