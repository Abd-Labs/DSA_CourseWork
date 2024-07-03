
package pkg;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1name = new javax.swing.JTextField();
        t2name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        p1name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p2name = new javax.swing.JTextField();
        p3name = new javax.swing.JTextField();
        p4name = new javax.swing.JTextField();
        p5name = new javax.swing.JTextField();
        p6name = new javax.swing.JTextField();
        p7name = new javax.swing.JTextField();
        p8name = new javax.swing.JTextField();
        p9name = new javax.swing.JTextField();
        p10name = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JComboBox<>();
        c3 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JComboBox<>();
        c5 = new javax.swing.JComboBox<>();
        c6 = new javax.swing.JComboBox<>();
        c7 = new javax.swing.JComboBox<>();
        c8 = new javax.swing.JComboBox<>();
        c9 = new javax.swing.JComboBox<>();
        c10 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setText("Team 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel2.setText("Team2");

        t1name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1nameActionPerformed(evt);
            }
        });
        t1name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1nameKeyPressed(evt);
            }
        });

        t2name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2nameActionPerformed(evt);
            }
        });
        t2name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2nameKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Enter Player's Information");

        p1name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1nameActionPerformed(evt);
            }
        });
        p1name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1nameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Enter Name of Teams");

        p2name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p2nameKeyPressed(evt);
            }
        });

        p3name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p3nameKeyPressed(evt);
            }
        });

        p4name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p4nameKeyPressed(evt);
            }
        });

        p5name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p5nameKeyPressed(evt);
            }
        });

        p6name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p6nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p6nameKeyReleased(evt);
            }
        });

        p7name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p7nameKeyPressed(evt);
            }
        });

        p8name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p8nameKeyPressed(evt);
            }
        });

        p9name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p9nameKeyPressed(evt);
            }
        });

        p10name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p10nameKeyPressed(evt);
            }
        });

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        c10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bat", "Bowl" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p10name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p9name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p8name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p7name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p1name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addComponent(p6name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p2name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p3name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t1name, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t2name, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8name, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p9name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p4name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p5name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p10name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1nameActionPerformed

    private void t2nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2nameActionPerformed

    private void p1nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1nameActionPerformed

    private void p1nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p1nameKeyPressed

    private void p2nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2nameKeyPressed
            // TODO add your handling code here:
             char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p2nameKeyPressed

    private void p3nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p3nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p3nameKeyPressed

    private void p4nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p4nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p4nameKeyPressed

    private void p5nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p5nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p5nameKeyPressed

    private void p6nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p6nameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_p6nameKeyReleased

    private void p6nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p6nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p6nameKeyPressed

    private void p7nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p7nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p7nameKeyPressed

    private void p8nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p8nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p8nameKeyPressed

    private void p9nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p9nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p9nameKeyPressed

    private void p10nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p10nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_p10nameKeyPressed

    private void t1nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_t1nameKeyPressed

    private void t2nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2nameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            t1name.setEditable(true);
        }else{
            t1name.setEditable(false);
        }
    }//GEN-LAST:event_t2nameKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Match match =null;
        Player [] Team1Players = new Player[5];
        
        Player [] Team2Players = new Player[5];
        
        
        ArrayList<JTextField> namelist = new ArrayList<>();
         ArrayList<JComboBox> combolist = new ArrayList<>();
        
      
        namelist.add(p1name);
        namelist.add(p2name);
        namelist.add(p3name);
        namelist.add(p4name);
        namelist.add(p5name);
        
        
        namelist.add(p6name);
        namelist.add(p7name);
        namelist.add(p8name);
        namelist.add(p9name);
        namelist.add(p10name);
        
        combolist.add(c1);
        combolist.add(c2);
        combolist.add(c3);
        combolist.add(c4);
        combolist.add(c5);
        combolist.add(c6);
        combolist.add(c7);
        combolist.add(c8);
        combolist.add(c9);
        combolist.add(c10);
        
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            
            if (i<5) {
                String type = combolist.get(i).getSelectedItem().toString();
                if (type.equalsIgnoreCase("Bat")) {
                    Team1Players[i] = new Batsman();
                }
                else{
                     Team1Players[i] = new Bowler();
                }
                
                Team1Players[i].setPlayerId(random.nextInt());
                Team1Players[i].setName(namelist.get(i).getText()); 
            }
            else{
                
                int j = i%5;
                
                String type = combolist.get(i).getSelectedItem().toString();
                if (type.equalsIgnoreCase("Bat")) {
                    Team2Players[j] = new Batsman();
                }
                else{
                     Team2Players[j] = new Bowler();
                }
                
                Team2Players[j].setPlayerId(random.nextInt());
                Team2Players[j].setName(namelist.get(i).getText()); 
            }
            
            team team1 = new team();
            team team2 = new team();
            
            team1.setTeamId(random.nextInt());
            team1.setTeamId(random.nextInt());
            
            team1.setTeamName(t1name.getText());
             team2.setTeamName(t2name.getText());
              
             team1.setPlayers(Team1Players);
             team1.setPlayers(Team2Players);
             
              match = new Match();
             match.setTeam1(team1);
             match.setTeam2(team2);
        }
             new matchdetails(match).setVisible(true);
             this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c10;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JComboBox<String> c5;
    private javax.swing.JComboBox<String> c6;
    private javax.swing.JComboBox<String> c7;
    private javax.swing.JComboBox<String> c8;
    private javax.swing.JComboBox<String> c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField p10name;
    private javax.swing.JTextField p1name;
    private javax.swing.JTextField p2name;
    private javax.swing.JTextField p3name;
    private javax.swing.JTextField p4name;
    private javax.swing.JTextField p5name;
    private javax.swing.JTextField p6name;
    private javax.swing.JTextField p7name;
    private javax.swing.JTextField p8name;
    private javax.swing.JTextField p9name;
    private javax.swing.JTextField t1name;
    private javax.swing.JTextField t2name;
    // End of variables declaration//GEN-END:variables
}
