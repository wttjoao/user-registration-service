-- Create the tags table
create table tags
(
    id   bigint auto_increment
        primary key,
    name varchar(255) not null
);


-- Create the user_tags join table
CREATE table user_tags
(
    user_id bigint not null,
    tag_id bigint not null,
    primary key (user_id, tag_id),
    foreign key (user_id) references users (id) on delete cascade,
    foreign key (tag_id) references tags (id) on delete cascade
);

-- ON DELETE CASCADE - se eliminarmos um record na users table, o record associado na user_tags vai ser eliminado