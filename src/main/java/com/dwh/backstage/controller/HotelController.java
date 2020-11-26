package com.dwh.backstage.controller;

import com.alibaba.fastjson.JSONObject;
import com.dwh.backstage.entity.Hotel;
import com.dwh.backstage.entity.Roleuser;
import com.dwh.backstage.service.HotelService;
import com.dwh.backstage.util.JsonResult;
import com.dwh.backstage.vo.ResultVO;
import com.dwh.backstage.vo.RoleUserVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Hotel)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:31
 */
@RestController
@RequestMapping("hotel")
public class HotelController {
    /**
     * 服务对象
     */
    @Resource
    private HotelService hotelService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Hotel selectOne(Integer id) {
        return this.hotelService.queryById(id);
    }

    @GetMapping("findAll")
    public ResultVO findAll(int page, int limit){
        PageInfo pageInfo = hotelService.findAll(page, limit);
        int total=(int)pageInfo.getTotal();
        ResultVO resultVO = new ResultVO();
        resultVO.setCount(total);
        List<Hotel> list = pageInfo.getList();

        resultVO.setList(list);
        return resultVO;
    }

    @RequestMapping("/deleteMany")
    public JSONObject deleteMany(@RequestParam(name = "data") List<Integer> data){
        for (Integer integer: data){
            hotelService.deleteById(integer);
        }
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/deleteById")
    public JSONObject deleteById(Integer id){
        hotelService.deleteById(id);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/add")
    public JSONObject add(@RequestBody Hotel hotel){
        hotelService.insert(hotel);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/update")
    public JSONObject update(@RequestBody Hotel hotel){
        System.out.println(hotel.toString());
        hotelService.update(hotel);
        return JsonResult.sendSuccess();
    }

}