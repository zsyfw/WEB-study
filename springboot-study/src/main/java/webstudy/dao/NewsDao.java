package webstudy.dao;

import webstudy.Class.News;
import webstudy.Class.User;

import java.util.List;

public interface NewsDao {

    public List<News> selectNews();
}
