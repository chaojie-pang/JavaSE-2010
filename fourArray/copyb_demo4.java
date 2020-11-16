package fourArray;

import java.util.Scanner;

/**
 * @author edz
 * 2020/11/14 10:48 上午
 * 　@version 1.0
 */
//输入10个整数存入数组，然后复制到b数组中输出
public class copyb_demo4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++) {
            System.out.println("请输入整数");
            int a=scanner.nextInt();
            arr[i]=a;
        }
        int [] newArr=arr;
        for(int i:newArr){
            System.out.print(i+"\t");
        }
    }

}
