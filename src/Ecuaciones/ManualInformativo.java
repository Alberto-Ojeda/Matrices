/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecuaciones;

/**
 *
 * @author alberto
 */
public class ManualInformativo extends javax.swing.JFrame {

    /**
     * Creates new form ManualInformativo
     */
    public ManualInformativo() {
        initComponents();
                this.setLocationRelativeTo(this);
                this.setTitle("MANUAL INFORMATIVO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 580, 230));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("INGRESA ALGUN NUMERO PARA VER LA EXPLICACION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("MATRIZ=1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("DETERMINANTES=2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("SUMA DE MATRICES=3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("RESTA DE MATRICES=4");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("MULTIPLICACION DE MATRICES=5");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("OBJETIVO Y CONCLUSION=6");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        jButton3.setText("REGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int b;
        b=Integer.parseInt(jTextField1.getText());
        if (b==1) {
    jTextArea1.append("•Las matrices y los determinantes son herramientas del álgebra \n" +
"que facilitan el ordenamiento de datos ,así como su manejo.\n" +
"•Una matriz es unatabla bidimensional de números \n" +
"en cantidades abstractas que pueden sumarse y multiplicarse.");}
        if (b==2) {
            jTextArea1.append("DETERMINANTES \n" +
" Sea A  una  matriz  cuadrada  de  orden n.  Se  define  como determinante  de A  \n" +
"(denotado  como A, ()Adet  ó A∆)  a  la  suma  de  los n  productos  (signados)  \n" +
"formados  por  n-factores  que  se  obtienen  al multiplicar n-elementos de la matriz \n" +
"de tal forma que cada producto contenga un sólo elemento de cada fila y columna de A.  \n" +
"Esto  significa  que  un  determinante  es  un valor  numéricoκ  que  está  relacionado  \n" +
"con  una  matriz cuadrada y que sigue ciertas reglas para su cálculo .  \n" +
"Dos  matrices  diferentes  (tanto  en  orden  como  en  elementos)  pueden  tener  igual  \n" +
"determinante.  Nótese como  la  notación  de  determinante  no  presenta  los  corchetes  \n" +
"(a  diferencia  de  las  matrices)  sino  sólo líneas.");
        }
        if (b==3) {
            jTextArea1.append("SUMA DE MATRICES\n" +
" La suma de matrices C=A+B se define como Cij=Aij+Bij. Esto es, \n" +
"la suma de matrices es igual a la suma de los elementos correspondientes de ambas matrices que tienen el mismo orden.\n" +
"La operación suma cumple con las siguientes propiedades: Propiedad asociativa:  \n" +
"PROPIEDAD ASOCIATIVA: (A+B)+C=A+(B+C)\n" +
"PROPIEDAD CONMUTATIVA: (A+B)=(B+A)");
            
        }
        if (b==4) {
            jTextArea1.append("Diferencia La  diferencia  o  resta  de  matrices C=A-B  se  define  como Cij=aij-bij. \n" +
" Esto  es,  la  diferencia  de matrices  es  igual  a  la  resta  de  los  elementos  \n" +
"correspondientes  de  ambas matrices  que  tienen  el  mismo orden. ");
        }
        if(b==5){
            jTextArea1.append("Multiplicación de matrices\n" +
" Para  efectuar  el  producto  de  dos  matrices  \n" +
"se  requiere  que  el  número  de  columnas  de  la  primera  matriz sea igual\n" +
" que el número de renglones de la segunda. Cuando sucede esto se dice que las matrices\n" +
" son conformables para la multiplicación. Esto es, si A es de orden n×p y B es de orden n×q\n" +
"el orden de la matriz producto es p×q. Los elementos de la matriz producto BA⋅  se definen de la siguiente manera: \n" +
"Cij=∑=aik*bkj\n" +
"donde i va desde 1 hasta q.  El elemento que ocupa la posición (i,j) \n" +
"de la matriz C de p filas y q columnas, se obtiene sumando los productos de los elementos de la fila i \n" +
"de A por los elementos de la columna j de B.");
        }if (b==6) {
            jTextArea1.append("OBJETIVO\n" +
"el motivo para la realizacion de dicho proyecto es el facilitar las operaciones de matrices \n" +
"desde operaciones basicas como los son suma, resta, multiplicacion. Hasta operaciones complejas\n" +
"como lo son la solución de una matriz.\n" +
"CONCLUSIÓN\n" +
"La elaboración de algoritmos es muy util ya que optimiza el tiempo de solución, y se durante el desarrollo\n" +
"de estos se estimula la capacidad logica de el programador.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jTextArea1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ManualInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManualInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManualInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManualInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManualInformativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
