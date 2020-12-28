class Dier{
    int age;
}

class Mammal extends Dier{
    String furColor;
    void liveBirth() {System.out.println("Baby baaren!"); }
}

class Human extends Mammal{
    String languageSpoken;
    void speak(){System.out.println("Praten"); }
}

class DierMamalHuman {
    public static void main(String[] args) {
        Human elvis=new Human();
        elvis.liveBirth();
        elvis.speak();
        elvis.languageSpoken="Dutch";
    }
}