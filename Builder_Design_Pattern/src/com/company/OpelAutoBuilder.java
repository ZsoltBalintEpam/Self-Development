package com.company;

/**
 * @author Zsolt_Balint
 */
public class OpelAutoBuilder implements AutoBuilder {

    private Auto auto;

    OpelAutoBuilder(){
        this.auto = new Auto();
    }
    @Override
    public void createAutoBody() {
        auto.setAutoBody("Opel Body");
    }

    @Override
    public void createAutoEngine() {
        auto.setAutoEngine("Opel Engine");
    }

    @Override
    public void createAutoTier() {
        auto.setAutoTier("Opel Tier");
    }

    @Override
    public void createAutoInterior() {
        auto.setAutoInterior("Opel Interior");
    }

    public Auto getAuto(){
        return this.auto;
    }
}
