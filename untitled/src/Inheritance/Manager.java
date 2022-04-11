package Inheritance;

class Manager {
    String names;
    int price = 3;
    Manager(String names) {
        this.names = names;
    }

    void values(String nemes){
        System.out.println("Hallo : " + nemes + " my neme is : " +  this.names);
    }
    int hasil(){
        return price;
    }

}
