package com.vivek.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.Pk.CompositeKey;
import com.vivek.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, CompositeKey> {
   public List<Employee>findByName(String name);
	

	

}
