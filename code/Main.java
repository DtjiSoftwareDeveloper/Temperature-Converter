import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args){
        // List of temperatures
        String[] temperatures = {"CELCIUS", "FAHRENHEIT", "KELVIN", "RANKINE", "REAUMUR"};

        // Creating frame
        JFrame jFrame = new JFrame("Temperature Converter");

        // Creating panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Creating combo box
        JLabel convertFromLabel = new JLabel("Converting from:");
        JComboBox<String> temperatureListFrom = new JComboBox<>(temperatures);
        temperatureListFrom.setSelectedIndex(0);
        JLabel convertToLabel = new JLabel("Converting to: ");
        JComboBox<String> temperatureListTo = new JComboBox<>(temperatures);
        temperatureListTo.setSelectedIndex(1);
        JLabel resultLabel = new JLabel("------------");
        JTextField convertFromText = new JTextField(7); // 7 columns in the text field
        JButton convertButton = new JButton("CONVERT");

        // Adding graphics objects to the panel
        panel.add(convertFromLabel);
        panel.add(temperatureListFrom);
        panel.add(convertFromText);
        panel.add(convertToLabel);
        panel.add(temperatureListTo);
        panel.add(resultLabel);
        panel.add(convertButton);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Initialising important variables
                double convertFromValue, convertToValue;

                try {
                    // Checking what temperatures we are converting to and from
                    String temperatureFrom = (String) temperatureListFrom.getSelectedItem();
                    String temperatureTo = (String) temperatureListTo.getSelectedItem();
                    convertFromValue = Double.parseDouble(convertFromText.getText());
                    assert temperatureFrom != null && temperatureTo != null;
                    if (temperatureFrom.equals("CELCIUS") && temperatureTo.equals("FAHRENHEIT")){
                        convertToValue = 1.8 * convertFromValue + 32;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("CELCIUS") && temperatureTo.equals("KELVIN")){
                        convertToValue = convertFromValue + 273.15;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("CELCIUS") && temperatureTo.equals("RANKINE")){
                        convertToValue = 1.8 * convertFromValue + 32 + 459.67;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("CELCIUS") && temperatureTo.equals("REAUMUR")){
                        convertToValue = 0.8 * convertFromValue;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("FAHRENHEIT") && temperatureTo.equals("CELCIUS")){
                        convertToValue = (convertFromValue - 32) / 1.8;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("FAHRENHEIT") && temperatureTo.equals("KELVIN")){
                        convertToValue = (convertFromValue + 459.67) / 1.8;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("FAHRENHEIT") && temperatureTo.equals("RANKINE")){
                        convertToValue = convertFromValue + 459.67;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("FAHRENHEIT") && temperatureTo.equals("REAUMUR")){
                        convertToValue = (convertFromValue - 32) / 2.25;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("KELVIN") && temperatureTo.equals("CELCIUS")){
                        convertToValue = convertFromValue - 273.15;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("KELVIN") && temperatureTo.equals("FAHRENHEIT")){
                        convertToValue = (convertFromValue * 1.8) - 459.67;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("KELVIN") && temperatureTo.equals("RANKINE")){
                        convertToValue = convertFromValue * 1.8;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("KELVIN") && temperatureTo.equals("REAUMUR")){
                        convertToValue = (convertFromValue - 273.15) * 0.8;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("RANKINE") && temperatureTo.equals("CELCIUS")){
                        convertToValue = (convertFromValue - 32 - 459.67) / 1.8;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("RANKINE") && temperatureTo.equals("FAHRENHEIT")){
                        convertToValue = convertFromValue - 459.67;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("RANKINE") && temperatureTo.equals("KELVIN")){
                        convertToValue = convertFromValue / 1.8;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("RANKINE") && temperatureTo.equals("REAUMUR")){
                        convertToValue = (convertFromValue - 32 - 459.67) / 2.25;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("REAUMUR") && temperatureTo.equals("CELCIUS")){
                        convertToValue = convertFromValue * 1.25;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("REAUMUR") && temperatureTo.equals("FAHRENHEIT")){
                        convertToValue = (convertFromValue * 2.25) + 32;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("REAUMUR") && temperatureTo.equals("KELVIN")){
                        convertToValue = (convertFromValue * 1.25) + 273.15;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                    else if (temperatureFrom.equals("REAUMUR") && temperatureTo.equals("RANKINE")){
                        convertToValue = (convertFromValue * 2.25) + 32 + 459.67;
                        resultLabel.setText(Double.toString(convertToValue));
                    }
                }
                catch (Exception ex){
                    // Do nothing
                }
            }
        });

        // Adding the panel to the frame
        jFrame.add(panel);

        // Setting size of the window
        jFrame.setSize(800, 640);

        // Making the frame visible
        jFrame.setVisible(true);
    }
}
