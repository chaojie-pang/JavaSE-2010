## 目的
通过练习来掌握数据类型的选用，变量和数组的定义方式

## 练习
定义一个Practice.java文件，将以下代码写到文件的main方法中
1. 如果要保存7天时间的毫秒值（7x24x60x60x1000=604800000），需要使用什么数据类型，请选用合理的变量名称，将定义和初始化过程记录到答案中。

   ```java
   public class week {
       public static void main(String[] args){
           int num1;
           num1=604800000;
           System.out.println(num1);
       }
   }
   ```

   

2. 如果要保存30天时间的毫秒值(30x24x60x60x1000=2592000000)，需要使用什么数据类型，请选用合理的变量名称，将定义和初始化过程记录到答案中

   ```java
   public class month {
       public static void main(String [] args){
           long num2;
           num2=2592000000L;//  不加L会失败，表示将整数赋值给长整型
           System.out.println(num2);
   
   ```

   

3. 如何验证小数字面量默认值是double数据类型的，请将代码说明记录到答案中

   

   ```java
       float f1 = 89.8f;    //如果不加上f,系统会报错，说明是大变小 
           double d1 = 89.8; //double时，不用声明，因此默认 double
   ```

   

