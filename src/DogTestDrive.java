// Blz 73 chapter 4 uit "HeadFirst Java" boek

class DogTestDrive {

    public static class Dog {
        int size;
        String name;

        int bark(int numberOfBarks) {
            while (numberOfBarks>0) {
            if (size>60){
                System.out.println("Woof! Woof");
            }
            else if (size>14){
                System.out.println("Ruff! Ruff");
            }
            else {
                System.out.println("Yip! Yip!");
            }
            numberOfBarks = numberOfBarks -1;}
            return 77;
        }
    }
    public static void main(String[] args){
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;
        int theSecret = one.bark(2);
        System.out.println("Het geheim is: "+theSecret);
        two.bark(3);
        three.bark(1);
}
}
