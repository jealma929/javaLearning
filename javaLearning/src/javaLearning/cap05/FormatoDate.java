import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FormatoDate {
    public static void main(String[] args) {
    	
    	//******************** genera el frame
        JFrame frame = new JFrame("Ejemplo de formato de Fecha");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
    	//******************** genera el JTextField con el mensaje de formato y mensaje de error
        JTextField dateField = new JTextField(10);
        JLabel messageLabel = new JLabel("Ingrese una fecha (dd/mm/aaaa):");
        JLabel messageLabel2 = new JLabel("dd/mm/aaaa");

        //******************** asigna un documentlistener
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
            
            // **************** valida los datos con el formato
            private void validateDate() {
                String text = dateField.getText();
                try {
                    LocalDate date = LocalDate.parse(text, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    messageLabel.setText("Fecha válida: " + date.toString());
                } catch (DateTimeParseException e) {
                    messageLabel.setText("Fecha no válida.");
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(messageLabel);
        frame.add(dateField);
        frame.add(messageLabel2);

        frame.setVisible(true);
    }
}