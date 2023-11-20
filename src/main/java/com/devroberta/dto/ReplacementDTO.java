package com.devroberta.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ReplacementDTO {

    @Schema(description = "Id atual do Game a ser movido.")
    private Integer sourceIndex;

    @Schema(description = "Id da posiçao a ser movido o Game.")
    private Integer destinationIndex;

}
