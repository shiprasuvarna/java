
//package javaapplication1;
//
//
//public class break_continue {
//    public static void main(String[] args) {
//        for(int i=1; i<=10; i++)
//        {
//            if(i==5)
//            {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("End of program");
//    }
//}


public class break_continue{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i==5)
            {
                continue;
        }
            System.out.println(i);
    }
        System.out.println("End of program");
}