package com.api.parking_control.repository;

import com.api.parking_control.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//NAO E NECESSARIO POIS QUANDO EXTENDE DO JPA , ELE JA VEM COM @REPOSITORY
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel , UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);

}
