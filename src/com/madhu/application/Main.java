package com.madhu.application;

import java.util.ArrayList;

import com.madhu.application.dto.EmployeeDto;
import com.madhu.application.view.EmployeeFrame;

public class Main {
	
	public static ArrayList<EmployeeDto>employeeList=new ArrayList<EmployeeDto>();

	public static void main(String[] args) {
			
		new EmployeeFrame();
	}

}
