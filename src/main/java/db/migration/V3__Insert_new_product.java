package db.migration;

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

public class V3__Insert_new_product implements SpringJdbcMigration {
    @Override
    public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        jdbcTemplate.update("INSERT INTO product (name, price) VALUES (?, ?)", new Object[] { "computer", 1500 });
    }
}
