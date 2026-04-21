

package user;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class Productpage extends javax.swing.JFrame {
     private ArrayList<JCheckBox> checkBoxList = new ArrayList<>();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Productpage.class.getName());

    private double Total =0.0;
    private int x=0;
    private double total;
    public Productpage() {
        initComponents();
        init();
        
    }

    public void init(){
        setTime();
    }
    
    
    
    public void reset(){
       
        TextArea.setText(" ");
        buy1.setSelected(true);
        buy2.setSelected(true);
        buy3.setSelected(true);
        buy4.setSelected(true);
        buy5.setSelected(true);
        buy6.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        IMG1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Price1 = new javax.swing.JLabel();
        buy1 = new javax.swing.JCheckBox();
        img2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();
        buy2 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Price3 = new javax.swing.JLabel();
        buy3 = new javax.swing.JCheckBox();
        IMG4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Price4 = new javax.swing.JLabel();
        buy4 = new javax.swing.JCheckBox();
        IMG5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Price5 = new javax.swing.JLabel();
        buy5 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        buy6 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Price6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        heding = new javax.swing.JLabel();
        txTime = new javax.swing.JLabel();
        txDate = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        Buybutton = new javax.swing.JButton();
        totalbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));

        IMG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Necklace.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Necklace");

        Price1.setBackground(new java.awt.Color(0, 102, 102));
        Price1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Price1.setForeground(new java.awt.Color(242, 242, 242));
        Price1.setText("Price :7800.0");

        buy1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        buy1.setForeground(new java.awt.Color(242, 242, 242));
        buy1.setText("Add to cart");
        buy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(IMG1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Price1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buy1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IMG1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price1)
                    .addComponent(buy1))
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 320));

        img2.setBackground(new java.awt.Color(0, 0, 0));
        img2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Necklaceset.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Necklace set");

        Price2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Price2.setForeground(new java.awt.Color(242, 242, 242));
        Price2.setText("Price :5000.0");

        buy2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        buy2.setForeground(new java.awt.Color(242, 242, 242));
        buy2.setText("Add to Cart");
        buy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout img2Layout = new javax.swing.GroupLayout(img2);
        img2.setLayout(img2Layout);
        img2Layout.setHorizontalGroup(
            img2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(img2Layout.createSequentialGroup()
                .addGroup(img2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(img2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(img2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buy2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(img2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(336, 336, 336))
        );
        img2Layout.setVerticalGroup(
            img2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(img2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(img2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price2)
                    .addComponent(buy2))
                .addContainerGap())
        );

        jPanel3.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 290, 320));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/earring.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Earring");

        Price3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Price3.setForeground(new java.awt.Color(242, 242, 242));
        Price3.setText("Price :6000.0");

        buy3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        buy3.setForeground(new java.awt.Color(242, 242, 242));
        buy3.setText("Add to Cart");
        buy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(Price3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buy3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(buy3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 290, 320));

        IMG4.setBackground(new java.awt.Color(0, 0, 0));
        IMG4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manglsutra.jpg"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("Mangalsutra");

        Price4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Price4.setForeground(new java.awt.Color(242, 242, 242));
        Price4.setText("Price : 8900.0");

        buy4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        buy4.setForeground(new java.awt.Color(242, 242, 242));
        buy4.setText("Add to Cart");
        buy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IMG4Layout = new javax.swing.GroupLayout(IMG4);
        IMG4.setLayout(IMG4Layout);
        IMG4Layout.setHorizontalGroup(
            IMG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IMG4Layout.createSequentialGroup()
                .addGroup(IMG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IMG4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Price4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(buy4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IMG4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IMG4Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        IMG4Layout.setVerticalGroup(
            IMG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IMG4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(13, 13, 13)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(IMG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buy4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(IMG4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 320, 320));

        IMG5.setBackground(new java.awt.Color(0, 0, 0));
        IMG5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setText("Diamond Necklace");

        Price5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Price5.setForeground(new java.awt.Color(242, 242, 242));
        Price5.setText("Price :9500.0");

        buy5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        buy5.setForeground(new java.awt.Color(242, 242, 242));
        buy5.setText("Add to Cart");
        buy5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy5ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/daimond.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout IMG5Layout = new javax.swing.GroupLayout(IMG5);
        IMG5.setLayout(IMG5Layout);
        IMG5Layout.setHorizontalGroup(
            IMG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IMG5Layout.createSequentialGroup()
                .addGroup(IMG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IMG5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IMG5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Price5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buy5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IMG5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(63, 63, 63)))
                .addContainerGap())
        );
        IMG5Layout.setVerticalGroup(
            IMG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IMG5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(IMG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buy5))
                .addGap(16, 16, 16))
        );

        jPanel3.add(IMG5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 290, 320));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(242, 242, 242));
        jLabel15.setText("jewellery");

        buy6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        buy6.setForeground(new java.awt.Color(242, 242, 242));
        buy6.setText("Add to Cart");
        buy6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy6ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diamondear.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 0));
        jLabel18.setText("Diamond Earring");

        Price6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Price6.setForeground(new java.awt.Color(242, 242, 242));
        Price6.setText("Price :8800.0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Price6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buy6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price6)
                            .addComponent(buy6))
                        .addGap(10, 10, 10))))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 290, 320));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 900, 0));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 640));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));

        heding.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        heding.setForeground(new java.awt.Color(242, 242, 242));
        heding.setText("OUR EXCLUSIVE COLLECTION's.....");

        txTime.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txTime.setForeground(new java.awt.Color(242, 242, 242));

        txDate.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txDate.setForeground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(heding, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txTime, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txDate, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(heding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 50));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 203, 203)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));

        Buybutton.setBackground(new java.awt.Color(255, 204, 0));
        Buybutton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Buybutton.setText("Buy Now");
        Buybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuybuttonActionPerformed(evt);
            }
        });

        totalbutton.setBackground(new java.awt.Color(255, 204, 0));
        totalbutton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        totalbutton.setText("Total");
        totalbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Buybutton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(totalbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(totalbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(Buybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 330, 210));

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 430));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 330, 640));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
        public void heding(){
        TextArea.setText("********************DIVA'S CREATION*********************\n"+ "Time: " + txTime.getText() + "   Date: " + txDate.getText() + "\n" +
        "***************************************************************\n"+"Product Name:\t\t\t"+"Price($)\n"
    );
    }
    private void buy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy1ActionPerformed
       x++;
       if(x==1){
           heding();
       }
       
         double Price1 = 7800.0; 
    String ProductName = jLabel2.getText();
        TextArea.setText(TextArea.getText()+x+". "+jLabel2.getText()+"\t\t\t"+Price1+"\n");
        total+=Price1;
       buy1.setSelected(true);
       
       
    }//GEN-LAST:event_buy1ActionPerformed



    private void buy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy2ActionPerformed
         x++;
       if(x==1){
           heding();
       }
        double Price2 = 5000.0; 
    String ProductName = jLabel15.getText();
        TextArea.setText(TextArea.getText()+x+". "+jLabel5.getText()+"\t\t\t"+Price2+"\n");
        total+=Price2;
       buy2.setSelected(true);
    }//GEN-LAST:event_buy2ActionPerformed

    private void buy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy3ActionPerformed
        x++;
       if(x==1){
           heding();
       }
          double Price3 = 6000.0; 
    String ProductName = jLabel18.getText();
        TextArea.setText(TextArea.getText()+x+". "+jLabel8.getText()+"\t\t\t"+Price3+"\n");
        total+=Price3;
       buy3.setSelected(true);
            
    }//GEN-LAST:event_buy3ActionPerformed

    private void buy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy4ActionPerformed
         x++;
       if(x==1){
           heding();
       }
          double Price4 = 8900.0; 
    String ProductName = jLabel11.getText();
        TextArea.setText(TextArea.getText()+x+". "+jLabel11.getText()+"\t\t\t"+Price4+"\n");
        total+=Price4;
       buy4.setSelected(true);
    }//GEN-LAST:event_buy4ActionPerformed

    private void buy5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy5ActionPerformed
         x++;
       if(x==1){
           heding();
       }
         
     double Price5 = 8900.0; 
    String ProductName = jLabel14.getText();
        TextArea.setText(TextArea.getText()+x+". "+jLabel14.getText()+"\t\t\t"+Price5+"\n");
        total+=Price5;
       buy5.setSelected(true);
    }//GEN-LAST:event_buy5ActionPerformed

    private void buy6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy6ActionPerformed
         x++;
       if(x==1){
           heding();
       }
         double Price6 = 8800.0; 
    String ProductName = jLabel18.getText();
        TextArea.setText(TextArea.getText()+x+". "+jLabel18.getText()+"\t\t\t"+Price6+"\n");
        total+=Price6;
        
       buy6.setSelected(true);
    }//GEN-LAST:event_buy6ActionPerformed

    private void BuybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuybuttonActionPerformed
   
        if (buy1.isSelected() || buy2.isSelected() || buy3.isSelected() ||
    buy4.isSelected() || buy5.isSelected() || buy6.isSelected()) {
    
    JOptionPane.showMessageDialog(null, "Your order has been placed...........!");
} else {
    JOptionPane.showMessageDialog(null, "Please select at least one product to place order.");
}

