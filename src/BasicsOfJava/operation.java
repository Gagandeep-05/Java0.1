package BasicsOfJava;

public class operation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
////        arithmetic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
////        ternary operator
        int min = (a < b)?a:b;
        System.out.println(min);

//        logical operator
        int num = 5;
        System.out.println(num < 5 && num <20);
        System.out.println(num <5 || num < 20);
        System.out.println(!(num < 5 && num <20));

//        relational operator
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

//        unary operator
        boolean c = true;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(!c);

//        assignment operator
        int o;
        System.out.println(b+=a);
        System.out.println(b-=a);
        System.out.println(o=a);
        System.out.println(b*=a);
        System.out.println(b/=a);
        System.out.println(b^=a);
        System.out.println(b%=a);

//        logical operator
        int h = 58;
        int j = 13;
        System.out.println(h&j);
        System.out.println(h|j);
        System.out.println(h^j);
        System.out.println(~h);

//        shift operator
        System.out.println(h << 2);
        System.out.println(h >> 2);


    }
}
