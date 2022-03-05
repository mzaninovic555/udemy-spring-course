package hr.springframework.services;

import hr.springframework.api.v1.model.VendorDTO;
import hr.springframework.api.v1.model.VendorListDTO;

public interface VendorService {
    VendorListDTO getAllVendors();

    VendorDTO getVendorById(Long id);

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}
