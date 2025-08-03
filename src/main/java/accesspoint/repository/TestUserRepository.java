package accesspoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import accesspoint.domain.TestUser;

public interface TestUserRepository extends JpaRepository<TestUser, Long>{
    
} 
