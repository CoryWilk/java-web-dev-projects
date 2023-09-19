package org.launchcode;

public abstract class BaseDisc implements OpticalDisc{
    //Shared fields for both CD and DVD
    private String name;
    private double capacity;
    private String contents;
    private String discType;

    //Constructor for BaseDisc
    public BaseDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
    //Custom code to print info
    public void reportInfo() {
        System.out.println("Disc Name: " + name);
        System.out.println("Capacity: " + capacity + " MB");
        System.out.println("Contents: " + contents);
        System.out.println("Disc Type: " + discType);
    }

    @Override
    public void spinDisc(){

    }

    @Override
    public void storeData(String data) {

    }

    @Override
    public String readData() {
        return null;
    }
}
