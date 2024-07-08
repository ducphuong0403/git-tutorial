package fa.training.demoSpringBoot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.demoSpringBoot.mapper.DeptMapper;
import fa.training.demoSpringBoot.model.Dept;
import fa.training.demoSpringBoot.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptMapper deptMapper;

	@Override
	public List<Dept> selectAllStudent() {
		// TODO Auto-generated method stub
		return deptMapper.selectAllStudent();
	}

	@Override
	public Dept selectDeptById(int projectId) {
		// TODO Auto-generated method stub
		return deptMapper.selectDeptById(projectId);
	}

}
