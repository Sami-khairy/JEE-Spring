package ma.khairy.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version BD");
        return 23;
    }
}
