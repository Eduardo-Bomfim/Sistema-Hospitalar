/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hospital.frames.recepcionista;

/**
 *
 * @author eduar
 */
public class telaRecepcionista extends javax.swing.JFrame {

    /**
     * Creates new form telaRecepcionista
     */
    public telaRecepcionista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPainel = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        caixaMessagemIcon = new javax.swing.JLabel();
        linhaSeparatoriaVertical = new javax.swing.JLabel();
        notificacaoIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        usertText = new javax.swing.JLabel();
        barraPesquisaPanel = new com.mycompany.hospital.customs.jpanel.PanelRound();
        lupaIcon = new javax.swing.JLabel();
        barraPesquisa = new javax.swing.JTextField();
        menuLateral = new javax.swing.JPanel();
        linhaDivisoria = new javax.swing.JSeparator();
        iconHome = new javax.swing.JLabel();
        homeText = new javax.swing.JLabel();
        linhaDivisoria6 = new javax.swing.JSeparator();
        iconTicket = new javax.swing.JLabel();
        ticketText = new javax.swing.JLabel();
        linhaDivisoria1 = new javax.swing.JSeparator();
        linhaDivisoria2 = new javax.swing.JSeparator();
        linhaDivisoria3 = new javax.swing.JSeparator();
        linhaDivisoria5 = new javax.swing.JSeparator();
        iconConfig = new javax.swing.JLabel();
        configText = new javax.swing.JLabel();
        cadastrarIcon = new javax.swing.JLabel();
        suporteText1 = new javax.swing.JLabel();
        iconSuporte1 = new javax.swing.JLabel();
        cadastrarText = new javax.swing.JLabel();
        filaIcon = new javax.swing.JLabel();
        filaText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPainel.setBackground(new java.awt.Color(51, 102, 255));
        menuPainel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_menu_48px_1_1.png"))); // NOI18N
        menuPainel.add(menuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 32));

        caixaMessagemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group_message_26px_1.png"))); // NOI18N
        menuPainel.add(caixaMessagemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 24, -1, -1));

        linhaSeparatoriaVertical.setBackground(new java.awt.Color(102, 102, 102));
        linhaSeparatoriaVertical.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        linhaSeparatoriaVertical.setForeground(new java.awt.Color(153, 153, 153));
        linhaSeparatoriaVertical.setText("I");
        menuPainel.add(linhaSeparatoriaVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 6, -1, 65));

        notificacaoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bell_26px_1.png"))); // NOI18N
        menuPainel.add(notificacaoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1051, 25, -1, -1));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male_user_50px_1.png"))); // NOI18N
        menuPainel.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1133, 6, -1, 65));

        usertText.setBackground(new java.awt.Color(255, 255, 255));
        usertText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usertText.setForeground(new java.awt.Color(255, 255, 255));
        usertText.setText("Olá, usuario");
        menuPainel.add(usertText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1189, 34, -1, -1));

        barraPesquisaPanel.setBackground(new java.awt.Color(153, 153, 153));
        barraPesquisaPanel.setRoundBottomLeft(20);
        barraPesquisaPanel.setRoundBottomRight(20);
        barraPesquisaPanel.setRoundTopLeft(20);
        barraPesquisaPanel.setRoundTopRight(20);

        lupaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_26px_1.png"))); // NOI18N

        barraPesquisa.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        barraPesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        barraPesquisa.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        barraPesquisa.setSelectionColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout barraPesquisaPanelLayout = new javax.swing.GroupLayout(barraPesquisaPanel);
        barraPesquisaPanel.setLayout(barraPesquisaPanelLayout);
        barraPesquisaPanelLayout.setHorizontalGroup(
            barraPesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPesquisaPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lupaIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        barraPesquisaPanelLayout.setVerticalGroup(
            barraPesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPesquisaPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(barraPesquisaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lupaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        menuPainel.add(barraPesquisaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 510, 50));

        getContentPane().add(menuPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 70));

        menuLateral.setBackground(new java.awt.Color(0, 153, 204));
        menuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaDivisoria.setBackground(new java.awt.Color(51, 51, 51));
        menuLateral.add(linhaDivisoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        iconHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_24px_1.png"))); // NOI18N
        menuLateral.add(iconHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        homeText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeText.setForeground(new java.awt.Color(255, 255, 255));
        homeText.setText("Home");
        menuLateral.add(homeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        linhaDivisoria6.setBackground(new java.awt.Color(51, 51, 51));
        menuLateral.add(linhaDivisoria6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 10));

        iconTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ingressos-de-cinema.png"))); // NOI18N
        menuLateral.add(iconTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        ticketText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ticketText.setForeground(new java.awt.Color(255, 255, 255));
        ticketText.setText("Tickets");
        menuLateral.add(ticketText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        linhaDivisoria1.setBackground(new java.awt.Color(51, 51, 51));
        menuLateral.add(linhaDivisoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 10));

        linhaDivisoria2.setBackground(new java.awt.Color(51, 51, 51));
        menuLateral.add(linhaDivisoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 20));

        linhaDivisoria3.setBackground(new java.awt.Color(51, 51, 51));
        menuLateral.add(linhaDivisoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, 10));

        linhaDivisoria5.setBackground(new java.awt.Color(51, 51, 51));
        menuLateral.add(linhaDivisoria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 20));

        iconConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/definicoes.png"))); // NOI18N
        menuLateral.add(iconConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        configText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        configText.setForeground(new java.awt.Color(255, 255, 255));
        configText.setText("Configurações");
        menuLateral.add(configText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        cadastrarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/registro-online.png"))); // NOI18N
        menuLateral.add(cadastrarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        suporteText1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        suporteText1.setForeground(new java.awt.Color(255, 255, 255));
        suporteText1.setText("Suporte");
        menuLateral.add(suporteText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        iconSuporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help-desk_4961759.png"))); // NOI18N
        menuLateral.add(iconSuporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        cadastrarText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cadastrarText.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarText.setText("Cadastrar");
        menuLateral.add(cadastrarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        filaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisa-de-dados.png"))); // NOI18N
        menuLateral.add(filaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        filaText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        filaText.setForeground(new java.awt.Color(255, 255, 255));
        filaText.setText("Fila");
        menuLateral.add(filaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        getContentPane().add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(telaRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraPesquisa;
    private com.mycompany.hospital.customs.jpanel.PanelRound barraPesquisaPanel;
    private javax.swing.JLabel cadastrarIcon;
    private javax.swing.JLabel cadastrarText;
    private javax.swing.JLabel caixaMessagemIcon;
    private javax.swing.JLabel configText;
    private javax.swing.JLabel filaIcon;
    private javax.swing.JLabel filaText;
    private javax.swing.JLabel homeText;
    private javax.swing.JLabel iconConfig;
    private javax.swing.JLabel iconHome;
    private javax.swing.JLabel iconSuporte1;
    private javax.swing.JLabel iconTicket;
    private javax.swing.JSeparator linhaDivisoria;
    private javax.swing.JSeparator linhaDivisoria1;
    private javax.swing.JSeparator linhaDivisoria2;
    private javax.swing.JSeparator linhaDivisoria3;
    private javax.swing.JSeparator linhaDivisoria5;
    private javax.swing.JSeparator linhaDivisoria6;
    private javax.swing.JLabel linhaSeparatoriaVertical;
    private javax.swing.JLabel lupaIcon;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel menuPainel;
    private javax.swing.JLabel notificacaoIcon;
    private javax.swing.JLabel suporteText1;
    private javax.swing.JLabel ticketText;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel usertText;
    // End of variables declaration//GEN-END:variables
}
