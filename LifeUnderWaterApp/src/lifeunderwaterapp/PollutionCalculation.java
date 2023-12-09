/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifeunderwaterapp;

/**
 *
 * @author CamaraAdmin
 */
public class PollutionCalculation {

    private double pollutionCalc;

 
    public PollutionCalculation(double pollutionFactor) {
        this.pollutionCalc = pollutionFactor;
    }

    public double calculatePollution(double minutes) {
        return minutes * this.pollutionCalc;
    }

    public void setPollutionFactor(double pollutionFactor) {
        this.pollutionCalc = pollutionFactor;
    }

    public double getPollutionFactor() {
        return this.pollutionCalc;
    }

}
