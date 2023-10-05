package fit.iuh.edu.vn.lab03week03.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "fit.iuh.edu.vn.lab03week03.responsitory")
@EntityScan(basePackages = "fit.iuh.edu.vn.lab03week03.entities")
public class Appconfig {
}
