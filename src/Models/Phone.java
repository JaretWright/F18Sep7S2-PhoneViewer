package Models;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;

public class Phone {
    private String make, model, os, osVersion, processor, colour;
    private double price, resolution, screenSize, batteryLife;
    private Image phoneImage;

    public Phone(String make, String model, String os, String osVersion, String processor, String colour, double price, double resolution, double screenSize, double batteryLife, Image phoneImage) {
        setMake(make);
        setModel(model);
        setOs(os);
        setOsVersion(osVersion);
        setProcessor(processor);
        setColour(colour);
        setPrice(price);
        setResolution(resolution);
        setScreenSize(screenSize);
        setBatteryLife(batteryLife);
        setPhoneImage(phoneImage);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        ArrayList<String> validManufacutures = new ArrayList<>();
        validManufacutures.add("Apple");
        validManufacutures.add("Samsung");
        validManufacutures.add("Sony");
        validManufacutures.add("Google");
        validManufacutures.add("Nokia");
        validManufacutures.add("Blackberry");
        validManufacutures.add("HTC");

        if (validManufacutures.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("Invalid make");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty() && model.length() <= 20)
            this.model = model;
        else
            throw new IllegalArgumentException("model name cannot" +
                    "be empty and must be less than 20 characters");

    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        ArrayList<String> validOS = new ArrayList<>();
        ArrayList<String> validOS2 =
                (ArrayList<String>)Arrays.asList("iOS","Android","Blackberry");

        validOS.add("Android");
        validOS.add("Blackberry");
        validOS.add("Windows Phone");

        if (validOS.contains(os))
            this.os = os;
        else
            throw new IllegalArgumentException("Invalid OS");
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public Image getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(Image phoneImage) {
        this.phoneImage = phoneImage;
    }
}
