package com.madhu.application.view;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.madhu.application.controller.EmployeeHandler;

public class EmployeeFrame extends Frame {
	private Label employeeIdLbl;
	private TextField employeeIdTxt;
	private Label employeeNameLbl;
	private TextField employeeNameTxt;
	private Checkbox maleOption;
	private Checkbox femaleOption;
	private Checkbox otherOption;
	private Label employeeGenderLbl;
	private Label employeePerkLbl;
	private Checkbox pfOption;
	private Checkbox graduityOption;
	private Checkbox mealcardOption;
	private Checkbox npsOption;
	private Checkbox mediclaimOption;
	private CheckboxGroup genderGroup;
	private Choice officeLocation;
	private Label locationLbl;
	private Label employeeAdressLbl;
	private TextArea empolyeeTextArea;
	private Label employeeSalaryLbl;
	private TextField employeeSalaryTxt;
	private Button saveButton;
	private Button searchButton;
	private Button updateButton;
	private Button deleteButton;
	private Button firstButton;
	private Button nextButton;
	private Button previousButton;
	private Button lastButton;

	public EmployeeFrame() {
		setBounds(50, 50, 700, 500);
		setTitle("Employee Information");
		setVisible(true);
		this.setLayout(null);

		genderGroup = new CheckboxGroup();

		employeeIdLbl = new Label("EmployeeId");
		employeeIdLbl.setBounds(20, 30, 120, 20);
		add(employeeIdLbl);

		employeeIdTxt = new TextField();
		employeeIdTxt.setBounds(160, 30, 120, 20);
		add(employeeIdTxt);

		employeeNameLbl = new Label("EmployeeName");
		employeeNameLbl.setBounds(20, 60, 120, 20);
		add(employeeNameLbl);

		employeeNameTxt = new TextField();
		employeeNameTxt.setBounds(160, 60, 120, 20);
		add(employeeNameTxt);

		employeeGenderLbl = new Label("Employee Gender");
		employeeGenderLbl.setBounds(20, 100, 130, 20);
		add(employeeGenderLbl);

		maleOption = new Checkbox("Male", true, genderGroup);
		maleOption.setBounds(160, 100, 50, 20);
		add(maleOption);

		femaleOption = new Checkbox("Female", false, genderGroup);
		femaleOption.setBounds(230, 100, 60, 20);
		add(femaleOption);

		otherOption = new Checkbox("Other", false, genderGroup);
		otherOption.setBounds(300, 100, 70, 20);
		add(otherOption);

		employeePerkLbl = new Label("Employee Perks");
		employeePerkLbl.setBounds(20, 140, 100, 20);
		add(employeePerkLbl);

		pfOption = new Checkbox("Pf");
		pfOption.setBounds(160, 140, 60, 20);
		add(pfOption);

		graduityOption = new Checkbox("Graduity");
		graduityOption.setBounds(230, 140, 70, 20);
		add(graduityOption);

		mealcardOption = new Checkbox("Meal Card");
		mealcardOption.setBounds(300, 140, 80, 20);
		add(mealcardOption);

		npsOption = new Checkbox("NPS");
		npsOption.setBounds(400, 140, 80, 20);
		add(npsOption);

		mediclaimOption = new Checkbox("Mediclaim");
		mediclaimOption.setBounds(490, 140, 80, 20);
		add(mediclaimOption);

		locationLbl = new Label("Employee office Location ");
		locationLbl.setBounds(20, 180, 150, 20);
		add(locationLbl);
		officeLocation = new Choice();
		officeLocation.setBounds(170, 180, 130, 20);
		officeLocation.add("");
		officeLocation.add("Hyderabad");
		officeLocation.add("Pune");
		officeLocation.add("Banglore");
		officeLocation.add("Hubli");
		add(officeLocation);
		
		employeeAdressLbl = new Label("Employee Address");
		employeeAdressLbl.setBounds(320, 180, 120, 20);
		add(employeeAdressLbl);
		
		empolyeeTextArea = new TextArea();
		empolyeeTextArea.setBounds(460, 180, 150, 100);
		add(empolyeeTextArea);

		employeeSalaryLbl = new Label("EmployeeSalary");
		employeeSalaryLbl.setBounds(20, 300, 100, 20);
		add(employeeSalaryLbl);
		
		employeeSalaryTxt = new TextField();
		employeeSalaryTxt.setBounds(160, 300, 150, 20);
		add(employeeSalaryTxt);

		saveButton = new Button("Save");
		saveButton.setBounds(160, 340, 80, 30);
		add(saveButton);
		saveButton.addActionListener(new EmployeeHandler(this));

		searchButton = new Button("Serach");
		searchButton.setBounds(260, 340, 80, 30);
		add(searchButton);
		searchButton.addActionListener(new EmployeeHandler(this));

		updateButton = new Button("Update");
		updateButton.setBounds(360, 340, 80, 30);
		add(updateButton);
		updateButton.addActionListener(new EmployeeHandler(this));

		deleteButton = new Button("Delete");
		deleteButton.setBounds(460, 340, 80, 30);
		add(deleteButton);
		deleteButton.addActionListener(new EmployeeHandler(this));

		firstButton = new Button("First");
		firstButton.setBounds(160, 380, 80, 30);
		add(firstButton);
		nextButton = new Button("Next");
		nextButton.setBounds(260, 380, 80, 30);
		add(nextButton);

		previousButton = new Button("Prev");
		previousButton.setBounds(360, 380, 80, 30);
		add(previousButton);

		lastButton = new Button("Last");
		lastButton.setBounds(460, 380, 80, 30);
		add(lastButton);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				EmployeeFrame ef = (EmployeeFrame) e.getSource();
				ef.dispose();
			}
		});
	}

	public Choice getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(Choice officeLocation) {
		this.officeLocation = officeLocation;
	}

	public Label getEmployeeIdLbl() {
		return employeeIdLbl;
	}

	public void setEmployeeIdLbl(Label employeeIdLbl) {
		this.employeeIdLbl = employeeIdLbl;
	}

	public TextField getEmployeeIdTxt() {
		return employeeIdTxt;
	}

	public void setEmployeeIdTxt(TextField employeeIdTxt) {
		this.employeeIdTxt = employeeIdTxt;
	}

	public Label getEmployeeNameLbl() {
		return employeeNameLbl;
	}

	public void setEmployeeNameLbl(Label employeeNameLbl) {
		this.employeeNameLbl = employeeNameLbl;
	}

	public TextField getEmployeeNameTxt() {
		return employeeNameTxt;
	}

	public void setEmployeeNameTxt(TextField employeeNameTxt) {
		this.employeeNameTxt = employeeNameTxt;
	}

	public Checkbox getMaleOption() {
		return maleOption;
	}

	public void setMaleOption(Checkbox maleOption) {
		this.maleOption = maleOption;
	}

	public Checkbox getFemaleOption() {
		return femaleOption;
	}

	public void setFemaleOption(Checkbox femaleOption) {
		this.femaleOption = femaleOption;
	}

	public Checkbox getOtherOption() {
		return otherOption;
	}

	public void setOtherOption(Checkbox otherOption) {
		this.otherOption = otherOption;
	}

	public Label getEmployeeGenderLbl() {
		return employeeGenderLbl;
	}

	public void setEmployeeGenderLbl(Label employeeGenderLbl) {
		this.employeeGenderLbl = employeeGenderLbl;
	}

	public Label getEmployeePerkLbl() {
		return employeePerkLbl;
	}

	public void setEmployeePerkLbl(Label employeePerkLbl) {
		this.employeePerkLbl = employeePerkLbl;
	}

	public Checkbox getPfOption() {
		return pfOption;
	}

	public void setPfOption(Checkbox pfOption) {
		this.pfOption = pfOption;
	}

	public Checkbox getGraduityOption() {
		return graduityOption;
	}

	public void setGraduityOption(Checkbox graduityOption) {
		this.graduityOption = graduityOption;
	}

	public Checkbox getMealcardOption() {
		return mealcardOption;
	}

	public void setMealcardOption(Checkbox mealcardOption) {
		this.mealcardOption = mealcardOption;
	}

	public Checkbox getNpsOption() {
		return npsOption;
	}

	public void setNpsOption(Checkbox npsOption) {
		this.npsOption = npsOption;
	}

	public Checkbox getMediclaimOption() {
		return mediclaimOption;
	}

	public void setMediclaimOption(Checkbox mediclaimOption) {
		this.mediclaimOption = mediclaimOption;
	}

	public CheckboxGroup getGenderGroup() {
		return genderGroup;
	}

	public void setGenderGroup(CheckboxGroup genderGroup) {
		this.genderGroup = genderGroup;
	}



	public Label getLocationLbl() {
		return locationLbl;
	}

	public void setLocationLbl(Label locationLbl) {
		this.locationLbl = locationLbl;
	}

	public Label getEmployeeAdressLbl() {
		return employeeAdressLbl;
	}

	public void setEmployeeAdressLbl(Label employeeAdressLbl) {
		this.employeeAdressLbl = employeeAdressLbl;
	}

	
	public TextArea getEmpolyeeTextArea() {
		return empolyeeTextArea;
	}

	public void setEmpolyeeTextArea(TextArea empolyeeTextArea) {
		this.empolyeeTextArea = empolyeeTextArea;
	}

	public Label getEmployeeSalaryLbl() {
		return employeeSalaryLbl;
	}

	public void setEmployeeSalaryLbl(Label employeeSalaryLbl) {
		this.employeeSalaryLbl = employeeSalaryLbl;
	}

	public TextField getEmployeeSalaryTxt() {
		return employeeSalaryTxt;
	}

	public void setEmployeeSalaryTxt(TextField employeeSalaryTxt) {
		this.employeeSalaryTxt = employeeSalaryTxt;
	}

	public Button getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(Button saveButton) {
		this.saveButton = saveButton;
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(Button searchButton) {
		this.searchButton = searchButton;
	}

	public Button getUpdateButton() {
		return updateButton;
	}

	public void setUpdateButton(Button updateButton) {
		this.updateButton = updateButton;
	}

	public Button getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton(Button deleteButton) {
		this.deleteButton = deleteButton;
	}

	public Button getFirstButton() {
		return firstButton;
	}

	public void setFirstButton(Button firstButton) {
		this.firstButton = firstButton;
	}

	public Button getNextButton() {
		return nextButton;
	}

	public void setNextButton(Button nextButton) {
		this.nextButton = nextButton;
	}

	public Button getPreviousButton() {
		return previousButton;
	}

	public void setPreviousButton(Button previousButton) {
		this.previousButton = previousButton;
	}

	public Button getLastButton() {
		return lastButton;
	}

	public void setLastButton(Button lastButton) {
		this.lastButton = lastButton;
	}

}
