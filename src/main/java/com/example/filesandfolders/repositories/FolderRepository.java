package com.example.filesandfolders.repositories;

import com.example.filesandfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
