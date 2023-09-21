import java.io.PrintStream;

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

    static class Empl{
        String name;
        String job_name;
        String email;
        String phone;
        double salary;
        int age;
        public Empl(String _name, String _job_name, String _email, String _phone, double _salary, int _age){
            name = _name;
            job_name = _job_name;
            email = _email;
            phone = _phone;
            salary = _salary;
            age = _age;

        }
        
        public void info(){
            System.out.println("name:"+ name +"\njob_name: "+ job_name +"\nemail: "+email+"\nnumber: "+phone+"\nsalary: "+salary+"\nage:"+ age+"\n");
        }

    }

    public static void main(String[] args){

        Empl[] dude = new Empl[4];


        dude[0] = new Empl("Petrov Petr", "Designer", "petpetr@mailbox.com", "891998765", 35000, 28);
        dude[1] = new Empl("Sidorov Sidor", "Programmer", "sidsid@mailbox.com", "890544332", 40000, 302);
        dude[2] = new Empl("Smirnov Sergey", "Manager", "smsmir@mailbox.com", "897712345", 42000, 42);
        dude[3] = new Empl("Kuznetsov Kirill", "Accountant", "kirkuz@mailbox.com", "896633221", 38000, 31);
        for(int i = 0; i<4; i++){
            if(dude[i].age >= 40){
                dude[i].info();
            }
        }


    }
}
    