// 位运算
public class BitOperator {
    public static void main(String[] args) {
        
        // 按位与 推导过程
        // 1. 2的原码 00000000 00000000 00000000 00000010
        //    2的补码 00000000 00000000 00000000 00000010
        // 2. 3的原码 00000000 00000000 00000000 00000011
        //    3的补码 00000000 00000000 00000000 00000011
        // 3. 按位&
        //    00000000 00000000 00000000 00000010
        //    00000000 00000000 00000000 00000011
        //    00000000 00000000 00000000 00000010 & 运算后的补码
        //    运算后的原码也是 00000000 00000000 00000000 00000010
        //    结果就是 2
        System.out.println(2 & 3);// 2

        // 按位取反 推导过程
        // 1. -2的原码 10000000 00000000 00000000 00000010
        // 2. -2的反码 11111111 11111111 11111111 11111101
        // 3. -2的补码 11111111 11111111 11111111 11111110
        // 4. ~-2操作  00000000 00000000 00000000 00000001
        // 5. 运算后的原码 00000000 00000000 00000000 00000001
        System.out.println(~-2);// 1

        // 按位取反 推导过程
        // 1. 2的原码 00000000 00000000 00000000 00000010
        //    2的补码 00000000 00000000 00000000 00000010
        // 2. ~2操作  11111111 11111111 11111111 11111101
        // 3. 运算后的反码 11111111 11111111 11111111 11111100
        // 4. 运算后的原码 10000000 00000000 00000000 00000011
        System.out.println(~2);// -3

        System.out.println(1 >> 2);// 1 / 2 = 0
        System.out.println(1 << 2);// 1 * 2 * 2 = 4
        System.out.println(4 << 3);// 4 * 2 * 2 * 2 = 32
        System.out.println(15 >> 2);// 15 / 2 / 2 = 3
    }
}
