package com.sj.cardemo.util;

import com.sj.cardemo.vo.ResultVO;

public class ResultUtil {
    public static ResultVO success(Object data){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(data);
        return resultVO;
    }
    public static ResultVO error(Object data){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("失败");
        resultVO.setData(data);
        return resultVO;
    }
}
