CREATE TABLE tb_game_list
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_tb_game_list PRIMARY KEY (id)
);