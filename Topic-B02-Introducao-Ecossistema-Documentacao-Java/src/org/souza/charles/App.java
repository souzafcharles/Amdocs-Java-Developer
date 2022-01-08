package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Daniel Hatanaka
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 4, 2022
 */

import org.souza.charles.base.Order;
import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        final Order order = new Order("code1234", new BigDecimal("101.00"));
        System.out.println(order);
    }
}
