package fa.training.demoSpringBoot.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan("fa.training.demoSpringBoot.mapper")
public class AppConfig {

    // Cấu hình DataSource
    @Bean
    public DataSource dataSource() throws IOException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        InputStream userProps = getClass().getResourceAsStream("/application.properties");
        properties.load(userProps);

        dataSource.setDriverClassName(properties.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(properties.getProperty("spring.datasource.url"));
        dataSource.setUsername(properties.getProperty("spring.datasource.username"));
        dataSource.setPassword(properties.getProperty("spring.datasource.password"));

        return dataSource;
    }

    // Cấu hình SqlSessionFactory
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());

        Resource configLocation = new ClassPathResource("mybatis-config.xml");
        sessionFactory.setConfigLocation(configLocation);

        return sessionFactory.getObject();
    }
}
