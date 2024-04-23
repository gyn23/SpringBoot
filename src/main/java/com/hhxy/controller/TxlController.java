package com.hhxy.controller;

import com.hhxy.domain.RequseJs;
import com.hhxy.domain.Txl;
import com.hhxy.domain.Txlgs;
import com.hhxy.servicde.ITxlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class TxlController {
    @Autowired
    private ITxlService iTxlService;
    @RequestMapping("/txl")
    public String cf(Txl txl){
        iTxlService.cf(txl);
        return "nihao ";
    }
    @RequestMapping("/zjmap")
    public String zjmap(Txl txl){
        iTxlService.zjmap(txl);
        return "nihao ";
    }
    @RequestMapping("/zjdx")
    public String zjdx(Txl txl){
        iTxlService.zjdx(txl);
        return "nihao ";
    }
    @RequestMapping("qsj")
    public void qsj(String bh){
        iTxlService.qsj(bh);
    }
    @RequestMapping("qdx")
    public void qdx(String bh){
        iTxlService.qdx(bh);
    }
    @RequestMapping("qmap")
    public void qmap(String bh){
        iTxlService.qmap(bh);
    }
    @RequestMapping("qlist")
    public void qlist(String bh){
        iTxlService.qlist(bh);
    }
    @RequestMapping("txlfh")
    public String txlfh(String bh){
        iTxlService.txlfh(bh);
        return null;
    }
    @RequestMapping("txlgs")
    public Txlgs txlgs(Txlgs txlgss){
        Txlgs txlgs=new Txlgs("a01","zsf","23844");
//        System.out.println("chenggong");
        return txlgs;
    }
    //增加数据返回给用户是否成功信息（异常采用的是创建空对象）
    @RequestMapping("txl_add")
    public RequseJs txladd(Txl txl){
       Txl a= iTxlService.cxadd(txl);
        RequseJs requseJs=null;
       if(a==null){
           int b=iTxlService.txladd(txl);
           if(b==0){
               requseJs=RequseJs.shibai("增加失败");
           } else if (b==1) {
               requseJs=RequseJs.success("增加成功");
           }else {
               requseJs=RequseJs.yihcang("插入出现异常");
           }
           return requseJs;
       } else {
           if(a.getBh()==null){
               requseJs=RequseJs.yihcang("取出出现异常");
           }else {
               requseJs=RequseJs.crcf("数据重复");
           }
       }
        return requseJs;
    }
    //增加数据返回给用户是否成功信息（异常采用的是返回几条数据）
    @RequestMapping("txl_addd")
    public RequseJs txladdd(Txl txl){
        int a= iTxlService.cxaddd(txl);
        RequseJs requseJs=null;
        if(a==0){
            int b=iTxlService.txladd(txl);
            if(b==0){
                requseJs=RequseJs.shibai("增加失败");
            } else if (b==1) {
                requseJs=RequseJs.success("增加成功");
            }else {
                requseJs=RequseJs.yihcang("插入出现异常");
            }
            return requseJs;
        } else if (a==-1) {
            requseJs=RequseJs.yihcang("查询出现异常");
        }else {
            requseJs=RequseJs.crcf("数据重复");
        }
        return requseJs;
    }
    //取出数据返回给用户信息
    @RequestMapping("quchu")
    public RequseJs quchu(Txl txl){
        RequseJs requseJs=null;
        List<Txl> list=iTxlService.quchu(txl);
        requseJs=RequseJs.chaxun(list);
        return requseJs;
    }
    @RequestMapping("shanchu")
    public RequseJs shanchu(Txl txl){
        int a= iTxlService.cxaddd(txl);
        RequseJs requseJs=null;
        if(a==0){
            requseJs=RequseJs.chaxunshibai("没有该数据");
            return requseJs;
        } else if (a==-1) {
            requseJs=RequseJs.yihcang("查询出现异常");
        }else {
            iTxlService.shanchu(txl);
        }
        return null;
    }
}
