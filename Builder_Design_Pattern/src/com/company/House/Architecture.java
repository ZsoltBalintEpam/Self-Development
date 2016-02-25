package com.company.House;

/**
 * @author Zsolt_Balint
 */
public interface Architecture {
    public void createBuildingLevel();
    public void createBuildingSitting();
    public void createBuildingConstructor();

    Building getBuilding();
}
