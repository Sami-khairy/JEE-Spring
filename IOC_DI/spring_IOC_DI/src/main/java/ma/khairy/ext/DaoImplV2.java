package ma.khairy.ext;

import ma.khairy.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("vrsion WS");
        return 65;
    }
}
