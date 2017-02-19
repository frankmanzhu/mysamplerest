package com.example.bootstrap;

import com.example.entity.Hero;
import com.example.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * Created by frankzhu on 19/2/17.
 */
@Component
class SampleDataCLR implements CommandLineRunner {

	private final HeroRepository heroRepository;

	@Autowired
	public SampleDataCLR(HeroRepository heroRepository) {
		this.heroRepository = heroRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
		Stream.of("Frank", "Juergen", "Andrew", "Bridget", "Onsi", "Phil", "Stephane")
				.forEach(name -> heroRepository.save(new Hero(name)));
		heroRepository.findAll().forEach(System.out::println);
	}
}
