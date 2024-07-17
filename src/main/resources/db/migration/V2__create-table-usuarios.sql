CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    mensagem VARCHAR(300) NOT NULL,
    data TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(50) NOT NULL,
    usuario_id BIGINT,
    curso VARCHAR(100) NOT NULL,

    PRIMARY KEY (id),

    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);