package com.company;

import com.company.Auto.Auto;
import com.company.Auto.AutoAssembler;
import com.company.Auto.AutoBuilder;
import com.company.Auto.OpelAutoBuilder;
import com.company.Auto.VWAutoBuilder;
import com.company.House.Architecture;
import com.company.House.Building;
import com.company.House.Engineer;
import com.company.House.FamilyHouse;

public class Main {
/*
    - Builder Pattern:
        - create object form a bunch of other objects
        - when you want to build an object made up from other objects
        - when you want the creation of these parts to be independent of the main object
        - hide the creation of the parts from the client so both aren't dependent
        - the builder knows the specifics and nobody else does so only the Builder knows what to do, evry other class is just use that
        - has 2 parts (builder and director)
*/

    public static void main(String[] args) {
        AutoBuilder VWAutoBuilder = new VWAutoBuilder();
        AutoAssembler VWAutoAssembler = new AutoAssembler(VWAutoBuilder);
        VWAutoAssembler.assembleAuto();
        Auto firstVWAuto = VWAutoAssembler.getAuto();
        firstVWAuto.printAoutAutoData(firstVWAuto);

        System.out.println("------------------------");

        AutoBuilder opelAutoBuilder = new OpelAutoBuilder();
        AutoAssembler opelAutoAssembler = new AutoAssembler(opelAutoBuilder);
        opelAutoAssembler.assembleAuto();
        Auto firstOpelAuto = opelAutoAssembler.getAuto();
        firstOpelAuto.printAoutAutoData(firstOpelAuto);

        System.out.println("------------------------");

        Architecture familyHouseArchitect = new FamilyHouse();
        Engineer engineer = new Engineer(familyHouseArchitect);
        engineer.build();
        Building familyHouse = familyHouseArchitect.getBuilding();
        familyHouse.printBuildingData(familyHouse);
    }
}
