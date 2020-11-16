package fourArray;

import java.util.Scanner;

/**
 * @author edz
 * 2020/11/13 5:17 下午
 * 　@version 1.0
 */
//任意乘法表
public class multiply {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您所要制作的n*n乘法表");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+" "+"\t");
            }
            System.out.println("");     // 一个数的循环结束之后，用于换行
        }

    }
}
