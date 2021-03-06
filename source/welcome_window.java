/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import javax.swing.JFrame;

/**
 *
 * @author kafas
 */
public class welcome_window extends JFrame {

    /**
     * Creates new form welcome_window
     */
    public welcome_window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        imgLabel = new javax.swing.JLabel();
        get_started_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(java.awt.Color.white);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("CV Editor: WELCOME"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/brand.png"))); // NOI18N
        imgLabel.setLabelFor(this);
        imgLabel.setToolTipText("");
        imgLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        get_started_button.setBackground(new java.awt.Color(204, 204, 204));
        get_started_button.setText("Get Started");
        get_started_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                get_started_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imgLabel)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(get_started_button)
                        .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(get_started_button)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        imgLabel.getAccessibleContext().setAccessibleName("iconLabel");

        bindingGroup.bind();

        setSize(new java.awt.Dimension(547, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void get_started_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_started_buttonActionPerformed
        dispose();
        profile_window window = new profile_window();
        window.setVisible(true);
    }//GEN-LAST:event_get_started_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    //    try {
    //        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //            if ("Nimbus".equals(info.getName())) {
    //                javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                break;
    //            }
    //        }
    //    } catch (ClassNotFoundException ex) {
    //        java.util.logging.Logger.getLogger(welcome_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (InstantiationException ex) {
    //        java.util.logging.Logger.getLogger(welcome_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (IllegalAccessException ex) {
    //        java.util.logging.Logger.getLogger(welcome_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //        java.util.logging.Logger.getLogger(welcome_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    }
        //</editor-fold>

        /* Create and display the form */
     //   java.awt.EventQueue.invokeLater(new Runnable() {
     //       public void run() {
     ///           new welcome_window().setVisible(true);
      //      }
      //  });
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton get_started_button;
    private javax.swing.JLabel imgLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
