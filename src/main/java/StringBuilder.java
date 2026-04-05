public class StringBuilder {
    public static void main(String args[]) 
    {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Navin");
        sb.append(" Hello");
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(0, "Java ");
        System.out.println(sb);

        //String buffer and string builder are same but string buffer is thread safe and string builder is not thread safe.
        // String buffer is slower than string builder because of thread safety. 


    }
    
}
