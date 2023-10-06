package fit.iuh.edu.vn.lab03week03.dao;

import fit.iuh.edu.vn.lab03week03.Mapper.CandidateMapper;
import fit.iuh.edu.vn.lab03week03.entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Component
public class CandidateDao implements ClassDao<Candidate,Long>{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

//    public CandidateDao(DataSource dataSource) {
//        jdbcTemplate = new JdbcTemplate(dataSource);
//
//    }
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);

    }

    @Override
    public boolean update(Candidate entity, Long aLong) {
        String sql = "update candidate set address = ?,email = ?,name = ?,phone = ? where can_id = ?";
        int row = jdbcTemplate.update(sql,entity.getAddress(),entity.getEmail(),entity.getName(),entity.getPhone(),aLong);
        if(row >0)
            return true;
        return false;
    }

    @Override
    public boolean delete(Long aLong) {
        return false;
    }

    @Override
    public boolean insert(Candidate entity) {
        String sql = "insert into candidate (address,email,name,phone) values (?,?,?,?)";
        int row = jdbcTemplate.update(sql, entity.getAddress(), entity.getEmail(), entity.getName(), entity.getPhone());
        if(row >0)
            return true;
        return false;
    }

    @Override
    public List<Candidate> findAll() {
        String sql = "select * from candidate";
        return  jdbcTemplate.query(sql,new CandidateMapper());
    }

    @Override
    public Candidate findById(Long aLong) {
        String sql = "select * from candidate where can_id = ?";
        return jdbcTemplate.queryForObject(sql,new CandidateMapper(),aLong);
    }
}
