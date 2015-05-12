package main;

import java.awt.*;
import java.util.*;


import javax.swing.JOptionPane;

public class browserBackEnd {
	
	void loadPage(String URLinput){
		
		main_gui gui = new main_gui();
		
		try{
			
			//MOST GODDAMN IMPORTANT CLASS!!!!
			gui.editorPaneBrowser.setPage(URLinput);			
			gui.txtBrowserURL.setText(URLinput);
			
		}
		
		 catch(Exception e){
			 JOptionPane.showMessageDialog(null, "This Page could not be loaded!");
		 }
		
		
	}

}
