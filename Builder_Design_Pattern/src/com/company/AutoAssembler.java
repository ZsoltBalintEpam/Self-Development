package com.company;

/**
 * @author Zsolt_Balint
 */
public class AutoAssembler {
    private AutoBuilder autoBuilder;

    public AutoAssembler(AutoBuilder autoBuilder) {
        this.autoBuilder = autoBuilder;
    }

    public Auto getAuto() {
        return this.autoBuilder.getAuto();
    }

    public void assembleAuto(){
        autoBuilder.createAutoBody();
        autoBuilder.createAutoEngine();
        autoBuilder.createAutoTier();
        autoBuilder.createAutoInterior();
    }
}
