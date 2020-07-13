/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kodachi
 */
public class Retiariuse extends Gladiator{


    // ŵåòèàŵèé, çàêèäûâàåò ñîïåŵíèà ñåòêîé, òîò îäèí õîä âñåãäà ïŵîïóñêàåò óäàŵ


    public Retiariuse(String name) {
        super (name, 15, 1);
    }

    @Override
    public Boolean special(Gladiator enemy) {

        enemy.takeHits(damage);
        if (enemy.getHitPoints() < 0) return false;
        else return true; // åñëè óáèëè âŵàãà, âîçâŵàùàåì true
    }
}

    

