package tn.esprit.gestionzoo;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo (Animal[] animals, String name, String city, int nbrCages) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " +name);
        System.out.println("Nom de la ville du zoo : " +city);
        System.out.println("Nombre de cage du zoo : " +nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo : " + name + " nom de la ville du zoo : " + city + " nombre de cage du zoo : " + nbrCages;
    }


}