package com.ram.restful.service;

import com.ram.restful.model.Employee;
import com.ram.restful.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 */
@Service
public class DefaultEmployeeService implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee entity) {
        return employeeRepository.save(entity);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
