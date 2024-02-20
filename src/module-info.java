module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
	exports gui;
	exports model.entities;
	exports model.services;
}