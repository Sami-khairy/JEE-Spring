package ma.khairy.metier;

import ma.khairy.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //couplage faible
//    @Autowired
    private IDao dao;

    public MetierImpl(@Qualifier("dao") IDao dao) {
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
