package com.dwh.backstage.controller;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import com.dwh.backstage.entity.Hotel;
import com.dwh.backstage.entity.Itinerary;
import com.dwh.backstage.service.ItineraryService;
import com.dwh.backstage.util.JsonResult;
import com.dwh.backstage.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;
import java.util.List;

/**
 * (Itinerary)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:34
 */
@RestController
@RequestMapping("itinerary")
public class ItineraryController {
    /**
     * 服务对象
     */
    @Resource
    private ItineraryService itineraryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Itinerary selectOne(Integer id) {
        return this.itineraryService.queryById(id);
    }

    @GetMapping("findAll")
    public ResultVO findAll(int page, int limit){
        PageInfo pageInfo = itineraryService.findAll(page, limit);
        int total=(int)pageInfo.getTotal();
        ResultVO resultVO = new ResultVO();
        resultVO.setCount(total);
        List<Itinerary> list = pageInfo.getList();

        resultVO.setList(list);
        return resultVO;
    }

    @RequestMapping("/deleteMany")
    public JSONObject deleteMany(@RequestParam(name = "data") List<Integer> data){
        for (Integer integer: data){
            itineraryService.deleteById(integer);
        }
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/deleteById")
    public JSONObject deleteById(Integer id){
        itineraryService.deleteById(id);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/add")
    public JSONObject add(@RequestBody Itinerary itinerary){
        itineraryService.insert(itinerary);
        return JsonResult.sendSuccess();
    }

    @RequestMapping("/test")
    public String test(@RequestParam(value = "file") MultipartFile file){
        try {
            String endpoint = "http://oss-cn-beijing.aliyuncs.com";
            String accessKeyId = "LTAI4GBA49LNsP4SHm4P2bDR";
            String accessKeySecret = "PIbkdgWcqtAvvX1lr700OCvCGblj11";
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

            String fileName = file.getOriginalFilename();
            System.out.println(fileName);
            if(fileName.indexOf("\\") != -1){

                fileName = "uploadImg/"+fileName.substring(fileName.lastIndexOf("\\"));
                String fileHead = "https://m-trip.oss-cn-beijing.aliyuncs.com/" + fileName;
            }

            // <yourObjectName>表示上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
            PutObjectRequest putObjectRequest = new PutObjectRequest("m-trip", fileName, new ByteArrayInputStream(file.getBytes()));
            // 上传字符串。
            ossClient.putObject(putObjectRequest);
            // 关闭OSSClient。
            ossClient.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功!";
    }

    @RequestMapping("/update")
    public JSONObject update(@RequestBody Itinerary itinerary){
        System.out.println(itinerary.toString());
        itineraryService.update(itinerary);
        return JsonResult.sendSuccess();
    }

}