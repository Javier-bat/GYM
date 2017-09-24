/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logico;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba 2013
 */
public class Controlador {
    

    
    public boolean enviarCorreo( Correo co){
    
        try {
            Properties pr = new Properties();
            
            pr.put("mail.smtp.host", "smtp.gmail.com");
            pr.setProperty("mail.smtp.starttls.enable", "true");
            pr.setProperty("mail.smtp.port", "587");
            pr.setProperty("mail.smtp.user", co.getCorreo());
            pr.setProperty("mail.smtp.auth", "true");
            
            
            Session s = Session.getDefaultInstance(pr,null);
            
            BodyPart texto = new MimeBodyPart();
            texto.setText(co.getMensaje());
            
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setText(co.getAsunto());
            
            if (!co.getRuta().isEmpty()) {
                adjunto.setDataHandler(new DataHandler(new FileDataSource(co.getRuta())));
                adjunto.setFileName(co.getNombreArchivo());
            }
            
            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);
            
            
            if (!co.getRuta().isEmpty()) {
                
                m.addBodyPart(adjunto);
                        
                
            }
            
            
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(co.getCorreo()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(co.getDestino()));
            mensaje.setSubject(co.getAsunto());
            mensaje.setContent(m);
            
            Transport t=s.getTransport("smtp");
            t.connect(co.getCorreo(),co.getContrasenia());
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            return true;
            
            
        } catch (Exception e) {   
            JOptionPane.showMessageDialog(null, "Error en "+e);

        }
    return false; 
    }
    
    
}
