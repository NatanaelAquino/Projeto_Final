/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.entities.GUI;

import javax.swing.JOptionPane;

import main.java.App;
import main.java.DAO.DatabaseDescarte;
import main.java.utils.Muda;

/**
 *
 * @author Natal
 */
public class Editar extends javax.swing.JFrame {

        /**
         * Creates new form Menu
         */
        Muda muda = new Muda();
        DatabaseDescarte dados = new DatabaseDescarte();

        public Editar() {
                initComponents();
        }

        public void preencherCampos(DatabaseDescarte dados) {
                // Preencher os campos com os dados do registro
                jTextField1.setText(dados.getNomeResiduo());
                jTextField3.setText(String.valueOf(dados.getQuantidade()));
                jComboBox1.setSelectedItem(dados.getTipoResiduo());
                jComboBox2.setSelectedItem(dados.getTipoFase());
                jComboBox3.setSelectedItem(dados.getSetor());
                jComboBox4.setSelectedItem(dados.getFormaReciclagem());
                jComboBox5.setSelectedItem(dados.getComoDescartado());
                jTextArea1.setText(dados.getDescricaoDescarte());
        }
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jRadioButton1 = new javax.swing.JRadioButton();
                kGradientPanel13 = new keeptoo.KGradientPanel();
                lbValues13 = new javax.swing.JLabel();
                lbDescription11 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                kGradientPanel1 = new keeptoo.KGradientPanel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jButton7 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox<>();
                jComboBox2 = new javax.swing.JComboBox<>();
                jLabel8 = new javax.swing.JLabel();
                jComboBox3 = new javax.swing.JComboBox<>();
                jLabel9 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jComboBox4 = new javax.swing.JComboBox<>();
                jComboBox5 = new javax.swing.JComboBox<>();
                jLabel10 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextArea1 = new javax.swing.JTextArea();
                jButton6 = new javax.swing.JButton();

                jRadioButton1.setText("jRadioButton1");

