package com.spring.rest.dao;

import com.spring.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory; //ему нужна эта зависимость DI c помощью поля класса
    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("from Employee ", Employee.class);
        List<Employee>allEmp = query.getResultList();
        return allEmp;
    }
    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id){
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }
    @Override
    public void deleteEmployee(int id){
        Session session = sessionFactory.getCurrentSession();
        Query<Employee>query=session.createQuery("delete from Employee "+
                "where id=:employeeId");
        query.setParameter("employeeId",id);
        query.executeUpdate();
    }

}
