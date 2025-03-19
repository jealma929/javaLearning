import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateInputExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fecha Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JTextField dateField = new JTextField(10);
        JLabel messageLabel = new JLabel("Ingrese una fecha (yyyy-MM-dd):");

        dateField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateDate();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateDate();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateDate();
            }

            private void validateDate() {
                String text = dateField.getText();
                try {
                    LocalDate date = LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE);
                    messageLabel.setText("Fecha válida: " + date.toString());
                } catch (DateTimeParseException e) {
                    messageLabel.setText("Fecha no válida.");
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(messageLabel);
        frame.add(dateField);

        frame.setVisible(true);
    }
}