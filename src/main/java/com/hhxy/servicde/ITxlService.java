package com.hhxy.servicde;

import com.hhxy.domain.Txl;

import java.util.List;

public interface ITxlService {
    void cf(Txl txl);

    void qsj(String bh);

    void qdx(String bh);

    void qmap(String bh);

    void zjmap(Txl txl);

    void zjdx(Txl txl);

    void txlfh(String bh);

    void qlist(String bh);

    int txladd(Txl txl);

    Txl cxadd(Txl txl);

    int cxaddd(Txl txl);

    List<Txl> quchu(Txl txl);

    void shanchu(Txl txl);
}
