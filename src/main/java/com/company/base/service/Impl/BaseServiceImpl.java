package com.company.base.service.Impl;

import com.company.base.repository.IBaseRepo;
import com.company.base.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements IBaseService {

	@Autowired
	private IBaseRepo base;

	@Override
	public void base() {

	}
}
