package fr.maif.demo.part8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Teeing {

  enum Poste {MANAGER, DEVELOPPEUR, DATA_SCIENTIST}

  record Employe(String name, double salary, Poste poste){}

  public static Double ratioSalaire(Collection<Employe> employes) {
    return employes
        .stream()
        .map(Employe::salary)
        .collect(Collectors.teeing(
            Collectors.maxBy(Double::compare),
            Collectors.minBy(Double::compare),
            (maxEmp, minEmp) -> maxEmp.get() / minEmp.get()
        ));
  }

  public static Map<Poste, Set<Employe>> extractProductiveEmployes(Collection<Employe> employes) {
    return employes.stream()
        .collect(Collectors.teeing(
            Collectors.filtering(
                employe -> employe.poste == Poste.DEVELOPPEUR,
                Collectors.toSet()
            ),
            Collectors.filtering(
                employe -> employe.poste == Poste.DATA_SCIENTIST,
                Collectors.toSet()
            ),
            (devs, dataScientists) -> Map.of(
                Poste.DEVELOPPEUR, devs,
                Poste.DATA_SCIENTIST, dataScientists
            )
        ));
  }

  public static void main(String[] args) {
    var employes = Set.of(
            new Employe("foo", 2000, Poste.DEVELOPPEUR),
            new Employe("bar", 3000, Poste.DEVELOPPEUR),
            new Employe("baz", 4000, Poste.DATA_SCIENTIST),
            new Employe("bof", 5000, Poste.DATA_SCIENTIST),
            new Employe("zaz", 6000, Poste.MANAGER),
            new Employe("fas", 10000, Poste.MANAGER)
        );

    System.out.println(ratioSalaire(employes));
    System.out.println(extractProductiveEmployes(employes));
  }
}
