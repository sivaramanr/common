package io.github.sivaramanr.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.sivaramanr.common.types.GenericType;
import io.github.sivaramanr.common.types.StatusType;
import io.github.sivaramanr.common.types.ValueType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericModelBean {

    private String id;

    @NotNull(message = "genericType cannot be null")
    private GenericType genericType;

    private String code;

    @NotEmpty(message = "name cannot be empty")
    private String name;

    private String value;

    @NotNull(message = "valueType cannot be null")
    private ValueType valueType;

    private StatusType status;

    private String description;

    private Integer sortOrder;

    private String parentId;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

}
