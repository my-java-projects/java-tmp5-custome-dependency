package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exception.DurationException;
import org.example.exception.NumberException;
import org.example.model.Deposit;


import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        createDeposit();
    }

    public static void createDeposit() {
        Deposit deposit = new Deposit("125845898496", BigDecimal.ZERO, 12);
        try {
            System.out.println(deposit.calculateInterest());
        } catch (DurationException | NumberException e) {

            logger.error("Exceptions happen!", e);
        }
    }
}