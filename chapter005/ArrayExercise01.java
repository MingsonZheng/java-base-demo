// 数组练习
public class ArrayExercise01 {
    public static void main(String[] args) {
        
        /*
        创建一个char类型的26个元素的数组，分别 放置'A'-'Z'
        使用for循环访问所有元素并打印出来。
        提示 :char类型数据运算 A'+1 ->B

        思路分析
        1. 定义一个 数组 char[] chars = new char[26]
        2. 因为'A'+ 1 =B 类推，所以使用for来赋值
        3. 使用for循环访问所有元素
         */
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)('A' + i);
        }

        System.out.println("===chars数组===");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + " ");
        }
    }
}
