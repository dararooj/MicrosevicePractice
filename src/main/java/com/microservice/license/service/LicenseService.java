package com.microservice.license.service;

import com.microservice.license.Model.License;

import java.util.Locale;

public interface LicenseService {
     License getLicense(String licenseId, String organizationId);
     String createLicense(License license, String organizationId, Locale locale);
     String updateLicense(License license, String organizationId, Locale locale);
     String deleteLicense(String licenseId, String organizationId, Locale locale);
}
