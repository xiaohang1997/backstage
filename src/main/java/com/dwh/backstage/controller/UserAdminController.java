package com.dwh.backstage.controller;

import com.alibaba.fastjson.JSONObject;
import com.dwh.backstage.entity.UserAdmin;
import com.dwh.backstage.service.UserAdminService;
import com.dwh.backstage.util.JsonResult;
import com.google.gson.JsonObject;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.security.auth.Subject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * (UserAdmin)表控制层
 *
 * @author makejava
 * @since 2020-11-30 06:25:13
 */
@RestController
@RequestMapping("userAdmin")
public class UserAdminController {
    /**
     * 服务对象
     */
    @Resource
    private UserAdminService userAdminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserAdmin selectOne(String id) {
        return this.userAdminService.queryById(id);
    }

    @PostMapping("/login")
    public JSONObject login(UserAdmin userAdmin, HttpServletRequest request, HttpServletResponse response){
        if (userAdminService.queryAll(userAdmin) != null){
            HttpSession session = request.getSession();
            //设置会话session对象有效期，默认10分钟
            session.setMaxInactiveInterval(10*60);
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(10*60);
            response.addCookie(cookie);
            System.out.println(cookie.toString());
            session.setAttribute("username",userAdmin.getName());

            return JsonResult.sendSuccess();
        }
        else {
            return null;
        }
    }

    @RequestMapping("/getSession")
    public String getSession(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        return (String) session.getAttribute("username");
    }

}