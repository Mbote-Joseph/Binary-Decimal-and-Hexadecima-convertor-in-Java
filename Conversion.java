public class Conversion extends javax.swing.JFrame {

 
    public Conversion() {
    initComponents();
    }
 
    @SuppressWarnings("unchecked")
   
    private void initComponents() {
    
    txtHexa = new javax.swing.JTextField();
    txtDecimal = new javax.swing.JTextField();
    txtBin = new javax.swing.JTextField();
    btnBinary = new javax.swing.JButton();
    btnHexa = new javax.swing.JButton();
    btnDecimal = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(51, 51, 255));
    
    btnBinary.setText("Convert");
    btnBinary.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnBinaryActionPerformed(evt);
    }
    });
    
    btnHexa.setText("Convert");
    btnHexa.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnHexaActionPerformed(evt);
    }
    });
    
    btnDecimal.setText("Convert");
    btnDecimal.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    btnDecimalActionPerformed(evt);
    }
    });
    
    jLabel1.setText("binary");
    
    jLabel2.setText("hexadecimal");
    
    jLabel3.setText("decimal");
    
    jLabel4.setBackground(new java.awt.Color(0, 102, 255));
    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel4.setText("--NUMBER SYSTEMS--");
    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
    .addGap(41, 41, 41)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(txtDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addComponent(txtHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addComponent(txtBin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(btnBinary)
    .addComponent(btnHexa)
    .addComponent(btnDecimal))
    .addGap(29, 29, 29))
    .addGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
    .addGap(122, 122, 122)
    .addComponent(jLabel1))
    .addGroup(layout.createSequentialGroup()
    .addGap(123, 123, 123)
    .addComponent(jLabel2))
    .addGroup(layout.createSequentialGroup()
    .addGap(120, 120, 120)
    .addComponent(jLabel3)))
    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    .addContainerGap(72, Short.MAX_VALUE)
    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(47, 47, 47))
    );
    layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    .addContainerGap(51, Short.MAX_VALUE)
    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(38, 38, 38)
    .addComponent(jLabel1)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
    .addComponent(btnBinary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addComponent(txtBin, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
    .addGap(18, 18, 18)
    .addComponent(jLabel3)
    .addGap(4, 4, 4)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    .addComponent(txtDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(26, 26, 26)
    .addComponent(jLabel2)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    .addComponent(txtHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addComponent(btnHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(30, 30, 30))
    );
    
    pack();
    }// </editor-fold>   
    
    private void btnBinaryActionPerformed(java.awt.event.ActionEvent evt) {   
    String val=txtBin.getText();
    int decimal=Integer.parseInt(val,2);
    txtDecimal.setText(decimal+"");
    String str = Integer.toHexString(decimal);
    txtHexa.setText(str);
    }
    
    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {
    int decimal=Integer.parseInt(txtDecimal.getText());
    txtBin.setText(Integer.toBinaryString(decimal));
    String str = Integer.toHexString(decimal);
    txtHexa.setText(str);
    }   
    
    private void btnHexaActionPerformed(java.awt.event.ActionEvent evt) {   
    String val=txtHexa.getText();
    int decimal=Integer.parseInt(val,16);
    String str = Integer.toHexString(decimal);
    txtDecimal.setText(decimal+"");
    txtHexa.setText(str);
    txtBin.setText(Integer.toBinaryString(decimal));
    }
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
      
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
    new Conversion().setVisible(true);
    }
    });
    }
    
    // Variables declaration - do not modify
    private javax.swing.JButton btnBinary;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnHexa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtBin;
    private javax.swing.JTextField txtDecimal;
    private javax.swing.JTextField txtHexa;
    // End of variables declaration
    }