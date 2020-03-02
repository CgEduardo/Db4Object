
package banco;

import Components.Conexion;
import Components.Usuario;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;



public class Sucursal extends javax.swing.JFrame {
    
    Usuario u = new Usuario();
    Conexion c = new Conexion();
    int resultado;
    int tarjeta1;
      int tarjeta2;
      int tarjeta3;
    
       
    public Sucursal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombrecliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txttarjeta = new javax.swing.JTextField();
        NumerodeCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        calculoedad = new javax.swing.JTextField();
        edad = new javax.swing.JButton();
        txtfechadenacimiento = new javax.swing.JTextField();
        campotutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        generarcuenta = new javax.swing.JButton();
        btntarjeta = new javax.swing.JButton();
        btnnip = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listita = new javax.swing.JTextArea();
        listaupdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fondito = new javax.swing.JTextField();
        txtnip = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jLabel1.setText("Nombre Completo");

        jLabel2.setText("Fecha de Nacimiento");

        jLabel3.setText("Numero de Tarjeta");

        jLabel4.setText("Nip");

        jLabel5.setText("Numero de cliente");

        nombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreclienteActionPerformed(evt);
            }
        });

        jButton1.setText("Ingresar Datos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txttarjeta.setEditable(false);
        txttarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttarjetaActionPerformed(evt);
            }
        });

        NumerodeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumerodeClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 11)); // NOI18N
        jLabel6.setText("Sistema de Administrador de Tarjetas");

        calculoedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoedadActionPerformed(evt);
            }
        });

        edad.setText("Calcular Edad");
        edad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edadMouseClicked(evt);
            }
        });
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        txtfechadenacimiento.setText("DD/MM/YYYY");
        txtfechadenacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechadenacimientoActionPerformed(evt);
            }
        });

        campotutor.setEditable(false);

        jLabel7.setText(" Tutor");

        generarcuenta.setText("generar");
        generarcuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarcuentaMouseClicked(evt);
            }
        });
        generarcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarcuentaActionPerformed(evt);
            }
        });

        btntarjeta.setText("generar");
        btntarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntarjetaMouseClicked(evt);
            }
        });
        btntarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntarjetaActionPerformed(evt);
            }
        });

        btnnip.setText("generar");
        btnnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnipActionPerformed(evt);
            }
        });

        listita.setColumns(20);
        listita.setRows(5);
        jScrollPane1.setViewportView(listita);

        listaupdate.setText("Refresh");
        listaupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaupdateMouseClicked(evt);
            }
        });
        listaupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaupdateActionPerformed(evt);
            }
        });

        jLabel8.setText("FondosTotales");

        fondito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonditoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listaupdate)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(edad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3))))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumerodeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtfechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(calculoedad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campotutor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btntarjeta)
                                    .addComponent(generarcuenta)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(fondito, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtnip, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnnip)))))))
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listaupdate)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(btnnip)
                                    .addComponent(txtnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(NumerodeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(generarcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16)
                                        .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(txtfechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(calculoedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(campotutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(6, 6, 6)
                                        .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(btntarjeta)))
                                .addGap(31, 31, 31)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(fondito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(92, 92, 92))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreclienteActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

// Almacenamiento de los datos recibidos
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dato1 = Integer.parseInt(NumerodeCliente.getText());
        String datoN =nombrecliente.getText();
        String tutor =campotutor.getText();
        String tarjeta=txttarjeta.getText();
        String NipI =txtnip.getText();
        int fondos = Integer.parseInt(fondito.getText());
        
        
        //Asignar los datos en la base de datos
        u.setNumeroCliente(dato1);
        u.setNombreCompleto(datoN);// La edad se genera desde el boton de calcular edad almacenando el el otro boton
        u.setEdad(resultado);
        u.setTutor(tutor);
        u.setNumeroTarejta(tarjeta);
        u.setFondos(fondos);
        u.setNip(NipI);
        
        
       c.insertarRegistro(u);
       
       NumerodeCliente.setText(null);
       nombrecliente.setText(null);
       campotutor.setText(null);
       txttarjeta.setText(null);
       txtnip.setText(null);
       fondito.setText(null);
       calculoedad.setText(null);
       txtfechadenacimiento.setText(null);
       System.out.println(c.seleccionarUsuario());
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttarjetaActionPerformed
       
    }//GEN-LAST:event_txttarjetaActionPerformed

    private void NumerodeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumerodeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumerodeClienteActionPerformed

    private void calculoedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculoedadActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void edadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edadMouseClicked
      
        //Obtencion de la fecha
        DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechanacimiento=LocalDate.parse(txtfechadenacimiento.getText(), date);
        LocalDate fechaactual=LocalDate.now();
        
        //Calculo de la fecha actual con el año de nacimiento
        Period periodo = Period.between(fechanacimiento, fechaactual);
        resultado =Integer.parseInt(periodo.getYears()+"");
        calculoedad.setText(""+resultado);
        
        
        //Validacion del campo tu tutor para verificar si lo necesita
        if(resultado>18){
        campotutor.setEditable(false);
        }else{
        campotutor.setEditable(true);
        campotutor.setText("Nombre del tutor requerido");
        campotutor.setBackground(Color.red);
        JOptionPane.showMessageDialog(null, "Esta apunto de agregar un menor de edad");
        }
    }//GEN-LAST:event_edadMouseClicked

    private void btntarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntarjetaActionPerformed
        //Creacion de la tarjeta de 12 dijiyos mediante el random
        
        tarjeta1 = (int)(Math.random()*(9999-1000+1)+1000);  
          tarjeta2 = (int)(Math.random()*(9999-1000+1)+1000);
           tarjeta3 = (int)(Math.random()*(9999-1000+1)+1000);
           
          txttarjeta.setText("5555"+"-"+tarjeta1+"-"+tarjeta2+"-"+tarjeta3);
    }//GEN-LAST:event_btntarjetaActionPerformed
            //Generar el numero random
    private void generarcuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarcuentaMouseClicked
       int numerodecliente;
       numerodecliente =(int)(Math.random()*(9999-1000+1)+1000);
       NumerodeCliente.setText(Integer.toString(numerodecliente));
       
        
         
    }//GEN-LAST:event_generarcuentaMouseClicked

    private void btntarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntarjetaMouseClicked
       
    }//GEN-LAST:event_btntarjetaMouseClicked

    private void listaupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaupdateActionPerformed

    private void listaupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaupdateMouseClicked
        
    }//GEN-LAST:event_listaupdateMouseClicked

    private void generarcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarcuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarcuentaActionPerformed
//Se ejecuta el random para asignar un nip ya que los nipno pueden ser asignados por las personas
    private void btnnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnipActionPerformed
        int nip;
      nip = (int) (Math.random()*(9999-1000+1)+1000);
      txtnip.setText(Integer.toString(nip));
      
      
       
       
    }//GEN-LAST:event_btnnipActionPerformed

    private void fonditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fonditoActionPerformed

    private void txtfechadenacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechadenacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechadenacimientoActionPerformed

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
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NumerodeCliente;
    private javax.swing.JButton btnnip;
    private javax.swing.JButton btntarjeta;
    private javax.swing.JTextField calculoedad;
    private javax.swing.JTextField campotutor;
    private javax.swing.JButton edad;
    private javax.swing.JTextField fondito;
    private javax.swing.JButton generarcuenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listaupdate;
    private javax.swing.JTextArea listita;
    private javax.swing.JTextField nombrecliente;
    private javax.swing.JTextField txtfechadenacimiento;
    private javax.swing.JTextField txtnip;
    private javax.swing.JTextField txttarjeta;
    // End of variables declaration//GEN-END:variables
}
