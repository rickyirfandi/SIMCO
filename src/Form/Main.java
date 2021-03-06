/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author Irfandi
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        Clear_Selected();
        dash_selected.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_setup = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_task_desc = new javax.swing.JTextArea();
        text_task_name = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        background_setup = new javax.swing.JLabel();
        dash_selected = new javax.swing.JLabel();
        setup_selected = new javax.swing.JLabel();
        about_selected = new javax.swing.JLabel();
        about_menu = new javax.swing.JLabel();
        dash_menu = new javax.swing.JLabel();
        setup_menu = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_setup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        text_task_desc.setColumns(20);
        text_task_desc.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        text_task_desc.setRows(5);
        jScrollPane1.setViewportView(text_task_desc);

        panel_setup.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 215, 440, 80));

        text_task_name.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        text_task_name.setToolTipText("");
        text_task_name.setBorder(null);
        panel_setup.add(text_task_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 135, 440, 30));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner1.setBorder(null);
        panel_setup.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 355, 49, 26));

        jSpinner2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner2.setBorder(null);
        panel_setup.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 355, 49, 26));

        jSpinner3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner3.setBorder(null);
        panel_setup.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 355, 49, 26));

        background_setup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/craete_panel.png"))); // NOI18N
        panel_setup.add(background_setup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 600));

        getContentPane().add(panel_setup, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 0, 560, 600));

        dash_selected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard_selected.png"))); // NOI18N
        dash_selected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_selectedMouseClicked(evt);
            }
        });
        getContentPane().add(dash_selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, -1, 50));

        setup_selected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/setup_selected.png"))); // NOI18N
        setup_selected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setup_selectedMouseClicked(evt);
            }
        });
        getContentPane().add(setup_selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 143, -1, 50));

        about_selected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about_selected.png"))); // NOI18N
        about_selected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_selectedMouseClicked(evt);
            }
        });
        getContentPane().add(about_selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 50));

        about_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_menuMouseClicked(evt);
            }
        });
        getContentPane().add(about_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 40));

        dash_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_menuMouseClicked(evt);
            }
        });
        getContentPane().add(dash_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 40));

        setup_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setup_menuMouseClicked(evt);
            }
        });
        getContentPane().add(setup_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled-1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void Clear_Selected(){
        dash_selected.setVisible(false);
        setup_selected.setVisible(false);
        about_selected.setVisible(false);
        panel_setup.setVisible(false);
    }
    private void dash_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_menuMouseClicked
        Clear_Selected();
        dash_selected.setVisible(true);
    }//GEN-LAST:event_dash_menuMouseClicked

    private void setup_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setup_menuMouseClicked
        Clear_Selected();
        setup_selected.setVisible(true);
        panel_setup.setVisible(true);
    }//GEN-LAST:event_setup_menuMouseClicked

    private void about_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_menuMouseClicked
        Clear_Selected();
        about_selected.setVisible(true);
    }//GEN-LAST:event_about_menuMouseClicked

    private void dash_selectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_selectedMouseClicked

    }//GEN-LAST:event_dash_selectedMouseClicked

    private void setup_selectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setup_selectedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_setup_selectedMouseClicked

    private void about_selectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_selectedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_about_selectedMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about_menu;
    private javax.swing.JLabel about_selected;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background_setup;
    private javax.swing.JLabel dash_menu;
    private javax.swing.JLabel dash_selected;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JLayeredPane panel_setup;
    private javax.swing.JLabel setup_menu;
    private javax.swing.JLabel setup_selected;
    private javax.swing.JTextArea text_task_desc;
    private javax.swing.JTextField text_task_name;
    // End of variables declaration//GEN-END:variables
}
