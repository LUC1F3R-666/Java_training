//securing the objects from the outerworld by making it private. And the values can be only called by the methods from the same class

public class EncapsulationSample {
    public static void main(String[] args) {
        InnerEncapsulationSample sample = new InnerEncapsulationSample();
        sample.setAge(10);
        sample.setName("Name");

        System.out.println(sample.getName() + ": " + sample.getAge());
        
    }
    
}

class InnerEncapsulationSample {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //by using this. will allow as to call the same object name inside the class, it wont go for any other values

    

    
}
