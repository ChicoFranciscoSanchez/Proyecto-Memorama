package views;

import models.Funcionamiento;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import main.MainWindow;

/**
 *
 * @author Chico
 */
public class Gameplay extends javax.swing.JPanel {

    private final MainWindow gameplay;
    
    private Funcionamiento funcionamiento = new Funcionamiento();
    
    /**
     * Creates new form Gameplay
     */
    public Gameplay(MainWindow gameplay) {
        initComponents();
        this.gameplay = gameplay;
        setCartas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_01 = new javax.swing.JButton();
        btn_02 = new javax.swing.JButton();
        btn_03 = new javax.swing.JButton();
        btn_04 = new javax.swing.JButton();
        btn_05 = new javax.swing.JButton();
        btn_06 = new javax.swing.JButton();
        btn_07 = new javax.swing.JButton();
        btn_08 = new javax.swing.JButton();
        btn_09 = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();
        btn_11 = new javax.swing.JButton();
        btn_12 = new javax.swing.JButton();
        btn_13 = new javax.swing.JButton();
        btn_14 = new javax.swing.JButton();
        btn_15 = new javax.swing.JButton();
        btn_16 = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEMORAMA");

        btn_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_01.setBorder(null);
        btn_01.setFocusable(false);
        btn_01.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_01ActionPerformed(evt);
            }
        });

        btn_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_02.setBorder(null);
        btn_02.setFocusable(false);
        btn_02.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_02ActionPerformed(evt);
            }
        });

        btn_03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_03.setBorder(null);
        btn_03.setFocusable(false);
        btn_03.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_03ActionPerformed(evt);
            }
        });

        btn_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_04.setBorder(null);
        btn_04.setFocusable(false);
        btn_04.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_04ActionPerformed(evt);
            }
        });

        btn_05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_05.setBorder(null);
        btn_05.setFocusable(false);
        btn_05.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_05ActionPerformed(evt);
            }
        });

        btn_06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_06.setBorder(null);
        btn_06.setFocusable(false);
        btn_06.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_06ActionPerformed(evt);
            }
        });

        btn_07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_07.setBorder(null);
        btn_07.setFocusable(false);
        btn_07.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_07ActionPerformed(evt);
            }
        });

        btn_08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_08.setBorder(null);
        btn_08.setFocusable(false);
        btn_08.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_08ActionPerformed(evt);
            }
        });

        btn_09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_09.setBorder(null);
        btn_09.setFocusable(false);
        btn_09.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_09ActionPerformed(evt);
            }
        });

        btn_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_10.setBorder(null);
        btn_10.setFocusable(false);
        btn_10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10ActionPerformed(evt);
            }
        });

        btn_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_11.setBorder(null);
        btn_11.setFocusable(false);
        btn_11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_11ActionPerformed(evt);
            }
        });

        btn_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_12.setBorder(null);
        btn_12.setFocusable(false);
        btn_12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_12ActionPerformed(evt);
            }
        });

        btn_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_13.setBorder(null);
        btn_13.setFocusable(false);
        btn_13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_13ActionPerformed(evt);
            }
        });

        btn_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_14.setBorder(null);
        btn_14.setFocusable(false);
        btn_14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_14ActionPerformed(evt);
            }
        });

        btn_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_15.setBorder(null);
        btn_15.setFocusable(false);
        btn_15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_15ActionPerformed(evt);
            }
        });

        btn_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btn_16.setBorder(null);
        btn_16.setFocusable(false);
        btn_16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btn_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_09)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_05)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_06)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_07)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_08))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_03)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_04)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_01)
                    .addComponent(btn_02)
                    .addComponent(btn_03)
                    .addComponent(btn_04))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_05)
                    .addComponent(btn_06)
                    .addComponent(btn_07)
                    .addComponent(btn_08))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_09)
                    .addComponent(btn_10)
                    .addComponent(btn_11)
                    .addComponent(btn_12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_13)
                    .addComponent(btn_14)
                    .addComponent(btn_15)
                    .addComponent(btn_16))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_01ActionPerformed
        botonEnable(btn_01);
    }//GEN-LAST:event_btn_01ActionPerformed

    private void btn_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_02ActionPerformed
        botonEnable(btn_02);
    }//GEN-LAST:event_btn_02ActionPerformed

    private void btn_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_03ActionPerformed
        botonEnable(btn_03);
    }//GEN-LAST:event_btn_03ActionPerformed

    private void btn_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_04ActionPerformed
        botonEnable(btn_04);
    }//GEN-LAST:event_btn_04ActionPerformed

    private void btn_05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_05ActionPerformed
        botonEnable(btn_05);
    }//GEN-LAST:event_btn_05ActionPerformed

    private void btn_06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_06ActionPerformed
        botonEnable(btn_06);
    }//GEN-LAST:event_btn_06ActionPerformed

    private void btn_07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_07ActionPerformed
        botonEnable(btn_07);
    }//GEN-LAST:event_btn_07ActionPerformed

    private void btn_08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_08ActionPerformed
        botonEnable(btn_08);
    }//GEN-LAST:event_btn_08ActionPerformed

    private void btn_09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_09ActionPerformed
        botonEnable(btn_09);
    }//GEN-LAST:event_btn_09ActionPerformed

    private void btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10ActionPerformed
        botonEnable(btn_10);
    }//GEN-LAST:event_btn_10ActionPerformed

    private void btn_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_11ActionPerformed
        botonEnable(btn_11);
    }//GEN-LAST:event_btn_11ActionPerformed

    private void btn_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_12ActionPerformed
        botonEnable(btn_12);
    }//GEN-LAST:event_btn_12ActionPerformed

    private void btn_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_13ActionPerformed
        botonEnable(btn_13);
    }//GEN-LAST:event_btn_13ActionPerformed

    private void btn_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_14ActionPerformed
        botonEnable(btn_14);
    }//GEN-LAST:event_btn_14ActionPerformed

    private void btn_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_15ActionPerformed
        botonEnable(btn_15);
    }//GEN-LAST:event_btn_15ActionPerformed

    private void btn_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_16ActionPerformed
        botonEnable(btn_16);
    }//GEN-LAST:event_btn_16ActionPerformed

    
    private void setCartas() {
        int[] numbers = funcionamiento.desordenar();
        
        btn_01.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[0]+".png")));
        btn_02.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[1]+".png")));
        btn_03.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[2]+".png")));
        btn_04.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[3]+".png")));
        btn_05.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[4]+".png")));
        btn_06.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[5]+".png")));
        btn_07.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[6]+".png")));
        btn_08.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[7]+".png")));
        btn_09.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[8]+".png")));
        btn_10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[9]+".png")));
        btn_11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[10]+".png")));
        btn_12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[11]+".png")));
        btn_13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[12]+".png")));
        btn_14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[13]+".png")));
        btn_15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[14]+".png")));
        btn_16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+numbers[15]+".png")));
    }
    
    private void botonEnable(JButton btn) {
        btn.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_01;
    private javax.swing.JButton btn_02;
    private javax.swing.JButton btn_03;
    private javax.swing.JButton btn_04;
    private javax.swing.JButton btn_05;
    private javax.swing.JButton btn_06;
    private javax.swing.JButton btn_07;
    private javax.swing.JButton btn_08;
    private javax.swing.JButton btn_09;
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_11;
    private javax.swing.JButton btn_12;
    private javax.swing.JButton btn_13;
    private javax.swing.JButton btn_14;
    private javax.swing.JButton btn_15;
    private javax.swing.JButton btn_16;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
