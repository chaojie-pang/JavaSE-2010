package fourArray;

import java.util.Scanner;

/**
 * @author edz
 * 2020/11/14 11:02 上午
 * 　@version 1.0
 */
//声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分
public class demo5 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int [] arr=new int[8];
        for(int i=0;i<arr.length;i++) {
            System.out.println("请输入整数");
            int a=scanner.nextInt();
            arr[i]=a;
        }
        for (int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println("");

        int a = sum(arr);
        double b=((double)(a)/arr.length) ;
        System.out.println("总分是"+a+"   "+"平均分是"+b);

        int c =max(arr);
        System.out.println("最高分"+c);

        int d =min(arr);
        System.out.println("最低分"+d);
    }

    public static int sum (int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static int max (int [] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[0]<arr[i]){
                arr[0]=arr[i];
            }
        }
        return arr[0];
    }
    public static int min (int [] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[0]>arr[i]){
                arr[0]=arr[i];
            }
        }
        return arr[0];
    }

}
