package com.company.House;

/**
 * @author Zsolt_Balint
 */
public class Building implements Construction{

    public String level;
    public String buildingSitting;
    public String constructor;

    @Override
    public void setBuildingLevel(String level) {
        this.level = level;
    }

    @Override
    public void setBuildingSitting(String buildingSitting) {
        this.buildingSitting = buildingSitting;
    }

    @Override
    public void setBuildingConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getLevel() {
        return level;
    }

    public String getBuildingSitting() {
        return buildingSitting;
    }

    public String getConstructor() {
        return constructor;
    }


    public void printBuildingData(Building building){
        System.out.println("Building Built!");
        System.out.println("Building Level:" + building.getLevel());
        System.out.println("Building Sitting:" + building.getBuildingSitting());
        System.out.println("Building Constructor:" + building.getConstructor());

    }
}
