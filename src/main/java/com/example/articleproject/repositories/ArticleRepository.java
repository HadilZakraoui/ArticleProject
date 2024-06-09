package com.example.articleproject.repositories;

import com.example.articleproject.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
