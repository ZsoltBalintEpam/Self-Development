package com.company;

/**
 * @author Zsolt_Balint
 */
public class VWAutoBuilder implements AutoBuilder{

    private Auto auto;

    public VWAutoBuilder(){
        this.auto = new Auto();
    }
    @Override
    public void createAutoBody() {
        auto.setAutoBody("VW Body");
    }

    @Override
    public void createAutoEngine() {
        auto.setAutoEngine("VW Engine");
    }

    @Override
    public void createAutoTier() {
        auto.setAutoTier("VW Tier");
    }

    @Override
    public void createAutoInterior() {
        auto.setAutoInterior("VW Interior");
    }

    public Auto getAuto(){
        return this.auto;
    }
}
