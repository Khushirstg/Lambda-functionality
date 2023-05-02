package com.example.lambda.DAO;



  import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.jdbc.core.JdbcTemplate; import
  org.springframework.stereotype.Repository;
  
  import com.example.lambda.entity.stud;
  
  import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.jdbc.core.JdbcTemplate; import
  org.springframework.stereotype.Repository;
  
  import com.example.lambda.entity.stud;
  
  @Repository public class StudDAO {
  
  @Autowired private JdbcTemplate jdbcTemplate;
  
  public List<stud> getAllStudsOver18(int pageNum, int pageSize) { String sql =
  "SELECT firstname, lastname, age, department FROM stud"; return
  jdbcTemplate.query(sql, (rs, rowNum) -> new stud(rs.getString("firstname"),
  rs.getString("lastname"), rs.getInt("age"), rs.getString("department"))); }
  
  }
  
  
 



