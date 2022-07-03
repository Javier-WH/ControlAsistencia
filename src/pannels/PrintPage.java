
package pannels;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;


public class PrintPage extends javax.swing.JFrame implements Printable{

   
    public PrintPage() {
        initComponents();
        lblLogo.setIcon(env.Enviroment.getLogoIcon(lblLogo.getWidth(), lblLogo.getHeight()));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConstancia = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelConstancia.setBackground(new java.awt.Color(255, 255, 255));
        PanelConstancia.setLayout(null);

        jLabel1.setText("Hola,  esto      es              una                    prueba!!!!!!!!!!!!!");
        PanelConstancia.add(jLabel1);
        jLabel1.setBounds(50, 160, 330, 100);
        PanelConstancia.add(lblLogo);
        lblLogo.setBounds(30, 20, 80, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConstancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConstancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelConstancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogo;
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
