package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.EmpVO;


@Mapper
public interface EmpMapper {
	
	/**
	 * @Since : 2022. 11. 28.
	 * @Author : mr.Yun
	 * @Return : List<EmpVO>
	 * @Comment : EMP 테이블 전체 조회
	 */
	List<EmpVO> selectEmp();
	
}
