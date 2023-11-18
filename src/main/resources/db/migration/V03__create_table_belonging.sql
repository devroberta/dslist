CREATE TABLE tb_belonging
(
    position INTEGER,
    game_id  BIGINT NOT NULL,
    list_id  BIGINT NOT NULL,
    CONSTRAINT pk_tb_belonging PRIMARY KEY (game_id, list_id)
);

ALTER TABLE tb_belonging
    ADD CONSTRAINT FK_TB_BELONGING_ON_GAME FOREIGN KEY (game_id) REFERENCES tb_game (id);

ALTER TABLE tb_belonging
    ADD CONSTRAINT FK_TB_BELONGING_ON_LIST FOREIGN KEY (list_id) REFERENCES tb_game_list (id);