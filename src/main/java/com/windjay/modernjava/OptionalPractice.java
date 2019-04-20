package com.windjay.modernjava;

import java.util.Optional;

public class OptionalPractice {
  public static void main(String[] args) {
    Order order = new Order();

    String coffeeToMake = Optional
            .ofNullable(order)
            .map(order::getCoffee)
            .orElse("Americano");
    System.out.println("만들 커피: " + coffeeToMake);

  }
}
