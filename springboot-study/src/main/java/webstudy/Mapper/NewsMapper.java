package webstudy.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import webstudy.Class.News;
import webstudy.Class.User;

import java.util.List;

@Mapper
public interface NewsMapper {
    @Select("select * from news")
    public List<News> selectNews();
}
