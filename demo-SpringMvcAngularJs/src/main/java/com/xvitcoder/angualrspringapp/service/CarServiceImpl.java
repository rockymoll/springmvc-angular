package com.xvitcoder.angualrspringapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.xvitcoder.angualrspringapp.beans.Car;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/20/12
 * Time: 11:14 PM
 */
@Service("carService")
public class CarServiceImpl implements CarService {
    
    private static List<Car> carList = new ArrayList<Car>();
    private static Long id = 0L;

    public Car getCarById(Long id) {
    	
    	return findCarById(id);
    }

    private Car findCarById(Long id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                return car;
            }
        }

        return null;
    }

	public List<Car> getAllCars() {		
		return carList;
	}


	public void addCar(Car car) {
		car.setId(++ id);
		carList.add(car);		
		
	}

	public void deleteCarById(Long id) {
        Car found = findCarById(id);
        if (found != null) {
            carList.remove(found);
            id--;
        }
		
	}

	public void updateRailwayStation(Car car) {
        Car found = findCarById(car.getId());
        if (found != null) {
            carList.remove(found);
            carList.add(car);
        }
	}
	
    public void deleteAll() {
        carList.clear();
        id = 0L;
    }
}
