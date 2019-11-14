package cn.xdl.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.XdlBankAccount;
import cn.xdl.mapper.XdlBankAccountMapper;
@Service("bankService")
public class XdlBankAccountService {
	@Autowired
	private  XdlBankAccountMapper mapper;
	public XdlBankAccount login(String name,String password) {
		return mapper.findAccountByAcc_noAndAcc_password(name, password);
	}
}
