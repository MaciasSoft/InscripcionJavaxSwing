package macias.nelson;

import javax.swing.*;
import java.awt.*;

public class Inscripcion extends JFrame {
    private JLabel titulo;
    private JLabel nombre;
    private JLabel apellido;
    private JLabel ci;
    private JLabel emitido;
    private JLabel intereses;

    private JTextField txt_nom;
    private JTextField txt_ap;
    private JTextField txt_ci;

    private JComboBox cbx_exp;

    private JCheckBox check1;
    private JCheckBox check2;
    private JCheckBox check3;

    private JButton registrar;
    private JButton cancelar;
    private JButton abrir;

    private JPanel imagen;

    public Inscripcion()
    {
        super("Inscripcion de estudiantes nuevos v1.0");

        titulo =new JLabel("FORMULARIO DE INSCRIPCION");
        titulo.setForeground(Color.blue);
        titulo.setBounds(10,12,180,20);

        nombre=new JLabel("Nombre:");
        nombre.setForeground(Color.black);
        nombre.setBounds(10,60,150,20);

        txt_nom=new JTextField(25);
        //txt_nom.setForeground(Color.black);
        txt_nom.setBounds(100,60,200,20);

        apellido=new JLabel("Apellido(s):");
        apellido.setForeground(Color.black);
        apellido.setBounds(10,90,200,20);

        txt_ap=new JTextField(25);
        //txt_nom.setForeground(Color.black);
        txt_ap.setBounds(100,90,200,20);

        ci=new JLabel("ci:");
        ci.setForeground(Color.black);
        ci.setBounds(10,120,150,20);

        txt_ci=new JTextField(25);
        txt_ci.setBounds(100,120,90,20);


        emitido=new JLabel("Exp.:");
        emitido.setBounds(200,120,200,20);

        cbx_exp=new JComboBox();
        //txt_nom.setForeground(Color.black);
        cbx_exp.setBounds(230,120,70,20);
        cbx_exp.addItem("");
        cbx_exp.addItem("cba");
        cbx_exp.addItem("lpz");
        cbx_exp.addItem("sta.Cruz");
        cbx_exp.addItem("bni");
        cbx_exp.addItem("pdo");
        cbx_exp.addItem("oru");
        cbx_exp.addItem("ptsi");
        cbx_exp.addItem("chu");
        cbx_exp.addItem("tar");


        intereses=new JLabel("Intereses:");
        intereses.setBounds(10,170,200,20);

        check1=new JCheckBox();
        check1.setText("Tecnologia");
        check1.setBounds(100,190,100,20);

        check2=new JCheckBox();
        check2.setText("Musica");
        check2.setBounds(100,210,100,20);

        check3=new JCheckBox();
        check3.setText("Otros");
        check3.setBounds(100,230,100,20);

        registrar=new JButton("Registrar");
        registrar.setBounds(310,110,90,30);

        cancelar=new JButton("Cancelar");
        cancelar.setBounds(460,210,100,30);

        //ImageIcon img=new ImageIcon(getClass().getResource("C:\\Users\\HP\\IdeaProjects\\InscripcionEstudiante\\src\\macias\\nelson"));

        imagen=new JPanel();
        imagen.setBackground(Color.gray);
        imagen.setBounds(410,30,150,160);

        abrir=new JButton("Subir");
        abrir.setBounds(310,60,90,30);


        FlowLayout f=new FlowLayout();
        setLayout(null);


        add(titulo);
        add(nombre);
        add(txt_nom);
        add(apellido);
        add(txt_ap);
        add(ci);
        add(txt_ci);
        add(emitido);
        add(cbx_exp);
        add(intereses);
        add(check1);
        add(check2);
        add(check3);
        add(registrar);
        add(cancelar);
        add(imagen);
        add(abrir);

    }
}
