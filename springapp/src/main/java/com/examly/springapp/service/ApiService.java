package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;

import java.util.List;

public interface ApiService {
    boolean addLaptop(Laptop laptop);
    Laptop getLaptopById(int laptopId);
    List<Laptop> getAllLaptops();
}
