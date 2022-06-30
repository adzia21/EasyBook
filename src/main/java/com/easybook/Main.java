package com.easybook;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        VatValue vat23 = new VatValue("Vat 23%", 0.23f);
        ProductOrService monsterEnergyDrink = new ProductOrService("Monster Energy Drink Watermelon", false, true, new BigDecimal(5.50), vat23);
        BankAccountDetails santander = new BankAccountDetails("Santander UK plc. ", "Triton Square, Regent's Place", "3AN", "2", "12546", "London", "The United Kingdom", "54212563458741500001542");
        Entity bigBrain = new Entity("Big Brain Sp. z o. o.", "Somewhere Street", "000-002", "23", "8", "Warsaw", "458752618422", "Poland", "4568423011", true, false);
        Invoice invoiceForMonsters = new Invoice("FV/S/21/03/2022", new Date(2022 / 02 / 21), new Date(2022 / 03 / 22), new Date(2022/04/10), "Poznan", 1, 8, new BigDecimal(100.00), "There should be notes in the future.", "I won't write it.", Collections.singletonList(monsterEnergyDrink), TypesOfPayment.MIXED, santander);


    }
}
