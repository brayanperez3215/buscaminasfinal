

package mibuscaminas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Buscaminas extends javax.swing.JFrame {
    
principiante nivelPrincipiante = new principiante();
intermedio nivelIntermedio = new intermedio();
	
        
private boolean prin=true, 
        inter=false;
          
        
private String[] archi = {
    "/imagenes/gano.png",
    "/imagenes/perdio.png",
    "/imagenes/nueva.png"};
	  
    private ImageIcon[] ima = new ImageIcon[3]; 
    
       	
    	 
     
    public Buscaminas() {
        for(int i=0;i<3;i++){
            ima[i] = new ImageIcon(getClass().getResource(archi[i]));
        }
    	this.add(nivelPrincipiante);
    	nivelPrincipiante.setVisible(false);
    	 	
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        translucido = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemprinci = new javax.swing.JMenuItem();
        itemmedio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("mibuscaminas/Bundle"); // NOI18N
        setTitle(bundle.getString("Buscaminas.title")); // NOI18N

        translucido.setColorPrimario(new java.awt.Color(0, 204, 204));
        translucido.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(bundle.getString("Buscaminas.jLabel1.text")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENESPRESENTACIOM/0.jpg"))); // NOI18N
        jLabel2.setText(bundle.getString("Buscaminas.jLabel2.text")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENESPRESENTACIOM/1.jpg"))); // NOI18N
        jLabel3.setText(bundle.getString("Buscaminas.jLabel3.text")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENESPRESENTACIOM/12.jpg"))); // NOI18N
        jLabel6.setText(bundle.getString("Buscaminas.jLabel6.text")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENESPRESENTACIOM/3.jpg"))); // NOI18N
        jLabel7.setText(bundle.getString("Buscaminas.jLabel7.text")); // NOI18N

        jButton1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton1.setText(bundle.getString("Buscaminas.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout translucidoLayout = new javax.swing.GroupLayout(translucido);
        translucido.setLayout(translucidoLayout);
        translucidoLayout.setHorizontalGroup(
            translucidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(translucidoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(translucidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(translucidoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, translucidoLayout.createSequentialGroup()
                        .addGap(0, 149, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, translucidoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(29, 29, 29))
            .addGroup(translucidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        translucidoLayout.setVerticalGroup(
            translucidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(translucidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(translucidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(translucidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jMenu1.setText(bundle.getString("Buscaminas.jMenu1.text")); // NOI18N

        itemprinci.setText(bundle.getString("Buscaminas.itemprinci.text")); // NOI18N
        itemprinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemprinciActionPerformed(evt);
            }
        });
        jMenu1.add(itemprinci);

        itemmedio.setText(bundle.getString("Buscaminas.itemmedio.text")); // NOI18N
        itemmedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemmedioActionPerformed(evt);
            }
        });
        jMenu1.add(itemmedio);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(translucido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(translucido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemprinciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemprinciActionPerformed
nivelPrincipiante.setVisible(true);
translucido.setVisible(false);
        nivelPrincipiante.botonP.setIcon(ima[2]);
        nivelPrincipiante.quitarBotonesPrincipiante();
        nivelPrincipiante.setVisible(false);            
        nivelPrincipiante.labelP.setText("");
        nivelPrincipiante.nuevaPartidaPrincipiante();
        nivelPrincipiante.setVisible(true);
        	if(inter){
        		this.remove(nivelIntermedio);
        		this.add(nivelPrincipiante);
        		inter=false;
        		prin=true; 
        	
                }	               
            setSize(216,305);
            setLocationRelativeTo(null);   
                // TODO add your handling code here:
    }//GEN-LAST:event_itemprinciActionPerformed

    private void itemmedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemmedioActionPerformed
translucido.setVisible(false);
        nivelIntermedio.btnreiniciar.setIcon(ima[2]);
        	nivelIntermedio.quitarBotonesIntermedio();
        	nivelIntermedio.setVisible(false);            
        	nivelIntermedio.labelI.setText("");
        	nivelIntermedio.nuevaPartidaIntermedio();
        	nivelIntermedio.setVisible(true);
        	if(prin){
        		this.remove(nivelPrincipiante);
        		this.add(nivelIntermedio);
        		prin=false;
        		inter=true; 
        	
                }	           
            setSize(416, 500);
            setLocationRelativeTo(null);        // TODO add your handling code here:
    }//GEN-LAST:event_itemmedioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
nivelPrincipiante.setVisible(true);
translucido.setVisible(false);
        nivelPrincipiante.botonP.setIcon(ima[2]);
        	nivelPrincipiante.quitarBotonesPrincipiante();
        	nivelPrincipiante.setVisible(false);            
            nivelPrincipiante.labelP.setText("");
            nivelPrincipiante.nuevaPartidaPrincipiante();
            nivelPrincipiante.setVisible(true);
        	if(inter){
        		this.remove(nivelIntermedio);
        		this.add(nivelPrincipiante);
        		inter=false;
        		prin=true; 
        	
                }	               
            setSize(216,305);
            setLocationRelativeTo(null);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscaminas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemmedio;
    private javax.swing.JMenuItem itemprinci;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private org.edisoncor.gui.panel.PanelRectTranslucido translucido;
    // End of variables declaration//GEN-END:variables
}
