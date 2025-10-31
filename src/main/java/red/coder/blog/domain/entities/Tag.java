package red.coder.blog.domain.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID) 
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;
}
