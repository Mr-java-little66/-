package cn.xdl.mapper;

import org.apache.ibatis.annotations.Param;

import cn.xdl.bean.XdlBankAccount;

public interface XdlBankAccountMapper {
	XdlBankAccount findAccountByAcc_noAndAcc_password(@Param("name")String  name,
	    	 @Param("password")String password);
}
