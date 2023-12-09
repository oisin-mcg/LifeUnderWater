/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifeunderwaterapp;

import java.util.ArrayList;

public class Pollution {
    private static class Donors {
        String name;
        String email;
        double amount;

        public Donors(String name, String email, double amount) {
            this.name = name;
            this.email = email;
            this.amount = amount;
        }
    }

    private ArrayList<Donors> donations;

    public Pollution() {
        donations = new ArrayList<>();
    }

    public void addDonation(String name, String email, double amount) {
        donations.add(new Donors(name, email, amount));
    }

}
