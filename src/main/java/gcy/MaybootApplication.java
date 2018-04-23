package gcy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"gcy"})
@MapperScan(basePackages = {"gcy.mapper"})
public class MaybootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MaybootApplication.class, args);
	}
}
