package SwingComponentOverview;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Arrays;

//Favor Composition over Inheritance!

public class MainWindow extends JFrame {


    //Jframe ist ein Top-Level Container. Jede Swing Anwendung braucht einen Top-Level Container
    JFrame mainFrame;
    private JLabel mainLabel;
    private JPanel mainPanel;
    private JCheckBox chk_milch;
    private JCheckBox chk_eier;
    private JCheckBox chk_zwiebeln;
    private JLabel lbl_einkaufliste;

    private JRadioButton rd_friday;
    private JRadioButton rd_saturday;
    private JRadioButton rd_sunday;

    private ButtonGroup rd_groups;

    private JPasswordField pw_user;
    private JButton btn_show_pw;

    private JSlider sl_demo;


    public MainWindow(){
        this.mainFrame=new JFrame("Swing Komponenten Demo");  //
        this.mainPanel=new JPanel(new FlowLayout());
        //this.mainPanel=new JPanel(new BoxLayout(mainFrame, BoxLayout.X_AXIS));
        this.createUI();

    }

    private void createUI(){
        //this.createCheckBoxes();
        this.mainFrame.add(this.createCheckBoxes());
        this.mainFrame.add(this.createRadioButtons());

        this.mainFrame.add(this.createPasswordField());

        this.mainFrame.add(this.createSlider());

        this.setSize(400,400);
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private JPanel createCheckBoxes(){
        this.lbl_einkaufliste=new JLabel();
        this.lbl_einkaufliste.setText("Bitte bringe mit: \n");

        this.chk_eier=new JCheckBox("Eier");
        this.chk_milch=new JCheckBox("Milch");
        this.chk_zwiebeln=new JCheckBox("Zwiebeln");

        this.mainPanel.add(this.lbl_einkaufliste);
        this.mainPanel.add(this.chk_eier);
        this.mainPanel.add(this.chk_milch);
        this.mainPanel.add(this.chk_zwiebeln);

        return mainPanel;
    }

    private JPanel createRadioButtons(){
        this.rd_friday=new JRadioButton("Freitag", true);
        this.rd_saturday=new JRadioButton("Samstag", true);
        this.rd_sunday=new JRadioButton("Sonntag", true);

        this.rd_groups=new ButtonGroup();
        this.rd_groups.add(rd_friday);
        this.rd_groups.add(rd_saturday);
        this.rd_groups.add(rd_sunday);

        this.mainPanel.add(rd_friday);
        this.mainPanel.add(rd_saturday);
        this.mainPanel.add(rd_sunday);

        return mainPanel;

    }


    private JPanel createPasswordField(){
        this.pw_user =new JPasswordField(12);
        this.btn_show_pw=new JButton("Zeige Password");

        this.btn_show_pw.addActionListener(e -> {
            String pw= Arrays.toString(this.pw_user.getPassword());
            JOptionPane.showMessageDialog(this.mainPanel, pw);
        });

        this.mainPanel.add(this.pw_user);
        this.mainPanel.add(this.btn_show_pw);

        return this.mainPanel;

    }

    private JPanel createSlider(){
        this.sl_demo=new JSlider(0,10,5);

        this.sl_demo.setMajorTickSpacing(1);
        this.sl_demo.setMinorTickSpacing(1);
        this.sl_demo.setPaintTicks(true);
        this.sl_demo.setPaintLabels(true);
        this.sl_demo.setSnapToTicks(true);

        this.sl_demo.addChangeListener( e-> {
                JSlider slider=(JSlider) e.getSource();
                if (slider.getValueIsAdjusting()){
                    //JLabel lbl=new JLabel();
                    int value=slider.getValue();
                    slider.setToolTipText(Integer.toString(value));
                } });

        this.mainPanel.add(this.sl_demo);

        return this.mainPanel;

    }


}
