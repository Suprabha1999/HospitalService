package com.mindtree.hospitaldetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hospitaldetails.entity.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
