/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.aptech.Employee.repository;

import fpt.aptech.Employee.models.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Admin
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    
}
