import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class dataSourceTest {
    @Autowired
    DataSource ds;

    @Test
    public void dsTest(){
        System.out.println(ds);
    }
}