                kGradientPanel13.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED),
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
                kGradientPanel13.setkEndColor(new java.awt.Color(0, 0, 0));
                kGradientPanel13.setkStartColor(new java.awt.Color(102, 0, 102));
                kGradientPanel13.setMaximumSize(new java.awt.Dimension(200, 100));

                lbValues13.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
                lbValues13.setForeground(new java.awt.Color(255, 255, 255));
                lbValues13.setText("Total");

                lbDescription11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                lbDescription11.setForeground(new java.awt.Color(255, 255, 255));
                lbDescription11.setText("Description");

                javax.swing.GroupLayout kGradientPanel13Layout = new javax.swing.GroupLayout(kGradientPanel13);
                kGradientPanel13.setLayout(kGradientPanel13Layout);
                kGradientPanel13Layout.setHorizontalGroup(
                                kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(kGradientPanel13Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(kGradientPanel13Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbDescription11)
                                                                                .addComponent(lbValues13))
                                                                .addContainerGap(115, Short.MAX_VALUE)));
                kGradientPanel13Layout.setVerticalGroup(
                                kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                kGradientPanel13Layout.createSequentialGroup()
                                                                                .addContainerGap(19, Short.MAX_VALUE)
                                                                                .addComponent(lbValues13)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(lbDescription11)
                                                                                .addGap(24, 24, 24)));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setMaximumSize(new java.awt.Dimension(1000, 520));
                jPanel1.setMinimumSize(new java.awt.Dimension(1000, 520));

                kGradientPanel1.setFocusCycleRoot(true);
                kGradientPanel1.setFocusTraversalPolicyProvider(true);
                kGradientPanel1.setInheritsPopupMenu(true);
                kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
                kGradientPanel1.setkGradientFocus(300);
                kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 102));
                kGradientPanel1.setOpaque(false);

                jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/1.png"))); // NOI18N
                jButton1.setText("Dashbord");
                jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
                jButton1.setContentAreaFilled(false);
                jButton1.setDoubleBuffered(true);
                jButton1.setFocusCycleRoot(true);
                jButton1.setFocusTraversalPolicyProvider(true);
                jButton1.setHideActionText(true);
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 255, 255));
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/4.png"))); // NOI18N
                jButton2.setText("Descarte");
                jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
                jButton2.setContentAreaFilled(false);
                jButton2.setDoubleBuffered(true);
                jButton2.setFocusCycleRoot(true);
                jButton2.setFocusTraversalPolicyProvider(true);
                jButton2.setHideActionText(true);
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
                jButton3.setForeground(new java.awt.Color(255, 255, 255));
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/3.png"))); // NOI18N
                jButton3.setText("Desempenho");
                jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
                jButton3.setContentAreaFilled(false);
                jButton3.setDoubleBuffered(true);
                jButton3.setFocusCycleRoot(true);
                jButton3.setFocusTraversalPolicyProvider(true);
                jButton3.setHideActionText(true);
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
                jButton4.setForeground(new java.awt.Color(255, 255, 255));
                jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/6.png"))); // NOI18N
                jButton4.setText("Editar");
                jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
                jButton4.setContentAreaFilled(false);
                jButton4.setDoubleBuffered(true);
                jButton4.setFocusCycleRoot(true);
                jButton4.setFocusTraversalPolicyProvider(true);
                jButton4.setHideActionText(true);
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton5.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
                jButton5.setForeground(new java.awt.Color(255, 255, 255));
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/8.png"))); // NOI18N
                jButton5.setText("Alterar dados");
                jButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
                jButton5.setContentAreaFilled(false);
                jButton5.setDoubleBuffered(true);
                jButton5.setFocusCycleRoot(true);
                jButton5.setFocusTraversalPolicyProvider(true);
                jButton5.setHideActionText(true);
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Configuraçoes  ");

                jLabel2.setIcon(new javax.swing.ImageIcon("B:\\Downloads\\Nova Logo (2).png")); // NOI18N
                jLabel2.setText("\n");

                javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
                kGradientPanel1.setLayout(kGradientPanel1Layout);
                kGradientPanel1Layout.setHorizontalGroup(
                                kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                                .addGroup(kGradientPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(kGradientPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                false)
                                                                                                .addComponent(jButton5,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                229,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jButton4,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jButton3,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jButton2,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                205,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 8, Short.MAX_VALUE)));
                kGradientPanel1Layout.setVerticalGroup(
                                kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                132,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(78, 78, 78)));

                jButton7.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/search.png"))); // NOI18N
                jButton7.setToolTipText("");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
                jLabel3.setText("Nome do Residuo");

                jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
                jLabel4.setText("Tipo");

                jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
                jLabel5.setText("Forma de Reciclagem");

                jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
                jLabel6.setText("Quantidade");

                jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
                jLabel7.setText("Descrição");

                jComboBox1.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Reciclável", "Não Reciclável" }));

                jComboBox2.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "Sólido", "Líquido" }));

                jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
                jLabel8.setText("Tipo de Fase");

                jComboBox3.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Administração", "Produção", "Logistica" }));

                jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
                jLabel9.setText("Setor");

                jComboBox4.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "Papel", "Plástico", "Metal",
                                                "Vidro", "Orgânico", "Eletrônico", "Outro" }));

                jComboBox5.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Coleta Seletiva", "Aterro Sanitário", "Incinerado" }));

                jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
                jLabel10.setText("Local de Descarte");

                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
                jScrollPane1.setViewportView(jTextArea1);

                jButton6.setBackground(new java.awt.Color(51, 0, 51));
                jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jButton6.setForeground(new java.awt.Color(255, 255, 255));
                jButton6.setText("SALVAR");
                jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                                new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED),
                                new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });
                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(kGradientPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(122, 122, 122)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jTextField2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                463,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                49,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jComboBox4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jComboBox2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel9)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jComboBox3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jComboBox1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(jLabel10)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jComboBox5,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel7)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jScrollPane1))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jTextField3))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel3)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jTextField1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                373,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(175, 175, 175)
                                                                                                .addComponent(jButton6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                138,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(123, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jButton7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                43,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                43,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jTextField1)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(jComboBox2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(jComboBox3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBox4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jTextField3)
                                                                                .addComponent(jLabel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jComboBox1)
                                                                                .addComponent(jComboBox5)
                                                                                .addComponent(jLabel10,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                200,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(61, 61, 61)));

                jTextField2.getAccessibleContext().setAccessibleName("");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE));

                setSize(new java.awt.Dimension(1016, 528));
                setLocationRelativeTo(null);
        }// </editor-fold>

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                muda.Home();
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                muda.descartado();
        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                muda.desempenho();
        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                muda.Editar();
        }

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
                muda.perfil();
        }
        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
                String nomeResiduo = jTextField1.getText();
                String tipoResiduo = (String) jComboBox4.getSelectedItem();
                String tipoFase = (String) jComboBox2.getSelectedItem();
                String setor = (String) jComboBox3.getSelectedItem();
                String quantidadeSTR = jTextField3.getText();
                String formaReciclagem = (String) jComboBox1.getSelectedItem();
                String comoDescartado = (String) jComboBox5.getSelectedItem();
                String descricaoDescarte = jTextArea1.getText();
                
                try {
                        long quantidade = Long.parseLong(quantidadeSTR);
                        DatabaseDescarte dados = new DatabaseDescarte();
                        String idString = jTextField2.getText();
                        long id = Long.parseLong(idString);
                        dados.setId(id); // Defina o ID antes de chamar o método editardescarte()
                        dados.editardescarte(nomeResiduo, tipoResiduo, tipoFase, setor, quantidade, formaReciclagem, comoDescartado, descricaoDescarte, id);                        
                        App.menu.preencherTabela();
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "A quantidade não é um número válido.");
                    }    
        }

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {

                String idString = jTextField2.getText();
                if (!idString.isEmpty()) {
                        if (idString.matches("\\d+")) {
                                long id = Long.parseLong(idString);
                                DatabaseDescarte dados = new DatabaseDescarte();
                                System.out.println(id);
                                String nomeResiduo = jTextField1.getText();
                                String tipoResiduo = (String) jComboBox4.getSelectedItem();
                                String tipoFase = (String) jComboBox2.getSelectedItem();
                                String setor = (String) jComboBox3.getSelectedItem();
                                String quantidadeSTR = jTextField3.getText();
                                String formaReciclagem = (String) jComboBox1.getSelectedItem();
                                String comoDescartado = (String) jComboBox5.getSelectedItem();
                                String descricaoDescarte = jTextArea1.getText();
                        } else {
                                JOptionPane.showMessageDialog(null, "Por favor, insira apenas números no campo de ID.",
                                                "Formato Inválido", JOptionPane.WARNING_MESSAGE);
                        }
                } else {
                        JOptionPane.showMessageDialog(null, "Por favor, preencha o campo de ID.", "Campo vazio",
                                        JOptionPane.WARNING_MESSAGE);
                }
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
        }

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JComboBox<String> jComboBox3;
        private javax.swing.JComboBox<String> jComboBox4;
        private javax.swing.JComboBox<String> jComboBox5;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JRadioButton jRadioButton1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea jTextArea1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private keeptoo.KGradientPanel kGradientPanel1;
        private keeptoo.KGradientPanel kGradientPanel13;
        private javax.swing.JLabel lbDescription11;
        private javax.swing.JLabel lbValues13;
        // End of variables declaration
}
