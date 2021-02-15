package com.tom.springmvc.web.ch4_5;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * UploadController
 *
 * @author Tom on 2021/2/14
 */
@Controller
public class UploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file) {//1

        try {
            FileUtils.writeByteArrayToFile(new File("d:/upload/"+file.getOriginalFilename()),
                    file.getBytes()); //2
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }


    }
}
