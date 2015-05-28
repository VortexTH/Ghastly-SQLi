package main;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;

import javax.swing.JCheckBox;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;





public class main {
	
	public String stringCommand = "";
	public String stringTargetURL = "";
	public String stringConnection = "";
	public String stringEnum = "";
	public String stringInjection = "";
	public String stringDetection = "";
	public String stringTechniques = "";
	public String stringFingerprint = "";
	public String stringOptimization = "";
	public String stringFileSystemAccess = "";
	public String stringOSAccess = "";
	public String stringWindowsRegistryAcces = "";
	public String stringUserDefinedInjection = "";
	public String stringEnumArg = "";
	public String stringInjectionArg = "";
	public String stringDetectionArg = "";
	public String stringTechniquesArg = "";
	public String stringOptimizationArg	= "";
	public String stringFSAArg	= "";
	public String stringOSAccessArg	= "";
	public String stringUserDefinedInjectionArg	= "";
	public String stringWindowsRegistryAccesArg	= "";
	public String stringDBArg = "";
	public String stringTableArg = "";
	public String stringColumnArg = "";
	public String stringUserArg = "";
	public String stringTorSocket = "";
	public String stringTorPort = "";
	public String stringFakeUserAgent = "";
	public String FUser = "";
	public boolean tormode = false;

