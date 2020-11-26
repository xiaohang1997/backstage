package com.dwh.backstage.controller;

import com.alibaba.fastjson.JSONObject;
import com.dwh.backstage.entity.Hotel;
import com.dwh.backstage.entity.Route;
import com.dwh.backstage.service.RouteService;
import com.dwh.backstage.util.JsonResult;
import com.dwh.backstage.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Route)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:40
 */
@RestController
@RequestMapping("route")
public class RouteController {
    /**
     * 服务对象
     */
    @Resource
    private RouteService routeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Route selectOne(Integer id) {
        return this.routeService.queryById(id);
    }

    @GetMapping("findAll")
    public ResultVO findAll(int page, int limit){
        PageInfo pageInfo = routeService.findAll(page, limit);
        int total=(int)pageInfo.getTotal();
        ResultVO resultVO = new ResultVO();
        resultVO.setCount(total);
        List list = pageInfo.getList();
        resultVO.setList(list);
        return resultVO;
    }

    @RequestMapping("/deleteMany")
    public JSONObject deleteMany(@RequestParam(name = "data") List<Integer> data){
        for (Integer integer: data){
            routeService.deleteById(integer);
        }
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/deleteById")
    public JSONObject deleteById(Integer id){
        routeService.deleteById(id);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/add")
    public JSONObject add(@RequestBody Route route){
        routeService.insert(route);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/update")
    public JSONObject update(@RequestBody Route route){
        System.out.println(route.toString());
        routeService.update(route);
        return JsonResult.sendSuccess();
    }

}