package io.khasang.enterprise.service;

import io.khasang.enterprise.dao.interfaces.NewsDao;
import io.khasang.enterprise.model.News;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("newsService")
@Transactional
public class NewsService {
    @Autowired
    NewsDao newsDao;

    public List<News> findLatestNews() {
        return newsDao.findLastNews();
    }

    public List<News> findAllNews() {
        return newsDao.findAll();
    }

    public List<News> getAllNews() {
        return newsDao.findAll();
    }

    public void deleteAllNews() {
        newsDao.deleteAllNews();
    }

    public void saveNewsToDB(News news) {
        newsDao.save(news);
    }
}
