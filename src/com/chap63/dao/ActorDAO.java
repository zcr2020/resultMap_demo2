package com.chap63.dao;
import com.chap63.domain.Actor;
/**
 * ActorDAO接口，提供按照演员ID查询演员信息的方法
 * @author Administrator
 *
 */
public interface ActorDAO {
	/**
	 * 根据演员ID查询演员信息
	 * @param id 演员ID
	 * @return  指定ID的Actor对象 
	 */
	public Actor  getActorById(int id);
}
