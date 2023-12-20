package com.zzm.mhl.service;

import com.zzm.mhl.dao.EmployeeDAO;
import com.zzm.mhl.domain.Employee;

/**
 * @author Mingson
 * @version 1.0
 * 该类完成对employee 表的各种操作(通过调用EmployeeDAO 对象完成)
 */
public class EmployeeService {

    // 定义一个 EmployeeDAO 属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    // 方法，根据empId 和 pwd 返回一个Employee对象
    // 如果查询不到，就返回null
    public Employee getEmployeeByIdAndPwd(String empId, String pwd) {
        return employeeDAO.querySingle("select * from employee where empId=? and pwd=md5(?)", Employee.class, empId, pwd);
    }
}
