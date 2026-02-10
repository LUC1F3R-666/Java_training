public class ConstructorSample {
    public static void main(String[] args) {
        TestContruct test =new TestContruct();
        TestContruct test1 = new TestContruct();
        test.setAge(16);
        test.setName("Manish");
        
        System.out.println(test.getName() + ": "+ test.getAge());
        System.out.println(test1.getName() + ": "+test1.getAge());
    }
    
}
class TestContruct{

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

// constructor name should e same as the class. 

    public TestContruct() //default constructor
    {
    age=12;
    name= "Arun";
    }


    public TestContruct(int age, String name) //parameterized constructor
    {
        this.age = age;
        this.name = name;
    }
}