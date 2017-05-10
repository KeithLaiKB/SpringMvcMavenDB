package com.schoolinformationmanagementsystem.myservice.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolinformationmanagementsystem.model.Major;
import com.schoolinformationmanagementsystem.myrepository.MajorRepository;
import com.schoolinformationmanagementsystem.myservice.MajorService;


//you'd better write the name of interface ,which could make the code be easy to read,though you can don't write it
@Service(value = "MajorService")
public class MajorServiceImpl implements MajorService{
	
	@Autowired(required=true)
    private  MajorRepository majorRepository;
  //  private final StudentMapper studentMapper;

	@Override
	public List<Major> findAllMajors() {
		// TODO Auto-generated method stub
		return majorRepository.findAllMajors();
	}

	@Override
	public int addMajor(Major major) {
		// TODO Auto-generated method stub
		return majorRepository.addMajor(major);
	}

	@Override
	public Major findMajorById(int majorId) {
		// TODO Auto-generated method stub
		return majorRepository.findMajorById(majorId);
	}

	@Override
	public Integer countAllMajorListNum() {
		// TODO Auto-generated method stub
		return majorRepository.countAllMajorListNum();
	}

	@Override
	public Map<String,Object> findPartialMajorListBySpecifiedPageNo(int pageNo) {
		// TODO Auto-generated method stub
		//
		List<Major> majorList=null;
		Map<String,Integer> inputMap=new HashMap<String,Integer>();
		Map<String,Object> returnMap=new HashMap<String,Object>();
		//
		//
		int totalRecordNum=-1;
		int totalPageNum=-1;
		//
		//
		int recordNumEachPage=2;
		int stRowId=-1;
		//
		//
		//
		//get the partial major list
		//nextIndex=						indexBefore-1
		//nextIndex=(thePageBefore*recordNumEachPage)+1-1
		stRowId=((pageNo-1)*recordNumEachPage)+1-1;
		//
		//
		inputMap.put("stRowId",stRowId);
		inputMap.put("recordNum",recordNumEachPage);
		//
		majorList=majorRepository.findPartialMajorListByStRowIdAndRecordNum(inputMap);
		//
		//
		//
		//
		//get the totalPageNum
		//use the method in this class
		totalRecordNum=this.countAllMajorListNum();
		if(totalRecordNum%recordNumEachPage!=0)
		{
			// 5 record 5/2+1=3 page
			totalPageNum=totalRecordNum/recordNumEachPage+1;
		}
		else if(totalRecordNum%recordNumEachPage==0)
		{
			// 5 record 4/2+0=3 page
			totalPageNum=totalRecordNum/recordNumEachPage;
		}
		//
		//
		//
		//
		//put the majorList and totalPageNum into a map
		returnMap.put("majorList", majorList);
		returnMap.put("totalPageNum",totalPageNum);
		returnMap.put("pageNo", pageNo);
		//
		//
		return returnMap;
	}





 /*   @Autowired
    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        //this.studentMapper=studentMapper;
        
    }*/
	




}
