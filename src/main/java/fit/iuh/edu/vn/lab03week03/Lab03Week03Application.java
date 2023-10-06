package fit.iuh.edu.vn.lab03week03;

import fit.iuh.edu.vn.lab03week03.dao.ClassDao;
import fit.iuh.edu.vn.lab03week03.entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Lab03Week03Application {
	@Autowired
	private ClassDao classDao;

	public static void main(String[] args) {

		 SpringApplication.run(Lab03Week03Application.class, args);
	}


//	@Bean
//	public CommandLineRunner example01(){
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				Candidate candidate = new Candidate("cuong", "01234567", "TP HCM", "Cuong@gmail.com");
//				if(classDao.insert(candidate)){
//					System.out.println("insertOk");
//				}
//
//			}
//		};
//	}

//	@Bean
//	public CommandLineRunner example02(){
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				Candidate candidate = new Candidate("cuong3", "01234567", "TP HCM", "Cuong@gmail.com");
//				if(classDao.update(candidate,3L)){
//					System.out.println("updateOK");
//				}
//
//			}
//		};
//	}

//	@Bean
//	public CommandLineRunner example03(){
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				List<Candidate> candidates = classDao.findAll();
//				for (Candidate candidate: candidates) {
//					System.out.println("ID:" + candidate.getId());
//					System.out.println(",Name:" + candidate.getName());
//					System.out.println(",Address:" + candidate.getAddress());
//					System.out.println(",Phone:" + candidate.getPhone());
//					System.out.println(",Email:" + candidate.getEmail());
//
//				}
//			}
//		};
//	}

	@Bean
	public CommandLineRunner example04(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Candidate candidate = (Candidate) classDao.findById(3L);
					System.out.println("ID:" + candidate.getId());
					System.out.println(",Name:" + candidate.getName());
					System.out.println(",Address:" + candidate.getAddress());
					System.out.println(",Phone:" + candidate.getPhone());
					System.out.println(",Email:" + candidate.getEmail());
			}
		};
	}

}
