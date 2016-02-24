package com.company;

/**
 * @author Zsolt_Balint
 */
public interface AutoBuilder {

    public void createAutoBody();
    public void createAutoEngine();
    public void createAutoTier();
    public void createAutoInterior();

    public Auto getAuto();
}
