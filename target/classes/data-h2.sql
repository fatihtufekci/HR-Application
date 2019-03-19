insert into users values('user1', '{noop}secret', true);
insert into users values('user2', '{noop}secret', true);
insert into users values('user3', '{noop}secret', true);

insert into authorities values('user1', 'ROLE_USER');
insert into authorities values('user2', 'ROLE_USER');
insert into authorities values('user2', 'ROLE_EDITOR');
insert into authorities values('user3', 'ROLE_USER');
insert into authorities values('user3', 'ROLE_EDITOR');
insert into authorities values('user3', 'ROLE_ADMIN');
