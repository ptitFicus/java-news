package fr.maif.demo.part10.vars;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Vars {

  public static void main(String[] args) {

    final var foo = List.of(Map.of("foo", Optional.of(List.of(1, 2, 3))));

    //foo = 1;

    //var bar = null;
  }
}
