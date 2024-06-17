/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import main.Game;

/**
 *
 * @author Владимир
 */
public class Menu extends javax.swing.JFrame {

    private final Game game;
    
    public Menu() {
        initComponents();
        game = new Game(this);
        setUserInfo();
        opponentsButtonGroup.add(zeroRadioButton);
        opponentsButtonGroup.add(oneRadioButton);
        opponentsButtonGroup.add(twoRadioButton);
        opponentsButtonGroup.add(threeRadioButton);
        opponentsButtonGroup.add(fourRadioButton);
        zeroRadioButton.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseOpponents = new javax.swing.JDialog();
        chooseOpponentsLabel = new javax.swing.JLabel();
        zeroRadioButton = new javax.swing.JRadioButton();
        oneRadioButton = new javax.swing.JRadioButton();
        twoRadioButton = new javax.swing.JRadioButton();
        threeRadioButton = new javax.swing.JRadioButton();
        fourRadioButton = new javax.swing.JRadioButton();
        confirmButton = new javax.swing.JButton();
        opponentsButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        changeDeckButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        victoriesLabel = new javax.swing.JLabel();
        defeatsLabel = new javax.swing.JLabel();
        moneyLabel = new javax.swing.JLabel();

        chooseOpponentsLabel.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        chooseOpponentsLabel.setText("Выберите число соперников:");

        zeroRadioButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        zeroRadioButton.setText("Ноль");
        zeroRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroRadioButtonActionPerformed(evt);
            }
        });

        oneRadioButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        oneRadioButton.setText("Один");
        oneRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneRadioButtonActionPerformed(evt);
            }
        });

        twoRadioButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        twoRadioButton.setText("Два");
        twoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoRadioButtonActionPerformed(evt);
            }
        });

        threeRadioButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        threeRadioButton.setText("Три");
        threeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeRadioButtonActionPerformed(evt);
            }
        });

        fourRadioButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        fourRadioButton.setText("Четыре");
        fourRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourRadioButtonActionPerformed(evt);
            }
        });

        confirmButton.setBackground(new java.awt.Color(239, 239, 239));
        confirmButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        confirmButton.setText("Принять");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseOpponentsLayout = new javax.swing.GroupLayout(chooseOpponents.getContentPane());
        chooseOpponents.getContentPane().setLayout(chooseOpponentsLayout);
        chooseOpponentsLayout.setHorizontalGroup(
            chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseOpponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chooseOpponentsLayout.createSequentialGroup()
                        .addComponent(fourRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmButton))
                    .addGroup(chooseOpponentsLayout.createSequentialGroup()
                        .addGroup(chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseOpponentsLabel)
                            .addGroup(chooseOpponentsLayout.createSequentialGroup()
                                .addGroup(chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zeroRadioButton)
                                    .addComponent(twoRadioButton))
                                .addGap(18, 18, 18)
                                .addGroup(chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oneRadioButton)
                                    .addComponent(threeRadioButton))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        chooseOpponentsLayout.setVerticalGroup(
            chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseOpponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseOpponentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroRadioButton)
                    .addComponent(oneRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoRadioButton)
                    .addComponent(threeRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chooseOpponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourRadioButton)
                    .addComponent(confirmButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        titleLabel.setText("Russian Blackjack");

        startButton.setBackground(new java.awt.Color(229, 229, 229));
        startButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        startButton.setText("Начать игру");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        changeDeckButton.setBackground(new java.awt.Color(229, 229, 229));
        changeDeckButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        changeDeckButton.setText("Изменить колоду");
        changeDeckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDeckButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(229, 229, 229));
        exitButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        exitButton.setText("Выйти");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        victoriesLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        victoriesLabel.setText("Победы: 0");

        defeatsLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        defeatsLabel.setText("Поражения: 0");

        moneyLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        moneyLabel.setText("Деньги: 1000000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(victoriesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moneyLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeDeckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(defeatsLabel)))
                        .addGap(0, 101, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(victoriesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(moneyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defeatsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeDeckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        game.saveUserInfo();
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void changeDeckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDeckButtonActionPerformed
        game.changeDeck();
    }//GEN-LAST:event_changeDeckButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        chooseOpponents.setSize(230, 160);
        chooseOpponents.setVisible(true);
    }//GEN-LAST:event_startButtonActionPerformed

    private void zeroRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zeroRadioButtonActionPerformed

    private void oneRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneRadioButtonActionPerformed

    private void twoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoRadioButtonActionPerformed

    private void threeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threeRadioButtonActionPerformed

    private void fourRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourRadioButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        chooseOpponents.setVisible(false);
        int number = 0;
        if (zeroRadioButton.isSelected()){
            number = 0;
        } else if (oneRadioButton.isSelected()){
            number = 1;
        } else if (twoRadioButton.isSelected()){
            number = 2;
        } else if (threeRadioButton.isSelected()){
            number = 3;
        } else if (fourRadioButton.isSelected()){
            number = 4;
        }
        game.setOpponents(number);
        game.start();
    }//GEN-LAST:event_confirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeDeckButton;
    private javax.swing.JDialog chooseOpponents;
    private javax.swing.JLabel chooseOpponentsLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel defeatsLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton fourRadioButton;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JRadioButton oneRadioButton;
    private javax.swing.ButtonGroup opponentsButtonGroup;
    private javax.swing.JButton startButton;
    private javax.swing.JRadioButton threeRadioButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton twoRadioButton;
    private javax.swing.JLabel victoriesLabel;
    private javax.swing.JRadioButton zeroRadioButton;
    // End of variables declaration//GEN-END:variables

    public void setUserInfo() {
        game.setUserInfo(victoriesLabel, defeatsLabel, moneyLabel);
    }
}
