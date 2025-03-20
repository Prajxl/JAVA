class Parent {
  void display() {
      System.out.println("Display from Parent");
  }
}

class Child extends Parent {
  void display() {
      System.out.println("Display from Child");
  }

  void show() {
      super.display(); // Calls Parent's display()
  }
}

public class Main {
  public static void main(String[] args) {
      Child obj = new Child();
      obj.show();
  }
}
