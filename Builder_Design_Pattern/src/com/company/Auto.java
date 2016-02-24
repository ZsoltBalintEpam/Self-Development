package com.company;

/**
 * @author Zsolt_Balint
 */
public class Auto implements AutoFactory {

    private String autoBody;
    private String autoEngine;
    private String autoTier;
    private String autoInterior;


    @Override
    public void setAutoBody(String body) {
        autoBody = body;
    }

    @Override
    public void setAutoEngine(String engine) {
        autoEngine = engine;
    }

    @Override
    public void setAutoTier(String tier) {
        autoTier = tier;
    }

    @Override
    public void setAutoInterior(String interior) {
        autoInterior = interior;
    }

    public String getAutoBody() {
        return autoBody;
    }

    public String getAutoEngine() {
        return autoEngine;
    }

    public String getAutoTier() {
        return autoTier;
    }

    public String getAutoInterior() {
        return autoInterior;
    }

    public void printAoutAutoData(Auto auto){
        System.out.println("Auto Built!");
        System.out.println("Auto Body:" + auto.getAutoBody());
        System.out.println("Auto Engine:" + auto.getAutoEngine());
        System.out.println("Auto Tyre:" + auto.getAutoTier());
        System.out.println("Auto Interior:" + auto.getAutoInterior());
    }


}
