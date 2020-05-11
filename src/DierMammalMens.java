
public class Animal {
    int age;
    Animal(int age){
        this.age = age;
    }
}

class Mammal extends Animal{
    String furColor;
    constructor(age,furColor){
        super(age);
        this.furColor = furColor;
    }
    liveBirth() {
        System.out.println("Test');
    }
    public Mammal(int age,String, furColor) {
    }
}

class Human extends Mammal{
    String languageSpoken;
    constructor(age, furColor,languageSpoken){
        super(age,furColor);
        this.languageSpoken = languageSpoken;
    }
    speak(){
    return (age furColor languageSpoken);
    }
}

public class DierMammalMens {
    public static void main(String[] args) {
        Animal animal = new Animal(10);
        Mammal mammal = new Mammal(10);
        mammal.furColor = "brown";
        Human human = new Human(mammal.age=10,mammal.furColor="brown",Human.languageSpoken="NL");
    }
}