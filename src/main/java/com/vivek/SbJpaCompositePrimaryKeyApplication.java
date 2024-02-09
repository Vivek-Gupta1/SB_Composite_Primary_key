package com.vivek;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vivek.Pk.CompositeKey;
import com.vivek.Repo.EmpRepo;
import com.vivek.entity.Employee;

@SpringBootApplication
public class SbJpaCompositePrimaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbJpaCompositePrimaryKeyApplication.class, args);
		EmpRepo bean = run.getBean(EmpRepo.class);
//		 CompositeKey key = new CompositeKey();
//		 key.setId(101);
//		 key.setPrn(242323224);
//		 
//		 Employee emp  = new Employee();
//		 emp.setName("Vivek");
//		 emp.setStream("MCA");
//		 emp.setPk(key);
//		 bean.save(emp);
		
//		CompositeKey ky = new CompositeKey();
//		ky.setId(101);
//		ky.setPrn(242323224);
//        Optional<Employee> findById = bean.findById(ky);
//        if(findById.isPresent()) {
//        	System.out.println(findById.get());
//        }
		
		  List<Employee> list = bean.findByName("vivek");
		  for(Employee name:list) {
			  System.out.println(name);
		  }
        
        
}
}
