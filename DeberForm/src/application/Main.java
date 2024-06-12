package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("allControls.fxml");

        AnchorPane anchorPane = new AnchorPane();

        // Button
        Button button = new Button("Button");
        Label buttonLabel = new Label("Button:");
        AnchorPane.setTopAnchor(buttonLabel, 10.0);
        AnchorPane.setLeftAnchor(buttonLabel, 10.0);
        AnchorPane.setTopAnchor(button, 10.0);
        AnchorPane.setLeftAnchor(button, 100.0);
        button.setOnAction(e -> System.out.println("Button clicked!"));

        // CheckBox
        CheckBox checkBox = new CheckBox("CheckBox");
        Label checkBoxLabel = new Label("CheckBox:");
        AnchorPane.setTopAnchor(checkBoxLabel, 40.0);
        AnchorPane.setLeftAnchor(checkBoxLabel, 10.0);
        AnchorPane.setTopAnchor(checkBox, 40.0);
        AnchorPane.setLeftAnchor(checkBox, 100.0);
        checkBox.setOnAction(e -> System.out.println("CheckBox is " + (checkBox.isSelected() ? "selected" : "not selected")));

        // Hyperlink
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        Label hyperlinkLabel = new Label("Hyperlink:");
        AnchorPane.setTopAnchor(hyperlinkLabel, 70.0);
        AnchorPane.setLeftAnchor(hyperlinkLabel, 10.0);
        AnchorPane.setTopAnchor(hyperlink, 70.0);
        AnchorPane.setLeftAnchor(hyperlink, 100.0);
        hyperlink.setOnAction(e -> System.out.println("Hyperlink clicked!"));

        // ToggleButton
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        Label toggleButtonLabel = new Label("ToggleButton:");
        AnchorPane.setTopAnchor(toggleButtonLabel, 100.0);
        AnchorPane.setLeftAnchor(toggleButtonLabel, 10.0);
        AnchorPane.setTopAnchor(toggleButton, 100.0);
        AnchorPane.setLeftAnchor(toggleButton, 100.0);
        toggleButton.setOnAction(e -> System.out.println("ToggleButton is " + (toggleButton.isSelected() ? "on" : "off")));

        // RadioButton
        RadioButton radioButton = new RadioButton("RadioButton");
        Label radioButtonLabel = new Label("RadioButton:");
        AnchorPane.setTopAnchor(radioButtonLabel, 130.0);
        AnchorPane.setLeftAnchor(radioButtonLabel, 10.0);
        AnchorPane.setTopAnchor(radioButton, 130.0);
        AnchorPane.setLeftAnchor(radioButton, 100.0);
        radioButton.setOnAction(e -> System.out.println("RadioButton is " + (radioButton.isSelected() ? "selected" : "not selected")));

        // Label
        Label label = new Label("Label");
        Label staticLabel = new Label("Label:");
        AnchorPane.setTopAnchor(staticLabel, 160.0);
        AnchorPane.setLeftAnchor(staticLabel, 10.0);
        AnchorPane.setTopAnchor(label, 160.0);
        AnchorPane.setLeftAnchor(label, 100.0);

        // TextField
        TextField textField = new TextField("some text...");
        Label textFieldLabel = new Label("TextField:");
        AnchorPane.setTopAnchor(textFieldLabel, 190.0);
        AnchorPane.setLeftAnchor(textFieldLabel, 10.0);
        AnchorPane.setTopAnchor(textField, 190.0);
        AnchorPane.setLeftAnchor(textField, 100.0);
        textField.setOnAction(e -> System.out.println("TextField text: " + textField.getText()));

        // PasswordField
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        Label passwordFieldLabel = new Label("PasswordField:");
        AnchorPane.setTopAnchor(passwordFieldLabel, 220.0);
        AnchorPane.setLeftAnchor(passwordFieldLabel, 10.0);
        AnchorPane.setTopAnchor(passwordField, 220.0);
        AnchorPane.setLeftAnchor(passwordField, 100.0);
        passwordField.setOnAction(e -> System.out.println("PasswordField text: " + passwordField.getText()));

        // TextArea
        TextArea textArea = new TextArea("This is very long text that will wrap to several lines.");
        textArea.setWrapText(true);
        Label textAreaLabel = new Label("TextArea:");
        AnchorPane.setTopAnchor(textAreaLabel, 250.0);
        AnchorPane.setLeftAnchor(textAreaLabel, 10.0);
        AnchorPane.setTopAnchor(textArea, 250.0);
        AnchorPane.setLeftAnchor(textArea, 100.0);
        AnchorPane.setRightAnchor(textArea, 10.0);
        AnchorPane.setBottomAnchor(textArea, 150.0);
        textArea.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case ENTER:
                    System.out.println("TextArea text: " + textArea.getText());
                    break;
                default:
                    break;
            }
        });

        // ProgressIndicator
        ProgressIndicator progressIndicator = new ProgressIndicator(0.40);
        progressIndicator.setPrefSize(50, 50);  // Set the preferred size
        Label progressIndicatorLabel = new Label("ProgressIndicator:");
        AnchorPane.setTopAnchor(progressIndicatorLabel, 460.0);
        AnchorPane.setLeftAnchor(progressIndicatorLabel, 10.0);
        AnchorPane.setTopAnchor(progressIndicator, 460.0);
        AnchorPane.setLeftAnchor(progressIndicator, 150.0);

        // ProgressBar
        ProgressBar progressBar = new ProgressBar(0.49);
        Label progressBarLabel = new Label("ProgressBar:");
        AnchorPane.setTopAnchor(progressBarLabel, 510.0);
        AnchorPane.setLeftAnchor(progressBarLabel, 10.0);
        AnchorPane.setTopAnchor(progressBar, 510.0);
        AnchorPane.setLeftAnchor(progressBar, 100.0);

        // Slider
        Slider slider = new Slider(0, 100, 50);
        Label sliderLabel = new Label("Slider:");
        AnchorPane.setTopAnchor(sliderLabel, 560.0);
        AnchorPane.setLeftAnchor(sliderLabel, 10.0);
        AnchorPane.setTopAnchor(slider, 560.0);
        AnchorPane.setLeftAnchor(slider, 100.0);
        AnchorPane.setRightAnchor(slider, 10.0);
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Slider value: " + newValue.intValue());
            progressBar.setProgress(newValue.doubleValue() / 100);
            progressIndicator.setProgress(newValue.doubleValue() / 100);
        });

        anchorPane.getChildren().addAll(
                buttonLabel, button,
                checkBoxLabel, checkBox,
                hyperlinkLabel, hyperlink,
                toggleButtonLabel, toggleButton,
                radioButtonLabel, radioButton,
                staticLabel, label,
                textFieldLabel, textField,
                passwordFieldLabel, passwordField,
                textAreaLabel, textArea,
                progressIndicatorLabel, progressIndicator,
                progressBarLabel, progressBar,
                sliderLabel, slider
        );

        Scene scene = new Scene(anchorPane, 500, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
