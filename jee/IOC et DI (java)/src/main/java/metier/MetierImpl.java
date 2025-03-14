package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; //couplage faible

    //injection de deps via le constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData()*43/3;
    }
}
