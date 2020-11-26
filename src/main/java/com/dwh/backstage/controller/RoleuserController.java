package com.dwh.backstage.controller;

import com.alibaba.fastjson.JSONObject;
import com.dwh.backstage.entity.Roleuser;
import com.dwh.backstage.entity.User;
import com.dwh.backstage.service.RoleuserService;
import com.dwh.backstage.util.JsonResult;
import com.dwh.backstage.util.Pager;
import com.dwh.backstage.vo.ResultVO;
import com.dwh.backstage.vo.RoleUserVO;
import com.dwh.backstage.vo.UserVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Roleuser)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:37
 */
@RestController
@RequestMapping("roleuser")
public class RoleuserController {
    /**
     * 服务对象
     */
    @Resource
    private RoleuserService roleuserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Roleuser selectOne(Integer id) {
        return this.roleuserService.queryById(id);
    }

    @GetMapping("findAll")
    public ResultVO findAll(int page, int limit){
        PageInfo<RoleUserVO> roleuserPageInfo = roleuserService.findAll(page, limit);
        int total=(int)roleuserPageInfo.getTotal();
        ResultVO resultVO = new ResultVO();
        resultVO.setCount(total);
        List<RoleUserVO> list = roleuserPageInfo.getList();
        ResultVO<RoleUserVO> roleUserVOResultVO = new ResultVO<>();
        roleUserVOResultVO.setList(list);
        return roleUserVOResultVO;
    }

    @RequestMapping("/deleteMany")
    public JSONObject deleteMany(@RequestParam(name = "data") List<Integer> data){
        for (Integer integer: data){
            roleuserService.deleteById(integer);
        }
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/deleteById")
    public JSONObject deleteById(Integer id){
        roleuserService.deleteById(id);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/add")
    public JSONObject add(@RequestBody Roleuser roleuser){
        roleuserService.insert(roleuser);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/update")
    public JSONObject update(@RequestBody Roleuser roleuser){
        roleuserService.update(roleuser);
        return JsonResult.sendSuccess();
    }


}