package project;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.*;
public class Gui implements Serializable{
	private static final long serialVersionUID = 1L;
	private static int patientPointer = 0;
	private static int staffPointer = 0;
	private static int recordsNumber = 10000;
	private static Patient[] patients = new Patient[recordsNumber];
	private static Staff[] personel = new Staff[recordsNumber];
	private static Hospital hosp = new Hospital();
	private static Room roommie = new Room();
	private static HospitalFloor hospFloor = new HospitalFloor();
	private static Pharmacy pharma = new Pharmacy();
	private static Parking_lot parky = new Parking_lot();
	private static Queue que = new Queue();
	private static Equipment eq = new Equipment();
	private static BookOfComplaints book = new BookOfComplaints();
	private static Financial_Accounts finances = new Financial_Accounts();
	private static JFrame frame;
	private static JPanel panel;
	private static JTextField userText;
	private static JLabel fail;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel saveBackupConfirmationLabel;
	private static JLabel saveBackupButtonLabel;
	private static JLabel roomColorLabel;
	private static JLabel roomTypeLabel;
	private static JLabel hospitalCheckLabel;
	private static JLabel hospitalCheckLabel_2;
	private static JLabel giveEquipmentLabel_2;
	private static JLabel giveEquipmentLabel;
	private static JLabel getEquipmentLabel;
	private static JLabel setPulseMeasurersConfirmLabel;
	private static JLabel setAnestheticsConfirmLabel;
	private static JLabel setPlungersConfirmLabel;
	private static JLabel setLaptopsConfirmLabel;
	private static JLabel setScalpelsConfirmLabel;
	private static JLabel setProfessionLabel;
	private static JLabel userLabel;
	private static JLabel passwordLabel;
	private static JLabel setPatientNameLabel;
	private static JLabel setStaffNameLabel;
	private static JLabel setPatientSurnameLabel;
	private static JLabel setStaffSurnameLabel;
	private static JLabel setDebtLabel;
	private static JLabel setPatientBirthLabel;
	private static JLabel setStaffBirthLabel;
	private static JLabel setMainClinicLabel;
	private static JLabel setInjuryLabel;
	private static JLabel patientCreationLabel;
	private static JLabel patientInfoLabel;
	private static JLabel getPatientInfoLabel;
	private static JLabel setSalaryLabel;
	private static JLabel staffCreationLabel;
	private static JLabel setOccupiedFloorLabel;
	private static JLabel getStaffInfoLabel;
	private static JLabel staffInfoLabel;
	private static JLabel setEquipmentLabel;
	private static JLabel staffInfoEqLabel;
	private static JLabel setCurrentBalanceLabel;
	private static JLabel setBankLabel;
	private static JLabel financeCreationLabel;
	private static JLabel setPatientDebtLabel;
	private static JLabel financeDebtLabel;
	private static JLabel financeInfoLabel;
	private static JLabel getFinanceInfoLabel;
	private static JLabel saveButtonLabel;
	private static JLabel loadButtonLabel;
	private static JLabel setPlungersLabel;
	private static JLabel setLaptopsLabel;
	private static JLabel setScalpelsLabel;
	private static JLabel setAnestheticsLabel;
	private static JLabel setPulseMeasurersLabel;
	private static JLabel getEquipmentLabel_2;
	private static JLabel hospitalWidthLabel;
	private static JLabel hospitalHeightLabel;
	private static JLabel hospitalLengthLabel;
	private static JLabel hospitalFloorLabel;
	private static JLabel hospitalCreateLabel;
	private static JLabel roomCreateLabel;
	private static JLabel roomCheckLabel;
	private static JLabel roomCheckLabel_2;
	private static JLabel pharmacySellLabel;
	private static JLabel pharmacySellLabel_2;
	private static JTextField setBackupText;
	private static JTextField pharmacyAmmountText;
	private static JTextField pharmacyIdText;
	private static JTextField roomTypeText;
	private static JTextField roomColorText;
	private static JTextField hospitalFloorText;
	private static JTextField hospitalWidthText;
	private static JTextField hospitalHeightText;
	private static JTextField hospitalLengthText;
	private static JTextField giveEquipmentText;
	private static JTextField setAnestheticsText;
	private static JTextField setScalpelsText;
	private static JTextField setLaptopsText;
	private static JTextField setPlungersText;
	private static JTextField setPatientDebtText;
	private static JTextField setBankText;
	private static JTextField setCurrentBalanceText;
	private static JTextField setEquipmentText;
	private static JTextField getStaffInfoText;
	private static JTextField setOccupiedFloorText;
	private static JTextField setSalaryText;
	private static JTextField setProfessionText;
	private static JTextField getPatientInfoText;
	private static JTextField setPatientNameText;
	private static JTextField setStaffNameText;
	private static JTextField setPatientSurnameText;
	private static JTextField setStaffSurnameText;
	private static JTextField setDebtText;
	private static JTextField setStaffBirthText;
	private static JTextField setPatientBirthText;
	private static JTextField setMainClinicText;
	private static JTextField setInjuryText;
	private static JTextField setPulseMeasurersText;
	private static JButton roomCreateButton;
	private static JButton hospitalCheckButton;
	private static JButton hospitalCreateButton;
	private static JButton giveAnestheticButton;
	private static JButton givePlungerButton;
	private static JButton getEquipmentButton;
	private static JButton setPlungersButton;
	private static JButton setScalpelsButton;
	private static JButton setAnestheticsButton;
	private static JButton setLaptopsButton;
	private static JButton setPulseMeasurersButton;
	private static JButton financeInfoButton;
	private static JButton staffInfoButton;
	private static JButton patientCreationButton;
	private static JButton staffCreationButton;
	private static JButton saveButton;
	private static JButton loadButton;
	private static JButton staffButton;
	private static JButton patientButton;
	private static JButton HospitalButton;
	private static JButton roomButton;
	private static JButton floorButton;
	private static JButton parkingButton;
	private static JButton queueButton;
	private static JButton pharmacyButton;
	private static JButton financeButton;
	private static JButton equipmentButton;
	private static JButton bookButton;
	private static JButton backupButton;
	private static JButton patientInfoButton;
	private static JButton financeCreationButton;
	private static JButton financeDebtButton;
	private static JButton givePulseMeasurerButton;
	private static JButton giveScalpelButton;
	private static JButton giveLaptopButton;
	private static JButton roomCheckButton;
	private static JButton pharmacySellButton;
	private static JLabel floorTypeLabel;
	private static JTextField floorTypeText;
	private static JLabel floorSoundLabel;
	private static JTextField floorSoundText;
	private static JButton floorCreateButton;
	private static JLabel floorCheckLabel;
	private static JButton floorCheckButton;
	private static JLabel floorCheckLabel_2;
	private static JLabel floorCreateLabel;
	private static JLabel parkingSlotsLabel;
	private static JTextField parkingSlotsText;
	private static JLabel parkingDisabledSlotsLabel;
	private static JTextField parkingDisabledSlotsText;
	private static JButton parkingCreateButton;
	private static JLabel parkingCheckLabel;
	private static JButton parkingCheckButton;
	private static JLabel parkingCheckLabel_2;
	private static JLabel parkingCreateLabel;
	private static JLabel queueTimeLabel;
	private static JTextField queueTimeText;
	private static JLabel queueMoodLabel;
	private static JTextField queueMoodText;
	private static JButton queueCreateButton;
	private static JLabel queueCheckLabel;
	private static JButton queueCheckButton;
	private static JLabel queueCheckLabel_2;
	private static JLabel queueCreateLabel;
	private static JLabel bookComplaintsLabel;
	private static JTextField bookComplaintsText;
	private static JLabel bookPraisesLabel;
	private static JTextField bookPraisesText;
	private static JButton bookCreateButton;
	private static JLabel bookCheckLabel;
	private static JButton bookCheckButton;
	private static JLabel bookCheckLabel_2;
	private static JLabel bookCreateLabel;
	private static JLabel pharmacyDrugsLabel;
	private static JTextField pharmacyDrugsText;
	private static JLabel pharmacyPriceLabel;
	private static JTextField pharmacyPriceText;
	private static JButton pharmacyCreateButton;
	private static JLabel pharmacyCheckLabel;
	private static JButton pharmacyCheckButton;
	private static JLabel pharmacyCheckLabel_2;
	private static JLabel pharmacyCreateLabel;
	
