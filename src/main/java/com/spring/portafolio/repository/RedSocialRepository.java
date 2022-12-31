
package com.spring.portafolio.repository;

import com.spring.portafolio.model.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository<RedSocial,Long>{
    
}
