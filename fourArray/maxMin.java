package fourArray;

/**
 * @author edz
 * 2020/11/14 1:59 下午
 * 　@version 1.0
 */
public class maxMin {
    public static void main(String[] args){

        int [] arr ={1,2,3,4,5,10,55,34,134,254563,1323,43242,232,};
        max(arr);
        min(arr);

    }

    public static void max (int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]<arr[i]){
                arr[0]=arr[i];
                count=i;
            }
        }
        System.out.println(arr[0]+"===> "+count);
    }

    public static void min (int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]>arr[i]){
                arr[0]=arr[i];
                count=i;
            }
        }
        System.out.println(arr[0]+"===> "+count);
    }

}
