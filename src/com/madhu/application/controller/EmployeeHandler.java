package com.madhu.application.controller;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.madhu.application.dto.EmployeeDto;
import com.madhu.application.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {

	EmployeeFrame ef;

	public EmployeeHandler(EmployeeFrame employeeFrame) {
		ef = employeeFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand().toLowerCase();
		EmployeeDto dto = getEmployeeData(ef);
		switch (action) {
		case "save":
//			saveorUpdate(dto);
			break;
		case "update":
//			saveorUpdate(dto);
			break;
			
		case "search":
			break;
			
		case "delete":
		    break;
			
		}
	}

//	public void saveorUpdate(EmployeeDto employeeDto) {
//
//	}

//	public void getEmployeeData(EmployeeFrame ef) {
//		int empId = Integer.parseInt(ef.getEmployeeIdTxt().getText());
//		String employeeName=ef.getEmployeeNameTxt().getText();
//		Checkbox selectedCheckBox=ef.getGenderGroup().getSelectedCheckbox();
//		String gender = selectedCheckBox.getLabel();
//		boolean pf=ef.getPfOption().getState();
//		boolean graduity=ef.getGraduityOption().getState();
//		boolean mealcard= ef.getMealcardOption().getState();
//		boolean nps=ef.getNpsOption().getState();
//		boolean mediclaim=ef.getMediclaimOption().getState();
//	    String officeLocation=ef.getOfficeLocation().getSelectedItem();
//		
//		System.out.println(empId+"-"+employeeName+"-"+gender+"-pf"+pf+"-mealcard"+mealcard+"-nps"+nps+"-mediclaim"+mediclaim+"-office-"+officeLocation);
	
	public EmployeeDto getEmployeeData(EmployeeFrame ef) {

		EmployeeDto employeeDto = new EmployeeDto();

		employeeDto.setEmployeeId(Integer.parseInt(ef.getEmployeeIdTxt().getText()));
		employeeDto.setEmployeeName(ef.getEmployeeNameTxt().getText());
		employeeDto.setGender(ef.getGenderGroup().getSelectedCheckbox().getLabel());
		employeeDto.setPf(ef.getPfOption().getState());
		employeeDto.setGraduity(ef.getGraduityOption().getState());
		employeeDto.setMealcard(ef.getMealcardOption().getState());
		employeeDto.setNps(ef.getNpsOption().getState());
		employeeDto.setMediclaim(ef.getMediclaimOption().getState());
		employeeDto.setOfficeLocation(ef.getOfficeLocation().getSelectedItem());
		employeeDto.setAddress(ef.getEmpolyeeTextArea().getText());
		employeeDto.setSalary(Integer.parseInt(ef.getEmployeeSalaryTxt().getText()));

		System.out.println(employeeDto);
		return employeeDto;
	}

}
