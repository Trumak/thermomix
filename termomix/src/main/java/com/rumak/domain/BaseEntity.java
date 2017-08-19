package com.rumak.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * Created by tomasz on 25.03.17.
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final String ID_SEQ = "id_seq";
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = ID_SEQ, sequenceName = ID_SEQ, allocationSize = 200)
    @GeneratedValue(generator = ID_SEQ, strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CREATION_TIME", nullable = false)
    private LocalDateTime creationTime;

    @Column(name = "UPDATE_TIME", nullable = false)
    private LocalDateTime lastUpdateTime;

    @Column(name = "CREATED_BY")
    @Size(max = 30)
    private String createdBy;

    @Column(name = "UPDATED_BY")
    @Size(max = 30)
    private String updatedBy;


    @PrePersist
    protected void prePersist() {
        this.creationTime = LocalDateTime.now();
        this.lastUpdateTime = LocalDateTime.now();
    }

    @PreUpdate
    protected void preUpdate() {
        this.lastUpdateTime = LocalDateTime.now();
    }
}
