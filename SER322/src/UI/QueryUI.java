package UI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class QueryUI extends Application{
	int height, width;
	@Override
	public void start(Stage stage) throws Exception {
		height = 100;
		width = 300;
		VBox queryBox = new VBox();
		Label textLabel = new Label("SQL Query");
		Button execute = new Button("Execute");
		TextArea textBox = new TextArea();
		textBox.setPrefHeight(height);
		textBox.setPrefWidth(width);
		textBox.setText("Enter your query here");
		execute.setOnAction((event) -> {
			String query = textBox.getText();
			System.out.println(query);
		});
		FlowPane flow = new FlowPane();
		queryBox.getChildren().add(textLabel);
		queryBox.getChildren().add(textBox);
		queryBox.getChildren().add(execute);
		flow.getChildren().add(queryBox);
		flow.setAlignment(Pos.CENTER);
		stage.setScene(new Scene(flow));
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
