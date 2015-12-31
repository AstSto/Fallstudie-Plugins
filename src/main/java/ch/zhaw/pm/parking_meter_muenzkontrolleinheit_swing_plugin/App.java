package ch.zhaw.pm.parking_meter_muenzkontrolleinheit_swing_plugin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App 
{
    
    public static void Bildbetrachter()
    {	
    	JFrame fenster;
        // Erzeuge das Swing-Fenster:
        fenster = new JFrame("Münzkontrolleinheit Swing-Plugin");
    
        // hier den Inhalt in das Fenster einfügen!
        
        Container contentPane = fenster.getContentPane();			//Die Methode getContentPane() des JFrame liefert eine Referenz auf den Container der Inhaltsfläche deds Fensters
        JLabel label = new JLabel("Bitte Münzen auswählen");
        contentPane.add(label);

        fenster.pack();						//Fenstergröße wird dem Inhalt kompakt angepasst
        									// Alternativ: Größe festlegen -> fenster.setSize(600,300);
        fenster.setVisible(true);
    }    
	
    public static void main( String[] args )
    {
        Bildbetrachter();
    }
}
