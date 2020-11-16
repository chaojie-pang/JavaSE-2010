package text_5;

import java.util.Scanner;

/**
 * @author edz
 * 2020/11/14 3:31 下午
 * 　@version 1.0
 */
//2:数据加密问题
//​某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
//​在传递过程中需要加密，加密规则如下：
//​首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3
//​最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
//​然后，把加密后的结果在控制台打印出来
public class data_2 {
    public static void main(String[] args) {
        //输入数字并将它们倒序
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的密码");
        int number = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[8];
        int a = 0;
        while (number > 0) {
            int d = number % 10;
            arr[a] = d;
            sum = sum * 10 + d;
            number = number / 10;
            a++;
        }
        //System.out.println(sum);

        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println(" ");
        //每位数字加五，然后除10，用所得余数代替这个数字
        for (int i=0;i<8;i++){
        arr[i]=(arr[i]+5)%10;
        }
        for (int i:arr){
            System.out.print(i);
        }
        System.out.println(" ");
        //将第一位与最后一位交换
        int temp;
        temp=arr[0];
        arr[0]=arr[7];
        arr[7]=arr[0];
        for(int i:arr){
            System.out.print(i);
        }

    }
}
