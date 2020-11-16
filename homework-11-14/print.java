package fourArray;

/**
 * @author edz
 * 2020/11/14 9:34 上午
 * 　@version 1.0
 */
public class print {
    public static void main(String [] args){
        int [] arr ={5,4,3,2,1,};
        for (int i=0;i<arr.length ;i++){
            for (int j=0;j<arr.length-i;j++){
                System.out.print(arr[j]);
            }
            System.out.println("");
        }
    }

}
