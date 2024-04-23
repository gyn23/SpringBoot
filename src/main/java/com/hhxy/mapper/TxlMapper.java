package com.hhxy.mapper;

import com.hhxy.domain.Txl;
import com.hhxy.domain.TxlFh;
import com.hhxy.domain.Txlgs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface TxlMapper {
    int add(@Param("bha")  String bh,@Param("xm")String xm, @Param("dh")String dh);
    String qsj(String bh);
    Txl qdx(String bh);
    Map<String, Object> qmap(String bh);

    void zjmap(Map map);

    void zjdx(Txl txl);

    TxlFh txlfh(String bh);

    List<Map<String, Object>> qlist(String bh);

    int txladd(Txl txl);

    Txl cxadd(Txl txl);

    int cxaddd(Txl txl);

    List<Txl> quchu(Txl txl);

    void shanchu(Txl txl);
}
