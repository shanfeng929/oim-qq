/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oim.fx.app;

import javax.swing.UIManager;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 2013-9-4 15:36:45
 * 
 * @author XiaHui
 */
public class AppStartup extends Application {

	Launcher startup = new Launcher();

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			java.util.logging.Logger.getLogger(AppStartup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
	}
}
