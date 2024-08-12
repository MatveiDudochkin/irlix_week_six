package com.irlix.poems.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PoemDto {
    private Long id;
    private String title;
    private String text;
}
