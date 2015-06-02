package de.windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;

import de.manager.PlayerManager;
import de.manager.WindowManager;
import de.manager.WindowManager.WindowID;

public class InventoryWindowT extends javax.swing.JFrame implements MouseListener{


	
	
    public InventoryWindowT() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel5.setText("Level");

        jLabel6.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel6.setText("Class");

        jLabel7.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel7.setText("HP");

        jLabel8.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel8.setText("MP");

        jLabel9.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel9.setText("Short Attack");

        jLabel10.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel10.setText("Magical Attack");

        jLabel11.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel11.setText("Long Attack");

        jLabel12.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel12.setText("Short Guard");

        jLabel13.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel13.setText("Long Guard");

        jLabel14.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel14.setText("Magical Guard");

        jLabel15.setText("11");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);


        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("Warrior");


        jLabel17.setText("1100");


        jLabel18.setText("1000");


        jLabel19.setText("100");


        jLabel20.setText("100");


        jLabel21.setText("100");


        jLabel22.setText("100");


        jLabel23.setText("100");


        jLabel24.setText("100");


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel19))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel20))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel21))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel22))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel23))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jToggleButton1.setText("Item01");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Item02");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Item03");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Item04");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("Item05");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("Item06");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setText("Item07");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setText("Item08");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setText("Item09");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setText("Item10");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setText("Item11");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton12.setText("Item12");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton13.setText("Item13");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setText("Item14");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setText("Item15");
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton16.setText("Item16");
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton17.setText("Item17");
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setText("Item18");
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton16)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton14)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToggleButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel25.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel25.setText("Item Name");

        jLabel26.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel26.setText("Class(job)");

        jLabel27.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel27.setText("Class(type)");

        jLabel28.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel28.setText("Detail");

        jLabel29.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel29.setText("Short Attack");

        jLabel30.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel30.setText("Long Attack");

        jLabel31.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel31.setText("Magical Attack");

        jLabel32.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel32.setText("Short Guard");

        jLabel33.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel33.setText("Long Guard");

        jLabel34.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
        jLabel34.setText("Magical Guard");

        jLabel35.setText("Wand of the Necromancer");
