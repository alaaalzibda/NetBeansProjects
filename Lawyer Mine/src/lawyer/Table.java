/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static pkgfinal.ADDer.addtion;
import static pkgfinal.NewJFrame.MainScreen;
import static pkgfinal.NewJFrame1.Search;
import static pkgfinal.NewJFrame1.arrayList;

/**
 *
 * @author Desgin
 */
public class Table extends javax.swing.JFrame {

    /**
     * Creates new form Table
     */
    static Table tableer;
    static ArrayList<Meeting> arraylist = new ArrayList<>();

    public Table(ArrayList<Meeting> list) {
        this.arraylist = list;
        setSize(679, 763);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        fillTable();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Tabel_Meeting.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {
                JTable table = (JTable) me.getSource();
                Point point = me.getPoint();
                int row_selected = table.rowAtPoint(point);
                if (me.getClickCount() == 2) {

                    for (int i = 0; i < arraylist.size(); i++) {
                        System.out.println(arraylist.get(i).getDay() + "-" + arraylist.get(i).getMonth() + "-" + arraylist.get(i).getYear());
                        System.out.println(table.getModel().getValueAt(row_selected, 1));
                        
                        if ((arraylist.get(i).getTitle().equals((String)(table.getModel().getValueAt(row_selected, 0)))) && (arraylist.get(i).getDay() + "-" + arraylist.get(i).getMonth() + "-" + arraylist.get(i).getYear()).equals((String)table.getModel().getValueAt(row_selected, 1))) {
                            tableer.setVisible(false);
                            Review.getMainScreen(arraylist.get(i).getTitle(), arraylist.get(i).getScript(), (arraylist.get(i).getDay() + "-" + arraylist.get(i).getMonth() + "-" + arraylist.get(i).getYear()));

                        }
                    }
                }
                //new ViewImages(images).setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }

            private void openViewer(String[] paths) {

            }
        });
    }

    public void fillTable() {
        DefaultTableModel modeal = (DefaultTableModel) Tabel_Meeting.getModel();
        modeal.setRowCount(0);

        DefaultTableModel defaultTableModel = (DefaultTableModel) Tabel_Meeting.getModel();
        for (int i = 0; i < arraylist.size(); i++) {
            String title = arraylist.get(i).getTitle();
            String Date = (arraylist.get(i).getDay() + "-" + arraylist.get(i).getMonth() + "-" + arraylist.get(i).getYear());
            String[] ar = {title, Date};
            defaultTableModel.addRow(ar);
        }
        Tabel_Meeting.setModel(Tabel_Meeting.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Note = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabel_Meeting = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(76, 76, 76));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desgin\\Desktop\\Project Images\\MainScrren\\2.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/BACK.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackMousePressed(evt);
            }
        });

        Note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/note.png"))); // NOI18N
        Note.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NoteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NoteMousePressed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Helvetica World", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "Month", "Day" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Show As");

        Tabel_Meeting.setFont(new java.awt.Font("Helvetica World", 0, 14)); // NOI18N
        Tabel_Meeting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "الملاحظة ", "التاريخ  "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tabel_Meeting);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Back)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Note)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Note, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered

        ImageIcon icon = new ImageIcon(getClass().getResource("BACKMOVED.png"));
        icon.getImage().flush();
        Back.setIcon(icon);
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited

        ImageIcon icon = new ImageIcon(getClass().getResource("BACK.png"));
        icon.getImage().flush();
        Back.setIcon(icon);
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseExited

    private void BackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMousePressed
        this.setVisible(false);
        NewJFrame.getMainScreen();        // TODO add your handling code here:
    }//GEN-LAST:event_BackMousePressed

    private void NoteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoteMouseEntered
        ImageIcon icon = new ImageIcon(getClass().getResource("Note-enter.png"));
        Note.setIcon(icon);
// TODO add your handling code here:
    }//GEN-LAST:event_NoteMouseEntered

    private void NoteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoteMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("note.png"));
        Note.setIcon(icon);
// TODO add your handling code here:
    }//GEN-LAST:event_NoteMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int index = jComboBox1.getSelectedIndex();
        System.out.println(index);
        if (index == 0) {
            SortByYear();
        }

        if (index == 1) {
            SortByMonth();
        }

        if (index == 2) {
            SortByDay();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void NoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoteMousePressed
        tableer.setVisible(false);
        Noter.getMainScreen();
    }//GEN-LAST:event_NoteMousePressed
    public static void main(String args[]) {
        new Table(null).setVisible(true);

    }

    public static Table getMainScreen(ArrayList<Meeting> list) {
    Review.reviewer=null;
   tableer=null;
    if (tableer == null) {
            tableer = new Table(list);
            tableer.setVisible(true);
            return tableer;

        } else {

            tableer.setVisible(true);

        }
        return tableer;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Note;
    private javax.swing.JTable Tabel_Meeting;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void SortByYear() {
        DefaultTableModel modal = (DefaultTableModel) Tabel_Meeting.getModel();
        modal.setRowCount(0);
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(Integer.parseInt(arraylist.get(i).getYear()));
            if (Calendar.getInstance().get(Calendar.YEAR) == Integer.parseInt(arraylist.get(i).getYear())) {
                String title = arraylist.get(i).getTitle();
                String Date = (arraylist.get(i).getDay() + "-" + arraylist.get(i).getMonth() + "-" + arraylist.get(i).getYear());
                String[] ar = {title, Date};
                modal.addRow(ar);
            }
        }
        Tabel_Meeting.setModel(modal);
    }

    private void SortByMonth() {
        //;
        DefaultTableModel modal = (DefaultTableModel) Tabel_Meeting.getModel();
        modal.setRowCount(0);
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(Integer.parseInt(arraylist.get(i).getYear()));
            if (Calendar.getInstance().get(Calendar.YEAR) == Integer.parseInt(arraylist.get(i).getYear()) && ((Calendar.getInstance().get((Calendar.MONTH)) + 1) == Integer.parseInt(arraylist.get(i).getMonth()))) {
                String title = arraylist.get(i).getTitle();
                String Date = (arraylist.get(i).getDay() + "-" + arraylist.get(i).getMonth() + "-" + arraylist.get(i).getYear());
                String[] ar = {title, Date};
                modal.addRow(ar);
            }
        }
        Tabel_Meeting.setModel(modal);

    }

    private void SortByDay() {

        DefaultTableModel modal = (DefaultTableModel) Tabel_Meeting.getModel();
        modal.setRowCount(0);
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(Integer.parseInt(arraylist.get(i).getYear()));
            if (Calendar.getInstance().get(Calendar.YEAR) == Integer.parseInt(arraylist.get(i).getYear()) && ((Calendar.getInstance().get((Calendar.MONTH)) + 1) == Integer.parseInt(arraylist.get(i).getMonth())) && (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) == Integer.parseInt(arraylist.get(i).getDay())) {
                String title = arraylist.get(i).getTitle();
                String Date = (arraylist.get(i).getDay() + "-" + arraylist.get(i).getMonth() + "-" + arraylist.get(i).getYear());
                String[] ar = {title, Date};
                modal.addRow(ar);
            }
        }
        Tabel_Meeting.setModel(modal);

    }
}
