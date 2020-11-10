## 			练习

1. 抄写一份`Hello.java`放到当前路径下，编译运行`Hello.java`，请记录打开终端开始到程序运行期间所有输入的终端命令

   ```java
   touch Hello.java
   vi Hello.java
   javac Hello.java
   java Hello
   ```

   

2. 将编译生成的`Hello.class`文件删除，编辑`Hello.java`将`class`后面的名称修改为`test`，然后编译`Hello.java`文件
   * 生成的class文件名是什么

     > test.class  

   * 请尝试使用`java`运行编译后的文件，应该输入什么命令

     >  java test

3. 保持上一题的状态，编辑Hello.java将class后面的名称修改为Test，然后编译Hello.java
   * 是否生成新的class文件

     > 生成新的Test.class

   * 请尝试使用`java`运行编译后的文件，应该输入什么命令

     > java Test

   * 将`test.class` 重命名为`test1.class`后尝试运行，是否可以运行成功，如果不成功记录错误

     > 错误: 找不到或无法加载主类 test1
     >
     > 原因: java.lang.NoClassDefFoundError: akkkk (wrong name: test1)

   * 将`test.class` 重命名为`TEST.class`尝试运行，是否可以运行成功，如果不成功记录错误

     > 错误: 找不到或无法加载主类 TEST
     >
     > 原因: java.lang.NoClassDefFoundError: akkkk (wrong name: TEST)

4. 仿照`Hello.java`写一个`HelloWorld.java`, 其中class声明为`HelloWorld`，向屏幕输出`Hello World!`

   ```java
   class HelloWorld {
           public static void main(String[] args){
                   System.out.println("hello world!");
           }
   }
   
   ```

   