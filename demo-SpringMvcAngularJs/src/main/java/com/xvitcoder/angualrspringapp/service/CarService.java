package com.xvitcoder.angualrspringapp.service;

import java.util.List;

import com.xvitcoder.angualrspringapp.beans.Car;

/**
 * Created with IntelliJ IDEA. User: xvitcoder Date: 12/20/12 Time: 11:12 PM
 */
public interface CarService {

	public Car getCarById(Long id);

	public List<Car> getAllCars();

	public void addCar(Car car);

	public void deleteCarById(Long id);

	public void updateRailwayStation(Car car);

	public void deleteAll();
}
