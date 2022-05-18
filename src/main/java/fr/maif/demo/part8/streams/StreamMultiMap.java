package fr.maif.demo.part8.streams;

import java.util.List;

public class StreamMultiMap {
  public static void main(String[] args) {
    record Employe(String name){}
    record Entreprise(String name, List<Employe> employes){}

    final List<Entreprise> entreprises = List.of(
        new Entreprise("entreprise-1", List.of(new Employe("foo"), new Employe("bar"), new Employe("baz"))),
        new Entreprise("entreprise-1", List.of(new Employe("daz"), new Employe("dow"))),
        new Entreprise("entreprise-1", List.of(new Employe("toto")))
    );

    entreprises.stream()
            .flatMap(entreprise ->
                entreprise.employes.stream()
                    .map(employe -> entreprise.name + " : " + employe.name)
            ).forEach(System.out::println);
    System.out.println("###############");

    entreprises.stream()
        .mapMulti((entreprise, consumer) -> {
          for(Employe employe: entreprise.employes) {
            consumer.accept(entreprise.name + " : " + employe.name);
          }
        }).forEach(System.out::println);
  }
}
