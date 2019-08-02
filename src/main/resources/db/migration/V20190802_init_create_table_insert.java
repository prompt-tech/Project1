package db.migration;

import org.springframework.core.api.migration.BaseJavaMigration;
import org.springframework.core.api.migration.Context;
import java.sql.PreparedStatement;

/*Java-based migration using Spring JDBC*/

public class V20190802_init_create_table_insert extends BaseJavaMigration {
    public void migrate(Context context){
        new JdbcTemplate(new SingleConnectionDataSource(context.getConnection(), true)
                .execute("INSERT INTO employee (ssn, fname, lname, bdate, address, sex, salary, superssn, dno, pnumber, hours, dnumber, dname, mgrstartdate, dlocation, pname, plocation) values (110,'Donald','Oconnell','1959.2.7','YONGIN','M',2600,146,3,3388,25,3,'IT','2005.3.2','SEOUL','Y','SEOUL')");
    }

    flyway flyway = new flyway;
    flyway.setDataSource();
    flyway.migrate();

    V20190802_init_create_table_insert.migrate();

}