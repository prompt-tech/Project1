package com.example.demo;

//import com.example.demo.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import db.migration.*;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {

//		V20190802_init_create_table_insert a = new V20190802_init_create_table_insert();
//		a.migrate(Employee.Employee);

		SpringApplication.run(DemoApplication.class, args);
	}

}
