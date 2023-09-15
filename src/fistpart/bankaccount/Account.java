package fistpart.bankaccount;

import java.math.BigDecimal;

public class Account {
    
    private Long id;
    private BigDecimal balance;
    
    public Account() {
    }

    public Account(Long id, Double balance) {
        this.id = id;
        setBalance(balance);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance.doubleValue();
    }

    public void setBalance(Double balance) {
        try {
            BigDecimal value = new BigDecimal(String.format("%.2f", balance));
            BigDecimal zero = new BigDecimal("0.0");

            if (value.compareTo(zero) >= 0) {
                this.balance = value;
            } else {
                throw new IllegalArgumentException("Enter valid values");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Unexpected error");
        }
        // catch (RuntimeException e) {
        //     e.printStackTrace();
        // }
    }

    public void credit(Double creditValue) {
        try {
            BigDecimal value = new BigDecimal(String.format("%.2f", creditValue));
            BigDecimal zero = new BigDecimal("0.0");
            
            if (value.compareTo(zero) > 0) {
                balance = balance.add(value);
            } else {
                throw new IllegalArgumentException("Enter valid values");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Unexpected error");
        }
        // catch (RuntimeException e) {
        //     e.printStackTrace();
        // }
    }

    public void debit(Double debitValue) {
        try {
            BigDecimal value = new BigDecimal(String.format("%.2f", debitValue));
            BigDecimal zero = new BigDecimal("0.0");
            
            if (value.compareTo(zero) > 0 && value.compareTo(balance) <= 0) {
                balance = balance.subtract(value);
            } else {
                throw new IllegalArgumentException("No balance");
            }
            
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Unexpected error");
        }
        // catch (RuntimeException e) {
        //     e.printStackTrace();
        // }
    }

    @Override
    public String toString() {
        return String.format(
            "{%n" +
            "   id: %s,%n" +
            "   balance: %s%n" +
            "}%n",
            id, balance
        );
    }

}