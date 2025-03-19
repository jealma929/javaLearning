import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

public class FormattedTextFieldExample {
    public static void main(String[] args) {
        // Crear un marco
        JFrame frame = new JFrame("Ejemplo de JTextField Formateado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Crear un formateador para números
        NumberFormat format = NumberFormat.getIntegerInstance();
        NumberFormatter numberFormatter = new NumberFormatter(format);
        numberFormatter.setValueClass(Integer.class);
        numberFormatter.setAllowsInvalid(false); // No permite entradas inválidas
        numberFormatter.setCommitsOnValidEdit(true); // Confirma la edición al ser válida

        // Crear un JFormattedTextField
        JFormattedTextField formattedTextField = new JFormattedTextField(numberFormatter);
        formattedTextField.setColumns(10); // Establecer el ancho del campo

        // Agregar el campo al marco
        frame.add(formattedTextField);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}