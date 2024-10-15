package dev.danvega.runnerz;

import dev.danvega.runnerz.run.Run;
import dev.danvega.runnerz.run.RunRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Component
	public static class ApplicationRunner implements CommandLineRunner {
		private final RunRepository runRepository;

		public ApplicationRunner(RunRepository runRepository) {
			this.runRepository = runRepository;
		}

		@Override
		public void run(String... args) throws Exception {
			List<Run> allRuns = runRepository.findAll();
			System.out.println("All Runs in the Repository:");
			allRuns.forEach(run -> {
				System.out.printf("ID: %d, Title: %s, Started On: %s, Completed On: %s, Miles: %d, Location: %s%n",
						run.id(), run.title(), run.startedOn(), run.completedOn(), run.miles(), run.location());
			});
		}
	}
}
