-- auto-generated definition
create table exception
(
    uuid           bigserial
        constraint exception_pk
            primary key,
    system_type_id varchar(255) not null,
    method_params  text         not null
);

alter table exception
    owner to postgres;

create unique index exception_uuid_uindex
    on exception (uuid);