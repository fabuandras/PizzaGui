package pizzagui;

import javax.swing.JOptionPane;

public class PizzaGui extends javax.swing.JFrame {

    public PizzaGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Fejlecpanel = new javax.swing.JPanel();
        Kep = new javax.swing.JLabel();
        Rendelesfelvetel = new javax.swing.JLabel();
        Rfintervallum = new javax.swing.JLabel();
        Nyitvatartas = new javax.swing.JLabel();
        Nytintervallum = new javax.swing.JLabel();
        LaComa = new javax.swing.JLabel();
        PIZZA = new javax.swing.JLabel();
        Alapszoszokpanel = new javax.swing.JPanel();
        Alapszoszok = new javax.swing.JLabel();
        Paradicsomos = new javax.swing.JRadioButton();
        Tejszines = new javax.swing.JRadioButton();
        Feltetekpanel = new javax.swing.JPanel();
        Feltetek = new javax.swing.JLabel();
        Sonka = new javax.swing.JCheckBox();
        Gomba = new javax.swing.JCheckBox();
        Sajt = new javax.swing.JCheckBox();
        Szalami = new javax.swing.JCheckBox();
        Kukorica = new javax.swing.JCheckBox();
        Jalapeno = new javax.swing.JCheckBox();
        Ananasz = new javax.swing.JCheckBox();
        Oliva = new javax.swing.JCheckBox();
        Pizzatesztafajtakpanel = new javax.swing.JPanel();
        Pizzatesztafajtak = new javax.swing.JLabel();
        Vekony = new javax.swing.JRadioButton();
        Vastag = new javax.swing.JRadioButton();
        Pizzameretekpanel = new javax.swing.JPanel();
        Pizzameretek = new javax.swing.JLabel();
        Meretek = new javax.swing.JComboBox<>();
        Rendelesgomb = new javax.swing.JButton();
        Torlesgomb = new javax.swing.JButton();
        Rendelesveglegesitese = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Coma PIZZA");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        Fejlecpanel.setBackground(new java.awt.Color(204, 204, 204));
        Fejlecpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Rendelesfelvetel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Rendelesfelvetel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rendelesfelvetel.setText("Rendelésfelvétel:");

        Rfintervallum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rfintervallum.setText("10:30 - 21:00");

        Nyitvatartas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nyitvatartas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nyitvatartas.setText("Nyitva tartás:");

        Nytintervallum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nytintervallum.setText("10:30 - 21:30");

        LaComa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LaComa.setForeground(new java.awt.Color(255, 0, 0));
        LaComa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LaComa.setText("La Coma");

        PIZZA.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        PIZZA.setForeground(new java.awt.Color(51, 204, 0));
        PIZZA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PIZZA.setText("PIZZA");

