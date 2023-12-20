package com.zzm.mhl.view;

import com.zzm.mhl.domain.Bill;
import com.zzm.mhl.domain.DiningTable;
import com.zzm.mhl.domain.Employee;
import com.zzm.mhl.domain.Menu;
import com.zzm.mhl.service.BillService;
import com.zzm.mhl.service.DiningTableService;
import com.zzm.mhl.service.EmployeeService;
import com.zzm.mhl.service.MenuService;
import com.zzm.mhl.utils.Utility;

import java.util.List;

/**
 * @author Mingson
 * @version 1.0
 * 这是主界面
 */
public class MHLView {

    // 控制是否退出菜单
    private boolean loop = true;
    private String key = "";// 接收用户的选择
    // 定义EmployeeService 属性
    private EmployeeService employeeService = new EmployeeService();
    // 定义 DiningTable 属性
    private DiningTableService diningTableService = new DiningTableService();
    // 定义 MenuService 属性
    private MenuService menuService = new MenuService();
    // 定义BillService属性
    private BillService billService = new BillService();

    public static void main(String[] args) {
        new MHLView().mainMenu();
    }

    // 查看账单
    public void listBill() {
        List<Bill> bills = billService.list();
        System.out.println("\n编号\t\t菜品号\t\t菜品量\t\t金额\t\t桌号\t\t日期\t\t\t\t\t\t\t状态");
        for (Bill bill : bills) {
            System.out.println(bill);
        }
        System.out.println("===============显示完毕===============");
    }

    // 点餐服务
    public void orderMenu() {
        System.out.println("===============点餐服务===============");
        System.out.println("请输入点餐的桌号(-1退出)：");
        int orderDiningTableId = Utility.readInt();
        if (orderDiningTableId == -1) {
            System.out.println("===============取消点餐===============");
            return;
        }
        System.out.println("请输入点餐的菜品号(-1退出)：");
        int orderMenuId = Utility.readInt();
        if (orderMenuId == -1) {
            System.out.println("===============取消点餐===============");
            return;
        }
        System.out.println("请输入点餐的莱品量(-1退出)：");
        int orderNums = Utility.readInt();
        if (orderNums == -1) {
            System.out.println("===============取消点餐===============");
            return;
        }

        // 验证餐桌号是否存在。
        DiningTable diningTable = diningTableService.getDiningTableById(orderDiningTableId);
        if (diningTable == null) {
            System.out.println("===============餐桌号不存在===============");
            return;
        }
        // 验证菜品编号
        Menu menu = menuService.getMenuById(orderMenuId);
        if (menu == null) {
            System.out.println("===============菜品号不存在===============");
            return;
        }

        // 点餐
        if (billService.orderMenu(orderMenuId, orderNums, orderDiningTableId)) {
            System.out.println("===============点餐成功===============");
        } else {
            System.out.println("===============点餐失败===============");
        }
    }

    // 显示所有菜品
    public void listMenu() {
        List<Menu> list = menuService.list();
        System.out.println("\n菜品编号\t\t菜品名\t\t类别\t\t价格");
        for (Menu menu : list) {
            System.out.println(menu);
        }
        System.out.println("===============显示完毕===============");
    }

    // 预定餐桌
    public void orderDiningTable() {
        System.out.println("===============预定餐桌===============");
        System.out.println("请选择要预定的餐桌编号(-1退出)：");
        int orderId = Utility.readInt();
        if (orderId == -1) {
            System.out.println("===============取消预定餐桌===============");
            return;
        }
        // 该方法得到的是 Y 或者 N
        char key = Utility.readConfirmSelection();
        if (key == 'Y') {// 要预定
            // 根据orderId 返回 对应DiningTable对象，如果为null，说明该对象不存在
            DiningTable diningTable = diningTableService.getDiningTableById(orderId);
            if (diningTable == null) {
                System.out.println("===============预定餐桌不存在===============");
                return;
            }
            // 判断该餐桌的状态是否“空”
            if (!("空".equals(diningTable.getState()))) {// 说明当前这个餐桌不是 “空” 状态
                System.out.println("===============该餐桌已经预定或者就餐中===============");
                return;
            }

            // 接收预定信息
            System.out.print("预定人的名字：");
            String orderName = Utility.readString(50);
            System.out.print("预定人的电话：");
            String orderTel = Utility.readString(50);

            // 更新餐桌状态
            if (diningTableService.orderDiningTable(orderId, orderName, orderTel)) {
                System.out.println("===============预定餐桌成功===============");
            } else {
                System.out.println("===============预定餐桌失败===============");
            }
        } else {
            System.out.println("===============取消预定餐桌===============");
        }
    }

    // 显示餐桌状态
    public void listDiningTable() {
        List<DiningTable> list = diningTableService.list();
        System.out.println("\n餐桌编号\t\t餐桌状态");
        for (DiningTable diningTable : list) {
            System.out.println(diningTable);
        }
        System.out.println("===============显示完毕===============");

    }

    // 显示主菜单
    public void mainMenu() {

        while (loop) {

            System.out.println("===============满汉楼===============");
            System.out.println("\t\t 1 登陆满汉楼");
            System.out.println("\t\t 2 退出满汉楼");
            System.out.println("请输入你的选择：");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    System.out.println("输入员工号：");
                    String empId = Utility.readString(50);
                    System.out.println("输入密 码：");
                    String pwd = Utility.readString(50);
                    Employee employee = employeeService.getEmployeeByIdAndPwd(empId, pwd);
                    if (employee != null) {// 说明存在该用户
                        System.out.println("===============登陆成功[" + employee.getName() + "]===============");
                        // 显示二级菜单，这里二级菜单是循环操作，所以做成while
                        while (loop) {
                            System.out.println("===============满汉楼(二级菜单)===============");
                            System.out.println("\t\t 1 显示餐桌状态");
                            System.out.println("\t\t 2 预定餐桌");
                            System.out.println("\t\t 3 显示所有菜品");
                            System.out.println("\t\t 4 点餐服务");
                            System.out.println("\t\t 5 查看账单");
                            System.out.println("\t\t 6 结账");
                            System.out.println("\t\t 9 退出满汉楼");
                            System.out.println("请输入你的选择：");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    listDiningTable();// 显示餐桌状态
                                    break;
                                case "2":
                                    orderDiningTable();// 预定餐桌
                                    break;
                                case "3":
                                    listMenu();// 显示所有菜品
                                    break;
                                case "4":
                                    orderMenu();// 点餐服务
                                    break;
                                case "5":
                                    listBill();// 查看账单
                                    break;
                                case "6":
                                    System.out.println("结账");
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("你输入有误，请重新输入.");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("===============登陆失败===============");
                    }
                    break;
                case "2":
                    loop = false;
                    break;
                default:
                    System.out.println("你输入有误，请重新输入.");
            }
        }

        System.out.println("你退出了满汉楼系统~");
    }
}
