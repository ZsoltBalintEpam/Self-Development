package com.company.House;

/**
 * @author Zsolt_Balint
 */
public class Engineer {

    public Architecture buildingLaborer;

    public Engineer(Architecture buildingLaborer){
       this.buildingLaborer = buildingLaborer;
    }

    public Building getBuilding() {
        return this.buildingLaborer.getBuilding();
    }

    public void build(){
        buildingLaborer.createBuildingLevel();
        buildingLaborer.createBuildingSitting();
        buildingLaborer.createBuildingConstructor();
    }
}
