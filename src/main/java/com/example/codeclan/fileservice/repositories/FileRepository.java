package com.example.codeclan.fileservice.repositories;

import com.example.codeclan.fileservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class FileRepository extends JpaRepository<File, Long> {
}
