package com.gojavaonline3.dlenchuk.module04;

import java.io.IOException;

/**
 * Created by DLenchuk on 27.05.2016.
 *
 */
public class TemperatureConverter {

    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println("F -> C");
        System.out.println("-40F = " + FahrenheitToCelsius(-40) + "C");
        System.out.println("0F = " + FahrenheitToCelsius(0) + "C");
        System.out.println("40F = " + FahrenheitToCelsius(40) + "C");
        System.out.println();
        System.out.println("C -> F");
        System.out.println("-273C = " + CelsiusToFahrenheit(-273) + "F");
        System.out.println("-40C = " + CelsiusToFahrenheit(-40) + "F");
        System.out.println("0C = " + CelsiusToFahrenheit(10) + "F");
        System.out.println("40C = " + CelsiusToFahrenheit(40) + "F");
    }

    public static double FahrenheitToCelsius(int tFahrenheit) {
        return 5 * (tFahrenheit - 32) / 9;
    }

    public static double CelsiusToFahrenheit(int tCelsius) {
        return 9 * tCelsius / 5 - 32;
    }
}
