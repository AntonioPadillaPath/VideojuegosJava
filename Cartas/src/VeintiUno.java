import java.util.Random;
import javax.swing.ImageIcon;

public class VeintiUno extends javax.swing.JFrame {
    
    public ImageIcon icoImagen;
    
    int i1 = 0, j1, i2 = 0, j2;
    int k1 = 0, k2 = 0;
    
    public void Cartas1()
    {
        k1 += 1;
        Tomadas1.setText("" +k1);
        
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10) + 1; 
        
        if (numero == 1)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\A.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 1;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else if (numero == 2)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\2.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 2;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else if (numero == 3)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\3.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 3;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else if (numero == 4)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\4.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 4;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else if (numero == 5)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\5.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 5;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else if (numero == 6)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\6.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 6;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else if (numero == 7)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\7.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 7;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else if (numero == 8)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\8.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 8;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else if (numero == 9)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\9.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 9;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        else
        {
            icoImagen = new ImageIcon("E:\\Cartas\\10.jpg");
            jLabel3.setIcon(icoImagen);
            j1 = 10;
            i1 += j1;
            Resultado1.setText("" +i1);
        }
        
        
        if (i1 < 21)
        {
            Estado1.setText("Sigues en juego");
        }
        else if (i1 > 21)
        {
            Estado1.setText("¡¡PERDISTE!!");
        }
        
        if (i1 < 21)
        {
            Estado1.setText("Sigues en juego");
        }
        else if (i1 > 21)
        {
            Estado1.setText("¡¡PERDISTE!!");
            Estado3.setText("GANA JUGADOR 2");
        }
        
    }
    
    public void Cartas2()
    {
        
        k2 += 1;
        Tomadas2.setText("" +k2);
        
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10) + 1; 
        
        if (numero == 1)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\A.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 1;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else if (numero == 2)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\2.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 2;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else if (numero == 3)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\3.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 3;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else if (numero == 4)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\4.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 4;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else if (numero == 5)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\5.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 5;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else if (numero == 6)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\6.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 6;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else if (numero == 7)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\7.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 7;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else if (numero == 8)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\8.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 8;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else if (numero == 9)
        {
            icoImagen = new ImageIcon("E:\\Cartas\\9.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 9;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        else
        {
            icoImagen = new ImageIcon("E:\\Cartas\\10.jpg");
            jLabel2.setIcon(icoImagen);
            j2 = 10;
            i2 += j2;
            Resultado2.setText("" +i2);
        }
        
        if (i2 < 21)
        {
            Estado2.setText("Sigues en juego");
        }
        else if (i2 > 21)
        {
            Estado2.setText("¡¡PERDISTE!!");
            Estado3.setText("GANA JUGADOR 1");
        }
        
    }

    public VeintiUno() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tomar1 = new javax.swing.JButton();
        Tomar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Resultado1 = new javax.swing.JTextField();
        Resultado2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tomadas1 = new javax.swing.JTextField();
        Tomadas2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Estado1 = new javax.swing.JLabel();
        Estado2 = new javax.swing.JLabel();
        Estado3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JUEGO 21: Saca cartas al azar y obten la suma de 21 o lo más próximo sin pasarte, si no perderás");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Volteada.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Volteada.jpg"))); // NOI18N

        Tomar1.setText("Tomar carta");
        Tomar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tomar1ActionPerformed(evt);
            }
        });

        Tomar2.setText("Tomar carta");
        Tomar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tomar2ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Volteada.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Volteada.jpg"))); // NOI18N

        jButton1.setText("Juego Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Resultado1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Resultado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resultado1.setText("0");

        Resultado2.setEditable(false);
        Resultado2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Resultado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resultado2.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Suma");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Suma");

        Tomadas1.setEditable(false);
        Tomadas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tomadas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tomadas1.setText("0");

        Tomadas2.setEditable(false);
        Tomadas2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tomadas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tomadas2.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cartas tomadas");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cartas tomadas");

        Estado1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Estado1.setForeground(new java.awt.Color(102, 255, 0));

        Estado2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Estado2.setForeground(new java.awt.Color(102, 255, 0));

        Estado3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Estado3.setForeground(new java.awt.Color(102, 255, 0));

        jButton2.setText("Validar puntos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Estado2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tomadas1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tomadas2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Tomar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tomar2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(Estado3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tomar1)
                    .addComponent(Tomar2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tomadas1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tomadas2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estado2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Estado3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tomar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tomar1ActionPerformed

        Cartas1();

    }//GEN-LAST:event_Tomar1ActionPerformed

    private void Tomar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tomar2ActionPerformed

        Cartas2();

    }//GEN-LAST:event_Tomar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Resultado1.setText("0");
        Resultado2.setText("0");
        Tomadas1.setText("0");
        Tomadas2.setText("0");
        Estado1.setText("");
        Estado2.setText("");
        Estado3.setText("");

        icoImagen = new ImageIcon("E:\\Cartas\\Volteada.jpg");
        jLabel3.setIcon(icoImagen);

        icoImagen = new ImageIcon("E:\\Cartas\\Volteada.jpg");
        jLabel2.setIcon(icoImagen);

        i1 = 0;
        i2 = 0;
        k1 = 0;
        k2 = 0;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (i1 == 21 && i2 == 21)
        {
            Estado3.setText("Â¡EMPATE!");
            Estado1.setText("");
            Estado2.setText("");
        }
        else if (i1 == 21 && i2 < 21)
        {
            Estado3.setText("Â¡GANA JUGADOR 1");
            Estado1.setText("");
            Estado2.setText("");
        }
        else if (i2 == 21 && i1 < 21)
        {
            Estado3.setText("Â¡GANA JUGADOR 2");
            Estado1.setText("");
            Estado2.setText("");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VeintiUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeintiUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeintiUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeintiUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeintiUno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado1;
    private javax.swing.JLabel Estado2;
    private javax.swing.JLabel Estado3;
    private javax.swing.JTextField Resultado1;
    private javax.swing.JTextField Resultado2;
    private javax.swing.JTextField Tomadas1;
    private javax.swing.JTextField Tomadas2;
    private javax.swing.JButton Tomar1;
    private javax.swing.JButton Tomar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
