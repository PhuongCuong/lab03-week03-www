package fit.iuh.edu.vn.lab03week03.Mapper;

import fit.iuh.edu.vn.lab03week03.entities.Candidate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CandidateMapper implements RowMapper<Candidate> {
    @Override
    public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
        Candidate candidate = new Candidate();
        candidate.setId(rs.getInt("can_id"));
        candidate.setAddress(rs.getString("address"));
        candidate.setName(rs.getString("name"));
        candidate.setEmail(rs.getString("email"));
        candidate.setPhone(rs.getString("phone"));
        return candidate;
    }
}
