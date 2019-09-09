
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Design
 */
public class Adding extends javax.swing.JFrame {

    ArrayList<File> f = new ArrayList<>();
    static Adding adding;

    public static Adding Adding_Screen() {
        if (adding == null) {
            adding = new Adding();
        }
        adding.setVisible(true);
        return adding;
    }

    private Adding() {
        super("لوحة الإضافة");
        try {
            initComponents();
            setLocationRelativeTo(null);
        } catch (Exception c) {
            JOptionPane.showMessageDialog(null, c.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        name.setForeground(Color.GRAY);
        name.setText("الاسم");
        name.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (name.getText().equals("الاسم")) {
                    name.setText("");
                    name.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (name.getText().isEmpty()) {
                    name.setForeground(Color.GRAY);
                    name.setText("الاسم");
                }
            }
        });

        id.setForeground(Color.GRAY);
        id.setText("رقم الهوية");
        id.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (id.getText().equals("رقم الهوية")) {
                    id.setText("");
                    id.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (id.getText().isEmpty()) {
                    id.setForeground(Color.GRAY);
                    id.setText("رقم الهوية");
                }
            }
        });

        date.setForeground(Color.GRAY);
        date.setText("NN/NN/NN");
        date.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (date.getText().equals("NN/NN/NN")) {
                    date.setText("");
                    date.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (date.getText().isEmpty()) {
                    date.setForeground(Color.GRAY);
                    date.setText("NN/NN/NN");
                }
            }
        });

        type.setForeground(Color.GRAY);
        type.setText("بيع/شراء");
        type.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (type.getText().equals("بيع/شراء")) {
                    type.setText("");
                    type.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (type.getText().isEmpty()) {
                    type.setForeground(Color.GRAY);
                    type.setText("بيع/شراء");
                }
            }
        });

        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setText("إضافة");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("قائمة الإضافة");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("رقم الهوية");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("التاريخ");
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("الاسم");

        name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        id.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setText("إغلاق");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("نوع العقد");

        type.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        type.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton3.setText("إضافة صور");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton3ActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Adding.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Adding.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Adding.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Adding.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(436, 436, 436))
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (!((name.getText().equals("")) || date.getText().equals("") || (id.getText().equals("")) || (type.getText().equals("")) || f.isEmpty())) {
                String name1 = name.getText();
                String id1 = id.getText();
                String date1 = date.getText();
                String type1 = type.getText();
                String real = "^([0-9]{1,2})/([0-9]{1,2})/([0-9]{4})";
                Pattern p = Pattern.compile(real);
                Matcher m = p.matcher(date.getText());
                if (m.find()) {
                    custmer cu1 = new custmer(id1, name1, date1, type1);
                    JOptionPane.showMessageDialog(null, " تمت الاضافة بنجاح ");
                    MainScrren.arrayList.add(cu1);
                    CreateFolder(cu1);
                    f.clear();
                } else {
                    JOptionPane.showMessageDialog(null, "ادخل تاريخ صحيح");
                }
            } else {
                JOptionPane.showMessageDialog(null, "جميع الحقول مطلوبة مع صور");

            }
        } catch (Exception c) {
            JOptionPane.showMessageDialog(null, c.getMessage());
        }
    }

    private void idActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        MainScrren.main_screen();
    }

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                adding = new Adding();
                adding.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField date;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField type;

    // End of variables declaration                   
    public void AddRowToTabl(custmer c) throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\acer\\Documents\\NetBeansProjects\\"
                + "Sample2.mdb", "", "");
        con.setAutoCommit(false);
        Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        s.execute("select * from Table3");
        ResultSet rs = s.getResultSet();
        rs.moveToInsertRow();
        rs.updateString("ID", c.getId());
        rs.updateString("Name", c.getName());
        rs.updateString("Date", c.getDate());
        rs.updateString("Contract", c.getContract_type());
        rs.insertRow();
        rs.moveToCurrentRow();
        con.commit();
        con.close();
        s.close();
        rs.close();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.updateUI(); //Create UI objects
        UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName()); //Now set look and feel
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); //works with metal as well
        chooser.showOpenDialog(null);
        File file[];
        file = chooser.getSelectedFiles();
        for (int i = 0; i < file.length; i++) {
            //String last_three_letters = file[i].getPath().substring(file[i].getPath().length() - 3);
            try {
                f.add(file[i]);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An Error Occurred");
                f.clear();
                break;
            }
        }
    }

    void CreateFolder(custmer c) {
        String path;
        File Path_Test = new File("C:/Contracts/" + c.getId());
        if (Path_Test.exists()) {
            String[] fileFound = Path_Test.list();
            path = "C:/Contracts/" + c.getId() + "/" + c.getContract_type() + (fileFound.length + 1);
            c.setContract_type(c.getContract_type() + (fileFound.length + 1));
        } else {
            path = "C:/Contracts/" + c.getId() + "/" + c.getContract_type() + 1;
            c.setContract_type(c.getContract_type() + 1);
        }
        createFolder(path, c);
    }

    public void createFolder(String path, custmer cu1) {
        File Folder = new File(path);
        Folder.mkdirs();
        copy_Images(path);
        try {
            AddRowToTabl(cu1);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void copy_Images(String path) {
        byte[] buffer = new byte[1000];
        try {
            for (int i = 0; i < f.size(); i++) {
                FileInputStream fis = new FileInputStream(f.get(i).getPath());
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(path + "/" + f.get(i).getName());
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                int numBytes;
                while ((numBytes = bis.read(buffer)) != -1) {
                    bos.write(buffer);
                }
                bis.close();
                bos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}