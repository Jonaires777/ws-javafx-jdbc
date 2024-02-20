module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	requires transitive javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
	exports gui;
	exports model.entities;
	exports model.services;
	exports gui.listeners;
}