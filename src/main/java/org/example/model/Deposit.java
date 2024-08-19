package org.example.model;

import org.example.exception.DurationException;
import org.example.exception.NumberException;

import javax.xml.datatype.Duration;
import java.math.BigDecimal;

public class Deposit {
    private String depositNumber;
    private BigDecimal amount;
    private int duration;

    public Deposit(String depositNumber, BigDecimal amount, int duration) {
        this.depositNumber = depositNumber;
        this.amount = amount;
        this.duration = duration;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public BigDecimal calculateInterest() throws DurationException, NumberException {
        BigDecimal interest = BigDecimal.ZERO;
        if(duration == 0){
            throw new DurationException("inalid duration");
        }else if (amount.compareTo(BigDecimal.ZERO) == 0) {
            throw new NumberException("invalid amount");
        }else {
            interest = amount.multiply(new BigDecimal(duration));
        }
        return interest;
    }
}
