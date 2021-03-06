package com.i5i58.secondary.dao.config;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.i5i58.data.config.AppVersionControl;

@Transactional
public interface AppVersionControlSecDao extends PagingAndSortingRepository<AppVersionControl, String> {

	AppVersionControl findByStatusAndDevice(int status, int device);

}
