/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.ease.the.stockbroker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dk
 */
public class OrdersSummary {

    public static String balanceStatements(String lst) {
        // your code
        if (lst == null || lst.isEmpty()) {
            return "Buy: 0 Sell: 0";
        }
        double sumBuy = 0;
        double sumSell = 0;
        StringBuilder orders = new StringBuilder();
        StringBuilder badOrders = new StringBuilder();

        int badlyFormedNum = 0;
        for (String order : lst.split(",")) {
            order = order.trim();
            try {
                double sum = parseSimpleOrder(order);
                if (sum > 0) {
                    sumBuy += sum;
                } else {
                    sumSell += (sum * -1);
                }

            } catch (AssertionError e) {
                badOrders.append(e.getMessage()).append(" ;");
                badlyFormedNum++;

            }
        }
        orders.append(String.format("Buy: %d Sell: %d", Math.round(sumBuy), Math.round(sumSell)));
        if (badlyFormedNum > 0) {
            orders.append(String.format("; Badly formed %d: %s", badlyFormedNum, badOrders));
        }
        System.out.println(orders.toString());
        return orders.toString();
    }

    private static double parseSimpleOrder(String ordr) throws AssertionError {
        Pattern p = Pattern.compile("^(\\S+)\\s+(\\d+)\\s(\\d*\\.+\\d+)\\s([bB|sS])$");
        Matcher m = p.matcher(ordr);
        if (!m.matches()) {
            throw new AssertionError(ordr);
        }
        double quantity = Double.valueOf(m.group(2));
        double price = Double.valueOf(m.group(3));
        double orderSum = quantity * price;
        String status = String.valueOf(m.group(4)).toUpperCase();
        return ("B".equals(status) ? orderSum : orderSum * -1);
    }

}
