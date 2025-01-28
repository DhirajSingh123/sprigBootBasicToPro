package com.sprigBootBasicToPro.Repository;

import com.sprigBootBasicToPro.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepoDB {

    @Autowired
    private MongoTemplate mongoTemplate;


    public void sevEmployee(Employee emp) {

        mongoTemplate.save(emp);


    }

    public Employee getEmloyee(String id) {

        return mongoTemplate.findById(id,Employee.class);
    }

    public List<Employee> getAllEmployee() {


        return mongoTemplate.findAll(Employee.class);
    }

    public List<Employee> getEmployeeWithpagination(int page, int limit) {

        Query query = new Query();
        query.skip(page);
        query.limit(limit);
        query.with(Sort.by(Sort.Direction.ASC,"salary"));
       return mongoTemplate.find(query,Employee.class);

    }
}
