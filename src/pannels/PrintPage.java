
package pannels;


import Actors.Users;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;



public class PrintPage extends javax.swing.JFrame implements Printable{

       
    public PrintPage(Users user, Users admin) {
        initComponents();
        lblLogo.setIcon(env.Enviroment.getLogoIcon(lblLogo.getWidth(), lblLogo.getHeight()));
        lblLogoCartaTrabajo.setIcon(env.Enviroment.getLogoCartaTrabajo(lblLogoCartaTrabajo.getWidth(), lblLogoCartaTrabajo.getHeight()));
        
   
        
        
       String text =  env.Enviroment.setConstanciaText(user, admin);
       
        textArea.setText(text);
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_JUSTIFIED);
        textArea.setParagraphAttributes(attribs, true);  
    }

    
     

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConstancia = new javax.swing.JPanel();
        lblCargo2 = new javax.swing.JLabel();
        lblCargo1 = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblLogoCartaTrabajo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        sP = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(21, 27));

        PanelConstancia.setBackground(new java.awt.Color(255, 255, 255));
        PanelConstancia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCargo2.setBackground(new java.awt.Color(255, 255, 255));
        lblCargo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo2.setText("__________________________");
        PanelConstancia.add(lblCargo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 550, 30));

        lblCargo1.setBackground(new java.awt.Color(255, 255, 255));
        lblCargo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo1.setText("Director");
        PanelConstancia.add(lblCargo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 550, 30));

        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo.setText("Juan Perez");
        PanelConstancia.add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 550, 30));

        lblLogoCartaTrabajo.setBackground(new java.awt.Color(153, 255, 102));
        lblLogoCartaTrabajo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLogoCartaTrabajo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelConstancia.add(lblLogoCartaTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 280, 40));
        PanelConstancia.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 70, 70));

        sP.setBorder(null);

        textArea.setFont(new java.awt.Font("Noto Sans Light", 0, 12)); // NOI18N
        textArea.setText("     Quien suscribe, Lcdo Borman Rafael Urquiola, titular de la cédula de indentidad N° 11.402.977, Jefe de Municipio del Sector Escolar N°5, que funciona en Guanarito Estado Portugueza, hace constar por medio de la presente que el ciudadano Yakelina Quevedo, titular de la cédula de identidad N° 9152249, se desempeña como Directora en la Escuela Básica \"Monseñor Unda\", y en la actualidad cuenta con 20 años y 08 meses de servicio. \n\n\n\n\nConstaaancia que se expide de parte interesaada en Guanarito a los veintidos días del mes de Octubre del año 2022");
        textArea.setToolTipText("");
        textArea.setMargin(new java.awt.Insets(2, 60, 2, 60));
        sP.setViewportView(textArea);

        PanelConstancia.add(sP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 540, 310));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Constancia de Trabajo");
        PanelConstancia.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 550, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConstancia, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConstancia, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelConstancia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargo1;
    private javax.swing.JLabel lblCargo2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoCartaTrabajo;
    private javax.swing.JScrollPane sP;
    private javax.swing.JTextPane textArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        
            if(pageIndex > 0){
                return NO_SUCH_PAGE;
            }
        Graphics2D page = (Graphics2D) graphics;
        page.translate(pageFormat.getImageableX()+30, pageFormat.getImageableY()+30);
        page.scale(1.0, 1.0);
        
        PanelConstancia.printAll(graphics);
        
        return PAGE_EXISTS;
        
    }
}
