INSERT INTO tb_user(first_name, last_name, email, password) VALUES('John', 'Doe', 'john@gmail.com', '$2a$12$jYoAYQUY1i.JPrPoVhrJg.30hvqgVY20bhStwsz0VJrBqTshM/y5S');
INSERT INTO tb_user(first_name, last_name, email, password) VALUES('Maria', 'Parker', 'maria@gmail.com', '$2a$12$jYoAYQUY1i.JPrPoVhrJg.30hvqgVY20bhStwsz0VJrBqTshM/y5S');

INSERT INTO tb_role(authority) VALUES('ROLE_ADMIN');
INSERT INTO tb_role(authority) VALUES('ROLE_USER');

INSERT INTO tb_user_role(user_id, role_id) VALUES(1,1);
INSERT INTO tb_user_role(user_id, role_id) VALUES(1,2);
INSERT INTO tb_user_role(user_id, role_id) VALUES(2,2);
