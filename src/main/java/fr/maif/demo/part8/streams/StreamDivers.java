package fr.maif.demo.part8.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDivers {
  public static void main(String[] args) {
    final List<String> strings = Stream.of("1", "2", "3").toList();
    System.out.println(strings);

    final List<String> listWithoutEmpty = List.of(
        Optional.of("1"),Optional.<String>empty(), Optional.of("3")
        ).stream().flatMap(Optional::stream).toList();

    System.out.println(listWithoutEmpty);

    Stream.iterate(0, i -> i < 10, i -> i + 1).forEach(System.out::println);

    // Autre méthodes "nouvelles" : takeWhile, dropWhile
  }
}
