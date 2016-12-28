package com.ss.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;


@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminUiApplication.class, args);
	}
	
	/*@Bean
	@Primary
	public RemindingNotifier remindingNotifier() {
		RemindingNotifier notifier = new RemindingNotifier(filteringNotifier(loggerNotifier()));
		notifier.setReminderPeriod(TimeUnit.SECONDS.toMillis(10));
		return notifier;
	}

	@Scheduled(fixedRate = 1_000L)
	public void remind() {
		remindingNotifier().sendReminders();
	}

	@Bean
	public FilteringNotifier filteringNotifier(Notifier delegate) {
		return new FilteringNotifier(delegate);
	}

	@Bean
	public LoggingNotifier loggerNotifier() {
		return new LoggingNotifier();
	}*/
}
