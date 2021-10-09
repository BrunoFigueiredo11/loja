create table produto(
id_produto NUMBER,
nome NVARCHAR2(50) NOT NULL,
descricao NVARCHAR2(200) NOT NULL,
preco NUMBER(8,2) NOT NULL,
quantidade NUMBER(20) NOT NULL,
CONSTRAINT id_produto_pk PRIMARY KEY (id_produto)
);

CREATE TABLE usuario(
id_usuario NUMBER,
usuario NVARCHAR2(50) NOT NULL,
senha NVARCHAR2(50) NOT NULL,
CONSTRAINT id_usuario_pk PRIMARY KEY (id_usuario)
);

CREATE SEQUENCE sequence_id
  START WITH 1
  INCREMENT BY 1
  CACHE 1000;
  
INSERT INTO usuario VALUES( sequence_id.nextval,'aequor','aequor');
commit;