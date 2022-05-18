package fr.maif.demo;

import java.util.List;
import java.util.Set;

public class PatternMatching {
  sealed interface Employe {
    record Manager(String name, Set<Employe> employes) implements Employe{}
    record Developer(String name) implements Employe{}
  }

  public static void main(String[] args) {
    final Employe root = new Employe.Manager(
        "manager1",
        Set.of(
            new Employe.Developer("dev1"),
            new Employe.Developer("dev2"),
            new Employe.Manager("manager2", Set.of(
                new Employe.Developer("dev3"),
                new Employe.Developer("dev4")
            ))
        ));

    System.out.println(countEmployes(root));
  }

  public static int countEmployes(Employe employe) {
    if(employe instanceof Employe.Manager manager) {
      return 1 + manager.employes.stream().mapToInt(PatternMatching::countEmployes).sum();
    } else {
      return 1;
    }
  }
}
