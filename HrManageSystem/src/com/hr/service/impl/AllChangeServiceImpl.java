package com.hr.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hr.entity.Change;
import com.hr.entity.ChangeExample;
import com.hr.entity.Dept;
import com.hr.entity.Emp;
import com.hr.entity.EmpExample;
import com.hr.entity.History;
import com.hr.entity.Job;
import com.hr.entity.JobExample;
import com.hr.entity.QueryExmapleVo;
import com.hr.entity.Staff;
import com.hr.mapper.ChangeEmpMapper;
import com.hr.mapper.ChangeMapper;
import com.hr.mapper.DeptMapper;
import com.hr.mapper.EmpMapper;
import com.hr.mapper.HistoryMapper;
import com.hr.mapper.JobMapper;
import com.hr.mapper.StaffAndDeptAndEmpAndJob;
import com.hr.mapper.StaffMapper;
import com.hr.mapper.TemporaryMapper;
import com.hr.service.AllChangeService;
import com.hr.service.EmpService;

@Service
public class AllChangeServiceImpl implements AllChangeService {

	@Autowired
	public JobMapper jobMapper;
	@Autowired
	public ChangeMapper changeMapper;
	@Autowired
	public TemporaryMapper temporaryMapper;
	@Autowired
	public StaffMapper staffMapper;
	@Autowired
	public ChangeEmpMapper changeEmpMapper;
	@Autowired
	public EmpMapper empMapper;
	@Autowired
	public DeptMapper deptmapper;
	@Autowired
	public HistoryMapper historyMapper;

	public List<Job> selectJoball(Integer deptid) {
		JobExample example = new JobExample();
		JobExample.Criteria criteria = example.createCriteria();
		criteria.andDeptidEqualTo(deptid);

		return jobMapper.selectByExample(example);
	}

	public int addChange(Change change) {
		History history = new History();
		int i = changeMapper.insert(change);
		if (i > 0) {
			int c = jobMapper.nameselect(change.getNewjob());// 查询新的工作岗位的jobid
			int k = jobMapper.nameselect(change.getOldjob());// 查询旧的工作岗位的jobid
			int j = temporaryMapper.tempselect(change.getEmpid());// 查询在temporary表是否有记录
			if (j > 0) {
				temporaryMapper.updatePrimaryKey(change.getEmpid(), c);// 对temporary的jobid属性表进行更新
				staffMapper.updatePrimaryKey(change.getEmpid(), c);// 对staff的jobid属性表进行更新
			} else {
				staffMapper.updatePrimaryKey(change.getEmpid(), c);// 对staff的jobid属性表进行更新
			}
			Integer Newdeptid = deptmapper.Alldeptname(change.getNewdept());// 查找属性为新部门的名字的部门id
			int Staffcount = staffMapper.staffemp(c);// 查找新的jobid的岗位有多少人
			history.setName("管理员");
			history.setType("调入");
			history.setJobid(c);
			history.setDeptid(Newdeptid);
			history.setChangetime(change.getJobtime());
			history.setPeople(Staffcount + 1);
			history.setOldpeople(Staffcount);
			history.setNewpeople(Staffcount + 1);
			historyMapper.insert(history);

			Integer Olddeptid = deptmapper.Alldeptname(change.getOlddept());// 查找旧的jobid的岗位有多少人
			int Staffcount1 = staffMapper.staffemp(k);
			history.setType("调出");
			history.setJobid(k);
			history.setDeptid(Olddeptid);
			history.setPeople(Staffcount1 - 1);
			history.setOldpeople(Staffcount1);
			history.setNewpeople(Staffcount1 - 1);
			historyMapper.insert(history);

		}

		return i;
	}

	public List<Change> selectChange(int pageno, int pagesize,
			QueryExmapleVo query) {

		if (query != null && query.getChange() != null
				&& "".equals(query.getChange().getJobtype())) {
			query.getChange().setJobtype(null);

		}
		if (query != null && query.getChange() != null
				&& "".equals(query.getChange().getDepttype())) {
			query.getChange().setDepttype(null);

		}

		PageHelper.startPage(pageno, pagesize);
		List<Change> list = changeEmpMapper.selectAllChange(query);

		return list;

	}

}
