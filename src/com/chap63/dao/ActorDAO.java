package com.chap63.dao;
import com.chap63.domain.Actor;
/**
 * ActorDAO�ӿڣ��ṩ������ԱID��ѯ��Ա��Ϣ�ķ���
 * @author Administrator
 *
 */
public interface ActorDAO {
	/**
	 * ������ԱID��ѯ��Ա��Ϣ
	 * @param id ��ԱID
	 * @return  ָ��ID��Actor���� 
	 */
	public Actor  getActorById(int id);
}
