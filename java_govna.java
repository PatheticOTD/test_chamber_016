public class java_govna {
    public static void all_data_types(){
        boolean bool = true; //                  1 bit
        byte b = 1; // -128 to 127;              1 byte
        short s = 1; // -32 768 to 32 767;       2 bytes
        int i = 1; // -2 billion to 2 billion;   4 bytes
        long l = 1; // -9 quintillion to 9 quit; 8 byres

        float f = 0.1f; // до 7 цифр после запятой;   4 bytes
        double d = 0.1; // до 15 цифр после запятой; 8 bytes

        char c = 'a'; // 2 bytes
        String S = "aaa"; 

        System.out.println(b+s+i+l+f+d);
        System.out.println(bool);
        System.out.println(S+c);



    }

    public static void main(String[] args){
        System.out.println("sosaka");
        all_data_types();
        //System.out.println(1);
        //System.out.println(1);


    }
}
    


