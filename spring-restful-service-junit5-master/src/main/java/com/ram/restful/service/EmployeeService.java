package com.ram.restful.service;

import java.util.List;

import com.ram.restful.model.Employee;

/**
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 */
public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAll();
}
