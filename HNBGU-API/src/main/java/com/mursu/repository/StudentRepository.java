package com.mursu.repository;

        import com.mursu.model.Students;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Students, Integer> {

    public Students findByEmailId(String email);

    public Students findByEmailIdAndPassword(String email, String password);
}
