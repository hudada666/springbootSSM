package cn.study.microboot.service.impl;

import cn.study.microboot.dao.IDeptDAO;
import cn.study.microboot.service.IDeptService;
import cn.study.microboot.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "iDeptService")
public class DeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDAO iDeptDAO;

    @Override
    public List<Dept> list() {
        List list1 = iDeptDAO.findAll();
        return list1;
    }
}
