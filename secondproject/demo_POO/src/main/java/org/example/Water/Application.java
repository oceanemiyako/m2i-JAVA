package org.example.Water;

public class Application {
    public static void main(String[] args) {

        WaterTank watertank1 = new WaterTank(50.0, 1000.0, 200.0);
        WaterTank watertank2 = new WaterTank(30.0, 500.0, 100.0);

        watertank1.fill(300.0);
        watertank1.empty(50.0);
        watertank2.fill(200.0);

        System.out.println( watertank1 + " Volume départ des WaterTank " + watertank1.getCurrentLevel());
        System.out.println( watertank2 + " Volume départ des WaterTank " + watertank2.getCurrentLevel());

        System.out.println( watertank1 + " volume total des WaterTank " + watertank1.getTotalWaterVolume());
        System.out.println( watertank2 + " volume total des WaterTank " + watertank2.getTotalWaterVolume());

    }
}


