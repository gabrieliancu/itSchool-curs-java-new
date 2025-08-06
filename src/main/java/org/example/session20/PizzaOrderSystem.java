package org.example.session20;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PizzaOrderSystem {
    public static void main(String[] args) {
        List<PizzaOrder> orders =List.of(
                new PizzaOrder("Margarita", List.of("branza"),30),
                new PizzaOrder("Pepperoni", List.of("carne", "ardei"),40),
                new PizzaOrder("Vegetarian", List.of("ciperci", "ardei", "masline"),50),
                new PizzaOrder("Margarita", List.of("ananas"),50)
        );
        System.out.println(orders);

        // filter and  for each
        orders.stream()
                .filter((o -> o.getPrice()>30))
                .forEach(o -> System.out.println(o.getName()));

List<String> messages=orders.stream()
        .map(o->"Pizza "+ o.getName()+ " costs "+ o.getPrice()+" and topings "+ String.join(", ",o.getTopping()))
        .filter(o-> o.contains("Margarita"))
        .collect(Collectors.toList());

messages.forEach(System.out::println);

orders.stream()
        .map(PizzaOrder::getName)
        .distinct()
        .sorted().forEach(System.out::println);

orders.stream()
        .flatMap(o->o.getTopping().stream())
        .distinct()
        .forEach(System.out::println);

int total= orders.stream()
        .map(PizzaOrder::getPrice)
        .reduce(0, Integer::sum);
        System.out.println("Total price is: "+total);

long nrOrders= orders.stream()
                .filter(o -> o.getTopping().contains("carne"))
                .count();
        System.out.println("Number of orders with meat is "+nrOrders);

boolean hasVegetarian= orders.stream()
        .anyMatch(o->!o.getTopping().contains("carne"));
        System.out.println("Has vegetarian pizza: "+hasVegetarian);

        orders.stream()
                .map(PizzaOrder::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Optional<PizzaOrder> optionaPizza =orders.stream()
                .filter(o->o.getPrice()>45)
                .findFirst();
        System.out.println("Optional "+ optionaPizza);

        Map<String,List<PizzaOrder>> groupByName=orders.stream()
                .collect(Collectors.groupingBy(PizzaOrder::getName));
        groupByName.forEach((name,list)-> System.out.println(name+" -> "+list.size()+" comenzi "));
        System.out.println(groupByName);

    }
}

class PizzaOrder{
    private String name;
    private List<String> topping;
    private int price;

    public PizzaOrder(String name,  List<String> topping, int price) {
        this.name = name;
        this.topping = topping;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public List<String> getTopping() {
        return topping;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "PizzaOrder{" +
                "name='" + name + '\'' +
                ", toppings=" + topping +
                ", price=" + price +
                '}';
    }
}