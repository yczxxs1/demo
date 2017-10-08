package mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Emp;

public class MybatisTest {
public static void main(String[] args) throws IOException {
	String resource = "mybatis-config.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession session = sqlSessionFactory.openSession();
	/*Emp e=session.selectOne("User.selectEmp", 33);
	System.out.println(e.getEname());
	List<Emp> list=session.selectList("User.selectAllEmp");
	System.out.print(list);
	e.setEname("ssa");
	int i=session.update("User.updateEmp",e);
	session.commit();
	System.out.println(i);
    session.delete("User.deleteEmp",e);	
	session.commit();*/
	
}
}
