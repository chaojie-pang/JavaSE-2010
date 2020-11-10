package club.banyuan.demo.Practice;

/**
 * @author edz
 * 2020/11/9 8:02 下午
 * 　@version 1.0
 */
public class month {
    public static void main(String [] args){
        long num2;
        num2=2592000000L;//  不加L会失败，表示将整数赋值给长整型
        System.out.println(num2);



        float f1 = 89.8f;
        double d1 = 89.8;




        System.out.println((getType(1.8)));

    }
    public static String getType(Object o){
        //调用该方法返回变量类型   getClass()方法
        return o.getClass().toString();
    }
}
