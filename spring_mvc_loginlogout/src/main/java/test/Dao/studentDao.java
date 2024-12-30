package test.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.beans.student;

public class studentDao 
{
 
	
	JdbcTemplate t1;

	public void setT1(JdbcTemplate t1) {
		this.t1 = t1;
	}


	
	
	public List<student> studentcheck(student s1)
	{
		
		return t1.query("select*from student where sname='"+s1.getSname()+"'",new RowMapper<student>() {

			@Override
			public student mapRow(ResultSet rs, int rowNum) throws SQLException {
			
				student se=new student();
			      se.setSname(rs.getString(2));
				return null;
			}
			
			
			
		} );
	}
	
	
	
	public int registerdata(student s1)
	{
		
		return t1.update("insert into student values('"+s1.getSid()+"','"+s1.getSname()+"','"+s1.getSemail()+"','"+s1.getSpass()+"')");
		
	}

	
	
	
	
	public List<student> checkdata(student s1)
	{
		
		return t1.query("select*from student where semail='"+s1.getSemail()+"' and  spass='"+s1.getSpass()+"'" , new RowMapper<student>() {

			@Override
			public student mapRow(ResultSet rs, int rowNum) throws SQLException {
			
				student se=new student();
				se.setSemail(rs.getString(3));
				se.setSpass(rs.getString(4));
				
				return se;
			}
			
			
			
		});
		
	}




	public int resetpass(student s2)
	{
		return t1.update("update student set spass='"+s2.getSpass()+"' where semail='"+s2.getSemail()+"'");
		
		
	}
	
	
	
	
	
	
}
