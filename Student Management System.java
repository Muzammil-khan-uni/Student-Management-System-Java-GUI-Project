import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class Student  extends Frame 
{  

	private static final long serialVersionUID = 1L;
		JLabel l, l1, l2, l3, l4,
            l5, l6, l7, l8,
            l9, l10, l12, l13,
            l14, l11, l15, l16,l17,l18;
    JTextField tf1, tf2, tf3,
            tf4, tf5, tf6,
            tf7, tf8, tf9,
            tf10,tf11;
    JTextArea area2, area1;
    JRadioButton rb5, rb6;
    JFileChooser f1;
    
    
    Student() {
    	super("Student Management System");
    	 Image iconImage = Toolkit.getDefaultToolkit().getImage("D:/Downloads/sys4.png");

         setIconImage(iconImage);
    	
    	  l17= new JLabel("University or College");
    	  l17.setBounds(500,10,200,200);
    	  add(l17); l17.setFont(new Font("Calibri", Font.BOLD, 19));
    	  tf11 = new JTextField();
          tf11.setBounds(675, 100, 220,20);  tf11.setFont(new Font("Calibri", Font.BOLD, 15));
          add(tf11);
        l = new JLabel("Student Management System");
        l.setBounds(470, 20, 500, 100);
        l.setFont(new Font("Calibri", Font.BOLD, 35));
        l1 = new JLabel("Fee Report");
        l1.setBounds(600, 260, 250, 20);
        l15 = new JLabel("Note: You can also edit or change course name and fee in the form because  form is editable ");
        l15.setBounds(690, 260, 600, 20);
        l15.setFont(new Font("Calibri",Font.BOLD,15));
        l2 = new JLabel("Name of the Student:");
        l2.setBounds(50, 150, 250, 20);
        tf1 = new JTextField();
        tf1.setBounds(250, 150, 250, 20);
        l3 = new JLabel("Name of the Father:");
        l3.setBounds(50, 200, 250, 20);
        tf2 = new JTextField();
        tf2.setBounds(250, 200, 250, 20);
        l4 = new JLabel("Roll Number:");
        l4.setBounds(50, 250, 250, 20);
        tf3 = new JTextField();
        tf3.setBounds(250, 250, 250, 20);
        l5 = new JLabel("Email ID:");
        l5.setBounds(50, 300, 250, 20);
        tf4 = new JTextField();
        tf4.setBounds(250, 300, 250, 20);
        l6 = new JLabel("Contact Number:");
        l6.setBounds(50, 350, 250, 20);
        tf5 = new JTextField();
        tf5.setBounds(250, 350, 250, 20);
        l7 = new JLabel("Address:");
        l7.setBounds(50, 400, 250, 20);
        area1 = new JTextArea();
        area1.setBounds(250, 400, 250, 90);
        l9 = new JLabel("Gender:");
        l9.setBounds(50, 500, 250, 20);
        final JRadioButton r5 = new JRadioButton(" Male");
        JRadioButton r6 = new JRadioButton(" Female");
        r5.setBounds(250, 500, 100, 30);
        r6.setBounds(350, 500, 100, 30);
        final ButtonGroup bg = new ButtonGroup();
        bg.add(r5);
        bg.add(r6);
        l10 = new JLabel("Nationality:");
        l10.setBounds(50, 550, 250, 20);
        tf6 = new JTextField();
        tf6.setBounds(250, 550, 250, 20);
        l11 = new JLabel("Year of passing 10th");
        l11.setBounds(50, 590, 250, 20);
        String language[] = {"2030","2029","2028","2027","2026","2025","2024","2023","2022","2021","2020","2019", "2018", "2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000"};
        final JComboBox cb1 = new JComboBox(language);
        cb1.setBounds(250, 590, 90, 20);
        l12 = new JLabel("Year of passing 12th");
        l12.setBounds(50, 630, 250, 20);
        String languagess[] = {"2030","2029","2028","2027","2026","2025","2024","2023","2022","2021","2020","2019", "2018", "2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000"};
        final JComboBox cb2 = new JComboBox(languagess);
        cb2.setBounds(250, 630, 90, 20);
        l13 = new JLabel("Percentage in 10th:");
        l13.setBounds(50, 670, 250, 20);
        tf7 = new JTextField();
        tf7.setBounds(250, 670, 250, 20);
        l14 = new JLabel("Percentage in 12th:");
        l14.setBounds(50, 700, 250, 20);
        tf8 = new JTextField();
        tf8.setBounds(250, 700, 250, 20);
        l8 = new JLabel("Courses Offered here are: ");
        l8.setBounds(800, 150, 250, 20);
        String languages[] = {"BSSE", "BSCS", "BSIT", "BSIR", "BBA", "other"};
        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(800, 200, 90, 20);
        final JLabel label = new JLabel();
        label.setBounds(600, 410, 500, 30);
        JButton b = new JButton("Show");
        b.setBounds(1000, 300, 80, 30);
        final DefaultListModel<String> li1 = new DefaultListModel<String>();
        li1.addElement(" BSSE(1, 10, 000)");
        li1.addElement(" BSCS(1, 10, 000)");
        li1.addElement(" BSIT(1, 05, 000)");
        li1.addElement(" BSIR(1, 05, 000)");
        li1.addElement(" BBA (1, 02, 000)");
        li1.addElement(" other");
        final JList<String> list1 = new JList<String>(li1);
        list1.setBounds(600, 300, 100, 110);
        DefaultListModel<String> li2 = new DefaultListModel<String>();
        li2.addElement(" bus(40, 000)");
        final JList<String> list2 = new JList<String>(li2);
        list2.setBounds(800, 300, 80, 40);
        li2.addElement(" None ");
        final JList<String> list3 = new JList<String>(li2);
        list3.setBounds(800, 310, 80, 30);
        JButton Receipt = new JButton("Generate Receipt");
        Receipt.setBounds(600, 440, 150, 30);
        JButton b2 = new JButton("Reset");
        b2.setBounds(750, 440, 150, 30);
        JButton Print = new JButton("Print");
        Print.setBounds(900, 440, 150, 30);
        l18= new JLabel("Text are Editable");
  	  l18.setBounds(1060, 448,200,20);
  	  add(l18); l18.setFont(new Font("Calibri", Font.BOLD, 19));
        area2 = new JTextArea();
        area2.setBounds(600, 475, 635, 240);
        JScrollPane scrollPane = new JScrollPane(area2);
        scrollPane.setBounds(600, 475, 635, 240);
        add(scrollPane);
       ;
        
        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (list1.getSelectedIndex() != -1) {
                    data = "You had selected the Course:" + list1.getSelectedValue();
                    label.setText(data);
                }
                if (list2.getSelectedIndex() != -1) {
                    data += "\n You had selected the Transpor:" + list2.getSelectedValue();
                    label.setText(data);
                }
                
                area2.setFont(new Font("Calibri", Font.BOLD, 16));
                area2.setText("\t\t"+tf11.getText()+"\n\n"+
                		"--------------------------------"
                		+ "------------FEE RECEIPT----"
                		+ "--------------------------"
                		+ "--------------------------"
                		+ "-------------------\n"
                		+
               " Name:\t\t" + tf1.getText() + "\n" + " Father's Name:\t" + tf2.getText() + "\n" + " Roll Number:\t\t" + tf3.getText()
                        + "\n" + " Email ID:\t\t" + tf4.getText() + "\n" + " Contact Number:\t" + tf5.getText() + "\n" + " Address:\t\t" + area1.getText()
                        + "\n" + " Gender:\t\t" + (r5.isSelected() ? " Male" : " Female") + "\n" + " Nationality:\t\t" + tf6.getText()
                        + "\n" + " Year of passing 10th:\t" + cb1.getSelectedItem() + "\n" + " Year of passing 12th:\t" + cb2.getSelectedItem()
                        + "\n" + " Percentage in 10th:\t" + tf7.getText() + "\n" + " Percentage in 12th:\t" + tf8.getText()
                        + "\n" + " Course:\t\t " + cb.getSelectedItem() + "\n" + " Transport:\t\t" + list2.getSelectedValue()
                        + "\n" );
                area2.setText(area2.getText() + " Fee has to be paid: " + label.getText() + "\n");
                area2.setText(area2.getText() + "--------------------------------" + "----------"
                        + "--------------------------------" + "--------------------------" + "------------\n");

                JOptionPane.showMessageDialog(
                		area2, "DATA SAVED SUCCESSFULLY");  }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                area1.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                area2.setText("");
                label.setText("");
                cb.setSelectedIndex(0);
                cb1.setSelectedIndex(0);
                cb2.setSelectedIndex(0);
                list1.clearSelection();
                list2.clearSelection();
                list3.clearSelection();
                bg.clearSelection();
            }
        });

        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area2.setText("Receipt" + "\n\n" + area2.getText());
            }
        });

        Print.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    area2.print();
                } catch (Exception evt) {
                    JOptionPane.showMessageDialog(null, evt.getMessage());
                }
            }
           
        });
        
       
        add(l);
        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(tf3);
        add(l5);
        add(tf4);
        add(l6);
        add(tf5);
        add(l7);
        add(area1);
        add(l8);
        add(cb);
        add(list1);
        add(list2);
        add(list3);
        add(l9);
        add(r5);
        add(r6);
        add(l10);
        add(tf6);
        add(l11);
        add(cb1);
        add(l12);
        add(cb2);
        add(l13);
        add(tf7);
        add(l14);
        add(tf8);
        add(l15);
        add(b);
        add(label);
        add(Receipt);
        add(b2);
        add(Print);
       

        
        b.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e)
        	{
        	String data = "";
        	if (list1.getSelectedIndex() != -1) {
        	data = "You had selected the Course:"
        	+ list1.getSelectedValue();
        	label.setText(data);
        	}
        	if (list2.getSelectedIndex() != -1) {
        	data += " and Bus with the "
        	+ "facility of: ";
        	for (Object frame :
        	list2.getSelectedValues()) {
        	data += frame + " ";
        	}
        	}
        	label.setText(data);
        	}
        });
        
        
        addWindowListener(
        		new WindowAdapter() {
        		public void windowClosing( WindowEvent we)
        		 
        		{
        		System.exit(0);
        		}
        		});

        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);
        
    }

   
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Student();
            }
        });
    
    }
}
