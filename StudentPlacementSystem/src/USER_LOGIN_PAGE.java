Statement stmt;
public Alogin() {
    super("LOGIN ADMIN");
    initComponents();
    try{
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/campus system","root","");
        stmt=(Statement) con.createStatement();
    }catch(Exception ee){}
}

// Variables declaration - do not modify
private javax.swing.JButton jButton1;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel8;
private javax.swing.JTextField t1;
private javax.swing.JPasswordField t2;
// End of variables declaration
                                                                               
41

        }