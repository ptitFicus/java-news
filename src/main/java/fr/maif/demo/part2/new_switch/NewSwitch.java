package fr.maif.demo.part2.new_switch;

public class NewSwitch {

  public static void main(String[] args) {
    enum TypeOperation {DEPOT, RETRAIT, CLOTURE}

    TypeOperation op = TypeOperation.DEPOT;
    int balance = 1000;

    switch (op) {
      case DEPOT:
        balance = balance + 100;
        break;
      case RETRAIT:
        balance = balance - 100;
        break;
    }

    System.out.println(balance);
  }
}

// TODO grouper les clauses
