package com.dwh.backstage.controller;

import com.alibaba.fastjson.JSONObject;
import com.dwh.backstage.entity.Hotel;
import com.dwh.backstage.entity.Room;
import com.dwh.backstage.service.RoomService;
import com.dwh.backstage.util.JsonResult;
import com.dwh.backstage.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Room)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:39
 */
@RestController
@RequestMapping("room")
public class RoomController {
    /**
     * 服务对象
     */
    @Resource
    private RoomService roomService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Room selectOne(Integer id) {
        return this.roomService.queryById(id);
    }

    @GetMapping("findAll")
    public ResultVO findAll(int page, int limit){
        PageInfo pageInfo = roomService.findAll(page, limit);
        int total=(int)pageInfo.getTotal();
        ResultVO resultVO = new ResultVO();
        resultVO.setCount(total);
        List<Room> list = pageInfo.getList();

        resultVO.setList(list);
        return resultVO;
    }

    @RequestMapping("/deleteMany")
    public JSONObject deleteMany(@RequestParam(name = "data") List<Integer> data){
        for (Integer integer: data){
            roomService.deleteById(integer);
        }
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/deleteById")
    public JSONObject deleteById(Integer id){
        roomService.deleteById(id);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/add")
    public JSONObject add(@RequestBody Room room){
        roomService.insert(room);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/update")
    public JSONObject update(@RequestBody Room room){
        System.out.println(room.toString());
        roomService.update(room);
        return JsonResult.sendSuccess();
    }

}