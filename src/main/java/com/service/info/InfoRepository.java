package com.service.info;

import com.service.info.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends
    JpaRepository<Info, Long> {

}
