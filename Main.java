package org.example;

import com.google.gson.Gson;
public class Main {
    public static Comp getCompData(Comp company) {
        company.setCompName("Accolite");
        company.setempname("Syed Adnan Moin S");
        company.setempID(6898);
        return company;
    }
    public static void main(String[] args) {
        Comp company = new Comp();
        company = getCompData(company);
        System.out.println("The JSON representation of Object company is ");
        System.out.println(new Gson().toJson(company));

    }
}