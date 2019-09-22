package practice;

import java.util.Scanner;

public class PyramidPrinting {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++){
            d(s.next(), s.nextInt(), s.nextInt());
        }
        s.close();
    }

    public static void d(String i, int h, int o){
        String s = p(i, h);
        int l = o ==1 ? 1 : (2 + (h -1) * 2) -1;
        int n = 0;
        boolean f = false;
        for(int r = 1; r <= h; r++){
            if(o == 1)
                s(h - r);
            else
                s(r -1);
            String c = "";
            c = s.substring(n, n + l);
            if(f)
                c = new StringBuilder(c).reverse().toString();
            n = n + l;
            System.out.println(c);
            l = o ==1? l+2:l-2;
            f = t(f);
        }
    }

    private static boolean t(boolean f) {
        return f? false: true;
    }

    public static void s(int n){
        for(int c = 0; c < n; c++){
            System.out.print(" ");
        }
    }

    public static String p(String s, int h){
        int m = (h*(2 + (h -1) *2))/2;
        String p = "";
        while(p.length() <= m){
            p +=  s;
        }
        p = p.substring(0,m);
        return p;
    }
}
