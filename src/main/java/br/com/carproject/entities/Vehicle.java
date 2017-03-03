package br.com.carproject.entities;

import java.util.Date;

public class Vehicle
{

    private String brand;
    private String model;
    private String fabricationYear;
    private String modelYear;
    private String color;
    private String licensePlate;
    private String vehicleIdentificationNumber;
    private int numberOfDoors;
    private String fuel;
    private String renavam;
    private Double fipePrice;
    private Double salePrice;
    private Date registrationDate;
    private Date changeDate;

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getFabricationYear()
    {
        return fabricationYear;
    }

    public void setFabricationYear(String fabricationYear)
    {
        this.fabricationYear = fabricationYear;
    }

    public String getModelYear()
    {
        return modelYear;
    }

    public void setModelYear(String modelYear)
    {
        this.modelYear = modelYear;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }

    public String getVehicleIdentificationNumber()
    {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber)
    {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }

    public String getFuel()
    {
        return fuel;
    }

    public void setFuel(String fuel)
    {
        this.fuel = fuel;
    }

    public String getRenavam()
    {
        return renavam;
    }

    public void setRenavam(String renavam)
    {
        this.renavam = renavam;
    }

    public Double getfipePrice()
    {
        return fipePrice;
    }

    public void setfipePrice(Double fipePrice)
    {
        this.fipePrice = fipePrice;
    }

    public Double getSalePrice()
    {
        return salePrice;
    }

    public void setSalePrice(Double salePrice)
    {
        this.salePrice = salePrice;
    }

    public Date getRegistrationDate()
    {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate)
    {
        this.registrationDate = registrationDate;
    }

    public Date getChangeDate()
    {
        return changeDate;
    }

    public void setChangeDate(Date changeDate)
    {
        this.changeDate = changeDate;
    }
}
