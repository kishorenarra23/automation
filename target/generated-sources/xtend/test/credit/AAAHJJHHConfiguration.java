package credit;

import de.bmiag.tapir.bootstrap.FqnAnnotationBeanNameGenerator;
import de.bmiag.tapir.bootstrap.annotation.BootstrapConfiguration;
import de.bmiag.tapir.bootstrap.annotation.NoScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@BootstrapConfiguration
@PropertySource(value = "classpath:test.properties")
@ComponentScan(basePackageClasses = AAAHJJHHConfiguration.class, nameGenerator = FqnAnnotationBeanNameGenerator.class, excludeFilters = @ComponentScan.Filter(classes = NoScan.class))
@EnableAutoConfiguration
@SuppressWarnings("all")
public class AAAHJJHHConfiguration {
}
