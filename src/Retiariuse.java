import javax.swing.JOptionPane;

public class Retiariuse extends Gladiator{


    // ŵåòèàŵèé, çàêèäûâàåò ñîïåŵíèà ñåòêîé, òîò îäèí õîä âñåãäà ïŵîïóñêàåò óäàŵ


    public Retiariuse(String name) {
        super (name, 20, 1);
    }

    @Override
    public Boolean special(Gladiator enemy) {JOptionPane.showMessageDialog(null,name +""+"çàêèíóë ñåòü íà ñîïåŵíèêà","", JOptionPane.PLAIN_MESSAGE);

        enemy.takeHits(damage);
        if (enemy.getHitPoints() < 0) return false;
        else return true; // åñëè óáèëè âŵàãà, âîçâŵàùàåì true
    }
}
