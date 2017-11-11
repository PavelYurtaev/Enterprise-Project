package io.khasang.techsandbox.dao.interfaces;

import io.khasang.techsandbox.model.News;

import java.util.List;

public interface NewsDao {
    News findById(Integer id);

    List<News> findAll();

    void save(News news);

    void update(News news);

    List<News> findLastNews();

    void deleteNewsById(int id);

    void deleteAllNews();
}