	private JFrame frmEhcV;
	private JTextField targetURL;
	private JTextField commandOut;
	private JTextField torport;
	private JTextField fordatabase;
	private JTextField fortable;
	private JTextField forcolumn;
	private JTextField foruser;
	private JTextField argenumeration;
	private JTextField arginjection;
	private JTextField argdetection;
	private JTextField argtechniques;
	private JTextField argfingerprint;
	private JTextField argoptimization;
	private JTextField argfsa;
	private JTextField argosa;
	private JTextField argwinregaccess;
	private JTextField arguserdefinedinjection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmEhcV.setVisible(true);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frmEhcV = new JFrame();
		frmEhcV.setTitle("GHASTLY SQLi V0.1 (c) Tim 2015");
		frmEhcV.setBounds(100, 100, 800, 700);
		frmEhcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEhcV.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 764, 641);
		frmEhcV.getContentPane().add(tabbedPane);
		
		JPanel hashcat = new JPanel();
		tabbedPane.addTab("SQLmap", null, hashcat, null);
		hashcat.setLayout(null);
		
		JLabel lblHashFile = new JLabel("Target URL:");
		lblHashFile.setBounds(10, 11, 58, 22);
		hashcat.add(lblHashFile);
		
		targetURL = new JTextField();
		targetURL.setBounds(78, 11, 590, 22);
		hashcat.add(targetURL);
		targetURL.setColumns(10);
		
		JButton paste = new JButton("Paste");
		paste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				File loc = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
				fileChooser.setCurrentDirectory(loc);
		        int returnValue = fileChooser.showOpenDialog(null);
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		          File selectedFilePath = fileChooser.getSelectedFile();
		          targetURL.setText((selectedFilePath.getPath()));
		        }
			}
		});
		paste.setBounds(678, 11, 71, 23);
		hashcat.add(paste);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(149, 96, 310, 12);
		hashcat.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(423, 341, 38, 12);
		hashcat.add(separator_2);
		
		JLabel lblWordlists = new JLabel("Attack Parameters");
		lblWordlists.setBounds(59, 86, 89, 22);
		hashcat.add(lblWordlists);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 96, 57, 12);
		hashcat.add(separator_4);
		
		JLabel lblLength_1 = new JLabel("Arguments");
		lblLength_1.setBounds(463, 86, 58, 22);
		hashcat.add(lblLength_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(520, 96, 239, 12);
		hashcat.add(separator_5);
		
		JLabel lblMask = new JLabel("TOR");
		lblMask.setBounds(463, 331, 37, 22);
		hashcat.add(lblMask);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(487, 341, 271, 12);
		hashcat.add(separator_11);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 452, 759, 12);
		hashcat.add(separator_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(423, 96, 10, 357);
		hashcat.add(separator_1);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(0, 512, 46, 12);
		hashcat.add(separator_8);
		
		JLabel lblCommand = new JLabel("Command:");
		lblCommand.setBounds(54, 501, 52, 22);
		hashcat.add(lblCommand);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(108, 511, 651, 12);
		hashcat.add(separator_9);
		
		commandOut = new JTextField();
		commandOut.setFont(new Font("Tahoma", Font.PLAIN, 11));
		commandOut.setBounds(10, 535, 739, 33);
		hashcat.add(commandOut);
		commandOut.setColumns(10);
		
		JButton CopyToClipboard = new JButton("Copy To Clipboard");
		CopyToClipboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				StringSelection copied = new StringSelection(commandOut.getText());
			    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			    clipboard.setContents (copied, copied);
								
			}
		});
		CopyToClipboard.setBounds(10, 579, 161, 23);
		hashcat.add(CopyToClipboard);
		
		JCheckBox chckbxEnableTorProx = new JCheckBox("Enable TOR proxy");
		chckbxEnableTorProx.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				tormode = true;
				
			}
		});
		chckbxEnableTorProx.setBounds(530, 352, 113, 23);
		hashcat.add(chckbxEnableTorProx);
		
		JLabel lblPort = new JLabel("port:");
		lblPort.setBounds(432, 390, 46, 14);
		hashcat.add(lblPort);
		
		torport = new JTextField();
		torport.setBounds(460, 388, 80, 20);
		hashcat.add(torport);
		torport.setColumns(10);
		
		JLabel lblSocket = new JLabel("Socket:");
		lblSocket.setBounds(550, 390, 46, 14);
		hashcat.add(lblSocket);
		
		JComboBox torsocket = new JComboBox();
		torsocket.setModel(new DefaultComboBoxModel(new String[] {"SOCKS5", "SOCKS4"}));
		torsocket.setBounds(590, 388, 158, 20);
		hashcat.add(torsocket);
		
		JLabel lblFakeUserAgent = new JLabel("Fake User Agent:");
		lblFakeUserAgent.setBounds(432, 417, 89, 14);
		hashcat.add(lblFakeUserAgent);
		
		JComboBox fua = new JComboBox();
		fua.setModel(new DefaultComboBoxModel(new String[] {"(none)", "Google Bot"}));
		fua.setBounds(520, 414, 228, 20);
		hashcat.add(fua);
		
		JLabel lblTargetConnectio = new JLabel("Target Connection:");
		lblTargetConnectio.setBounds(10, 56, 96, 14);
		hashcat.add(lblTargetConnectio);
		
		JComboBox connection = new JComboBox();
		connection.setModel(new DefaultComboBoxModel(new String[] {"URL"}));
		connection.setBounds(115, 53, 113, 20);
		hashcat.add(connection);
		
		JComboBox boxoptimization = new JComboBox();
		boxoptimization.setMaximumRowCount(40);
		boxoptimization.setModel(new DefaultComboBoxModel(new String[] {"(none)", "All (Auto; not recommended)", "Predict Output", "Keep Alive", "Null Connection", "Max Number Of Threads:"}));
		boxoptimization.setBounds(78, 275, 242, 20);
		hashcat.add(boxoptimization);
		
		JLabel lblOptimization = new JLabel("Optimization:");
		lblOptimization.setBounds(10, 278, 79, 14);
		hashcat.add(lblOptimization);
		
		JLabel lblInjection = new JLabel("Injection:");
		lblInjection.setBounds(10, 153, 46, 14);
		hashcat.add(lblInjection);
		
		JComboBox boxinjection = new JComboBox();
		boxinjection.setMaximumRowCount(40);
		boxinjection.setModel(new DefaultComboBoxModel(new String[] {"Auto (recommended)", "Testable Parameter:", "Skip Given Parameter:", "Force Backend DBMS To Value:"}));
		boxinjection.setBounds(78, 150, 242, 20);
		hashcat.add(boxinjection);
		
		JLabel lblDetection = new JLabel("Detection:");
		lblDetection.setBounds(10, 183, 67, 14);
		hashcat.add(lblDetection);
		
		JComboBox boxdetection = new JComboBox();
		boxdetection.setMaximumRowCount(40);
		boxdetection.setModel(new DefaultComboBoxModel(new String[] {"Auto Promt (recommended)", "Level Of Tests To Perform:", "Risk Of Test To Perform:"}));
		boxdetection.setBounds(78, 182, 242, 20);
		hashcat.add(boxdetection);
		
		JLabel lblTechniques = new JLabel("Techniques:");
		lblTechniques.setBounds(10, 217, 58, 14);
		hashcat.add(lblTechniques);
		
		JComboBox boxtechniques = new JComboBox();
		boxtechniques.setMaximumRowCount(40);
		boxtechniques.setModel(new DefaultComboBoxModel(new String[] {"Auto (recommended)", "Technique To Use:"}));
		boxtechniques.setBounds(78, 214, 242, 20);
		hashcat.add(boxtechniques);
		
		JLabel lblFingerprint = new JLabel("Fingerprint:");
		lblFingerprint.setBounds(10, 247, 79, 14);
		hashcat.add(lblFingerprint);
		
		JComboBox boxfingerprint = new JComboBox();
		boxfingerprint.setMaximumRowCount(40);
		boxfingerprint.setModel(new DefaultComboBoxModel(new String[] {"OFF", "ON"}));
		boxfingerprint.setBounds(78, 244, 242, 20);
		hashcat.add(boxfingerprint);
		
		JComboBox boxenumeration = new JComboBox();
		boxenumeration.setMaximumRowCount(40);
		boxenumeration.setModel(new DefaultComboBoxModel(new String[] {"(none)", "Simple Scan", "Enumerate Databases", "Enumerate DB Tables", "Enumerate Table Columns", "Dump Table", "Dump Full Database", "Enumerate DBMS users", "Enumerate DBMS users Passwd Hashes", "Enumerate DBMS user Privileges", "Enumerate DBMS user Roles", "Retrieve DBMS Banner", "Retrieve DBMS Current User", "Retrieve DBMS Server Hostname", "Retrieve Everything", "Search"}));
		boxenumeration.setBounds(78, 119, 242, 20);
		hashcat.add(boxenumeration);
		
		JLabel lblEnumeration = new JLabel("Enumeration:");
		lblEnumeration.setBounds(10, 122, 79, 14);
		hashcat.add(lblEnumeration);
		
		JLabel lblFileSystemAccess = new JLabel("File System Access:");
		lblFileSystemAccess.setBounds(10, 306, 126, 14);
		hashcat.add(lblFileSystemAccess);
		
		JComboBox boxfilesystemaccess = new JComboBox();
		boxfilesystemaccess.setMaximumRowCount(40);
		boxfilesystemaccess.setModel(new DefaultComboBoxModel(new String[] {"(none) ", "Read File From Backend:", "Write File To Backend:", "Backend Filepath To Write To:"}));
		boxfilesystemaccess.setBounds(108, 303, 212, 20);
		hashcat.add(boxfilesystemaccess);
		
		JLabel lblOsAccess = new JLabel("OS Access:");
		lblOsAccess.setBounds(10, 334, 66, 14);
		hashcat.add(lblOsAccess);
		
		JComboBox boxosaccess = new JComboBox();
		boxosaccess.setModel(new DefaultComboBoxModel(new String[] {"(none)", "Execute An OS Command:", "Prompt For Shell", "Promt For Out-Of-Band Shell", "OOB, Meterpreter, VNC", "Stored Procedure Buffer Overflow Exploitation", "DB Process Under Priveledge Escalation", "Local Path To Metasploit Framework:", "Remote Absolute Path To Temp Dir:"}));
		boxosaccess.setMaximumRowCount(40);
		boxosaccess.setBounds(78, 331, 242, 20);
		hashcat.add(boxosaccess);
		
		JLabel lblWindowsRegistryAccess = new JLabel("Windows registry Access:");
		lblWindowsRegistryAccess.setBounds(10, 364, 138, 14);
		hashcat.add(lblWindowsRegistryAccess);
		
		JComboBox boxwindowsregistryaccess = new JComboBox();
		boxwindowsregistryaccess.setModel(new DefaultComboBoxModel(new String[] {"(none)", "Read A Reg Key Value", "Write A Reg Key Value", "Delete A Reg Key Value"}));
		boxwindowsregistryaccess.setMaximumRowCount(40);
		boxwindowsregistryaccess.setBounds(143, 362, 177, 20);
		hashcat.add(boxwindowsregistryaccess);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Runtime runt = Runtime.getRuntime();
				
				String updatecmd = "python sqlmap.py " + "--update";
				
				try {
					runt.exec("cmd.exe /c start cmd.exe /k \""+updatecmd+"\"");
				} catch (IOException z) {
					JOptionPane.showMessageDialog(null, z);
					z.printStackTrace();
				}
				
			}
		});
		btnUpdate.setBounds(149, 471, 89, 23);
		hashcat.add(btnUpdate);
		
		JLabel lblLooksFor = new JLabel("Looks for & installs Updates:");
		lblLooksFor.setBounds(10, 475, 161, 14);
		hashcat.add(lblLooksFor);
		
		JLabel lblUserDefinedInjection = new JLabel("User defined Injection:");
		lblUserDefinedInjection.setBounds(10, 393, 126, 14);
		hashcat.add(lblUserDefinedInjection);
		
		JComboBox boxuserdefinedinjection = new JComboBox();
		boxuserdefinedinjection.setModel(new DefaultComboBoxModel(new String[] {"OFF", "Inject Custom Function:", "Local Path Of Shared Library:"}));
		boxuserdefinedinjection.setBounds(143, 390, 177, 20);
		hashcat.add(boxuserdefinedinjection);
		
		JLabel lblForDatabase = new JLabel("For Database:");
		lblForDatabase.setBounds(432, 119, 89, 14);
		hashcat.add(lblForDatabase);
		
		JLabel lblForTable = new JLabel("For Table:");
		lblForTable.setBounds(432, 144, 68, 14);
		hashcat.add(lblForTable);
		
		JLabel lblForColumn = new JLabel("For Column:");
		lblForColumn.setBounds(432, 168, 68, 14);
		hashcat.add(lblForColumn);
		
		fordatabase = new JTextField();
		fordatabase.setBounds(504, 116, 203, 20);
		hashcat.add(fordatabase);
		fordatabase.setColumns(10);
		
		fortable = new JTextField();
		fortable.setColumns(10);
		fortable.setBounds(504, 141, 203, 20);
		hashcat.add(fortable);
		
		forcolumn = new JTextField();
		forcolumn.setColumns(10);
		forcolumn.setBounds(504, 165, 203, 20);
		hashcat.add(forcolumn);
		
		JButton button = new JButton("?");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "<html>Make sure there is an Instance<br>Of TOR runnig on your System<br>At the moment!</html>");
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(701, 352, 48, 23);
		hashcat.add(button);
		
		JLabel lblForUser = new JLabel("For User:");
		lblForUser.setBounds(432, 196, 68, 14);
		hashcat.add(lblForUser);
		
		foruser = new JTextField();
		foruser.setColumns(10);
		foruser.setBounds(504, 193, 203, 20);
		hashcat.add(foruser);
		
		JLabel lblAdditionalArgs = new JLabel("Additional Args:");
		lblAdditionalArgs.setBounds(330, 105, 93, 14);
		hashcat.add(lblAdditionalArgs);
		
		argenumeration = new JTextField();
		argenumeration.setBounds(330, 119, 86, 20);
		hashcat.add(argenumeration);
		argenumeration.setColumns(10);
		
		arginjection = new JTextField();
		arginjection.setColumns(10);
		arginjection.setBounds(330, 150, 86, 20);
		hashcat.add(arginjection);
		
		argdetection = new JTextField();
		argdetection.setColumns(10);
		argdetection.setBounds(330, 180, 86, 20);
		hashcat.add(argdetection);
		
		argtechniques = new JTextField();
		argtechniques.setColumns(10);
		argtechniques.setBounds(330, 214, 86, 20);
		hashcat.add(argtechniques);
		
		argfingerprint = new JTextField();
		argfingerprint.setColumns(10);
		argfingerprint.setBounds(330, 244, 86, 20);
		hashcat.add(argfingerprint);
		
		argoptimization = new JTextField();
		argoptimization.setColumns(10);
		argoptimization.setBounds(330, 275, 86, 20);
		hashcat.add(argoptimization);
		
		argfsa = new JTextField();
		argfsa.setColumns(10);
		argfsa.setBounds(330, 303, 86, 20);
		hashcat.add(argfsa);
		
		argosa = new JTextField();
		argosa.setColumns(10);
		argosa.setBounds(330, 332, 86, 20);
		hashcat.add(argosa);
		
		argwinregaccess = new JTextField();
		argwinregaccess.setColumns(10);
		argwinregaccess.setBounds(330, 361, 86, 20);
		hashcat.add(argwinregaccess);
		
		arguserdefinedinjection = new JTextField();
		arguserdefinedinjection.setColumns(10);
		arguserdefinedinjection.setBounds(330, 390, 86, 20);
		hashcat.add(arguserdefinedinjection);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("LOG", null, panel_1, null);
		
		JTextArea logarea = new JTextArea();
		logarea.setBounds(10, 11, 739, 568);
		panel_1.add(logarea);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("DUMP", null, panel, null);
		
		JPanel HashID = new JPanel();
		tabbedPane.addTab("Hash-ID", null, HashID, null);
		HashID.setLayout(null);
		
		JButton btnClearLog = new JButton("Clear Log");
		btnClearLog.setBounds(10, 590, 89, 23);
		btnClearLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logarea.setText("");
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnClearLog);		
		
		JButton btnEnumerate = new JButton("ENUMERATE");
		btnEnumerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				stringEnum = boxenumeration.getSelectedItem().toString();
				stringInjection = boxinjection.getSelectedItem().toString();
				stringFingerprint = boxfingerprint.getSelectedItem().toString();
				stringDetection = boxdetection.getSelectedItem().toString();
				
				stringTargetURL = targetURL.getText();
				stringUserArg = foruser.getText();
				stringColumnArg = forcolumn.getText();
				stringTableArg = fortable.getText();
				stringUserArg = foruser.getText();			
				stringFakeUserAgent = fua.getSelectedItem().toString();
				stringDBArg = fordatabase.getText();
				
				String enumeration = "";
				String TOR = "";
				
				
				
				//TOR Options
				if(stringFakeUserAgent == "Google Bot"){
					 FUser = " --user-agent=\"Googlebot (compatible; Googlebot/2.1; +http://www.google.com/bot.html)\"";
				}
				stringTorSocket = torsocket.getSelectedItem().toString();
				stringTorPort = torport.getText();
				stringTorSocket = torsocket.getSelectedItem().toString();
				if(tormode == true){					
					TOR = " --tor " + "--tor-type=" + stringTorSocket + " --tor-port=" + stringTorPort + FUser + " --check-tor ";
				}
				
				
								
				//Enumeration Options
				if(stringEnum == "Simple Scan"){
					enumeration = "";
				}				
				else if(stringEnum == "Enumerate Databases"){
					enumeration = " --dbs ";
				}
				else if(stringEnum == "Enumerate DB Tables"){
					enumeration = " --tables " + "-D " + stringDBArg;
				}
				else if(stringEnum == "Enumerate Table Columns"){
					enumeration = " --columns " + "-D " + stringDBArg + " -T " + stringTableArg;
				}
				else if(stringEnum == "Dump Table"){
					enumeration = " --dump " + "-D " + stringDBArg + " -T " + stringTableArg;
				}
				else if(stringEnum == "Dump Full Database"){
					enumeration = " --dump-all " + "-D " + stringDBArg + " -T " + stringTableArg;
				}
				
                
				
				//Sets Command String that is passed to SQLmap
				if(connection.getSelectedItem().toString() == "URL"){
				stringCommand = "python sqlmap.py " + "-u " + "\"" + stringTargetURL + "\"" + enumeration + TOR;
				}
				
				//Gets Runtime, executes cmd, passing "stringCommand" to the process.
								
				Runtime rt = Runtime.getRuntime();
				
				try {
					rt.exec("cmd.exe /c start cmd.exe /k \""+stringCommand+"\"");
				} catch (IOException z) {
					JOptionPane.showMessageDialog(null, z);
					z.printStackTrace();
				}
				
				//Creates an input stream from the cmd Process and reads it
				/*
				InputStream inputStream = proc.getInputStream();
				InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

				
				Appends Input Stream from cdm to logarea				
				String line = "";				
				
				try {
				line = bufferedReader.readLine();					
				} catch (IOException e2) {
				   
					JOptionPane.showMessageDialog(null, e2);
				
				   }
				
					while (line != null)
					{
					    logarea.append(line);
					}				
				*/
				
				
			}
		});
		btnEnumerate.setBounds(423, 464, 325, 36);
		hashcat.add(btnEnumerate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fordatabase.setText("");
				foruser.setText("");
				fortable.setText("");
				forcolumn.setText("");
			}
		});		
		btnClear.setBounds(682, 307, 67, 23);
		hashcat.add(btnClear);
		
		
		
		
		}
	}