//        jLabel35.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
//            public void propertyChange(ActionEvent evt) {
//                jLabel35PropertyChange(evt);
//            }
//
//			@Override
//			public void propertyChange(PropertyChangeEvent arg0) {
//				jLabel35PropertyChange(arg0);
//				
//			}
//        });

        
        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel36.setText("Warrior");
        jLabel36.setToolTipText("");

        
        jLabel37.setText("Supplies/Weapon..");


        jLabel38.setText("HP + 30%");


        jLabel39.setText("100");
        jLabel39.setToolTipText("");


        jLabel40.setText("100");

        
        jLabel41.setText("100");

        
        jLabel42.setText("100");


        jLabel43.setText("100");

        
        jLabel44.setText("100");


        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel35))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addGap(9, 9, 9)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addGap(14, 14, 14)
                .addComponent(jLabel28)
                .addGap(2, 2, 2)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel40))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel44))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Status");

        jLabel2.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Inventory");

        jLabel3.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Item Info");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("* Press [[[[  HERE  ]]]] to exit *");
        jLabel4.addMouseListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5))
        );

        pack();
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(jToggleButton1.isSelected()){
    		System.out.println("Hello1");
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("Hello1");
    		System.out.println("X");
    		restorePrev();
    	}
    }
    
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(jToggleButton2.isSelected()){
        	System.out.println("Hello2");
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
        	System.out.println("Hello2");
    		System.out.println("X");
    		restorePrev();
    	}
    }
    
    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(jToggleButton3.isSelected()){
    		System.out.println("Hello3");
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("Hello3");
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(jToggleButton4.isSelected()){
    		System.out.println("Hello4");
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("Hello4");
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(jToggleButton5.isSelected()){
    		System.out.println("Hello5");
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("Hello5");
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {

    	if(jToggleButton6.isSelected()){
    		System.out.println("Hello6");
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("Hello6");
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello7");
    	if(jToggleButton7.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello8");
    	if(jToggleButton8.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello9");
    	if(jToggleButton9.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello10");
    	if(jToggleButton10.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello11");
    	if(jToggleButton11.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello12");
    	if(jToggleButton12.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello13");
    	if(jToggleButton13.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello14");
    	if(jToggleButton14.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello15");
    	if(jToggleButton15.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello16");
    	if(jToggleButton16.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello17");
    	if(jToggleButton17.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println("Hello18");
    	if(jToggleButton18.isSelected()){
    		System.out.println("O");
    		prevSave();
        	jLabel35PropertyChange(evt);
        	jLabel36PropertyChange(evt);
        	jLabel37PropertyChange(evt);
        	jLabel38PropertyChange(evt);
        	jLabel39PropertyChange(evt);
        	jLabel40PropertyChange(evt);
        	jLabel41PropertyChange(evt);
        	jLabel42PropertyChange(evt);
        	jLabel43PropertyChange(evt);
        	jLabel44PropertyChange(evt);
    	}else{
    		System.out.println("X");
    		restorePrev();
    	}
    }

    private void jLabel15PropertyChange(ActionEvent evt) {
        //Level
    }

    private void jLabel16PropertyChange(ActionEvent evt) {
        //Class
    }

    private void jLabel17PropertyChange(ActionEvent evt) {
        //HP
    }

    private void jLabel18PropertyChange(ActionEvent evt) {
        //MP
    }

    private void jLabel19PropertyChange(ActionEvent evt) {
        //short attack
    }

    private void jLabel20PropertyChange(ActionEvent evt) {
        //long attack
    }

    private void jLabel21PropertyChange(ActionEvent evt) {
       // magical attack
    }

    private void jLabel22PropertyChange(ActionEvent evt) {
        //short guard
    }

    private void jLabel23PropertyChange(ActionEvent evt) {
        //long guard
    }

    private void jLabel24PropertyChange(ActionEvent evt) {
        //magical guard
    }

    
    public String jLabel35prev;
    public String jLabel36prev;
    public String jLabel37prev;
    public String jLabel38prev;
    public String jLabel39prev;
    public String jLabel40prev;
    public String jLabel41prev;
    public String jLabel42prev;
    public String jLabel43prev;
    public String jLabel44prev;
    
    public void prevSave(){
    	jLabel35prev = jLabel35.getText();
    	jLabel36prev = jLabel36.getText();
    	jLabel37prev = jLabel37.getText();
    	jLabel38prev = jLabel38.getText();
    	jLabel39prev = jLabel39.getText();
    	jLabel40prev = jLabel40.getText();
    	jLabel41prev = jLabel41.getText();
    	jLabel42prev = jLabel42.getText();
    	jLabel43prev = jLabel43.getText();
    	jLabel44prev = jLabel44.getText();
    }
    
    public void restorePrev(){
    	jLabel35.setText(jLabel35prev);
    	jLabel36.setText(jLabel36prev);
    	jLabel37.setText(jLabel37prev);
    	jLabel38.setText(jLabel38prev);
    	jLabel39.setText(jLabel39prev);
    	jLabel40.setText(jLabel40prev);
    	jLabel41.setText(jLabel41prev);
    	jLabel42.setText(jLabel42prev);
    	jLabel43.setText(jLabel43prev);
    	jLabel44.setText(jLabel44prev);
    }
    
    private void jLabel35PropertyChange(ActionEvent evt) {
        // Item name
    	jLabel35.setText("Item name change");
    }

    private void jLabel36PropertyChange(ActionEvent evt) {
        //class(job)
    	jLabel36.setText("class(job) change");
    }

    private void jLabel37PropertyChange(ActionEvent evt) {
        //class type
    	jLabel37.setText("class type change");
    }

    private void jLabel38PropertyChange(ActionEvent evt) {
        //detail
    	jLabel38.setText("detail change");
    }

    private void jLabel39PropertyChange(ActionEvent evt) {
        //short attack
    	jLabel39.setText("short attack change");
    }

    private void jLabel40PropertyChange(ActionEvent evt) {
        //long attack
    	jLabel40.setText("long attack change");
    }

    private void jLabel41PropertyChange(ActionEvent evt) {
        //magical attack
    	jLabel41.setText("magical attack change");
    }

    private void jLabel42PropertyChange(ActionEvent evt) {
        //short defence
    	jLabel42.setText("short defence change");
    }

    private void jLabel43PropertyChange(ActionEvent evt) {
        //long defence
    	jLabel43.setText("long defence change");
    }

    private void jLabel44PropertyChange(ActionEvent evt) {
        //magical defence
    	jLabel44.setText("magical defence change");
    }

    
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    public javax.swing.JLabel jLabel44;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JToggleButton jToggleButton10;
    public javax.swing.JToggleButton jToggleButton11;
    public javax.swing.JToggleButton jToggleButton12;
    public javax.swing.JToggleButton jToggleButton13;
    public javax.swing.JToggleButton jToggleButton14;
    public javax.swing.JToggleButton jToggleButton15;
    public javax.swing.JToggleButton jToggleButton16;
    public javax.swing.JToggleButton jToggleButton17;
    public javax.swing.JToggleButton jToggleButton18;
    public javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JToggleButton jToggleButton3;
    public javax.swing.JToggleButton jToggleButton4;
    public javax.swing.JToggleButton jToggleButton5;
    public javax.swing.JToggleButton jToggleButton6;
    public javax.swing.JToggleButton jToggleButton7;
    public javax.swing.JToggleButton jToggleButton8;
    public javax.swing.JToggleButton jToggleButton9;
    
	@Override
	public void mouseClicked(MouseEvent arg0) {
		WindowManager.getInstance().Hide(WindowID.STATUS);
		WindowManager.getInstance().Show(WindowID.MAP);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}
    
    
}
