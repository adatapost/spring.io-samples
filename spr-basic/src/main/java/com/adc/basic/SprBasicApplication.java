package com.adc.basic;

import java.util.Locale;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.adc.basic.model.Dept;
import com.adc.basic.model.DeptRepository;
import com.adc.basic.model.Emp;
import com.adc.basic.model.EmpRepository;
import com.adc.basic.model.User;
import com.adc.basic.model.UserRepository;

@SpringBootApplication

public class SprBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprBasicApplication.class, args);

	}

	@Bean
	public SessionLocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		return slr;
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

}

@Component
class MyCommand implements CommandLineRunner {
	private UserRepository repo;
	private DeptRepository deptRepo;
	private EmpRepository empRepo;

	public MyCommand(UserRepository repo, DeptRepository deptRepo, EmpRepository empRepo) {
		this.repo = repo;
		this.deptRepo = deptRepo;
		this.empRepo = empRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * User user = repo.findByEmail("a@a.com"); System.out.println(user);
		 */

		test6();
		test7();
	}

	void test6() {
		for (Dept d : deptRepo.findAll()) {
			System.out.println(d);

			for (Emp e : d.getEmps())
				System.out.println(e);

		}
	}

	void test7() {
		Optional<Dept> dept = deptRepo.findById(1L);

		if (dept.isPresent()) {
			System.out.println(dept.get().getEmps());
		}

	}

	void test5() {
		Optional<Emp> emp = empRepo.findById(1L);
		if (emp.isPresent()) {
			var e = emp.get();
			System.out.println(e);
			System.out.println(e.getDept());
		}

		else
			System.out.println("Employee not oufnd");
	}

	void test4() {
		Optional<Emp> emp = empRepo.findById(1L);
		if (emp.isPresent())
			System.out.println(emp.get());
		else
			System.out.println("Employee not oufnd");
	}

	void test3() {
		Optional<Dept> dept = deptRepo.findById(12L);
		System.out.println(dept.isPresent());
		if (dept.isPresent())
			System.out.println(dept.get());
		else
			System.out.println("Not found");
	}

	void test2() {
		empRepo.save(new Emp(0L, "Reena", 10000L, 1L));
		empRepo.save(new Emp(0L, "Keena", 20000L, 2L));
		empRepo.save(new Emp(0L, "Seena", 30000L, 1L));
		empRepo.save(new Emp(0L, "Leena", 40000L, 1L));
		empRepo.save(new Emp(0L, "Teena", 10000L, 2L));
	}

	void test1() {
		Dept d = new Dept("Accounting");
		deptRepo.save(d);
		deptRepo.save(new Dept("HR"));
	}

}