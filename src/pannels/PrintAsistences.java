package pannels;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import javax.swing.table.DefaultTableModel;

public class PrintAsistences extends javax.swing.JFrame implements Printable{

       DefaultTableModel model = null;
   
    public PrintAsistences(DefaultTableModel model, boolean isPresentedSelected, String date) {
        initComponents();
        this.model = model;
        tblAssistance.setModel(model);
        
        String title = (isPresentedSelected ? "Asistencias" : "Inasistencias") + " para el " + date;
        lblTitle.setText(title);
        lblInstitutionName.setText(env.Enviroment.getOwnerName());
        lblLogo.setIcon(env.Enviroment.getLogoIcon(lblLogo.getWidth(), lblLogo.getHeight()));
        
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAssistance = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblInstitutionName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        tblAssistance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "C.I.", "Nombre", "Apellido", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAssistance);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 123, 525, 568));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTitle.setText("Asistencias");
        mainPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 56, 414, -1));
        mainPanel.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 17, 73, 88));

        lblInstitutionName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInstitutionName.setText("Asistencias");
        mainPanel.add(lblInstitutionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 35, 414, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInstitutionName;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblAssistance;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
       
           if(pageIndex > 0){
                return NO_SUCH_PAGE;
            }
        Graphics2D page = (Graphics2D) graphics;
        page.translate(pageFormat.getImageableX()+30, pageFormat.getImageableY()+30);
        page.scale(1.0, 1.0);
        
        mainPanel.printAll(graphics);
        
        return PAGE_EXISTS;

        
    }
}
