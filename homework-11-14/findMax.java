package fourArray;

/**
 * @author edz
 * 2020/11/14 9:47 上午
 * 　@version 1.0
 */
//定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
    //返回的话，两个数 可以 用  String   数组
public class findMax {
    public static void main(String [] args){
        int [] arr ={1,2,3,4,5,10,55,34,134,254563,1323,43242,232,};
        int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[0]<arr[i]){
                    arr[0]=arr[i];
                    count=i;
                }
            }
            System.out.println(arr[0]+"===> "+count);
    }

}
