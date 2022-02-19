package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

@RepositoryRestResource(exported = false)
//@Component
public interface AuthorRepository extends JpaRepository<Author, Long> {}

/*
With @RepositoryRestResource(exported = false),

        "author" : {
          "href" : "http://localhost:8080/posts/1/author"
        }

        becomes

        "author" : {
            "lastname" : "Holderness",
            "firstName" : "Sarah"
        },
 */