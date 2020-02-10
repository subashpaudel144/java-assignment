

interface Animal {
    public void animalSound(); 
    public void sleep(); 
  }
  
  class Dog implements Animal {
    public void animalSound() {
      
      System.out.println("The dog says: hou hou ");
    }
    public void sleep() {
    
      System.out.println("suiiiiiiii");
    }
  }
  
  class interface_in_java {
    public static void main(String[] args) {
      Dog mydog = new Dog(); 
      mydog.animalSound();
      mydog.sleep();
    }
  }
