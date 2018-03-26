package com.glqdlt.thugviewer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThugViewerApplication implements CommandLineRunner{


	@Autowired
	ThugRepo thugRepo;
	public static void main(String[] args) {
		SpringApplication.run(ThugViewerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(thugRepo.findAll());
	}
}
