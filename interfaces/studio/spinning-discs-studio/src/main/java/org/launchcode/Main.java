package org.launchcode;

public class Main {
    public static void main(String[] args) {
        String newLine = System.lineSeparator();
        // TODO: Declare and initialize a CD and a DVD object.
        CD cdDisc = new CD("New CD", 700, "Music", "Cd-R");
        DVD dvdDisc = new DVD("New Movie", 4700, "Video", "DVD-R");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(cdDisc.getName());
        System.out.println(cdDisc.getCapacity());
        System.out.println(cdDisc.getContents());
        System.out.println(cdDisc.getDiscType());
        System.out.println(newLine);
        cdDisc.reportData();
    }
}