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

    // Attention au null !
    int balanceBew = switch (op) {
      case DEPOT -> balance + 100;
      case RETRAIT -> balance - 100;
      case CLOTURE -> 0;
    };

    System.out.println(balanceBew);
  }
}

// TODO grouper les clauses
