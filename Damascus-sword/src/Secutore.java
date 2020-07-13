/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kodachi
 */
import javax.swing.JOptionPane;
public class Secutore extends Gladiator{
    
	public Secutore(String name) {

		super(name,10,2);
	    }





	    @Override
	    public Boolean special(Gladiator enemy) {
	    	JOptionPane.showMessageDialog(null,"░░░░░░░▀███▀░░░░░░░░░░░░░░░░▀███▀░░░░░░░\n"+"░░░░░░░▄████░░░░░░░░░░░░░░░░████▄░░░░░░░\n"+"░░░░░░░░░▄███▀░░░░░░░░░░░░▀███▄░░░░░░░░░\n"+"░░░░░░░░░░▄█████▀░░░░░░▀█████▄░░░░░░░░░░\n"+"░░░░░░░░░░░░░▄████▀▀▀▀████▄░░░░░░░░░░░░░\n"+"░░░░░░▀▀░░░░░░░▄▄██████▄▄░░░░░░░▀▀░░░░░░\n"+"░░░▀████░░░░░░▀▀████████▀▀░░░░░░████▀░░░\n"+"░▀██████░░░░▀█████▄░░▄█████▀░░░░██████▀░\n"+"████████░░▀█████▄░░░░░░▄█████▀░░████████\n"+"░░░▄██████████▄░░░░░░░░░░▄██████████▄░░░\n"+"░░░░░░▄██████▄░░░░░░░░░░░░▄██████▄░░░░░░\n"+"░░░░░░░░▄███▄░░░░░░░░░░░░░░▄███▄░░░░░░░░\n"+"░░░░░░░░░░▄░░░░░░░░░░░░░░░░░░▄░░░░░░░░░░\n"+"\n"+name+" " + "нанес двойной урон! "+"\n","", JOptionPane.PLAIN_MESSAGE);

	        damage = 4;
	        Boolean f;
	        f = attack(enemy);
	        damage = 2;
	        return f;
	    }
}


