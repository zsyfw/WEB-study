/**
 * @author FW
 * @date 2023/10/16 15:31
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import webstudy.Class.News;
import webstudy.Class.User;
import webstudy.Mapper.NewsMapper;
import webstudy.Mapper.UserMapper;
import webstudy.dao.NewsDao;

import java.util.List;

@Repository
public class NewsDaoImpl implements NewsDao {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> selectNews() {
        List<News> newsList= newsMapper.selectNews();
        return newsList;
    }
}
