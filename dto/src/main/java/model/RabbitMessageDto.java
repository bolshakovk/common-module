package model;

import lombok.Data;


@Data
public class RabbitMessageDto {
    private Long id;
    private MessageType type;
    private String content;
}
