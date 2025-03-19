import javax.swing.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
//import com.opencsv.*;
import javax.swing.event.*;
public class Formulario extends JFrame implements ActionListener,
ChangeListener{
private JCheckBox check1,check2,check3;
private static String[] vec;
private JButton aplicar;
public Formulario() {
vec=new String[3];
vec[0]="false";
vec[1]="false";
vec[2]="false";
setLayout(null);
setTitle("LucidoS");
setBounds(0, 0, 1370, 730);
check1=new JCheckBox("Inglés");
check1.setBounds(10,10,150,30);
check1.addChangeListener(this);
add(check1);
check2=new JCheckBox("Francés");
check2.setBounds(10,50,150,30);
check2.addChangeListener(this);
add(check2);
check3=new JCheckBox("Alemán");
check3.setBounds(10,90,150,30);
check3.addChangeListener(this);
add(check3);
aplicar=new JButton("Aplicar");
aplicar.setBounds(1190,660, 85,25);
add(aplicar);
aplicar.addActionListener(this);
}
@Override
public void stateChanged(ChangeEvent e){
if (check1.isSelected()==true)
vec[0]="true"; else vec[0]="false";
if (check2.isSelected()==true)
vec[1]="true"; else vec[1]="false";
if (check3.isSelected()==true)
vec[2]="true"; else vec[2]="false";
}
@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==aplicar)
System.exit(0);
}
public static void main(String[] ar) {
Formulario formulario1=new Formulario();
formulario1.setVisible(true);
for(int i=0; i<3; i++)
System.out.println("nr: "+vec[i]);
}
}