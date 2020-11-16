package text_5;

import java.util.Scanner;

/**
 * @author edz
 * 2020/11/14 2:56 下午
 * 　@version 1.0
 */
//1.你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。
// 程序输出读到的数据中的奇数和偶数的个数。
//​输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
//​输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，
// 第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。
public class inPut {
    public static void main(String[] args){
        int kkey=0;
        int okey=0;
        String str="";
        Scanner scanner=new Scanner(System.in);
       while(true){
        System.out.println("请输入数值");
        int  number=scanner.nextInt();
           if (number==-1){
               System.out.println("程序结束");
               break;
           }
           if(number<0 || number>100000){
               System.err.println("您输入的数据已经超出范围，请重新输入");
               continue;//   退出本次循环，执行下一次
           }
           if(number%2==0){
               okey++;
           }else {
               kkey++;
           }

       }

        str=okey+" "+kkey;
       System.out.println(str);

    }

}
