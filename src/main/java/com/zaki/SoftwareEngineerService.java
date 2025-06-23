package com.zaki;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }
    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer getSoftwareEngineerById(int id){
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new RuntimeException("Software Engine not found"));
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer){
        softwareEngineerRepository.save(softwareEngineer);
    }
}
