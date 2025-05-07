import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * Description
 *
 * @version 1.0 from 19.03.2025
 * @author 
 */

public class HashPro extends JFrame {
  // start attributes
  
  // Anfang Attribute
  private HashMap<String, HashMap<String, ArrayList<Integer>>> uebersichtSchueler = new HashMap<>();
   // private HashMap<String, ArrayList<Integer>> uebersichtSchueler = new HashMap<>();


  
  
  private JLabel lHashMaPPro1 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JNumberField jNumberField1 = new JNumberField();
  private JComboBox<String> jComboBox1 = new JComboBox<>();
    private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<>();
  private JButton bHinzu2 = new JButton();
  private JLabel lSchueler1 = new JLabel();
  private JLabel lFach1 = new JLabel();
  private JLabel lNote1 = new JLabel();
  private JComboBox<String> jBoxNamen = new JComboBox<>();
    private DefaultComboBoxModel<String> jBoxNamenModel = new DefaultComboBoxModel<>();
  private JComboBox<String> jBoxFach = new JComboBox<>();
    private DefaultComboBoxModel<String> jBoxFachModel = new DefaultComboBoxModel<>();
  private JComboBox<String> jBoxNote = new JComboBox<>();
    private DefaultComboBoxModel<String> jBoxNoteModel = new DefaultComboBoxModel<>();
  // Ende Attribute
  // end attributes
  
  
  // Anfang Methoden
  
  
  
  public HashPro() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 516; 
    int frameHeight = 547;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("HashPro");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    // start components
    
    lHashMaPPro1.setBounds(104, 24, 217, 57);
    lHashMaPPro1.setText("HashMaP Pro.");
    cp.add(lHashMaPPro1);
    jTextField1.setBounds(8, 168, 80, 32);
    cp.add(jTextField1);
    jNumberField1.setBounds(184, 168, 88, 32);
    cp.add(jNumberField1);
    jComboBox1.setModel(jComboBox1Model);
    jComboBox1Model.addElement("Mathe");
    jComboBox1Model.addElement("Deutsch");
    jComboBox1Model.addElement("Englisch");
    jComboBox1.setBounds(96, 168, 80, 32);
    cp.add(jComboBox1);
    bHinzu2.setBounds(288, 168, 184, 32);
    bHinzu2.setText("Hinzu.");
    bHinzu2.setMargin(new Insets(2, 2, 2, 2));
    bHinzu2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bHinzu2_ActionPerformed(evt);
      }
    });
    cp.add(bHinzu2);
    lSchueler1.setBounds(16, 128, 64, 24);
    lSchueler1.setText("Schüler");
    cp.add(lSchueler1);
    lFach1.setBounds(104, 128, 64, 24);
    lFach1.setText("Fach");
    cp.add(lFach1);
    lNote1.setBounds(192, 128, 64, 24);
    lNote1.setText("Note");
    cp.add(lNote1);
    jBoxNamen.setModel(jBoxNamenModel);
    jBoxNamen.setBounds(16, 296, 80, 24);
    jBoxNamenModel.addElement("America");
    jBoxNamenModel.addElement("Europe");
    jBoxNamenModel.addElement("Asia");
    jBoxNamen.setVisible(false);

    cp.add(jBoxNamen);
    jBoxFach.setModel(jBoxFachModel);
    jBoxFachModel.addElement("America");
    jBoxFachModel.addElement("Europe");
    jBoxFachModel.addElement("Asia");
    jBoxFach.setBounds(112, 296, 80, 24);
    jBoxFach.setVisible(false);
    cp.add(jBoxFach);
    
    jBoxNote.setBounds(208, 296, 80, 24);
    jBoxNote.setModel(jBoxNoteModel);
    jBoxNoteModel.addElement("America");
    jBoxNoteModel.addElement("Europe");
    jBoxNoteModel.addElement("Asia");
    jBoxNoteModel.addElement("quntin");
    jBoxNote.setVisible(false);
    cp.add(jBoxNote);
    
    
    
    
    jBoxNamen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
            DefaultComboBoxModel<String> fachModel = new DefaultComboBoxModel<>();
        
            System.out.println(jBoxNamen.getSelectedItem());

           // Elemente aus der Liste hinzufügen
            for (String elementFach : uebersichtSchueler.get(jBoxNamen.getSelectedItem()).keySet()) {
                fachModel.addElement(elementFach);
            }
        
              jBoxFach.setModel(fachModel);
              System.out.println(fachModel);       
                  
                 
              }
        });
    
    jBoxFach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jBoxFachModel.getElementAt(jBoxFach.getSelectedIndex());
                System.out.println("ll");
            }
        });
    
    jBoxNote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jBoxNoteModel.getElementAt(jBoxNote.getSelectedIndex());
                System.out.println("äää");
            }
        });
    
    
    
    
    
    
    
    
    // end components
    

    // Ende Komponenten
    setVisible(true);
  } // end of public Hashbrownies
  
  // start methods     
  
  public static void main(String[] args) {
    new HashPro();
  } // end of main   
  
  public void bHinzu2_ActionPerformed(ActionEvent evt) {
    // TODO add your code here 
    
    
    
 
    String name = jTextField1.getText();
    String fach = jComboBox1Model.getElementAt(jComboBox1.getSelectedIndex());
    
    int note = jNumberField1.getInt();
    
    
    HashMap<String, ArrayList<Integer>> fachMap = uebersichtSchueler.getOrDefault(name, new HashMap<String, ArrayList<Integer>>());

    // Bestehende Noten-Map holen oder neue erstellen
    
    
    ArrayList<Integer> notenListe = fachMap.getOrDefault(fach, new ArrayList<Integer>());
    
    
    System.out.println(notenListe);
    
    notenListe.add(note);
    
    fachMap.put(fach, notenListe);
    
    uebersichtSchueler.put(name, fachMap);




    

    System.out.println("Fach Map :" + fachMap);
    
    System.out.println("Uebersicht Schüler" + uebersichtSchueler);
    
    
    //Für die erste ComboBox die Liste hinzu
    
     DefaultComboBoxModel<String> namenModel = new DefaultComboBoxModel<>();

     // Elemente aus der Liste hinzufügen
    for (String elementName : uebersichtSchueler.keySet()) {
        namenModel.addElement(elementName);
    }

      jBoxNamen.setModel(namenModel);
      System.out.println(namenModel);
    
    jBoxNamen.setVisible(true);
    
    
    
    
    
    
    
    
    
    
    ArrayList<String> schueler = new ArrayList<String>();
    
    System.out.println(uebersichtSchueler.keySet());
    
    
    
  
    
    
  } // end of bHinzu2_ActionPerformed   
  
  

  

  // end methods
  // Ende Methoden
} // end of class HashPro
