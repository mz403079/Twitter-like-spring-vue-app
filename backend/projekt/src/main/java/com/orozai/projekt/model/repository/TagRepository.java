package com.orozai.projekt.model.repository;

import com.orozai.projekt.model.entity.Post;
import com.orozai.projekt.model.entity.Tag;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