//if(! buy1.isSelected()|| !buy2.isSelected()||!buy3.isSelected()||!buy4.isSelected()||!buy5.isSelected()||!buy6.isSelected()) { 
//        JOptionPane.showMessageDialog(null, "your Order Has Been Placed...........!");
//    }else {
//        System.out.println("check if you selected product");
//    }
    }//GEN-LAST:event_BuybuttonActionPerformed

    private void totalbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbuttonActionPerformed
//        if(total==0.0){
//            JOptionPane.showMessageDialog(null, "You haven't selected any item");
//        }
//        else{
            TextArea.setText(TextArea.getText()+"\n********************************************************\n"+"Total:\t\t\t"+
                    (total)+"\n\n"
                      +"\n************************************************************\n"+"*******************😊😊😊THANK YOU😊😊😊*********************");
        //}
    }//GEN-LAST:event_totalbuttonActionPerformed
    
    public void setTime(){
        new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                    try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException ex) {
                    ex.printStackTrace(); // Or use a logger
                }

                Date date = new Date();
                SimpleDateFormat tf = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");

                String time = tf.format(date);
                String dateStr = df.format(date);

                txTime.setText(time); 
                txDate.setText(dateStr);
                }
                
            }
            
        }).start();
        
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Productpage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buybutton;
    private javax.swing.JLabel IMG1;
    private javax.swing.JPanel IMG4;
    private javax.swing.JPanel IMG5;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel Price3;
    private javax.swing.JLabel Price4;
    private javax.swing.JLabel Price5;
    private javax.swing.JLabel Price6;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JCheckBox buy1;
    private javax.swing.JCheckBox buy2;
    private javax.swing.JCheckBox buy3;
    private javax.swing.JCheckBox buy4;
    private javax.swing.JCheckBox buy5;
    private javax.swing.JCheckBox buy6;
    private javax.swing.JLabel heding;
    private javax.swing.JPanel img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton totalbutton;
    private javax.swing.JLabel txDate;
    private javax.swing.JLabel txTime;
    // End of variables declaration//GEN-END:variables

}

