package com.example.memo.dto;

import com.example.memo.entity.Memo;
import lombok.Getter;

@Getter

public class MemoRequestDto {

    private Long id;

    private String title;

    private String contents;

}