	//Login GUI
	public Gui() {
		frame = new JFrame("Login");
		panel = new JPanel();
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		userLabel= new JLabel("User");
		userLabel.setBounds(140, 100, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField();
		userText.setBounds(210, 100, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(140, 140, 80, 25);
		panel.add(passwordLabel);
		passwordText = new JPasswordField();
		passwordText.setBounds(210, 140, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(210, 185, 80, 30);
		//Using not strictly the action event interface - this approach feels more like javascript
		//and allows me to effortlessly create many different actions for each of the buttons with
		//just a simple lambda function feature, quite useful in swing
		button.addActionListener(e -> check());
		panel.add(button);
		
		fail = new JLabel("");
		fail.setBounds(160, 220, 200, 25);
		
		panel.add(fail);
		
		frame.setVisible(true);
	}
	
	//Main menu GUI
	public Gui(int k) {
		frame = new JFrame("Main menu");
		panel = new JPanel();
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
		saveButton = new JButton("Save current database");
		saveButton.setBounds(600, 700, 175, 30);
		saveButton.addActionListener(e -> {
			try {
				save();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		});
		panel.add(saveButton);
		
		saveButtonLabel = new JLabel("");
		saveButtonLabel.setBounds(620, 650, 140, 30);
		panel.add(saveButtonLabel);
		
		loadButton = new JButton("Load last database");
		loadButton.setBounds(800, 700, 175, 30);
		loadButton.addActionListener(e -> {
			try {
				load();
			} catch (ClassNotFoundException | IOException e1) {
				e1.printStackTrace();
			}
		});
		panel.add(loadButton);
		
		loadButtonLabel = new JLabel("");
		loadButtonLabel.setBounds(820, 650, 140, 30);
		panel.add(loadButtonLabel);
		
		
		saveBackupButtonLabel = new JLabel("Name of the backup:");
		saveBackupButtonLabel.setBounds(20, 650, 120, 30);
		panel.add(saveBackupButtonLabel);
		
		setBackupText = new JTextField();
		setBackupText.setBounds(150, 650, 165, 25);
		panel.add(setBackupText);
		
		saveBackupConfirmationLabel = new JLabel("");
		saveBackupConfirmationLabel.setBounds(360, 700, 80, 30);
		panel.add(saveBackupConfirmationLabel);
		
		backupButton = new JButton("Create a safe backup");
		backupButton.setBounds(150, 700, 200, 30);
		backupButton.addActionListener(e -> {
			try {
				save(setBackupText.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		panel.add(backupButton);
		
		staffButton = new JButton("Staff menu");
		staffButton.setBounds(50, 40, 120, 30);
		staffButton.addActionListener(e -> guiStaff());
		panel.add(staffButton);
		
		HospitalButton = new JButton("Hospital menu");
		HospitalButton.setBounds(150, 200, 120, 30);
		HospitalButton.addActionListener(e -> guiHospital());
		panel.add(HospitalButton);
		
		
		roomButton = new JButton("Rooms menu");
		roomButton.setBounds(250, 360, 120, 30);
		roomButton.addActionListener(e -> guiRoom());
		panel.add(roomButton);
		
		
		queueButton = new JButton("Queue menu");
		queueButton.setBounds(350, 520, 120, 30);
		queueButton.addActionListener(e -> guiQueue());
		panel.add(queueButton);
		
		pharmacyButton = new JButton("Pharmacy menu");
		pharmacyButton.setBounds(750, 520, 130, 30);
		pharmacyButton.addActionListener(e -> guiPharmacy());
		panel.add(pharmacyButton);
		
		parkingButton = new JButton("Parking lot menu");
		parkingButton.setBounds(450, 360, 140, 30);
		parkingButton.addActionListener(e -> guiParking());
		panel.add(parkingButton);
		
		floorButton = new JButton("Floor menu");
		floorButton.setBounds(350, 200, 120, 30);
		floorButton.addActionListener(e -> guiFloor());
		panel.add(floorButton);
		
		financeButton = new JButton("Finances menu");
		financeButton.setBounds(250, 40, 120, 30);
		financeButton.addActionListener(e -> guiFinancial());
		panel.add(financeButton);
		
		equipmentButton = new JButton("Equipment menu");
		equipmentButton.setBounds(450, 40, 130, 30);
		equipmentButton.addActionListener(e -> guiEquipment());
		panel.add(equipmentButton);
		
		patientButton = new JButton("Patient menu");
		patientButton.setBounds(550, 200, 120, 30);
		patientButton.addActionListener(e -> guiPatient());
		panel.add(patientButton);
		
		bookButton = new JButton("Book of complaints menu");
		bookButton.setBounds(650, 360, 200, 30);
		bookButton.addActionListener(e -> guiBook());
		panel.add(bookButton);
		
		
		
		frame.setVisible(true);
	}
	
	//Patient GUI
	public Gui(int k, String p) {
		
		frame = new JFrame("Patient menu");
		panel = new JPanel();
		frame.setSize(900, 700);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
		
		setPatientNameLabel= new JLabel("Name:");
		setPatientNameLabel.setBounds(40, 40, 80, 25);
		panel.add(setPatientNameLabel);
		
		setPatientNameText = new JTextField();
		setPatientNameText.setBounds(130, 40, 165, 25);
		panel.add(setPatientNameText);
		
		setPatientSurnameLabel = new JLabel("Surname:");
		setPatientSurnameLabel.setBounds(310, 40, 80, 25);
		panel.add(setPatientSurnameLabel);
		
		setPatientSurnameText = new JTextField();
		setPatientSurnameText.setBounds(400, 40, 165, 25);
		panel.add(setPatientSurnameText);
		
		setPatientBirthLabel = new JLabel("Date of birth:");
		setPatientBirthLabel.setBounds(40, 120, 80, 25);
		panel.add(setPatientBirthLabel);
		
		setPatientBirthText = new JTextField();
		setPatientBirthText.setBounds(130, 120, 165, 25);
		panel.add(setPatientBirthText);
		
		setMainClinicLabel = new JLabel("Main clinic:");
		setMainClinicLabel.setBounds(310, 120, 80, 25);
		panel.add(setMainClinicLabel);
		
		setMainClinicText = new JTextField();
		setMainClinicText.setBounds(400, 120, 165, 25);
		panel.add(setMainClinicText);
		
		patientCreationButton = new JButton("Create");
		patientCreationButton.setBounds(620, 120, 80, 30);
		patientCreationButton.addActionListener(e -> patientCreate());
		panel.add(patientCreationButton);
		
		patientCreationLabel = new JLabel("");
		patientCreationLabel.setBounds(600, 160, 300, 25);
		panel.add(patientCreationLabel);
		
		setDebtLabel = new JLabel("Debt:");
		setDebtLabel.setBounds(40, 200, 80, 25);
		panel.add(setDebtLabel);
		
		setDebtText = new JTextField();
		setDebtText.setBounds(130, 200, 165, 25);
		panel.add(setDebtText);
		
		setInjuryLabel = new JLabel("Injury:");
		setInjuryLabel.setBounds(310, 200, 80, 25);
		panel.add(setInjuryLabel);
		
		setInjuryText = new JTextField();
		setInjuryText.setBounds(400, 200, 165, 25);
		panel.add(setInjuryText);
		
		getPatientInfoLabel = new JLabel("Already created one and want to check the data?   Enter the id number here:");
		getPatientInfoLabel.setBounds(20, 300, 450, 25);
		panel.add(getPatientInfoLabel);
		
		getPatientInfoText = new JTextField();
		getPatientInfoText.setBounds(460, 300, 165, 25);
		panel.add(getPatientInfoText);
		
		patientInfoButton = new JButton("Check");
		patientInfoButton.setBounds(650, 300, 80, 30);
		patientInfoButton.addActionListener(e -> patientInfo());
		panel.add(patientInfoButton);
		

		patientInfoLabel = new JLabel("");
		patientInfoLabel.setBounds(20, 380, 850, 25);
		
		panel.add(patientInfoLabel);
		
		frame.setVisible(true);
	}
	
	//Financial_Accounts GUI
	public Gui(String z) {
		
		frame = new JFrame("Finance menu");
		panel = new JPanel();
		frame.setSize(900, 700);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
		
		
		setCurrentBalanceLabel= new JLabel("Balance:");
		setCurrentBalanceLabel.setBounds(40, 40, 60, 25);
		panel.add(setCurrentBalanceLabel);
		
		setCurrentBalanceText = new JTextField();
		setCurrentBalanceText.setBounds(110, 40, 165, 25);
		panel.add(setCurrentBalanceText);
		
		setBankLabel = new JLabel("Bank name:");
		setBankLabel.setBounds(310, 40, 80, 25);
		panel.add(setBankLabel);
		
		setBankText = new JTextField();
		setBankText.setBounds(400, 40, 165, 25);
		panel.add(setBankText);
		
		setPatientDebtLabel= new JLabel("Make someone pay off their debt! Just enter the id of the patient:");
		setPatientDebtLabel.setBounds(40, 160, 400, 25);
		panel.add(setPatientDebtLabel);
		
		setPatientDebtText = new JTextField();
		setPatientDebtText.setBounds(450, 160, 120, 25);
		panel.add(setPatientDebtText);
		
		financeDebtButton = new JButton("Collect debt");
		financeDebtButton.setBounds(620, 160, 170, 30);
		financeDebtButton.addActionListener(e -> financePay());
		panel.add(financeDebtButton);
		
		financeDebtLabel= new JLabel("");
		financeDebtLabel.setBounds(40, 200, 500, 25);
		panel.add(financeDebtLabel);
		
		financeCreationButton = new JButton("Create or replace");
		financeCreationButton.setBounds(620, 40, 170, 30);
		financeCreationButton.addActionListener(e -> financeCreate());
		panel.add(financeCreationButton);
		
		financeCreationLabel = new JLabel("");
		financeCreationLabel.setBounds(620, 80, 300, 25);
		panel.add(financeCreationLabel);
		
		
		
		getFinanceInfoLabel = new JLabel("Already created one and want to check the data?   Press here:");
		getFinanceInfoLabel.setBounds(40, 300, 390, 25);
		panel.add(getFinanceInfoLabel);
		
		financeInfoButton = new JButton("Check");
		financeInfoButton.setBounds(400, 300, 80, 30);
		financeInfoButton.addActionListener(e -> financeInfo());
		panel.add(financeInfoButton);
		

		financeInfoLabel = new JLabel("");
		financeInfoLabel.setBounds(20, 380, 850, 25);
		panel.add(financeInfoLabel);
		
		frame.setVisible(true);
	}

	
	//Staff GUI
	public Gui(int k, String s, String t) {
	
		frame = new JFrame("Staff menu");
		panel = new JPanel();
		frame.setSize(900, 700);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
	
	
		setStaffNameLabel= new JLabel("Name:");
		setStaffNameLabel.setBounds(40, 40, 80, 25);
		panel.add(setStaffNameLabel);
		
		setStaffNameText = new JTextField();
		setStaffNameText.setBounds(130, 40, 165, 25);
		panel.add(setStaffNameText);
		
		setStaffSurnameLabel = new JLabel("Surname:");
		setStaffSurnameLabel.setBounds(310, 40, 80, 25);
		panel.add(setStaffSurnameLabel);
		
		setStaffSurnameText = new JTextField();
		setStaffSurnameText.setBounds(400, 40, 165, 25);
		panel.add(setStaffSurnameText);
		
		setEquipmentLabel = new JLabel("Equipment:");
		setEquipmentLabel.setBounds(575, 40, 80, 25);
		panel.add(setEquipmentLabel);
		
		setEquipmentText = new JTextField();
		setEquipmentText.setBounds(665, 40, 165, 25);
		panel.add(setEquipmentText);
		
		setStaffBirthLabel = new JLabel("Date of birth:");
		setStaffBirthLabel.setBounds(40, 120, 80, 25);
		panel.add(setStaffBirthLabel);
		
		setStaffBirthText = new JTextField();
		setStaffBirthText.setBounds(130, 120, 165, 25);
		panel.add(setStaffBirthText);
		
		setProfessionLabel = new JLabel("Profession:");
		setProfessionLabel.setBounds(310, 120, 80, 25);
		panel.add(setProfessionLabel);
		
		setProfessionText = new JTextField();
		setProfessionText.setBounds(400, 120, 165, 25);
		panel.add(setProfessionText);
		
		staffCreationButton = new JButton("Create");
		staffCreationButton.setBounds(620, 120, 80, 30);
		staffCreationButton.addActionListener(e -> staffCreate());
		panel.add(staffCreationButton);
		
		staffCreationLabel = new JLabel("");
		staffCreationLabel.setBounds(600, 160, 300, 25);
		panel.add(staffCreationLabel);
		
		setSalaryLabel = new JLabel("Salary:");
		setSalaryLabel.setBounds(40, 200, 80, 25);
		panel.add(setSalaryLabel);
		
		setSalaryText = new JTextField();
		setSalaryText.setBounds(130, 200, 165, 25);
		panel.add(setSalaryText);
		
		setOccupiedFloorLabel = new JLabel("Floor:");
		setOccupiedFloorLabel.setBounds(310, 200, 80, 25);
		panel.add(setOccupiedFloorLabel);
		
		setOccupiedFloorText = new JTextField();
		setOccupiedFloorText.setBounds(400, 200, 165, 25);
		panel.add(setOccupiedFloorText);
		
		getStaffInfoLabel = new JLabel("Already created one and want to check the data?  Enter the id number here:");
		getStaffInfoLabel.setBounds(20, 300, 440, 25);
		panel.add(getStaffInfoLabel);
		
		getStaffInfoText = new JTextField();
		getStaffInfoText.setBounds(470, 300, 165, 25);
		panel.add(getStaffInfoText);
		
		staffInfoButton = new JButton("Check");
		staffInfoButton.setBounds(650, 300, 80, 30);
		staffInfoButton.addActionListener(e -> staffInfo());
		panel.add(staffInfoButton);
		
	
		staffInfoLabel = new JLabel("");
		staffInfoLabel.setBounds(20, 380, 850, 25);
		panel.add(staffInfoLabel);
		
		staffInfoEqLabel = new JLabel("");
		staffInfoEqLabel.setBounds(20, 480, 850, 25);
		panel.add(staffInfoEqLabel);
		
		frame.setVisible(true);
}
	
	//Equipment GUI
	public Gui(int k, String s, String t, String l) {
		
		frame = new JFrame("Equipment menu");
		panel = new JPanel();
		frame.setSize(900, 700);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
	
	
		setPlungersLabel= new JLabel("Plungers:");
		setPlungersLabel.setBounds(40, 40, 80, 25);
		panel.add(setPlungersLabel);
		
		setPlungersText = new JTextField();
		setPlungersText.setBounds(130, 40, 165, 25);
		panel.add(setPlungersText);
		
		setPlungersButton = new JButton("Set");
		setPlungersButton.setBounds(310, 40, 80, 30);
		setPlungersButton.addActionListener(e -> setPlungers());
		panel.add(setPlungersButton);
		
		
		setPlungersConfirmLabel = new JLabel("");
		setPlungersConfirmLabel.setBounds(400, 40, 160, 25);
		panel.add(setPlungersConfirmLabel);
		
		setLaptopsLabel = new JLabel("Laptops:");
		setLaptopsLabel.setBounds(40, 120, 80, 25);
		panel.add(setLaptopsLabel);
		
		setLaptopsText = new JTextField();
		setLaptopsText.setBounds(130, 120, 165, 25);
		panel.add(setLaptopsText);
		
		setLaptopsButton = new JButton("Set");
		setLaptopsButton.setBounds(310, 120, 80, 30);
		setLaptopsButton.addActionListener(e -> setLaptops());
		panel.add(setLaptopsButton);
		
		setLaptopsConfirmLabel = new JLabel("");
		setLaptopsConfirmLabel.setBounds(400, 120, 160, 25);
		panel.add(setLaptopsConfirmLabel);
		
		setScalpelsLabel = new JLabel("Scalpels:");
		setScalpelsLabel.setBounds(40, 200, 80, 25);
		panel.add(setScalpelsLabel);
		
		setScalpelsText = new JTextField();
		setScalpelsText.setBounds(130, 200, 165, 25);
		panel.add(setScalpelsText);
		
		setScalpelsButton = new JButton("Set");
		setScalpelsButton.setBounds(310, 200, 80, 30);
		setScalpelsButton.addActionListener(e -> setScalpels());
		panel.add(setScalpelsButton);
		
		setScalpelsConfirmLabel = new JLabel("");
		setScalpelsConfirmLabel.setBounds(400, 200, 160, 25);
		panel.add(setScalpelsConfirmLabel);
		
		setPulseMeasurersLabel = new JLabel("Pulse measurers:");
		setPulseMeasurersLabel.setBounds(40, 280, 110, 25);
		panel.add(setPulseMeasurersLabel);
		
		setPulseMeasurersText = new JTextField();
		setPulseMeasurersText.setBounds(160, 280, 135, 25);
		panel.add(setPulseMeasurersText);
		
		setPulseMeasurersButton = new JButton("Set");
		setPulseMeasurersButton.setBounds(310, 280, 80, 30);
		setPulseMeasurersButton.addActionListener(e -> setPulseMeasurers());
		panel.add(setPulseMeasurersButton);
		
		setPulseMeasurersConfirmLabel = new JLabel("");
		setPulseMeasurersConfirmLabel.setBounds(400, 280, 160, 25);
		panel.add(setPulseMeasurersConfirmLabel);
		
		setAnestheticsLabel = new JLabel("Anesthetics:");
		setAnestheticsLabel.setBounds(40,  360, 100, 25);
		panel.add(setAnestheticsLabel);
		
		setAnestheticsText = new JTextField();
		setAnestheticsText.setBounds(130,  360, 165, 25);
		panel.add(setAnestheticsText);
		
		setAnestheticsButton = new JButton("Set");
		setAnestheticsButton.setBounds(310,  360, 80, 30);
		setAnestheticsButton.addActionListener(e -> setAnesthetics());
		panel.add(setAnestheticsButton);
		
		setAnestheticsConfirmLabel = new JLabel("");
		setAnestheticsConfirmLabel.setBounds(400, 360, 160, 25);
		panel.add(setAnestheticsConfirmLabel);
		
		getEquipmentLabel = new JLabel("Want to check the equipment? Click here:");
		getEquipmentLabel.setBounds(20, 420, 260, 25);
		panel.add(getEquipmentLabel);
		
		getEquipmentLabel_2 = new JLabel("");
		getEquipmentLabel_2.setBounds(20, 460, 800, 25);
		panel.add(getEquipmentLabel_2);
		
		getEquipmentButton = new JButton("Click me");
		getEquipmentButton.setBounds(290, 420, 120, 30);
		getEquipmentButton.addActionListener(e -> equipmentInfo());
		panel.add(getEquipmentButton);
		
		giveEquipmentLabel = new JLabel("Want to give one of the employees an item? Write his id here and then click one of the give buttons:");
		giveEquipmentLabel.setBounds(20, 500, 600, 25);
		panel.add(giveEquipmentLabel);
		
		giveEquipmentText = new JTextField();
		giveEquipmentText.setBounds(630,  500, 80, 25);
		panel.add(giveEquipmentText);
		
		giveEquipmentLabel_2 = new JLabel("");
		giveEquipmentLabel_2.setBounds(200, 580, 400, 25);
		panel.add(giveEquipmentLabel_2);
		
		givePlungerButton = new JButton("Give plunger");
		givePlungerButton.setBounds(20, 610, 120, 30);
		givePlungerButton.addActionListener(e -> eqManagement("Toilet plunger"));
		panel.add(givePlungerButton);
		
		giveLaptopButton = new JButton("Give laptop");
		giveLaptopButton.setBounds(150, 610, 120, 30);
		giveLaptopButton.addActionListener(e -> eqManagement("Laptop"));
		panel.add(giveLaptopButton);
		
		giveScalpelButton = new JButton("Give scalpel");
		giveScalpelButton.setBounds(280, 610, 120, 30);
		giveScalpelButton.addActionListener(e -> eqManagement("Scalpel"));
		panel.add(giveScalpelButton);
		
		givePulseMeasurerButton = new JButton("Give pulse measurer");
		givePulseMeasurerButton.setBounds(410, 610, 200, 30);
		givePulseMeasurerButton.addActionListener(e -> eqManagement("Pulse measurer"));
		panel.add(givePulseMeasurerButton);
		
		giveAnestheticButton = new JButton("Give anesthetic");
		giveAnestheticButton.setBounds(620, 610, 200, 30);
		giveAnestheticButton.addActionListener(e -> eqManagement("Anesthetic"));
		panel.add(giveAnestheticButton);
		
		
		
		frame.setVisible(true);
}
	
	
	//Hospital GUI
		public Gui(int k, String s, String t, String l, String c) {
			
			frame = new JFrame("Hospital menu");
			panel = new JPanel();
			frame.setSize(900, 700);
			frame.setLocationRelativeTo(null);
			frame.add(panel);
			panel.setLayout(null);
		
		
			hospitalWidthLabel= new JLabel("Width:");
			hospitalWidthLabel.setBounds(40, 40, 80, 25);
			panel.add(hospitalWidthLabel);
			
			hospitalWidthText = new JTextField();
			hospitalWidthText.setBounds(130, 40, 165, 25);
			panel.add(hospitalWidthText);
			
			hospitalHeightLabel = new JLabel("Height:");
			hospitalHeightLabel.setBounds(40, 120, 80, 25);
			panel.add(hospitalHeightLabel);
			
			hospitalHeightText = new JTextField();
			hospitalHeightText.setBounds(130, 120, 165, 25);
			panel.add(hospitalHeightText);
			
			hospitalLengthLabel = new JLabel("Length:");
			hospitalLengthLabel.setBounds(40, 200, 80, 25);
			panel.add(hospitalLengthLabel);
			
			hospitalLengthText = new JTextField();
			hospitalLengthText.setBounds(130, 200, 165, 25);
			panel.add(hospitalLengthText);
			
			hospitalFloorLabel = new JLabel("Floor number:");
			hospitalFloorLabel.setBounds(40, 280, 110, 25);
			panel.add(hospitalFloorLabel);
			
			hospitalFloorText = new JTextField();
			hospitalFloorText.setBounds(130, 280, 165, 25);
			panel.add(hospitalFloorText);
			
			hospitalCreateButton = new JButton("Create");
			hospitalCreateButton.setBounds(130, 360, 80, 30);
			hospitalCreateButton.addActionListener(e -> createHospital());
			panel.add(hospitalCreateButton);
			
			hospitalCreateLabel = new JLabel("");
			hospitalCreateLabel.setBounds(220, 360, 300, 25);
			panel.add(hospitalCreateLabel);
			
			
			hospitalCheckLabel = new JLabel("Want to check the info? Click here:");
			hospitalCheckLabel.setBounds(20, 420, 240, 25);
			panel.add(hospitalCheckLabel);
			
			hospitalCheckButton = new JButton("Check");
			hospitalCheckButton.setBounds(280, 420, 80, 30);
			hospitalCheckButton.addActionListener(e -> hospitalInfo());
			panel.add(hospitalCheckButton);
			
			hospitalCheckLabel_2 = new JLabel("");
			hospitalCheckLabel_2.setBounds(20, 460, 800, 25);
			panel.add(hospitalCheckLabel_2);
			
			
			frame.setVisible(true);
	}
		
		//Room GUI
		public Gui(int k, int g) {
					
			frame = new JFrame("Room menu");
			panel = new JPanel();
			frame.setSize(900, 700);
			frame.setLocationRelativeTo(null);
			frame.add(panel);
			panel.setLayout(null);
				
				
			roomColorLabel = new JLabel("Color:");
			roomColorLabel.setBounds(40, 40, 80, 25);
			panel.add(roomColorLabel);
					
			roomColorText = new JTextField();
			roomColorText.setBounds(150, 40, 165, 25);
			panel.add(roomColorText);
					
			roomTypeLabel = new JLabel("Type of paint:");
			roomTypeLabel.setBounds(40, 120, 100, 25);
			panel.add(roomTypeLabel);
					
			roomTypeText = new JTextField();
			roomTypeText.setBounds(150, 120, 165, 25);
			panel.add(roomTypeText);
					
			roomCreateButton = new JButton("Create");
			roomCreateButton.setBounds(330, 120, 80, 30);
			roomCreateButton.addActionListener(e -> createRoom());
			panel.add(roomCreateButton);
					
			roomCreateLabel = new JLabel("");
			roomCreateLabel.setBounds(420, 120, 300, 25);
			panel.add(roomCreateLabel);
					
					
			roomCheckLabel = new JLabel("Want to check the prefered rooms? Click here:");
			roomCheckLabel.setBounds(20, 220, 300, 25);
			panel.add(roomCheckLabel);
					
			roomCheckButton = new JButton("Check");
			roomCheckButton.setBounds(330, 220, 80, 30);
			roomCheckButton.addActionListener(e -> roomInfo());
			panel.add(roomCheckButton);
					
			roomCheckLabel_2 = new JLabel("");
			roomCheckLabel_2.setBounds(20, 260, 800, 25);
			panel.add(roomCheckLabel_2);
					
					
			frame.setVisible(true);
			}
		
		
		//Parking GUI
		public Gui(int k, int g, int n) {
							
			frame = new JFrame("Parking menu");
			panel = new JPanel();
			frame.setSize(900, 700);
			frame.setLocationRelativeTo(null);
			frame.add(panel);
			panel.setLayout(null);
						
						
			parkingSlotsLabel = new JLabel("Total slots:");
			parkingSlotsLabel.setBounds(40, 40, 80, 25);
			panel.add(parkingSlotsLabel);
							
			parkingSlotsText = new JTextField();
			parkingSlotsText.setBounds(140, 40, 165, 25);
			panel.add(parkingSlotsText);
							
			parkingDisabledSlotsLabel = new JLabel("Disabled slots:");
			parkingDisabledSlotsLabel.setBounds(40, 120, 90, 25);
			panel.add(parkingDisabledSlotsLabel);
							
			parkingDisabledSlotsText = new JTextField();
			parkingDisabledSlotsText.setBounds(140, 120, 165, 25);
			panel.add(parkingDisabledSlotsText);
							
			parkingCreateButton = new JButton("Create");
			parkingCreateButton.setBounds(330, 120, 80, 30);
			parkingCreateButton.addActionListener(e -> createParkingLot());
			panel.add(parkingCreateButton);
							
			parkingCreateLabel = new JLabel("");
			parkingCreateLabel.setBounds(420, 120, 300, 25);
			panel.add(parkingCreateLabel);
							
							
			parkingCheckLabel = new JLabel("Want to check parking properties? Click here:");
			parkingCheckLabel.setBounds(20, 220, 300, 25);
			panel.add(parkingCheckLabel);
							
			parkingCheckButton = new JButton("Check");
			parkingCheckButton.setBounds(330, 220, 80, 30);
			parkingCheckButton.addActionListener(e -> parkingInfo());
			panel.add(parkingCheckButton);
							
			parkingCheckLabel_2 = new JLabel("");
			parkingCheckLabel_2.setBounds(20, 260, 800, 25);
			panel.add(parkingCheckLabel_2);
							
							
			frame.setVisible(true);
			}			
		
		//Floor GUI
		public Gui(String g, String k, String n) {
									
			frame = new JFrame("Floor menu");
			panel = new JPanel();
			frame.setSize(900, 700);
			frame.setLocationRelativeTo(null);
			frame.add(panel);
			panel.setLayout(null);
								
								
			floorTypeLabel = new JLabel("Type:");
			floorTypeLabel.setBounds(40, 40, 80, 25);
			panel.add(floorTypeLabel);
									
			floorTypeText = new JTextField();
			floorTypeText.setBounds(130, 40, 165, 25);
			panel.add(floorTypeText);
							
			floorSoundLabel = new JLabel("Sound:");
			floorSoundLabel.setBounds(40, 120, 80, 25);
			panel.add(floorSoundLabel);
							
			floorSoundText = new JTextField();
			floorSoundText.setBounds(130, 120, 165, 25);
			panel.add(floorSoundText);
									
			floorCreateButton = new JButton("Create");
			floorCreateButton.setBounds(350, 120, 80, 30);
			floorCreateButton.addActionListener(e -> createFloor());
			panel.add(floorCreateButton);
									
			floorCreateLabel = new JLabel("");
			floorCreateLabel.setBounds(440, 120, 300, 25);
			panel.add(floorCreateLabel);
									
									
			floorCheckLabel = new JLabel("Want to check the propeties? Click here:");
			floorCheckLabel.setBounds(20, 220, 240, 25);
			panel.add(floorCheckLabel);
									
			floorCheckButton = new JButton("Check");
			floorCheckButton.setBounds(270, 220, 80, 30);
			floorCheckButton.addActionListener(e -> floorInfo());
			panel.add(floorCheckButton);
									
			floorCheckLabel_2 = new JLabel("");
			floorCheckLabel_2.setBounds(20, 260, 800, 25);
			panel.add(floorCheckLabel_2);
									
									
			frame.setVisible(true);
		}
		
		//Queue GUI
		public Gui(int k, int g, int n, int l) {
									
			frame = new JFrame("Queue menu");
			panel = new JPanel();
			frame.setSize(900, 700);
			frame.setLocationRelativeTo(null);
			frame.add(panel);
			panel.setLayout(null);
								
								
			queueTimeLabel = new JLabel("Total time:");
			queueTimeLabel.setBounds(40, 40, 80, 25);
			panel.add(queueTimeLabel);
									
			queueTimeText = new JTextField();
			queueTimeText.setBounds(130, 40, 165, 25);
			panel.add(queueTimeText);
									
			queueMoodLabel = new JLabel("Mood:");
			queueMoodLabel.setBounds(40, 120, 80, 25);
			panel.add(queueMoodLabel);
									
			queueMoodText = new JTextField();
			queueMoodText.setBounds(130, 120, 165, 25);
			panel.add(queueMoodText);
									
			queueCreateButton = new JButton("Create");
			queueCreateButton.setBounds(320, 80, 80, 30);
			queueCreateButton.addActionListener(e -> createQueue());
			panel.add(queueCreateButton);
									
			queueCreateLabel = new JLabel("");
			queueCreateLabel.setBounds(410, 80, 300, 25);
			panel.add(queueCreateLabel);
									
									
			queueCheckLabel = new JLabel("Want to check queue information? Click here:");
			queueCheckLabel.setBounds(20, 220, 300, 25);
			panel.add(queueCheckLabel);
									
			queueCheckButton = new JButton("Check");
			queueCheckButton.setBounds(330, 220, 80, 30);
			queueCheckButton.addActionListener(e -> queueInfo());
			panel.add(queueCheckButton);
									
			queueCheckLabel_2 = new JLabel("");
			queueCheckLabel_2.setBounds(20, 260, 800, 25);
			panel.add(queueCheckLabel_2);
									
									
			frame.setVisible(true);
		}			
	
		//BookOfComplaints GUI
		public Gui(int k, int g, int n, int l, int f) {
											
			frame = new JFrame("Book menu");
			panel = new JPanel();
			frame.setSize(900, 700);
			frame.setLocationRelativeTo(null);
			frame.add(panel);
			panel.setLayout(null);
										
										
			bookComplaintsLabel = new JLabel("Complaints:");
			bookComplaintsLabel.setBounds(40, 40, 80, 25);
			panel.add(bookComplaintsLabel);
											
			bookComplaintsText = new JTextField();
			bookComplaintsText.setBounds(130, 40, 165, 25);
			panel.add(bookComplaintsText);
											
			bookPraisesLabel = new JLabel("Praises:");
			bookPraisesLabel.setBounds(40, 120, 120, 25);
			panel.add(bookPraisesLabel);
											
			bookPraisesText = new JTextField();
			bookPraisesText.setBounds(130, 120, 165, 25);
			panel.add(bookPraisesText);
											
			bookCreateButton = new JButton("Create");
			bookCreateButton.setBounds(330, 120, 80, 30);
			bookCreateButton.addActionListener(e -> createBook());
			panel.add(bookCreateButton);
											
			bookCreateLabel = new JLabel("");
			bookCreateLabel.setBounds(420, 120, 300, 25);
			panel.add(bookCreateLabel);
											
											
			bookCheckLabel = new JLabel("Want to check opinions about personel? Click here:");
			bookCheckLabel.setBounds(20, 220, 300, 25);
			panel.add(bookCheckLabel);
											
			bookCheckButton = new JButton("Check");
			bookCheckButton.setBounds(330, 220, 80, 30);
			bookCheckButton.addActionListener(e -> bookInfo());
			panel.add(bookCheckButton);
											
			bookCheckLabel_2 = new JLabel("");
			bookCheckLabel_2.setBounds(20, 260, 800, 25);
			panel.add(bookCheckLabel_2);
											
											
			frame.setVisible(true);
		}			
	
		//Pharmacy GUI
		public Gui(int k, int g, int n, int l, int f, int b) {
													
			frame = new JFrame("Pharmacy menu");
			panel = new JPanel();
			frame.setSize(900, 700);
			frame.setLocationRelativeTo(null);
			frame.add(panel);
			panel.setLayout(null);
												
												
			pharmacyDrugsLabel = new JLabel("Number of meds:");
			pharmacyDrugsLabel.setBounds(40, 40, 125, 25);
			panel.add(pharmacyDrugsLabel);
													
			pharmacyDrugsText = new JTextField();
			pharmacyDrugsText.setBounds(170, 40, 165, 25);
			panel.add(pharmacyDrugsText);
													
			pharmacyPriceLabel = new JLabel("Price for each:");
			pharmacyPriceLabel.setBounds(40, 120, 120, 25);
			panel.add(pharmacyPriceLabel);
													
			pharmacyPriceText = new JTextField();
			pharmacyPriceText.setBounds(170, 120, 165, 25);
			panel.add(pharmacyPriceText);
													
			pharmacyCreateButton = new JButton("Create");
			pharmacyCreateButton.setBounds(350, 80, 80, 30);
			pharmacyCreateButton.addActionListener(e -> createPharmacy());
			panel.add(pharmacyCreateButton);
													
			pharmacyCreateLabel = new JLabel("");
			pharmacyCreateLabel.setBounds(440, 80, 300, 25);
			panel.add(pharmacyCreateLabel);
													
													
			pharmacyCheckLabel = new JLabel("Want to check the availability of meds? Click here:");
			pharmacyCheckLabel.setBounds(20, 220, 300, 25);
			panel.add(pharmacyCheckLabel);
													
			pharmacyCheckButton = new JButton("Check");
			pharmacyCheckButton.setBounds(330, 220, 80, 30);
			pharmacyCheckButton.addActionListener(e -> pharmacyInfo());
			panel.add(pharmacyCheckButton);
													
			pharmacyCheckLabel_2 = new JLabel("");
			pharmacyCheckLabel_2.setBounds(20, 260, 800, 25);
			panel.add(pharmacyCheckLabel_2);
			
			pharmacySellLabel = new JLabel("Want to sell medicines to particular patient? Input his id to the left box below, the ammount to the right box below:");
			pharmacySellLabel.setBounds(20, 300, 800, 25);
			panel.add(pharmacySellLabel);
			
			pharmacyIdText = new JTextField();
			pharmacyIdText.setBounds(65, 340, 165, 25);
			panel.add(pharmacyIdText);
			
			pharmacyAmmountText = new JTextField();
			pharmacyAmmountText.setBounds(240, 340, 165, 25);
			panel.add(pharmacyAmmountText);
			
			
			pharmacySellButton = new JButton("Sell");
			pharmacySellButton.setBounds(420, 340, 80, 30);
			pharmacySellButton.addActionListener(e -> sellPharmacy());
			panel.add(pharmacySellButton);
			
			pharmacySellLabel_2 = new JLabel();
			pharmacySellLabel_2.setBounds(20, 380, 800, 25);
			panel.add(pharmacySellLabel_2);
													
			frame.setVisible(true);
		}			
		
		
		
	public static void save() throws FileNotFoundException, IOException {
		String userHomeFolder = System.getProperty("user.home");
		loadButtonLabel.setText("");
		saveBackupConfirmationLabel.setText("");
			save(1, userHomeFolder+"/Desktop/Patients.txt");
			save(1,1,userHomeFolder+"/Desktop/Staff.txt");
			save(1,1,1,userHomeFolder+"/Desktop/Finances.txt");
			save(1,1,1,1,userHomeFolder+"/Desktop/Equipment.txt");
			save(1,1,1,1,1,userHomeFolder+"/Desktop/Hospital.txt");
			save(1,1,1,1,1,1,userHomeFolder+"/Desktop/Room.txt");
			save(1,1,1,1,1,1,1,userHomeFolder+"/Desktop/Hospital_floor.txt");
			save(1,1,1,1,1,1,1,1,userHomeFolder+"/Desktop/Parking.txt");
			save("1",userHomeFolder+"/Desktop/Pharmacy.txt");
			save("1","1",userHomeFolder+"/Desktop/Queue.txt");
			save("1","1","1",userHomeFolder+"/Desktop/Book.txt");
	}
	
	public static void save(String back) throws FileNotFoundException, IOException {
		String userHomeFolder = System.getProperty("user.home");
		loadButtonLabel.setText("");
			save(1, userHomeFolder+"/Desktop/Patients" + back + ".bak");
			save(1,1,userHomeFolder+"/Desktop/Staff" + back + ".bak");
			save(1,1,1,userHomeFolder+"/Desktop/Finances" + back + ".bak");
			save(1,1,1,1,userHomeFolder+"/Desktop/Equipment" + back + ".bak");
			save(1,1,1,1,1,userHomeFolder+"/Desktop/Hospital" + back + ".bak");
			save(1,1,1,1,1,1,userHomeFolder+"/Desktop/Room" + back + ".bak");
			save(1,1,1,1,1,1,1,userHomeFolder+"/Desktop/Hospital_floor" + back + ".bak");
			save(1,1,1,1,1,1,1,1,userHomeFolder+"/Desktop/Parking" + back + ".bak");
			save("1",userHomeFolder+"/Desktop/Pharmacy" + back + ".bak");
			save("1","1",userHomeFolder+"/Desktop/Queue" + back + ".bak");
			save("1","1","1",userHomeFolder+"/Desktop/Book" + back + ".bak");
			saveButtonLabel.setText("");
			saveBackupConfirmationLabel.setText("Done");
	}
	
	
	//saving for Patients
	public static void save(int g, String home) throws FileNotFoundException, IOException {
		
        ObjectOutputStream patpat=null;
        try{
        	patpat= new ObjectOutputStream(new FileOutputStream(home));
            // Writing to the file
            for(int i=0; patients[i]!=null; i++) {
            	patpat.writeObject(patients[i]);
        }
            patpat.flush();
        }
        catch (Exception ex) {
        	saveButtonLabel.setText("Something went wrong");
        }
        finally{
            if(patpat!=null) {
            	patpat.close();
            }
        }
}
	
	//saving for Staff
public static void save(int g, int k, String home) throws FileNotFoundException, IOException {
		
        ObjectOutputStream staffy=null;
        try{
        	staffy= new ObjectOutputStream(new FileOutputStream(home));
            for(int i=0; personel[i]!=null; i++) {
            	staffy.writeObject(personel[i]);
        }
            staffy.flush();
        }
        catch (Exception ex) {
        	saveButtonLabel.setText("Something went wrong");
        }
        finally{
            if(staffy!=null) {
            	staffy.close();
            }
        }
}
	//saving for Financial_Accounts
public static void save(int e, int k, int l, String home) throws FileNotFoundException, IOException {
	
    ObjectOutputStream finan=null;
    try{
    	finan = new ObjectOutputStream(new FileOutputStream(home));
        finan.writeObject(finances);
        finan.flush();
    }
    catch (Exception ex) {
    	saveButtonLabel.setText("Something went wrong");
    }
    	
    finally{
        if(finan!=null) {
        	finan.close();
        }
    }
}
//saving for Equipment
public static void save(int e, int k, int l, int g, String home) throws FileNotFoundException, IOException {
	
    ObjectOutputStream equip=null;
    try{
    	equip = new ObjectOutputStream(new FileOutputStream(home));
    	equip.writeObject(eq);
    	equip.flush();
    }
    catch (Exception ex) {
    	saveButtonLabel.setText("Something went wrong");
    }
    	
    finally{	
        if(equip!=null) {
        	equip.close();
        }
    }
}
//saving for Hospital
public static void save(int q, int w, int e, int r, int t, String home) throws FileNotFoundException, IOException {
	
    ObjectOutputStream hospy=null;
    try{
    	hospy = new ObjectOutputStream(new FileOutputStream(home));
    	hospy.writeObject(hosp);
    	hospy.flush();
    }
    catch (Exception ex) {
    	saveButtonLabel.setText("Something went wrong");
    }
    	
    finally{
    	
        if(hospy!=null) {
        	hospy.close();
        }
    }
}
//saving for Room
public static void save(int q, int w, int e, int r, int t, int y, String home) throws FileNotFoundException, IOException {
	
    ObjectOutputStream rom=null;
    try{
    	rom = new ObjectOutputStream(new FileOutputStream(home));
    	rom.writeObject(roommie);
    	rom.flush();
    }
    catch (Exception ex) {
    	saveButtonLabel.setText("Something went wrong");
    }
    	
    finally{
    	
        if(rom!=null) {
        	rom.close();
        }
    }
}
//saving for HospitalFloor
public static void save(int q, int w, int e, int r, int t, int y, int u, String home ) throws FileNotFoundException, IOException {
	
    ObjectOutputStream flo=null;
    try{
    	flo = new ObjectOutputStream(new FileOutputStream(home));
    	flo.writeObject(hospFloor);
    	flo.flush();
    }
    catch (Exception ex) {
    	saveButtonLabel.setText("Something went wrong");
    }
    	
    finally{
        if(flo!=null) {
        	flo.close();
        }
    }
}
//saving for Parking_lot
public static void save(int q, int w, int e, int r, int t, int y, int u, int i, String home) throws FileNotFoundException, IOException {
	
    ObjectOutputStream par=null;
    try{
    	par = new ObjectOutputStream(new FileOutputStream(home));
    	par.writeObject(parky);
    	par.flush();
    }
    catch (Exception ex) {
    	saveButtonLabel.setText("Something went wrong");
    }
    	
    finally{
        if(par!=null) {
        	par.close();
        }
    }
}


//saving for Pharmacy
public static void save(String g, String home) throws FileNotFoundException, IOException {
	
ObjectOutputStream medkit=null;
try{
	medkit = new ObjectOutputStream(new FileOutputStream(home));
	medkit.writeObject(pharma);
	medkit.flush();
}
catch (Exception ex) {
	saveButtonLabel.setText("Something went wrong");
}
	
finally{
    if(medkit!=null) {
    	medkit.close();
    }
}
}

//saving for Queue
public static void save(String g, String k, String home) throws FileNotFoundException, IOException {
	
ObjectOutputStream pstro=null;
try{
	pstro = new ObjectOutputStream(new FileOutputStream(home));
	pstro.writeObject(que);
	pstro.flush();
}
catch (Exception ex) {
	saveButtonLabel.setText("Something went wrong");
}
	
finally{
  if(pstro!=null) {
	  pstro.close();
  }
}
}

//saving for BookOfComplaints
public static void save(String g, String k, String n, String home) throws FileNotFoundException, IOException {
	
ObjectOutputStream booksy=null;
try{
	  booksy = new ObjectOutputStream(new FileOutputStream(home));
	  booksy.writeObject(book);
	  booksy.flush();
}
catch (Exception ex) {
	saveButtonLabel.setText("Something went wrong");
}
	
finally{
	saveButtonLabel.setText("Saving successful");
    if(booksy!=null) {
  	  booksy.close();
    }
}
}
	
	public static void load() throws FileNotFoundException, IOException, ClassNotFoundException {
		String userHomeFolder = System.getProperty("user.home");
		saveButtonLabel.setText("");
		 load(1,userHomeFolder);
		 load(1,1,userHomeFolder);
		 load(1,1,1,userHomeFolder);
		 load(1,1,1,1,userHomeFolder);
		 load(1,1,1,1,1,userHomeFolder);
		 load(1,1,1,1,1,1,userHomeFolder);
		 load(1,1,1,1,1,1,1,userHomeFolder);
		 load(1,1,1,1,1,1,1,1,userHomeFolder);
		 load("1",userHomeFolder);
		 load("1","1",userHomeFolder);
		 load("1","1","1",userHomeFolder);
        
    }
	
		//Loading for Patients
	public static void load(int g, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
		 ObjectInputStream patpat=null;
		 Patient z = null;
		 int i = 0;
       try{
       	patpat=new ObjectInputStream(new FileInputStream(home +"/Desktop/Patients.txt"));
           while(true){
               z=(Patient)patpat.readObject();
              patients[i] = z;
               i++;
           }
       } 
       catch (EOFException ex) {
       }
       catch (Exception ex) {
       	loadButtonLabel.setText("Create a proper database first");
       }
       finally{
           if(patpat!=null) {
           	patpat.close();
           }
       }
       patientPointer = i;   
   }
	
	//Loading for Staff
	public static void load(int g, int k, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
		 ObjectInputStream staffy=null;
		 Staff m = null;
		 int i = 0;
       
       try{
       	staffy=new ObjectInputStream(new FileInputStream(home +"/Desktop/Staff.txt"));
           while(true){
               m=(Staff)staffy.readObject();
              personel[i] = m;
               i++;
           }
       } 
       catch (EOFException ex) {
       }
       catch (Exception ex) {
       	loadButtonLabel.setText("Create a proper database first");
       }
       finally{
           if(staffy!=null) {
           	staffy.close();
           }
       }
       staffPointer = i;
   }
    
	//Loading for Financial_Acounts
	public static void load(int g, int b, int l, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
		 ObjectInputStream finance=null;
       	Financial_Accounts k = null;
       try{
       	finance =new ObjectInputStream(new FileInputStream(home +"/Desktop/Finances.txt"));
               k =(Financial_Accounts)finance.readObject();
               finances = k;
       } 
       catch (EOFException ex) {
       }
       catch (Exception ex) {
       	loadButtonLabel.setText("Create a proper database first");
       }
       finally{
           if(finance!=null) {
           	finance.close();
           }
       }
   }
	//Loading for Equipment
	public static void load(int g, int b, int l, int c, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
		 ObjectInputStream equip=null;
      	Equipment k = null;
      try{
    	  equip =new ObjectInputStream(new FileInputStream(home +"/Desktop/Equipment.txt"));
              k =(Equipment)equip.readObject();
              eq = k;
      } 
      catch (EOFException ex) {
      }
      catch (Exception ex) {
      	loadButtonLabel.setText("Create a proper database first");
      }
      finally{
          if(equip!=null) {
        	  equip.close();
          }
      }
  }
	
	//Loading for Hospital
		public static void load(int q, int w, int e, int r, int t, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
			 ObjectInputStream hospy=null;
	      	Hospital k = null;
	      try{
	    	  hospy =new ObjectInputStream(new FileInputStream(home +"/Desktop/Hospital.txt"));
	              k =(Hospital)hospy.readObject();
	              hosp = k;
	      } 
	      catch (EOFException ex) {
	      }
	      catch (Exception ex) {
	      	loadButtonLabel.setText("Create a proper database first");
	      }
	      finally{
	          if(hospy!=null) {
	        	  hospy.close();
	          }
	      }
	  }
		//Loading for Room
		public static void load(int q, int w, int e, int r, int t, int y, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
			 ObjectInputStream rom=null;
	      	Room k = null;
	      try{
	    	  rom =new ObjectInputStream(new FileInputStream(home +"/Desktop/Room.txt"));
	              k =(Room)rom.readObject();
	              roommie = k;
	      } 
	      catch (EOFException ex) {
	      }
	      catch (Exception ex) {
	      	loadButtonLabel.setText("Create a proper database first");
	      }
	      finally{
	          if(rom!=null) {
	        	  rom.close();
	          }
	      }
	  }
		
		//Loading for HospitalFloor
		public static void load(int q, int w, int e, int r, int t, int y, int u, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
			 ObjectInputStream flo=null;
	      	HospitalFloor k = null;
	      try{
	    	  flo =new ObjectInputStream(new FileInputStream(home +"/Desktop/Hospital_floor.txt"));
	              k =(HospitalFloor)flo.readObject();
	              hospFloor = k;
	      } 
	      catch (EOFException ex) {
	      }
	      catch (Exception ex) {
	      	loadButtonLabel.setText("Create a proper database first");
	      }
	      finally{
	          if(flo!=null) {
	        	  flo.close();
	          }
	      }
	  }
		
		//Loading for Parking_lot
		public static void load(int q, int w, int e, int r, int t, int y, int u, int i, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
			 ObjectInputStream par=null;
	      	Parking_lot k = null;
	      try{
	    	  par =new ObjectInputStream(new FileInputStream(home +"/Desktop/Parking.txt"));
	              k =(Parking_lot)par.readObject();
	              parky = k;
	      } 
	      catch (EOFException ex) {
	      }
	      catch (Exception ex) {
	      	loadButtonLabel.setText("Create a proper database first");
	      }
	      finally{
	          if(par!=null) {
	        	  par.close();
	          }
	      }
	  }
		
		//Loading for Pharmacy
		public static void load(String g, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
			 ObjectInputStream medkit=null;
	      	Pharmacy k = null;
	      try{
	    	  medkit =new ObjectInputStream(new FileInputStream(home +"/Desktop/Pharmacy.txt"));
	              k =(Pharmacy)medkit.readObject();
	              pharma = k;
	      } 
	      catch (EOFException ex) {
	      }
	      catch (Exception ex) {
	      	loadButtonLabel.setText("Create a proper database first");
	      }
	      finally{
	          if(medkit!=null) {
	        	  medkit.close();
	          }
	      }
	  }
		
		//Loading for Queue
				public static void load(String g, String l, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
					 ObjectInputStream quo=null;
			      	Queue k = null;
			      try{
			    	  quo =new ObjectInputStream(new FileInputStream(home +"/Desktop/Queue.txt"));
			              k =(Queue)quo.readObject();
			              que = k;
			      }
			      catch (EOFException ex) {
			      }
			      catch (Exception ex) {
			    	  
			      	loadButtonLabel.setText("Create a proper database first");
			      }
			      finally{
			          if(quo!=null) {
			        	  quo.close();
			          }
			      }
			  }
	
				
				//Loading for BookOfComplaints
				public static void load(String g, String n, String w, String home) throws FileNotFoundException, IOException, ClassNotFoundException {
					 ObjectInputStream boo=null;
			      	BookOfComplaints k = null;
			      try{
			    	  boo =new ObjectInputStream(new FileInputStream(home +"/Desktop/Book.txt"));
			              k =(BookOfComplaints)boo.readObject();
			              book = k;
			      } 
			      catch (EOFException ex) {
			      }
			      catch (Exception ex) {
			      	loadButtonLabel.setText("Create a proper database first");
			      }
			      finally{
			    	  loadButtonLabel.setText("Loading successful");
			          if(boo!=null) {
			        	  boo.close();
			          }
			      }
			  }
	
	public static void check() {
		String user = userText.getText();
		@SuppressWarnings("deprecation")
		String password = passwordText.getText();
		if (user.equals("Admin") && password.equals("Admin")) {
			frame.dispose();
			new Gui(1);
		}
		else {
			fail.setText("Wrong username or password");
		}
	}
	
	
	public static void guiPatient() {
		new Gui(1, "p");
	}
	
	public static void guiStaff() {
		new Gui(1, "s", "t");
	}
	
	public static void guiFinancial() {
		new Gui("f");
	}
	
	public static void guiFloor() {
		new Gui("f", "s" , "w");
	}
	
	public static void guiEquipment() {
		new Gui(1, "f", "g", "d");
	}
	
	public static void guiHospital() {
		new Gui(1, "2", "1", "3", "7");
	}
	
	public static void guiRoom() {
		new Gui(1, 1);
	}
	
	public static void guiParking() {
		new Gui(1, 1 ,1);
	}
	
	public static void guiQueue() {
		new Gui(1, 1 ,1, 1);
	}
	
	public static void guiBook() {
		new Gui(1, 1 ,1, 1, 1);
	}
	
	public static void guiPharmacy() {
		new Gui(1, 1 ,1, 1, 1, 1);
	}
	
	
	
	public static void patientInfo() {
		String patientText = getPatientInfoText.getText();
        try{
        	if (patientText.equals("")){
				patientInfoLabel.setText("Please fill in the id field");
     }
        	else {

            int number = Integer.parseInt(patientText);
            patientInfoLabel.setText(patients[number].toString());
        }
        }
        catch (NumberFormatException ex){
        	patientInfoLabel.setText("Please, input a number, not a mix");
        }
        catch (Exception ex) {
        	patientInfoLabel.setText("Wrong id");
        }
	}
	
	public static void staffInfo() {
		String staffText = getStaffInfoText.getText();
        try{
        	 
        	if (staffText.equals("")){
     				staffInfoLabel.setText("Please fill in the id field");
       }
        	else {
            int number = Integer.parseInt(staffText);
           staffInfoLabel.setText(personel[number].toString());
           staffInfoEqLabel.setText("Equipment:  " + personel[number].getEquipment());
       }
       }
        catch (NumberFormatException ex){
        	staffInfoLabel.setText("Please, input a number, not a mix");
        }
        catch (Exception ex) {
        	staffInfoLabel.setText("Wrong id");
        }
	}
	
	public static void equipmentInfo() {
		getEquipmentLabel_2.setText(eq.toString());
	}
	
	public static void financeInfo() {
		financeInfoLabel.setText(finances.toString());
	}
	
	public static void hospitalInfo() {
		hospitalCheckLabel_2.setText(hosp.toString());
	}
	
	public static void roomInfo() {
		roomCheckLabel_2.setText(roommie.toString());
	}
	public static void floorInfo() {
		floorCheckLabel_2.setText(hospFloor.toString());
	}
	
	public static void parkingInfo() {
		parkingCheckLabel_2.setText(parky.toString());
	}
	
	public static void queueInfo() {
		queueCheckLabel_2.setText(que.toString());
	}
	
	public static void bookInfo() {
		bookCheckLabel_2.setText(book.toString());
	}
	
	public static void pharmacyInfo() {
		pharmacyCheckLabel_2.setText(pharma.toString());
	}
	
	public static void patientCreate(){
		String name = setPatientNameText.getText();
		String surname = setPatientSurnameText.getText();
		String dateOfBirth = setPatientBirthText.getText();
		String injury = setInjuryText.getText();
		String mainClinic = setMainClinicText.getText();
		try{
			if (name.equals("") || surname.equals("") || dateOfBirth.equals("") || injury.equals("") || mainClinic.equals("")){
				patientCreationLabel.setText("Please fill all the fields");
     }
     else {
      
			double debt = Double.parseDouble(setDebtText.getText());
			patients[patientPointer] = new Patient(name, surname, dateOfBirth, injury, patientPointer, debt, mainClinic);
			patientCreationLabel.setText("Patient created succesfully with id: " + patients[patientPointer].getId());
			patientPointer++;
     }
        }
        catch (NumberFormatException ex){
        	patientCreationLabel.setText("Please, input a double number, not a mix");
        }
        catch (Exception ex) {
        	patientCreationLabel.setText("Something went wrong");
        }
		
	}
	
	public static void staffCreate(){
		String name = setStaffNameText.getText();
		String surname = setStaffSurnameText.getText();
		String dateOfBirth = setStaffBirthText.getText();
		String floor = setOccupiedFloorText.getText();
		String occupancy = setProfessionText.getText();
		String equipment = setEquipmentText.getText();
		try{
			if (name.equals("") || surname.equals("") || dateOfBirth.equals("") || floor.equals("") || occupancy.equals("") || equipment.equals("") || setSalaryText.getText().equals("")){
				staffCreationLabel.setText("Please fill all the fields");
     }
     else {
      
			double salary = Double.parseDouble(setSalaryText.getText());
			personel[staffPointer] = new Staff(name, surname, dateOfBirth, occupancy, equipment, floor, staffPointer, salary);
			staffCreationLabel.setText("Staff created succesfully with id: " + personel[staffPointer].getId());
			staffPointer++;
     }
        }
        catch (NumberFormatException ex){
        	staffCreationLabel.setText("Please, input a double number, not a mix");
        }
        catch (Exception ex) {
        	staffCreationLabel.setText("Something went wrong");
        }
		
	}
	
	public static void financeCreate() {
		String bank = setBankText.getText();
		String value = setCurrentBalanceText.getText();
		try{
			if (bank.equals("") || value.equals("")){
				financeCreationLabel.setText("Please fill all the fields");
     }
     else {
      
			double balance = Double.parseDouble(setCurrentBalanceText.getText());
			finances.setTotal_money(balance);
			finances.setAccount(bank);
			financeCreationLabel.setText("Operation successfull");
     }
		}
        catch (NumberFormatException ex){
        	financeCreationLabel.setText("Please, input a double number, not a mix");
        }
        catch (Exception ex) {
        	financeCreationLabel.setText("Something went wrong");
        }
	}
	public static void financePay() {
		try{
			if (setPatientDebtText.getText().equals("")){
			financeDebtLabel.setText("Please input an id first");
			}
			else {	
			int choice = Integer.parseInt(setPatientDebtText.getText());
			double toBePaid;
			toBePaid = patients[choice].getDebt();
			patients[choice].setDebt(0);
			finances.setTotal_money(finances.getTotal_money() + toBePaid);
			financeDebtLabel.setText("Successfully received owed money. New Balance:   " + finances.getTotal_money() + "$");
			}
		
     }
        catch (NumberFormatException ex){
        	staffCreationLabel.setText("Please, input a double number, not a mix");
        }
        catch (Exception ex) {
        	staffCreationLabel.setText("Well, id also has to be within the range of declared patients");
        }
		
	}
	
	public static void setPulseMeasurers() {
		try{
			if (setPulseMeasurersText.getText().equals("")){
				setPulseMeasurersConfirmLabel.setText("Please fill in the ammount first");
     }
     else {
      
    	 int measur = Integer.parseInt(setPulseMeasurersText.getText());
			eq.setPulse_measurers(measur);
			setPulseMeasurersConfirmLabel.setText("Operation successfull");
     }
		}
        catch (NumberFormatException ex){
        	setPulseMeasurersConfirmLabel.setText("Please, input an integer");
        }
        catch (Exception ex) {
        	setPulseMeasurersConfirmLabel.setText("Something went wrong");
        }
	}
	
	public static void setScalpels() {
		try{
			if (setScalpelsText.getText().equals("")){
				setScalpelsConfirmLabel.setText("Please fill in the ammount first");
     }
     else {
      
    	 int scalps = Integer.parseInt(setScalpelsText.getText());
			eq.setScalpels(scalps);
			setScalpelsConfirmLabel.setText("Operation successfull");
     }
		}
        catch (NumberFormatException ex){
        	setScalpelsConfirmLabel.setText("Please, input an integer");
        }
        catch (Exception ex) {
        	setScalpelsConfirmLabel.setText("Something went wrong");
        }
	}
	
	public static void setPlungers() {
		try{
			if (setPlungersText.getText().equals("")){
				setPlungersConfirmLabel.setText("Please fill in the ammount first");
     }
     else {
      
    	 int plungs = Integer.parseInt(setPlungersText.getText());
			eq.setPlungers(plungs);
			setPlungersConfirmLabel.setText("Operation successfull");
     }
		}
        catch (NumberFormatException ex){
        	setPlungersConfirmLabel.setText("Please, input an integer");
        }
        catch (Exception ex) {
        	setPlungersConfirmLabel.setText("Something went wrong");
        }
	}
	
	public static void setLaptops() {
		try{
			if (setLaptopsText.getText().equals("")){
				setLaptopsConfirmLabel.setText("Please fill in the ammount first");
     }
     else {
      
    	 int laps = Integer.parseInt(setLaptopsText.getText());
			eq.setLaptops(laps);
			setLaptopsConfirmLabel.setText("Operation successfull");
     }
		}
        catch (NumberFormatException ex){
        	setLaptopsConfirmLabel.setText("Please, input an integer");
        }
        catch (Exception ex) {
        	setLaptopsConfirmLabel.setText("Something went wrong");
        }
	}
	
	public static void setAnesthetics() {
		try{
			if (setAnestheticsText.getText().equals("")){
				setAnestheticsConfirmLabel.setText("Please fill in the ammount first");
     }
     else {
      
    	 int anes = Integer.parseInt(setAnestheticsText.getText());
			eq.setAnesthetics(anes);
			setAnestheticsConfirmLabel.setText("Operation successfull");
     }
		}
        catch (NumberFormatException ex){
        	setAnestheticsConfirmLabel.setText("Please, input an integer");
        }
        catch (Exception ex) {
        	setAnestheticsConfirmLabel.setText("Something went wrong");
        }
	}
	
	public static void eqManagement(String item) {
		String who = giveEquipmentText.getText();
        try{
        	if (who.equals("")){
				giveEquipmentLabel_2.setText("Please at least specify the id...");
     }
        	else {

            int number = Integer.parseInt(who);
            giveEquipmentLabel_2.setText(personel[number].setEquipment(item, eq));
        }
        }
        catch (NumberFormatException ex){
        	giveEquipmentLabel_2.setText("Please, input a number, not a mix");
        }
        catch (Exception ex) {
        	giveEquipmentLabel_2.setText("Wrong id");
        }
	}
	
	public static void createHospital() {
		String width = hospitalWidthText.getText();
		String length = hospitalLengthText.getText();
		String height = hospitalHeightText.getText();
		String floors = hospitalFloorText.getText();
		try{
			if (length.equals("") || height.equals("") || width.equals("") || floors.equals("")){
				hospitalCreateLabel.setText("Please fill all the fields");
     }
     else {
    	 	
			double widthy = Double.parseDouble(width);
			double lengthy = Double.parseDouble(length);
			double heighty = Double.parseDouble(height);
			int floorsy = Integer.parseInt(floors);
			hosp.setHeight(heighty);
			hosp.setLength(lengthy);
			hosp.setWidth(widthy);
			hosp.setFloors(floorsy);
			hosp.setArea(widthy, floorsy, heighty);
			hosp.setFloorSize(widthy, floorsy);
			hospitalCreateLabel.setText("Success");
     }
        }
        catch (NumberFormatException ex){
        	hospitalCreateLabel.setText("Please, input numbers in correct format");
        }
        catch (Exception ex) {
        	hospitalCreateLabel.setText("Something went wrong");
        }
		
	}
	
	public static void createRoom() {
		String color = roomColorText.getText();
		String type = roomTypeText.getText();
			if (color.equals("") || type.equals("")){
				roomCreateLabel.setText("Please fill all the fields");
     }
			else {

		roommie.setColor(color);
		roommie.setTypeOfPaint(type);
		roomCreateLabel.setText("Success");
	}
		}
	
	public static void createFloor() {
		String type = floorTypeText.getText();
		String sound = floorSoundText.getText();
		if (type.equals("") || sound.equals("")){
			floorCreateLabel.setText("Please fill all the fields");
 }
		else {
		hospFloor.setSound(sound);
		hospFloor.setType(type);
		floorCreateLabel.setText("Success");
	}
	}
	
	public static void createParkingLot() {
		String slots = parkingSlotsText.getText();
		String disabledSlots = parkingDisabledSlotsText.getText();
		try{
			if (slots.equals("") || disabledSlots.equals("")){
				parkingCreateLabel.setText("Please fill all the fields");
     }
			else {
		int slotsy = Integer.parseInt(slots);
		int disabledSlotsy = Integer.parseInt(disabledSlots);
		parky.setSlots(slotsy);
		parky.setDisabledSlots(disabledSlotsy);
		parkingCreateLabel.setText("Success");
	}
		}
		 catch (NumberFormatException ex){
		        parkingCreateLabel.setText("Please, input numbers in correct format");
		 }
		 catch (Exception ex){
		        parkingCreateLabel.setText("Something went wrong");
		 }
	}
	
	public static void createQueue() {
		String time = queueTimeText.getText();
		String mood = queueMoodText.getText();
		try{
			if (time.equals("") ||mood.equals("")){
				queueCreateLabel.setText("Please fill all the fields");
     }
			else {
		double timey = Double.parseDouble(time);
		que.setTime(timey);
		que.setMood(mood);
		queueCreateLabel.setText("Success");
	}
		}
		 catch (NumberFormatException ex){
		        queueCreateLabel.setText("Please, input numbers in correct format");
		 }
		 catch (Exception ex){
		        queueCreateLabel.setText("Something went wrong");
		 }
	}
	
	public static void createBook() {
		String complaints = bookComplaintsText.getText();
		String praises = bookPraisesText.getText();
		try{
			if (complaints.equals("") ||praises.equals("")){
				bookCreateLabel.setText("Please fill all the fields");
     }
			else {
		int complainey = Integer.parseInt(complaints);
		int praisey = Integer.parseInt(praises);
		book.setComplaints(complainey);
		book.setPraises(praisey);
		bookCreateLabel.setText("Success");
	}
		}
		 catch (NumberFormatException ex){
		        bookCreateLabel.setText("Please, input numbers in correct format");
		 }
		 catch (Exception ex){
		        bookCreateLabel.setText("Something went wrong");
		 }
	}
	
	public static void createPharmacy() {
		String drugs = pharmacyDrugsText.getText();
		String price = pharmacyPriceText.getText();
		try{
			if (drugs.equals("") ||price.equals("")){
				pharmacyCreateLabel.setText("Please fill all the fields");
     }
			else {
		double pricey = Double.parseDouble(price);
		int drugsy = Integer.parseInt(drugs);
		pharma.setPrice(pricey);
		pharma.setDrugs(drugsy);
		pharmacyCreateLabel.setText("Success");
	}
		}
		 catch (NumberFormatException ex){
		       	pharmacyCreateLabel.setText("Please, input numbers in correct format");
		 }
		 catch (Exception ex){
		        pharmacyCreateLabel.setText("Something went wrong");
		 }
	}
	
	public static void sellPharmacy() {
		String pharmaId = pharmacyIdText.getText();
		String pharmaAmmount = pharmacyAmmountText.getText();
		try{
			if (pharmaId.equals("") || pharmaAmmount.equals("")){
				pharmacySellLabel_2.setText("Please fill in the above forms");
			}
			else {	
			int pharmaIdy = Integer.parseInt(pharmaId);
			int pharmaAmmounty = Integer.parseInt(pharmaAmmount);
			pharmacySellLabel_2.setText(pharma.buyDrugs(patients[pharmaIdy], pharmaAmmounty));
			}
		
     }
        catch (NumberFormatException ex){
        	pharmacySellLabel_2.setText("Please, input numbers in correct format");
        }
        catch (Exception ex) {
        	pharmacySellLabel_2.setText("Well, id also has to be within the range of declared patients");
        }
		
	}
	
	
}