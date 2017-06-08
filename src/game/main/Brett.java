/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Mark Engelhard
 * Klasse FIAE 15
 */
public class Brett extends javax.swing.JFrame {
    
    private ArrayList<JLabel> fields = new ArrayList<JLabel>();
    private static javax.swing.JButton btnClose;
    private static javax.swing.JLabel lblHeadline;
    private static javax.swing.JLabel lbl_1;
    private static javax.swing.JLabel lbl_10;
    private static javax.swing.JLabel lbl_11;
    private static javax.swing.JLabel lbl_12;
    private static javax.swing.JLabel lbl_13;
    private static javax.swing.JLabel lbl_14;
    private static javax.swing.JLabel lbl_15;
    private static javax.swing.JLabel lbl_16;
    private static javax.swing.JLabel lbl_17;
    private static javax.swing.JLabel lbl_18;
    private static javax.swing.JLabel lbl_19;
    private static javax.swing.JLabel lbl_2;
    private static javax.swing.JLabel lbl_20;
    private static javax.swing.JLabel lbl_21;
    private static javax.swing.JLabel lbl_22;
    private static javax.swing.JLabel lbl_23;
    private static javax.swing.JLabel lbl_24;
    private static javax.swing.JLabel lbl_25;
    private static javax.swing.JLabel lbl_26;
    private static javax.swing.JLabel lbl_27;
    private static javax.swing.JLabel lbl_28;
    private static javax.swing.JLabel lbl_29;
    private static javax.swing.JLabel lbl_3;
    private static javax.swing.JLabel lbl_30;
    private static javax.swing.JLabel lbl_31;
    private static javax.swing.JLabel lbl_32;
    private static javax.swing.JLabel lbl_33;
    private static javax.swing.JLabel lbl_34;
    private static javax.swing.JLabel lbl_35;
    private static javax.swing.JLabel lbl_36;
    private static javax.swing.JLabel lbl_37;
    private static javax.swing.JLabel lbl_38;
    private static javax.swing.JLabel lbl_39;
    private static javax.swing.JLabel lbl_4;
    private static javax.swing.JLabel lbl_40;
    private static javax.swing.JLabel lbl_41;
    private static javax.swing.JLabel lbl_42;
    private static javax.swing.JLabel lbl_43;
    private static javax.swing.JLabel lbl_44;
    private static javax.swing.JLabel lbl_45;
    private static javax.swing.JLabel lbl_46;
    private static javax.swing.JLabel lbl_47;
    private static javax.swing.JLabel lbl_48;
    private static javax.swing.JLabel lbl_49;
    private static javax.swing.JLabel lbl_5;
    private static javax.swing.JLabel lbl_50;
    private static javax.swing.JLabel lbl_6;
    private static javax.swing.JLabel lbl_7;
    private static javax.swing.JLabel lbl_8;
    private static javax.swing.JLabel lbl_9;
    private javax.swing.JLabel lbl_Zahl;
    private javax.swing.JLabel lbl_dice;
    private javax.swing.JLabel lbl_eyes;
    
    public Brett() {
        initComponents();
        initialize();
    }
    
