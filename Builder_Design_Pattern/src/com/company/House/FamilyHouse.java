package com.company.House;

/**
 * @author Zsolt_Balint
 */
public class FamilyHouse implements Architecture {

    public Building building;

    public FamilyHouse(){
        this.building = new Building();
    }

    @Override
    public void createBuildingLevel() {
        building.setBuildingConstructor("Family House Constructor");
    }

    @Override
    public void createBuildingSitting() {
        building.setBuildingLevel("Level 2");
    }

    @Override
    public void createBuildingConstructor() {
        building.setBuildingSitting("Suburban area ");
    }

    @Override
    public Building getBuilding() {
        return this.building;
    }
}
