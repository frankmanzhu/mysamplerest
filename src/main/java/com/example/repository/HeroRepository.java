package com.example.repository;

import com.example.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by frankzhu on 19/2/17.
 */
@CrossOrigin
@RepositoryRestResource
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
