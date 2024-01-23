
package GUI;

/**
*---------------
*
* Creado el 17 de Enero, 2024, 13:00 horas
*
* @ Author Gabriel Campoverde, Roberto Mera 
*
* @version POO - 2022
*
*/


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FrmPrincipalListener implements ActionListener{
    private FrmPrincipal frm;
    public FrmPrincipalListener(FrmPrincipal frm){       
        this.frm = frm; 
    }
    @Override
    public void actionPerformed(ActionEvent e){
         Object obj = e.getSource();
         if(obj == frm.getMniRegistrar()){
            IFrmNuevoPropietario IFnuevoPropietario = new IFrmNuevoPropietario("Informacion de nuevo propietario");
            IFnuevoPropietario.setVisible(true);
            frm.getDesktopPane().add(IFnuevoPropietario);     
         }
         if(obj == frm.getMniSalir()){
             System.exit(0);
         }
         if(obj == frm.getMniRevisar()){
            IFrmListadoCliente ifrm = new IFrmListadoCliente("tabla perrro");
            ifrm.setVisible(true);  
            frm.getDesktopPane().add(ifrm);
         }
    }
}
