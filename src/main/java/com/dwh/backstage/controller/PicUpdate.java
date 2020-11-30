package com.dwh.backstage.controller;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import com.dwh.backstage.util.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;

@RestController
public class PicUpdate {
    @RequestMapping("/picUpdate")
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
            String file01 = "https://m-trip.oss-cn-beijing.aliyuncs.com/" + fileName;
            System.out.println(file01);
            return file01;
        } catch (Exception e) {
            e.printStackTrace();
            return "上传失败";
        }
    }
}
