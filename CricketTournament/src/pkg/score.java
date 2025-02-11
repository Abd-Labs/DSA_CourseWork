/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class score extends javax.swing.JFrame {
    
    Match match;
    int inningNo=0;
    
    int team1score;
    int team2score;
    /**
     * Creates new form score
     */
    public score() {
        initComponents();
    }
    public score(Match match){
        this();
        
        this.match=match;
        
        teamName.setEditable(false);
        score.setEditable(false);
        wickets.setEditable(false);
        overs.setEditable(false);
        if (match.toss.getTossWin().equalsIgnoreCase("Team1")) {
            if(match.toss.choose.equalsIgnoreCase("bat"))
            teamName.setText(match.getTeam1().getTeamName());
            else
            teamName.setText(match.getTeam2().getTeamName());  
        }
        else{
             if(match.toss.choose.equalsIgnoreCase("bat"))
            teamName.setText(match.getTeam2().getTeamName());
            else
            teamName.setText(match.getTeam1().getTeamName()); 
        }
    
    
        score.setText("0");
        wickets.setText("0");
        overs.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teamName = new javax.swing.JTextField();
        score = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        wickets = new javax.swing.JTextField();
        overs = new javax.swing.JTextField();
        thisball = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        jLabel1.setText("/");

        overs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oversActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("This ball");

        Update.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel3.setText("( W )for wicket");

        jLabel4.setText("(Wd) for Wide ball");

        jLabel5.setText("1-6  for Runs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thisball, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(overs)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wickets, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wickets, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(overs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thisball, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamNameActionPerformed

    private void oversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oversActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oversActionPerformed

    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        String run = thisball.getText();
        
        if (run.trim().isEmpty()) {
            return;
        }
        if (run.equalsIgnoreCase("W")) {
            int totalWickets= Integer.parseInt(wickets.getText());
            
            totalWickets++;
            
            wickets.setText(String.valueOf(totalWickets));
            
            UpdateOvers();
            
            if (InningsEnd()) {
                NextInnings(inningNo);
            }
            
            return;
        }
        
        int runs = Integer.parseInt(score.getText());
        if (run.equalsIgnoreCase("Wd")) {
            runs++;
            score.setText(String.valueOf(runs));
            return;
        }
        else if (run.equals("1")) {
            runs++;
            
        }
        else if (run.equals("2")) {
            runs+=2;
        }
        else if (run.equals("3")) {
            runs+=3;
        }
        else if (run.equals("4")) {
            runs+=4;
        }
        else if (run.equals("5")) {
            runs+=5;
        }
        else if (run.equals("6")) {
            runs+=6;
        }
        score.setText(String.valueOf(runs));
        UpdateOvers();
        if (InningsEnd()) {
                NextInnings(inningNo);
            }
    }//GEN-LAST:event_UpdateActionPerformed

    public void UpdateOvers(){
        
        double overs = Float.parseFloat(this.overs.getText());
        
        overs+=0.1;
        
        if ( (overs - (int)overs) > 0.55){
            overs= Math.ceil(overs);
        }
        
        this.overs.setText(String.valueOf(String.format("%.1f", overs)));
        
    }
    public boolean InningsEnd(){
        
        if (teamName.getText().equalsIgnoreCase(match.getTeam1().getTeamName())) {
            team1score = Integer.parseInt(score.getText());
        }
        else{
            team2score = Integer.parseInt(score.getText());
        }
       
        
        if ((match.getOvers()== (int) Float.parseFloat(overs.getText())) || (Integer.parseInt(wickets.getText()))==4) {
             inningNo++;
            return true;
        }
        
        return false;
    }
    
    public void NextInnings(int inningNo){
        
        if(inningNo==1){
        JOptionPane.showMessageDialog(score.this , "Innings Break");
            if (teamName.getText().equalsIgnoreCase(match.getTeam1().getTeamName())) {
                teamName.setText(match.getTeam2().getTeamName());
            }
            else{
                  teamName.setText(match.getTeam1().getTeamName());
            }
            
            score.setText("0");
            wickets.setText("0");
            overs.setText("0");
            thisball.setText("");
        }
        if (inningNo==2){
            
            if (team1score>team2score) {
                JOptionPane.showMessageDialog(score.this, match.getTeam1().getTeamName()+ " has won the match");
            }
            else if (team2score>team1score) {
                 JOptionPane.showMessageDialog(score.this, match.getTeam2().getTeamName()+ " has won the match");
            }
            
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
            this.setVisible(false);
        }
        
    }
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
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new score().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField overs;
    private javax.swing.JTextField score;
    private javax.swing.JTextField teamName;
    private javax.swing.JTextField thisball;
    private javax.swing.JTextField wickets;
    // End of variables declaration//GEN-END:variables
}
