import com.sun.xml.internal.txw2.Document;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author napolsky
 */
public class BuilderTest extends javax.swing.JFrame {

    /**
     * Creates new form BuilderTest
     */
    public BuilderTest() {
        initComponents();
        final DocumentListener dl=new DocumentListener() 
        {
            @Override public void insertUpdate(DocumentEvent e) { ValueChanged(); }
            @Override public void removeUpdate(DocumentEvent e) { ValueChanged(); }
            @Override public void changedUpdate(DocumentEvent e) { ValueChanged(); }
        };
        IdValue.getDocument().addDocumentListener(dl);
        getRootPane().setDefaultButton(BtnAdd);
        ValueFocus();
   }
   
    private void ValueChanged()
    {
        boolean enabled=false;
        try
        {
            idvalue=Long.parseLong(IdValue.getText());
            enabled=true;
        }
        catch(NumberFormatException e)
        {
        }
        BtnAdd.setEnabled(enabled);
    }

    private void ValueFocus()
    {
        IdValue.requestFocus();
        IdValue.selectAll();
    }
    
    private IdBuilder ib = new IdBuilder("MEDVED", "; ");
    private long idvalue = 0;

    private void BackToEdit()
    {
        ValueFocus();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAdd = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        BtnBuild = new javax.swing.JButton();
        LogScroll = new javax.swing.JScrollPane();
        Log = new javax.swing.JTextArea();
        IdValue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAdd.setText("Dodaj");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnClear.setText("Buduj");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        BtnBuild.setText("Clear");
        BtnBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuildActionPerformed(evt);
            }
        });

        Log.setColumns(20);
        Log.setRows(5);
        LogScroll.setViewportView(Log);

        IdValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        IdValue.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnBuild, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(BtnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IdValue))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IdValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(BtnClear)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBuild)
                        .addGap(0, 378, Short.MAX_VALUE))
                    .addComponent(LogScroll))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        ib.Add(Long.parseLong(IdValue.getText()));
        BackToEdit();
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        // TODO add your handling code here:
        Log.append(ib.toString() + System.lineSeparator());
        BackToEdit();
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuildActionPerformed
        // TODO add your handling code here:
        ib.Clear();
         BackToEdit();
    }//GEN-LAST:event_BtnBuildActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuilderTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuilderTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuilderTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuilderTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuilderTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnBuild;
    private javax.swing.JButton BtnClear;
    private javax.swing.JTextField IdValue;
    private javax.swing.JTextArea Log;
    private javax.swing.JScrollPane LogScroll;
    // End of variables declaration//GEN-END:variables
}
