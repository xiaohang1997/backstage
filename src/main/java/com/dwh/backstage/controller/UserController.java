package com.dwh.backstage.controller;

import com.dwh.backstage.entity.User;
import com.dwh.backstage.service.UserService;
import com.dwh.backstage.util.Pager;
import com.dwh.backstage.vo.ResultVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:45
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }


    @RequestMapping("/findAllUserByLimit")
    public ResultVO<User> findAllByLimit(int page, int limit){
        Pager<User> pagerUser = userService.findAllByLimit(page, limit);
        ResultVO resultVO =  new ResultVO();
        resultVO.setList(pagerUser.getRows());
        resultVO.setCount(pagerUser.getTotal());
        return resultVO;
    }

    @RequestMapping("/insertUser")
    public User insert(@RequestBody User user){ //注意要用@RequstBody
        //对实体对象的操作
        User user1 = userService.insert(user);
        return user1;
    }
    @RequestMapping("/deleteById")
    public boolean deleteById(Integer id){

        return userService.deleteById(id);
    }
    @RequestMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.update(user);
    }

    @RequestMapping("/deleteMany")
    public boolean deleteMany(@RequestParam(name = "data") List<Integer> data){
        for (Integer integer: data){
            userService.deleteById(integer);
        }
        return true;
    }
}