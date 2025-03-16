package ma.khairy.metier;

import ma.khairy.dao.IDao;

public class MetierImpl implements IMetier {
    //couplage faible
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData()*23;
    }
    //injection de dependances
    public void setdao(IDao dao) {
        this.dao = dao;
    }
}
