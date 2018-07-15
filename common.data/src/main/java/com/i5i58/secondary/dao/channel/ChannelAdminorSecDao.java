package com.i5i58.secondary.dao.channel;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.i5i58.data.channel.ChannelAdminor;

@Transactional
public interface ChannelAdminorSecDao extends CrudRepository<ChannelAdminor, Long> {

	List<ChannelAdminor> findByAccId(String accId);

	ChannelAdminor findByCIdAndAccId(String cId, String accId);

}