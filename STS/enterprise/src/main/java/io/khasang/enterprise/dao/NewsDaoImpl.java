package io.khasang.enterprise.dao;

import io.khasang.enterprise.dao.interfaces.ClientDao;
import io.khasang.enterprise.dao.interfaces.NewsDao;
import io.khasang.enterprise.model.Client;
import io.khasang.enterprise.model.News;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsDaoImpl extends AbstractDao<News> implements NewsDao {
    public List<News> findAllNews() {
        return null;
    }

    public List<News> findLatestNews() {
        return null;
    }

    public void saveNews(News news) {

    }

    public void deleteNewsById(int id) {

    }

    public void deleteAllNews() {

    }
}
