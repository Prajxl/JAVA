class Parent {
  Parent() {
      System.out.println("Parent Constructor");
  }
}

class Child extends Parent {
  Child() {
      super(); // Calls Parent Constructor
      System.out.println("Child Constructor");
  }
}

public class Main {
  public static void main(String[] args) {
      Child obj = new Child();
  }
}
