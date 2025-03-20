class Car {
    String brand;

    // Parameterized Constructor
    Car(String b) {
        brand = b;
    }

    // Copy Constructor
    Car(Car c) {
        brand = c.brand;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {
        Car obj1 = new Car("BMW"); // Original Object
        Car obj2 = new Car(obj1);  // Copying obj1 to obj2

        obj1.display();
        obj2.display();
    }
}

