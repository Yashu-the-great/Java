public class multiply {
    
    static String add(String first, String second) {
        String Result="";
        String v = "0123456789";
        while(first.length() != second.length()) {
            if(first.length() > second.length()) {
                second = "0" + second;
            }
            if(first.length() < second.length()) {
                first = "0" + first;
            }
        }
        first = "0" + first;
        second = "0" + second;
        int base = 10;
        int c = 0, m = 0;
        for(int i=first.length()-1;i>=0;i-=1) {
            m = c + v.indexOf(first.charAt(i)) + v.indexOf(second.charAt(i));
            Result = v.charAt(m % base) + Result;
            c = m/base;
        }
        return Result;
    }

    static String multiply(String n1,String n2) {
        if(n1.length() < n2.length()) {
            String t = n1;
            n1 = n2;
            n2 = t;
        }

        String R="";
        String t = "";
        int c = 0;
        for(int i = n2.length()-1; i>=0;i-=1) {
            for(int j=n1.length()-1;j>=0;j-=1) {
                int m = c + (int)(n1.charAt(j) - '0' ) * (int) (n2.charAt(i) - '0');
                c = m/10;
                t = m%10 + t;
            }
            for(int k = i;k>=i;k-=1) {
                t+="0";
            }
            R = add(R,t);
            t="";
        }
        int i =0;
        while(R.charAt(i) == '0') {
            R = R.substring(i+1);
        }
        return R;
    }


    public static void main(String[] args) {
        System.out.println(multiply("51423424","1293312"));
    }

}
