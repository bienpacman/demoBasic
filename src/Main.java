// Đảo ngược chuỗi
public class Main {

   // Cách 1 : Dùng for

//    public static void main(String[] args) {
//        String blogName = "Nice to meet you !!!";
//        System.out.println(blogName);
//        String reverse = "";
//        for (int i = blogName.length() - 1; i > 0; i--) {
//            reverse = reverse + blogName.charAt(i);
//        }
//        System.out.println("Chuỗi được đảo ngược : " + reverse);
//    }

    // Sử dụng đệ quy

//    public  String recursiveReverse(String orig) {
//        if (orig.length() == 1){
//            return orig;
//        }else
//            return  orig.charAt(orig.length()-1) + recursiveReverse(orig.substring(0,orig.length()-1) );
//    }
//    public static void main(String[] args) {
//
//        Main main =new Main();
//        String blogName = " Say oh year";
//        System.out.println("Chuỗi gốc : " + blogName);
//        System.out.println();
//        String reverse = main.recursiveReverse(blogName);
//        System.out.println("Chuỗi đảo : " + reverse);
//    }


    // Sử dụng StringBuffer

    public static void main(String[] args) {
        String str = "Your name ?";
        System.out.println("Chuỗi gốc : " + str);
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("Chuỗi đảo : " + stringBuffer.reverse());
    }
}