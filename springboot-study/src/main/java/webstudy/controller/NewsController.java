/**
 * @author FW
 * @date 2023/10/13 14:38
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webstudy.Class.News;
import webstudy.Result.Result;
import webstudy.service.NewsService;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping("/getNews")    //获取新闻列表
    public Result getNews(){
        List<News>  newsList = newsService.selectNews();
        return Result.success(newsList);
    }
}
