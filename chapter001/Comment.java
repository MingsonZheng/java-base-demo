//注释
//文档注释
/**
 * @author MingsonZheng
 * @version 1.0
 */
//生成文档
//javadoc -d d:\\temp -author -version Comment.java
//双击index.html查看文档
public class Comment {
    public static void main(String[] args) {
        
        //单行注释

        //多行注释
        /**
         * 示意 => 可读性很好
         * 下面代码完成 两个数相加
         */
        //定义变量
        int n1 = 10;
        int n2 = 30;
        //求和
        int sum = n1 + n2;
        //输出结果
        System.out.println("结果=" + sum);
    }
}