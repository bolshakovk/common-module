-- auto-generated definition
create table debug
(
    uuid           bigserial
        constraint debug_pk
            primary key,
    system_type_id varchar(255) not null,
    method_params  text         not null
);

alter table debug
    owner to postgres;

create unique index debug_uuid_uindex
    on debug (uuid);
