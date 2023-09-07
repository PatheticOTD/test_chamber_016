public class java_govna {
    

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        
        boolean arr[4] = {a,b,c,d};
        int c = 0;

        for (int i =0; i<4;i++){

            if (arr[i]) {c++};
        }
        if (c == 2){return true};
        else {return false};

    }

    public static void main(String[] args){
        System.out.println(booleanExpression(true, true, true, true));

    }
}
    


