package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de donnees");
        return 20;
    }
}
