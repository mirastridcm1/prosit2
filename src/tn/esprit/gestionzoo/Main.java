package tn.esprit.gestionzoo;

public class Main {

    public static void main(String[] args ) {
        Animal lion = new Animal("family", "name", 5, false);
        Animal lion1 = new Animal("family", "name", 5, false);
        Animal lion2 = new Animal("family", "name", 5, false);
        Animal lion3 = new Animal("family", "name", 5, false);
        Animal lion4 = new Animal("family", "name", 5, false);
        Animal lion5 = new Animal("family", "name", 5, false);

        Animal[] a = new Animal[100];
        Zoo myZoo = new Zoo(a, "mvog-ada", "yde", 200);
        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion.toString());
    }

}
