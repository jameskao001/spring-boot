package com.example.demo.repository;

import com.example.demo.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author James Kao on 2018/12/5
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
