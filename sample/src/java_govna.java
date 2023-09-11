public class java_govna {
    
    public static char charExpression(int a) {
        char charValue = '\\';
        int ans = (int) charValue;
        ans += a;

        return (char) ans;
    }
    public static void main(String[] args){


        System.out.println(charExpression(32));

    }
}
    


