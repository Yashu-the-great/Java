public class subtract {

    static int compare(String f, String s) {
        for(int i = 0;i<f.length();i+=1) {
            if(f.charAt(i) > s.charAt(i)) {
                return 1;
            }
            if(f.charAt(i) < s.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }

    static String sub(String first, String second) {
        String Result="";
        int a=0,b=0,c=0,base = 0;
        String v = "0123456789";
        while(first.length() != second.length()) {
            if(first.length() > second.length()) {
                second = "0" + second;
            }
            if(first.length() < second.length()) {
                first = "0" + first;
            }
        }
        int R = compare(first, second);

        if(R == -1) {
            String t = first;
            first= second;
            second = t;
        }

        for(int i =first.length()-1;i>=0 ;i+=1) {
            a = c + v.indexOf(first.charAt(i));
            b = v.indexOf(second.charAt(i));
            if(b>a) {
                c=((b>a) ? -1:0);
                a+=base;
            }
            Result = v.charAt(a-b)+Result;
        }
        return Result;
    }

    public static void main(String[] args) {
        System.out.println(sub("5","1"));
    }
    
}
