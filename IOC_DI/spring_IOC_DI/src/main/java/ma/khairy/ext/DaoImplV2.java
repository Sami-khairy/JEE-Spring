package ma.khairy.ext;

import ma.khairy.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version WS");
        return 65;
    }
}