    /** 
     * initialization of the GUI
     * create and style all GUI Elements
     * 
     **/
    private void initComponents() {

        lblHeadline = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lbl_dice = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_6 = new javax.swing.JLabel();
        lbl_7 = new javax.swing.JLabel();
        lbl_8 = new javax.swing.JLabel();
        lbl_9 = new javax.swing.JLabel();
        lbl_10 = new javax.swing.JLabel();
        lbl_11 = new javax.swing.JLabel();
        lbl_12 = new javax.swing.JLabel();
        lbl_13 = new javax.swing.JLabel();
        lbl_14 = new javax.swing.JLabel();
        lbl_15 = new javax.swing.JLabel();
        lbl_16 = new javax.swing.JLabel();
        lbl_17 = new javax.swing.JLabel();
        lbl_18 = new javax.swing.JLabel();
        lbl_19 = new javax.swing.JLabel();
        lbl_20 = new javax.swing.JLabel();
        lbl_21 = new javax.swing.JLabel();
        lbl_22 = new javax.swing.JLabel();
        lbl_23 = new javax.swing.JLabel();
        lbl_24 = new javax.swing.JLabel();
        lbl_25 = new javax.swing.JLabel();
        lbl_26 = new javax.swing.JLabel();
        lbl_27 = new javax.swing.JLabel();
        lbl_28 = new javax.swing.JLabel();
        lbl_29 = new javax.swing.JLabel();
        lbl_30 = new javax.swing.JLabel();
        lbl_31 = new javax.swing.JLabel();
        lbl_32 = new javax.swing.JLabel();
        lbl_33 = new javax.swing.JLabel();
        lbl_34 = new javax.swing.JLabel();
        lbl_35 = new javax.swing.JLabel();
        lbl_36 = new javax.swing.JLabel();
        lbl_37 = new javax.swing.JLabel();
        lbl_38 = new javax.swing.JLabel();
        lbl_39 = new javax.swing.JLabel();
        lbl_40 = new javax.swing.JLabel();
        lbl_41 = new javax.swing.JLabel();
        lbl_42 = new javax.swing.JLabel();
        lbl_43 = new javax.swing.JLabel();
        lbl_44 = new javax.swing.JLabel();
        lbl_45 = new javax.swing.JLabel();
        lbl_46 = new javax.swing.JLabel();
        lbl_47 = new javax.swing.JLabel();
        lbl_48 = new javax.swing.JLabel();
        lbl_49 = new javax.swing.JLabel();
        lbl_50 = new javax.swing.JLabel();
        lbl_Zahl = new javax.swing.JLabel();
        lbl_eyes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1024, 768));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1024, 768));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        lblHeadline.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHeadline.setText("Ladder Game");

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lbl_dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/wuerfel.png"))); // NOI18N
        lbl_dice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_diceMouseClicked(evt);
            }
        });

        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_1.setName(""); // NOI18N

        lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_Zahl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Zahl.setText("Augen:");

        lbl_eyes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_eyes.setText("0");
        lbl_eyes.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblHeadline)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_dice)
                                        .addGap(86, 86, 86)
                                        .addComponent(lbl_Zahl)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_eyes)
                                        .addGap(312, 312, 312)
                                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_dice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeadline)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Zahl)
                            .addComponent(lbl_eyes)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        pack();
    } 
    
    /** initialize the fierst field and call setFields() **/
    public void initialize(){
        setFields();
        lbl_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/player_blue_red.png")));
    }
    
    /** fill the fields array in right sort order **/
    private void setFields(){ 
        fields.add(lbl_1);
        fields.add(lbl_2);
        fields.add(lbl_3);
        fields.add(lbl_4);
        fields.add(lbl_5);
        fields.add(lbl_6);
        fields.add(lbl_7);
        fields.add(lbl_8);
        fields.add(lbl_9);
        fields.add(lbl_10);
        fields.add(lbl_11);
        fields.add(lbl_12);
        fields.add(lbl_13);
        fields.add(lbl_14);
        fields.add(lbl_15);
        fields.add(lbl_16);
        fields.add(lbl_17);
        fields.add(lbl_18);
        fields.add(lbl_19);
        fields.add(lbl_20);
        fields.add(lbl_21);
        fields.add(lbl_22);
        fields.add(lbl_23);
        fields.add(lbl_24);
        fields.add(lbl_25);
        fields.add(lbl_26);
        fields.add(lbl_27);
        fields.add(lbl_28);
        fields.add(lbl_29);
        fields.add(lbl_30);
        fields.add(lbl_31);
        fields.add(lbl_32);
        fields.add(lbl_33);
        fields.add(lbl_34);
        fields.add(lbl_35);
        fields.add(lbl_36);
        fields.add(lbl_37);
        fields.add(lbl_38);
        fields.add(lbl_39);
        fields.add(lbl_40);
        fields.add(lbl_41);
        fields.add(lbl_42);
        fields.add(lbl_43);
        fields.add(lbl_44);
        fields.add(lbl_45);
        fields.add(lbl_46);
        fields.add(lbl_47);
        fields.add(lbl_48);
        fields.add(lbl_49);
        fields.add(lbl_50); 
    }
    
        /** sets the Background Images for the Labels according 
     * to the given parameters 
     * @param player
     * @param field 
     */
    public void setPlayerToField(int player, int field){
        
        String path;
        
        if(player == 1){
            path = "/newpackage/player_red.png";
        }
        else{
            path = "/newpackage/player_blue.png";
        }
        
        JLabel label = fields.get(field-1);

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
    }
    
    /** function to set the "both players on one field" image
     * @param field **/
    public void setBothPlayertoField(int field){
        String path = "/newpackage/player_blue_red.png";      
    }
    
    /** set the diced eyes in the label
     * @param eyes **/
    public void setDicedEyes(int eyes){
        lbl_eyes.setText(eyes+"");
    }
    
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void lbl_diceMouseClicked(java.awt.event.MouseEvent evt) {                                      
        /** TODO call Controller setter for Dice action **/
    }   
}
