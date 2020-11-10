/**
 * Copyright (C), 2015-2020, 上海巧房信息科技有限公司
 * FileName: Controller
 * Author:   wenji.li
 * Date:     2020/11/10 14:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author wenji.li
 * @create 2020/11/10
 * @since 1.0.0
 */
@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "hello springboot";
    }

    @GetMapping("jacoco")
    public String hiJacoco() {
        return "hi jacoco";
    }
}
