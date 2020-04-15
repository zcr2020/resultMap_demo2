package com.chap63.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.chap63.dao.ActorDAO;
import com.chap63.domain.Actor;
import com.chap63.util.MyBatisUtils;
@Repository("actorDao")
public class ActorDAOImpl implements ActorDAO {
	@Override
	public Actor getActorById(int id) {
		SqlSession  sqlSession=MyBatisUtils.getSqlSession();
		Actor  actor=sqlSession.selectOne("com.chap63.mapper.ActorMapper.findActorById", id);
		return actor;
	}

}
