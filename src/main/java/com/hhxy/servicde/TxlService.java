package com.hhxy.servicde;

import com.hhxy.domain.Txl;
import com.hhxy.domain.TxlFh;
import com.hhxy.domain.Txlgs;
import com.hhxy.mapper.TxlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class TxlService implements ITxlService {
    @Autowired
    private TxlMapper txlMapper;
    @Override
    public void cf(Txl txl){
        txlMapper.add(txl.getBh(),txl.getXm(),txl.getDh());
    }
    @Override
    public void qsj(String bh) {
        String dh=txlMapper.qsj(bh);
        System.out.println(dh);
    }
    @Override
    public void qdx(String bh) {
       Txl txl= txlMapper.qdx(bh);
        System.out.println(txl);
    }
    @Override
    public void qmap(String bh) {
       Map<String,Object> map=txlMapper.qmap(bh);
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
    @Override
    public void zjmap(Txl txl) {
        Map<String,Object> map=new HashMap<>();
        map.put("bh",txl.getBh());
        map.put("xm",txl.getXm());
        map.put("dh",txl.getDh());
        txlMapper.zjmap(map);
    }
    @Override
    public void zjdx(Txl txl) {
        txlMapper.zjdx(txl);
    }
    @Override
    public void txlfh(String bh) {
        TxlFh txlfh=txlMapper.txlfh(bh);
        System.out.println(txlfh);
    }
    @Override
    public void qlist(String bh) {
        List<Map<String,Object>> list=txlMapper.qlist(bh);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                System.out.println(entry.getKey() + "   " + entry.getValue());
            }
        }
    }

    @Override
    public int txladd(Txl txl) {
        int a= 0;
        try {
            a = txlMapper.txladd(txl);
        } catch (Exception e) {
            a=-1;
        }
        return a;
    }

    @Override
    public Txl cxadd(Txl txl) {
        Txl a= null;
        try {
            a = txlMapper.cxadd(txl);
        } catch (Exception e) {
            a=new Txl();
        }
        return a;
    }

    @Override
    public int cxaddd(Txl txl) {
        int a= 0;
        try {
            a = txlMapper.cxaddd(txl);
        } catch (Exception e) {
            a=-1;
        }
        return a;
    }

    @Override
    public List<Txl> quchu(Txl txl) {
        List<Txl> list= txlMapper.quchu(txl);
        return list;
    }

    @Override
    public void shanchu(Txl txl) {
        txlMapper.shanchu(txl);
    }
}
