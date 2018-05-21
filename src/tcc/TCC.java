/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

import view.ViewLogin;


/**
 *
 * @author Home
 */
public class TCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
       ViewLogin login=new ViewLogin();
    //Essa lnha é para deixar a localização do frmLogin//
   login.setLocationRelativeTo(null);    
    //Essa linha é para deixar o login visivel, por isso o True//
    
    login.setVisible(true);
    }
}

    
  
