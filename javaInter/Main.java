package javaInter;
class SuperAcessParent {
  String name ="Prajwal"; 
}
class child extends SuperAcessParent{
  String name = "Nandan";
  void showNames(){
    System.out.println(name);
    System.out.println(super.name);
  }
}
public class Main {
  public static void main(String[] args) {
      child obj = new child();
      obj.showNames();
  }
}


