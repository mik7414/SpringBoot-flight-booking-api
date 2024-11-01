package com.springboot.utilities;

import com.springboot.exceptions.InsufficientAccountBalance;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> accountDetails = new HashMap<>();

    static {
        accountDetails.put("acc1", 12000.0);
        accountDetails.put("acc2", 10000.0);
        accountDetails.put("acc3", 5000.0);
        accountDetails.put("acc4", 8000.0);
    }

    public static boolean validateCreditLimit(String accNo, double totalFare) {

        if (totalFare > accountDetails.get(accNo)) {
            throw new InsufficientAccountBalance("Insufficient account balance...!!!");
        } else {
            return true;
        }

    }

}
