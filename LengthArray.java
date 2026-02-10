public class LengthArray{
    public static void main(String[] args) {
        int numArray[] = new int[6];
        numArray[0] = 6;
        numArray[1] = 2;
        for (int i = 0; i < numArray.length; i++) {
        System.out.print(numArray[i] + " ");
         }
         System.out.println("");
         
        Student s1 =new Student();
        s1.mark=50;
        s1.name = "Vinay";

        Student s2 = new Student();
        s2.mark = 70;
        s2.name = "Sanjay";

        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;
        System.out.println(s1.name + ":" + s1.mark);
        System.out.println(s2.name + ":" + s2.mark);

        //length of an array

        System.out.println("Length: " + students.length);

        //enahanced for-loop

        for(Student student : students){
            System.out.println(student.name + " : " + student.mark);

        }

        //find small and large numbers using array and for loop
        
        int[] numbers = {45, 22, 89, 16, 90, 33};
        int smallest = numbers[0];
        int largest = numbers[0];
         
         for(int num : numbers){
             if(num < smallest){
                 smallest = num;
             }
             if(num > largest){
                 largest = num;
             }
         }
         System.out.println("Smallest: " + smallest);
         System.out.println("Largest: " + largest);
        
    }
}
    

class Student{
    int mark;
    String name;
}


