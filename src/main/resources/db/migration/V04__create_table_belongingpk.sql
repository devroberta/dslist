CREATE TABLE tb_belongingpk
(
    game_id BIGINT,
    list_id BIGINT
);

ALTER TABLE tb_belongingpk
    ADD CONSTRAINT FK_TB_BELONGINGPK_ON_GAME FOREIGN KEY (game_id) REFERENCES tb_game (id);

ALTER TABLE tb_belongingpk
    ADD CONSTRAINT FK_TB_BELONGINGPK_ON_LIST FOREIGN KEY (list_id) REFERENCES tb_game_list (id);