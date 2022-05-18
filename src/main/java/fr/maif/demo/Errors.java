package fr.maif.demo;

import java.util.List;

public class Errors {
  record Identite(String name){}
  record Employe(Identite identite){}
  record Structure(List<Employe> employes){}
  record Entreprise(String name, Structure structure){}

  public static void main(String[] args) {
    var entreprise = new Entreprise("my-company", new Structure(List.of(new Employe(null))));
    var entreprise2 = new Entreprise("my-company", null);

    System.out.println(entreprise.structure.employes.get(0).identite.name);
    //System.out.println(entreprise2.structure.employes.get(0).identite.name);
    //System.out.println(entreprise.structure.employes.get(1).identite.name);
  }
}
