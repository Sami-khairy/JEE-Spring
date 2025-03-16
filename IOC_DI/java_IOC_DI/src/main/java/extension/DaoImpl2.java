package extension;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Versino web service");
        return 40;
    }
}