        javax.swing.GroupLayout FejlecpanelLayout = new javax.swing.GroupLayout(Fejlecpanel);
        Fejlecpanel.setLayout(FejlecpanelLayout);
        FejlecpanelLayout.setHorizontalGroup(
            FejlecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FejlecpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FejlecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PIZZA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LaComa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kep, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FejlecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Nyitvatartas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rendelesfelvetel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rfintervallum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nytintervallum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FejlecpanelLayout.setVerticalGroup(
            FejlecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Kep, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addGroup(FejlecpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FejlecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FejlecpanelLayout.createSequentialGroup()
                        .addComponent(Rendelesfelvetel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rfintervallum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nyitvatartas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nytintervallum))
                    .addGroup(FejlecpanelLayout.createSequentialGroup()
                        .addComponent(LaComa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PIZZA)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Alapszoszokpanel.setBackground(new java.awt.Color(153, 153, 153));
        Alapszoszokpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Alapszoszok.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Alapszoszok.setText("Alapszószok");

        buttonGroup2.add(Paradicsomos);
        Paradicsomos.setText("Paradicsomos");

        buttonGroup2.add(Tejszines);
        Tejszines.setText("Tejszínes");

        javax.swing.GroupLayout AlapszoszokpanelLayout = new javax.swing.GroupLayout(Alapszoszokpanel);
        Alapszoszokpanel.setLayout(AlapszoszokpanelLayout);
        AlapszoszokpanelLayout.setHorizontalGroup(
            AlapszoszokpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlapszoszokpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlapszoszokpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Alapszoszok)
                    .addComponent(Paradicsomos)
                    .addComponent(Tejszines))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        AlapszoszokpanelLayout.setVerticalGroup(
            AlapszoszokpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlapszoszokpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Alapszoszok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Paradicsomos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tejszines)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Feltetekpanel.setBackground(new java.awt.Color(153, 153, 153));
        Feltetekpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Feltetek.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Feltetek.setText("Feltétek");

        Sonka.setText("Sonka");

        Gomba.setText("Gomba");

        Sajt.setText("Sajt");
        Sajt.setToolTipText("");

        Szalami.setText("Szalámi");

        Kukorica.setText("Kukorica");

        Jalapeno.setText("Jalapeno");

        Ananasz.setText("Ananász");

        Oliva.setText("Oliva");

        javax.swing.GroupLayout FeltetekpanelLayout = new javax.swing.GroupLayout(Feltetekpanel);
        Feltetekpanel.setLayout(FeltetekpanelLayout);
        FeltetekpanelLayout.setHorizontalGroup(
            FeltetekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeltetekpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FeltetekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Feltetek)
                    .addGroup(FeltetekpanelLayout.createSequentialGroup()
                        .addGroup(FeltetekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gomba)
                            .addComponent(Sonka))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FeltetekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FeltetekpanelLayout.createSequentialGroup()
                                .addComponent(Szalami)
                                .addGap(18, 18, 18)
                                .addComponent(Jalapeno))
                            .addGroup(FeltetekpanelLayout.createSequentialGroup()
                                .addComponent(Sajt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Kukorica)))
                        .addGap(18, 18, 18)
                        .addGroup(FeltetekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ananasz)
                            .addComponent(Oliva))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        FeltetekpanelLayout.setVerticalGroup(
            FeltetekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeltetekpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Feltetek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FeltetekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sonka)
                    .addComponent(Sajt)
                    .addComponent(Kukorica)
                    .addComponent(Ananasz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FeltetekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gomba)
                    .addComponent(Szalami)
                    .addComponent(Jalapeno)
                    .addComponent(Oliva))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Pizzatesztafajtakpanel.setBackground(new java.awt.Color(153, 153, 153));
        Pizzatesztafajtakpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Pizzatesztafajtak.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pizzatesztafajtak.setText("Pizza (tészta) fajták");

        buttonGroup1.add(Vekony);
        Vekony.setText("Vékony");
        Vekony.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VekonyStateChanged(evt);
            }
        });

        buttonGroup1.add(Vastag);
        Vastag.setText("Vastag");

        javax.swing.GroupLayout PizzatesztafajtakpanelLayout = new javax.swing.GroupLayout(Pizzatesztafajtakpanel);
        Pizzatesztafajtakpanel.setLayout(PizzatesztafajtakpanelLayout);
        PizzatesztafajtakpanelLayout.setHorizontalGroup(
            PizzatesztafajtakpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzatesztafajtakpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PizzatesztafajtakpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pizzatesztafajtak)
                    .addComponent(Vekony)
                    .addComponent(Vastag))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PizzatesztafajtakpanelLayout.setVerticalGroup(
            PizzatesztafajtakpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzatesztafajtakpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pizzatesztafajtak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vekony)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vastag)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Pizzameretekpanel.setBackground(new java.awt.Color(204, 204, 204));
        Pizzameretekpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Pizzameretek.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pizzameretek.setText("Pizza méretek");

        Meretek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">> Válassz méretet! <<", "24 cm: 3390 Ft", "32 cm: 3990 Ft", "45 cm: 6290 Ft" }));

        javax.swing.GroupLayout PizzameretekpanelLayout = new javax.swing.GroupLayout(Pizzameretekpanel);
        Pizzameretekpanel.setLayout(PizzameretekpanelLayout);
        PizzameretekpanelLayout.setHorizontalGroup(
            PizzameretekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzameretekpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PizzameretekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pizzameretek)
                    .addComponent(Meretek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PizzameretekpanelLayout.setVerticalGroup(
            PizzameretekpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PizzameretekpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pizzameretek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Meretek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rendelesgomb.setBackground(new java.awt.Color(153, 255, 153));
        Rendelesgomb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Rendelesgomb.setForeground(new java.awt.Color(51, 204, 0));
        Rendelesgomb.setText("Rendelés leadás");
        Rendelesgomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendelesgombActionPerformed(evt);
            }
        });

        Torlesgomb.setBackground(new java.awt.Color(255, 153, 153));
        Torlesgomb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Torlesgomb.setForeground(new java.awt.Color(255, 0, 0));
        Torlesgomb.setText("Rendelés törlés");
        Torlesgomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TorlesgombActionPerformed(evt);
            }
        });

        Rendelesveglegesitese.setText("Rendelés véglegesítése");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fejlecpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pizzatesztafajtakpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pizzameretekpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alapszoszokpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Feltetekpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rendelesgomb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Rendelesveglegesitese)
                                .addComponent(Torlesgomb, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fejlecpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pizzatesztafajtakpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alapszoszokpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pizzameretekpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rendelesveglegesitese)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Torlesgomb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rendelesgomb))
                    .addComponent(Feltetekpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TorlesgombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TorlesgombActionPerformed
        
    }//GEN-LAST:event_TorlesgombActionPerformed

    private void VekonyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VekonyStateChanged
        
    }//GEN-LAST:event_VekonyStateChanged

    private void RendelesgombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendelesgombActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Tesztverzió!", "Cím", 2);
    }//GEN-LAST:event_RendelesgombActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alapszoszok;
    private javax.swing.JPanel Alapszoszokpanel;
    private javax.swing.JCheckBox Ananasz;
    private javax.swing.JPanel Fejlecpanel;
    private javax.swing.JLabel Feltetek;
    private javax.swing.JPanel Feltetekpanel;
    private javax.swing.JCheckBox Gomba;
    private javax.swing.JCheckBox Jalapeno;
    private javax.swing.JLabel Kep;
    private javax.swing.JCheckBox Kukorica;
    private javax.swing.JLabel LaComa;
    private javax.swing.JComboBox<String> Meretek;
    private javax.swing.JLabel Nyitvatartas;
    private javax.swing.JLabel Nytintervallum;
    private javax.swing.JCheckBox Oliva;
    private javax.swing.JLabel PIZZA;
    private javax.swing.JRadioButton Paradicsomos;
    private javax.swing.JLabel Pizzameretek;
    private javax.swing.JPanel Pizzameretekpanel;
    private javax.swing.JLabel Pizzatesztafajtak;
    private javax.swing.JPanel Pizzatesztafajtakpanel;
    private javax.swing.JLabel Rendelesfelvetel;
    private javax.swing.JButton Rendelesgomb;
    private javax.swing.JCheckBox Rendelesveglegesitese;
    private javax.swing.JLabel Rfintervallum;
    private javax.swing.JCheckBox Sajt;
    private javax.swing.JCheckBox Sonka;
    private javax.swing.JCheckBox Szalami;
    private javax.swing.JRadioButton Tejszines;
    private javax.swing.JButton Torlesgomb;
    private javax.swing.JRadioButton Vastag;
    private javax.swing.JRadioButton Vekony;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    // End of variables declaration//GEN-END:variables
}
