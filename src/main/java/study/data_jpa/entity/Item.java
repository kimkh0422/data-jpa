package study.data_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import study.data_jpa.domain.Persistable;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AutoCloseable.class)
@NoArgsConstructor
public class Item implements Persistable<String> {

    @Id
    private String id;

    @CreatedDate
    private LocalDateTime createdDate;

    public Item(String id) {
        this.id = id;
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isNew(){
        return createdDate == null;
    }
}
