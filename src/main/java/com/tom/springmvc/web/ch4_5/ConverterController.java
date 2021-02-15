package com.tom.springmvc.web.ch4_5;

import com.tom.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ConverterController
 *
 * @author Tom on 2021/2/15
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = { "application/x-tom" }) //1
    public @ResponseBody
    DemoObj convert(@RequestBody DemoObj demoObj) {

        return demoObj;

    }

}
