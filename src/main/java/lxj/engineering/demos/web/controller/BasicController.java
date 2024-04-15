/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package lxj.engineering.demos.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lxj.engineering.demos.web.dto.FoodSearchRequestDto;
import lxj.engineering.demos.web.dto.FoodSearchResponseDto;
import lxj.engineering.demos.web.entity.MobileFoodFacilityPermit;
import lxj.engineering.demos.web.dto.Result;
import lxj.engineering.demos.web.service.BasicService;
import lxj.engineering.demos.web.util.CSVReader;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "饮食铺", tags = {"饮食铺 - 接口"})
public class BasicController {

    @Resource
    private BasicService basicService;

    /**
     * 全量数据
     *
     * @return
     */
    // http://127.0.0.1:8080/hello
    @ApiOperation("全量数据")
    @GetMapping("/allData")
    public Result<List<MobileFoodFacilityPermit>> allData() {
        return Result.defaultSuccess(CSVReader.getListData());
    }

    @ApiOperation("按给定条件搜索")
    @PostMapping("/searchList")
    public Result<List<FoodSearchResponseDto>> searchList(@RequestBody FoodSearchRequestDto dto){
        return Result.defaultSuccess(basicService.searchList(dto));
    }

    @ApiOperation("只查询一个店铺的详情")
    @PostMapping("/detailByLocationId")
    public Result<FoodSearchResponseDto> detailByLocationId(@RequestBody FoodSearchRequestDto dto){
        return Result.defaultSuccess(basicService.detailByLocationId(dto));
    }

    @ApiOperation("状态列表 数据")
    @GetMapping("/getStatus")
    public Result<List<String>> getStatus() {

        return Result.defaultSuccess(basicService.getStatus());
    }

    @ApiOperation("设施类型 数据")
    @GetMapping("/getFacilityType")
    public Result<List<String>> getFacilityType(){
        return Result.defaultSuccess(basicService.getFacilityType());
    }


}
