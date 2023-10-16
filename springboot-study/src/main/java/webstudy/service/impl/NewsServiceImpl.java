/**
 * @author FW
 * @date 2023/10/16 15:36
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstudy.Class.News;
import webstudy.Class.User;
import webstudy.dao.MysqlDao;
import webstudy.dao.NewsDao;
import webstudy.service.NewsService;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> selectNews() {
        List<News> newsList = newsDao.selectNews();
        return newsList;
    }
}
