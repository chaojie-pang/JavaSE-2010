package club.banyuan.demo;

/**
 * @author edz
 * $DATE 2020/11/9 3:43 下午
 * 　@version 1.0
 */
public class Fristdemo {
// 驼峰命名

    public static void main (String [] args ) {
        int num ;    // 在内存中开辟一个（int）整型变量
        num=12;       //  对存储空间进行赋值
        char ch='男';  //[男][\0]会涉及到编码格式，
        double dou = 12.22d;  //小数默认类型
        float flo= 34.555f;
        byte by =12;
        char cx='E';
        String str="哟哟";

        boolean flag=true;



        System.out.println("by"+by);
        System.out.println("hahaha");
        System.out.println("12.34");
        System.out.println("\u3333");
    }
}
// 变量：内存中的一段存储空间
//