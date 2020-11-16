package fourArray;

import java.util.Scanner;

/**
 * @author edz
 * 2020/11/14 11:24 上午
 * 　@version 1.0
 */
//定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，
// 查找此整数，找到 输出下标，没找到给出提示。
public class demo_5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int [] arr=new int[10];//   提取输入的10个数并在屏幕上显示
        for(int i=0;i<arr.length;i++) {
            System.out.println("请输入整数");
            int a=scanner.nextInt();
            arr[i]=a;
        }
        for (int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println("");


        System.out.println("请输入要查找的数字");
        int b=scanner.nextInt();//   输入要查找的数字
        boolean bool=false;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==b){
                bool=true;
                System.out.println("arr["+i+"]"+"="+arr[i]);
            }
        }
        if(bool==false){
            System.out.println("对不起，该数组中没有您要查找的数");
        }
    }


}
