package fourArray;

/**
 * @author edz
 * 2020/11/14 2:09 下午
 * 　@version 1.0
 */
// 有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
//0  1  2  3  4  5  6  7  8  9
//
//   随机30个数字
    ////    int  num=12;
////    int  time=0;
////    for (int i = 0; i <10; i++) {
////      int  number=(int)(Math.random()*30);
////      //System.out.println(">>>>"+number);
////      if(number==num){
////        time++;
////      }
public class demo_7 {

    public static void main(String[] args){


        //  建立一个数组包含三十个随机数
        int [] arr=new int[30];
        for(int i=0;i<30;i++){
            int number=(int)(Math.random()*10);
            arr[i]=number;

        }

        for (int d:arr){
            System.out.print(d+"\t");
        }
        System.out.println(" ");

        for(int i=0;i<10;i++){
            int time=0;
            for (int j=0;j<30;j++){
                if (i==arr[j]){
                    time++;
                }

            }
            System.out.println(i+"在数组中共出现"+time+"次");
        }
    }

}
//  改进 ：： 可以直接拿数值与下标比较。。。

