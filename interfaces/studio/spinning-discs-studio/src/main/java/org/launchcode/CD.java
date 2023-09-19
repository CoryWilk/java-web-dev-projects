package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }
    // TODO: Implement your custom interface.

    @Override
    public void reportData() {
        super.reportInfo();
    }

    @Override
    public void spinDisc() {
        super.spinDisc();
    }

    @Override
    public void storeData(String data) {
        super.storeData(data);
    }

    @Override
    public String readData() {
        return super.readData();
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
