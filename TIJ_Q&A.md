### net.mindview.util.Print.*;包不存在解决方法

估计学习java的买了Bruce Eckle《Thinking In Java 4th Edition》的新手们（我也是），估计多会遇到一个问题：
编译时import static net.mindview.util.Print.*;找不到相应的包，print方法就用不了。下面把我的操作方法贴出来，希望能帮到你。
     1、把书本的源代码下载到硬盘。
     2、创建文件夹，其路径为：D:/TIJ4/code。
     3、把书本源代码直接解压到步骤2的code文件夹中。（注意是直接解压）
     4、编辑环境变量CLASSPATH，在其值的末尾添加 ;.;..;D:/TIJ4/code;  
     5、完毕。
    
 
     参考及其书本代码下载：http://www.mindviewinc.com/TIJ4/CodeInstructions.html
 From http://blog.csdn.net/onionlee/article/details/5223606
