package fr.maif.demo.part3.records;

abstract class Bar {}
interface Foo {}

record MyRecord(String attribut1, int attribut2) {
  boolean isOdd() {
    return attribut2 % 2 == 0;
  }
}


class Testing {
  public static void main(String[] args){
    final MyRecord foo = new MyRecord("foo", 2);
  }
}