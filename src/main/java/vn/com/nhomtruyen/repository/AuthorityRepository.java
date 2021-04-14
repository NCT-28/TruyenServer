package vn.com.nhomtruyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.nhomtruyen.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
