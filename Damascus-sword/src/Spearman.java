/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kodachi
 */
import javax.swing.*;
public class Spearman extends Gladiator{
    public Spearman(String name) {

        super(name,15,1);
    }
    @Override
    public Boolean special(Gladiator enemy) {
        JOptionPane.showMessageDialog(null,"████████████████████████████████████████\n"+"██░░░▀██████████████████████████████████\n"+"██▄░░░░▀████████████████████████████████\n"+"████▄░▄██▀▀▀▀███████████████████████████\n"+"███████▀░░░░░▄██████████████████████████\n"+"███████░░░▄██▀▀▀▀████████▀▀▀████████████\n"+"███████▄░▄█▀░░░░░░▀██████░░░▀███████████\n"+"███████████░░░░▄▄█▀▀███░██░░░▀██████████\n"+"███████████▄░░██░░░░░██░░█▄░░░██████████\n"+"█████████████▄█░░░░░░█░░░░█▄░░░█████████\n"+"███████████████▄░▄▄▄██░░░░▀█░░░▀████████\n"+"███████████████▀▀▀▀░░░░░░░░██░░░▀███████\n"+"███████████▀▀▀█▄▄▄░░░░░░░░░░█▄░░░███████\n"+"██████████▀░░░░░▀▀▀██▄▄░░░░░░█▄░░░██████\n"+"████████████▄▄▄░░░░░░░▀▀██▄▄░▀█░░░░█████\n"+"█████████████████▄▄▄░░░░░░░▀▀███░░░▀████\n"+"████████████████████████████▄▄░░░░░░░███\n"+"█████████████████████████████████▄▄▄░░██\n"+"████████████████████████████████████████\n"+"\n"+name+" " + "Кинул копьё! "+"\n","", JOptionPane.PLAIN_MESSAGE);

        damage = 2;
        Boolean damageSpearman;
        damageSpearman = attack(enemy);
        damage = 3;
        return damageSpearman;
    }


}

    

