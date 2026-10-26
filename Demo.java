package sample;


class Animal {
    void sound() {
        System.out.println("Making a sound...");
    }
}


class Cat extends Animal {
    
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}

public class Demo {

	public static void main(String[] args) {
		
		 Cat myCat = new Cat();
	     myCat.sound();

	}

}

