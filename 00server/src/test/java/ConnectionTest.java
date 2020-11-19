import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static junit.framework.TestCase.fail;

@Log4j
public class ConnectionTest {

    static {

        try {
        Class.forName("oracle.jdbc.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void connection(){
        try(Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE","book_ex","book_ex"
        )){

        }catch (Exception e){
            fail(e.getMessage());
        }
    }

}
