/**
 * @author FW
 * @date 2023/9/22 15:39
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import webstudy.Result.Result;

@Slf4j
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Result upload( MultipartFile image){
        log.info("文件上传");
        return Result.success();
    }
}
