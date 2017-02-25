package br.com.projetocarro.entities;

import java.util.Date;

public class Vehicle
{

    private String brand;
    private String model;
    private Date fabricationDate;
    private Date changeDate;
    private String color;
    private String licensePlate;
    private String chassisNumber;
    private int numberOfDoors;
    private String fuel;
    private String renavam;
    private Double price;
    private Double downPayment;
    private Double financedAmount;
    private Double installmentValue;
    private int numberOfInstallments;
    private String financingBank;

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

    public Date getFabricationDate()
    {
        return fabricationDate;
    }

    public void setFabricationDate(Date fabricationDate)
    {
        this.fabricationDate = fabricationDate;
    }

    public Date getChangeDate()
    {
        return changeDate;
    }

    public void setChangeDate(Date changeDate)
    {
        this.changeDate = changeDate;
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

    public String getChassisNumber()
    {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber)
    {
        this.chassisNumber = chassisNumber;
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

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Double getDownPayment()
    {
        return downPayment;
    }

    public void setDownPayment(Double downPayment)
    {
        this.downPayment = downPayment;
    }

    public Double getFinancedAmount()
    {
        return financedAmount;
    }

    public void setFinancedAmount(Double financedAmount)
    {
        this.financedAmount = financedAmount;
    }

    public Double getInstallmentValue()
    {
        return installmentValue;
    }

    public void setInstallmentValue(Double installmentValue)
    {
        this.installmentValue = installmentValue;
    }

    public int getNumberOfInstallments()
    {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments)
    {
        this.numberOfInstallments = numberOfInstallments;
    }

    public String getFinancingBank()
    {
        return financingBank;
    }

    public void setFinancingBank(String financingBank)
    {
        this.financingBank = financingBank;
    }
}
