/*TODO
*Create ArrayList(Compare the count property)
*ListIterator?
*Maybe a stack? There is no need for an ArrayList if you won't be able to remove Smis 
    (ask if you have to be able remove them)
*Update actions performed by menus
*Add buttons to change which Smi is being displayed(Like task?)
*/
package Smis;

import javax.swing.JOptionPane;

public class SmisGame extends javax.swing.JFrame {
    
    Being b;
    //ArrayList<Being> list = new ArrayList<Being>();

    public SmisGame() {
        initComponents();
        try{
          update();  
        }catch(Exception e){
            
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        txtmoney = new javax.swing.JLabel();
        txthappiness = new javax.swing.JLabel();
        txthunger = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtexclusive = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmon = new javax.swing.JLabel();
        txthap = new javax.swing.JLabel();
        txthung = new javax.swing.JLabel();
        txtti = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        purchase = new javax.swing.JMenu();
        mnuconfirmpurchase = new javax.swing.JMenuItem();
        play = new javax.swing.JMenu();
        mnuconfirmplay = new javax.swing.JMenuItem();
        eat = new javax.swing.JMenu();
        mnuconfirmeat = new javax.swing.JMenuItem();
        sleep = new javax.swing.JMenu();
        mnuconfirmsleep = new javax.swing.JMenuItem();
        pfa = new javax.swing.JMenu();
        mnuwork = new javax.swing.JMenuItem();
        mnudig = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Money:");

        jLabel2.setText("Happiness:");

        jLabel3.setText("Hunger:");

        jLabel4.setText("Time:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtexclusive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                    .addComponent(txtti, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txthap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txthung, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txthap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txthung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtexclusive, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtti, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        purchase.setText("Purchase New  |");

        mnuconfirmpurchase.setText("Confirm");
        mnuconfirmpurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuconfirmpurchaseActionPerformed(evt);
            }
        });
        purchase.add(mnuconfirmpurchase);

        jMenuBar1.add(purchase);

        play.setText("Play  |");

        mnuconfirmplay.setText("Confirm");
        play.add(mnuconfirmplay);

        jMenuBar1.add(play);

        eat.setText("Eat  |");

        mnuconfirmeat.setText("Confirm");
        eat.add(mnuconfirmeat);

        jMenuBar1.add(eat);

        sleep.setText("Sleep  |");

        mnuconfirmsleep.setText("Confirm");
        sleep.add(mnuconfirmsleep);

        jMenuBar1.add(sleep);

        pfa.setText("Perform Exclusive Action  |");

        mnuwork.setText("Work (Person)");
        pfa.add(mnuwork);

        mnudig.setText("Dig (Dog)");
        pfa.add(mnudig);

        jMenuBar1.add(pfa);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txthappiness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txthunger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txthappiness, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txthunger, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuconfirmpurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuconfirmpurchaseActionPerformed
        PurchaseNewSmi form = new PurchaseNewSmi(this, true); //link to JDialog
        form.setVisible(true);
        if(form.getSignal().equals("Ok")){ //receive the "OK" from the JDialog
            b = form.getBeing(); 
            //list.add(b);
            update();
            txtoutput.setText("You purchased a new Smi! \n\n" + b.info());
        }
    }//GEN-LAST:event_mnuconfirmpurchaseActionPerformed
    
    /*Will be for play
        b.play();
        txtoutput.setText(b.playString());
        update();
    */
    /*Eat
        b.eat()
        update();
    */
    /*Exclusive,different for Dog and Person
        //b.dig();
        //or//b.work();
        update();
    */
    /*Sleep
        b.sleep();
        update();
    */
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
            java.util.logging.Logger.getLogger(SmisGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmisGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmisGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmisGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmisGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu eat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuconfirmeat;
    private javax.swing.JMenuItem mnuconfirmplay;
    private javax.swing.JMenuItem mnuconfirmpurchase;
    private javax.swing.JMenuItem mnuconfirmsleep;
    private javax.swing.JMenuItem mnudig;
    private javax.swing.JMenuItem mnuwork;
    private javax.swing.JMenu pfa;
    private javax.swing.JMenu play;
    private javax.swing.JMenu purchase;
    private javax.swing.JMenu sleep;
    private javax.swing.JLabel txtexclusive;
    private javax.swing.JLabel txthap;
    private javax.swing.JLabel txthappiness;
    private javax.swing.JLabel txthung;
    private javax.swing.JLabel txthunger;
    private javax.swing.JLabel txtmon;
    private javax.swing.JLabel txtmoney;
    private javax.swing.JTextArea txtoutput;
    private javax.swing.JLabel txtti;
    // End of variables declaration//GEN-END:variables

    private void update() {//update the displays for hunger, happiness, money, etc.
        txtmon.setText(Integer.toString(Being.getMoney()));
        txthap.setText(Integer.toString(b.getHappiness()));
        txthung.setText(Integer.toString(b.getHunger()));
        txtexclusive.setText(b.getExclusive());
        txtti.setText(Double.toString(Being.getTime()));
        //checkDeath();
    }
    /*
    private boolean checkDeath(){
        if(b.getHappiness <=0){ list.remove(b); return true;}
        if(b.getHunger <=0){ list.remove(b); return true;}
        if(((Person)b).getStress() >= 100){ list.remove(b); return true;}
        if(((Dog)b).getAttention() <= 0){ list.remove(b); return true;}
        else return false;
    }
    */
}
