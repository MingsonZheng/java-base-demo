// 马踏棋盘
package com.zzm;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Mingson
 * @version 1.0
 */
public class HorseChessBoard {

    // 定义属性
    private static int X = 6;// 表示 col
    private static int Y = 6;// 表示 row
    private static int[][] chessBoard = new int[Y][X];// 棋盘
    private static boolean[] visited = new boolean[X * Y];// 记录某个位置是否走过
    private static boolean finished = false;// 记录马儿是否遍历完棋盘。

    public static void main(String[] args) {

        // 输出当前这个棋盘的情况
        for (int[] rows : chessBoard) {
            for (int step : rows) {// step 表示 该位置是马儿应该走的第几步
                System.out.print(step + "\t");
            }
            System.out.println();
        }
    }

    // 编写方法，可以获取当前位置，可以走的下一步的所有位置(Point表示 x,y)
    public static ArrayList<Point> next(Point curPoint) {

        // 创建一个ArrayList
        ArrayList<Point> ps = new ArrayList<>();

        // 创建一个Point对象(点/位置)，准备放入到 ps
        Point p1 = new Point();

        // 判断在 curPoint 是否可以走如下位置，如果可以走，就将该点(Point) 放入到ps
        /**
         *   6    7
         * 5        0
         *     马
         * 4        1
         *   3    2
         */

        // 判断是否可以走5位置
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));// 这里一定要new Point
        }
        // 判断是否可以走6位置
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));// 这里一定要new Point
        }
        // 判断是否可以走7位置
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));// 这里一定要new Point
        }
        // 判断是否可以走0位置
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));// 这里一定要new Point
        }
        // 判断是否可以走1位置
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));// 这里一定要new Point
        }
        // 判断是否可以走2位置
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));// 这里一定要new Point
        }
        // 判断是否可以走3位置
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));// 这里一定要new Point
        }
        // 判断是否可以走4位置
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));// 这里一定要new Point
        }

        return ps;
    }
}
