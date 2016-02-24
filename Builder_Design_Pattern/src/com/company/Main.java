package com.company;

public class Main {

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

    }
}
