package fr.maif.demo;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Vars {

  public static void main(String[] args) {
    var trucVraimentComplique =
        List.of(Map.of("foo", Optional.of(List.of(1,2,3))));

    //trucVraimentComplique = 1;

    //var foo = null;
  }
}
