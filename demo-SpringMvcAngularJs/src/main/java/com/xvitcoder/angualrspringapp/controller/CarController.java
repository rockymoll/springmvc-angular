package com.xvitcoder.angualrspringapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xvitcoder.angualrspringapp.beans.Car;
import com.xvitcoder.angualrspringapp.service.CarService;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/21/12
 * Time: 12:23 AM
 */
@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/carlist.json")
    public @ResponseBody List<Car> getCarList() {
        return carService.getAllCars();
    }

    @RequestMapping(value = "/addCar", method = RequestMethod.POST)
    public @ResponseBody void addCar(@RequestBody Car car) {
    	System.out.println(car.getFichier());
        carService.addCar(car);
    }

    @RequestMapping(value = "/removeCar/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void removeCar(@PathVariable("id") Long id) {
        carService.deleteCarById(id);
    }

    @RequestMapping(value = "/removeAllCars", method = RequestMethod.DELETE)
    public @ResponseBody void removeAllCars() {
        carService.deleteAll();
    }

    @RequestMapping("/layout")
    public String getCarPartialPage() {
        return "cars/layout";
    }
}
