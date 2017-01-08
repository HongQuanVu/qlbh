
    CREATE TABLE  ROLES  
    (  
    ID NUMBER(*, 0) NOT NULL,  
    ORG_KEY VARCHAR2(30) DEFAULT 'DEFAULT' NOT NULL,  
    SHORT_NAME VARCHAR2(10) NOT NULL,  
    NAME VARCHAR2(40) NOT NULL  
    );  
      
    CREATE TABLE  USER_ROLE_GRANTS  
    (  
    ID NUMBER(*, 0) NOT NULL,  
    USR_ID NUMBER(*, 0) NOT NULL,  
    RLE_ID NUMBER(*, 0) NOT NULL  
    );  
      
    CREATE TABLE  USERS  
    (  
    ID NUMBER(*, 0) NOT NULL,  
    EMAIL_ADDRESS VARCHAR2(240),  
    USERNAME VARCHAR2(240) NOT NULL,  
    ORG_KEY VARCHAR2(30) DEFAULT 'DEFAULT',  
    PASSWORD VARCHAR2(240),  
    DISPLAY_NAME VARCHAR2(240),  
    LOCALE VARCHAR2(10)  
    );  
      
    ALTER TABLE  ROLES  
    ADD CONSTRAINT  RLE_PK PRIMARY KEY  
    ( ID ) ENABLE;  
      
    ALTER TABLE  ROLES  
    ADD CONSTRAINT  RLE_UK1 UNIQUE  
    ( SHORT_NAME,ORG_KEY ) ENABLE;  
      
    ALTER TABLE  USER_ROLE_GRANTS  
    ADD CONSTRAINT  URG_PK PRIMARY KEY  
    ( ID ) ENABLE;  
      
    ALTER TABLE  USER_ROLE_GRANTS  
    ADD CONSTRAINT  URG_UK1 UNIQUE  
    ( RLE_ID, USR_ID ) ENABLE;  
      
    ALTER TABLE  USERS  
    ADD CONSTRAINT  USR_PK PRIMARY KEY  
    ( ID ) ENABLE;  
      
    CREATE SEQUENCE  SEQ INCREMENT BY 1 MAXVALUE 999999999999999999999999999 MINVALUE 1 CACHE 20 ;  
      
    -- Create two users SKING and AHUNOLD  
    insert into  users (ID, EMAIL_ADDRESS, USERNAME, ORG_KEY, PASSWORD, DISPLAY_NAME)  
    select  seq.nextval,'SKING','SKING','DEFAULT','SKING', 'Steven King'  
    from dual  
    where not exists (select '1' from  users where username='SKING');  
      
    insert into  users (ID, EMAIL_ADDRESS, USERNAME, ORG_KEY, PASSWORD, DISPLAY_NAME)  
    select  seq.nextval,'AHUNOLD','AHUNOLD','DEFAULT','AHUNOLD', 'Alexander Hunold'  
    from dual  
    where not exists (select '1' from  users where username='AHUNOLD');  
      
    -- set up two roles: Administrator and User  
    insert into  roles(id, SHORT_NAME, name)  
    select  seq.nextval, 'ADMIN','Administrator'  
    from dual  
    where not exists (select '1' from  roles where short_name='ADMIN');  
      
    insert into  roles(id, SHORT_NAME, name)  
    select  seq.nextval, 'USER','User'  
    from dual  
    where not exists (select '1' from  roles where short_name='USER');  
      
    -- Make Steven King Administrator  
    insert into  user_role_grants (id,rle_id,usr_id)  
    select  seq.nextval, rle.id, usr.id  
    from  roles rle,  users usr  
    where rle.short_name='ADMIN'  
    and usr.username='SKING'  
    and not exists (select '1' from  user_role_grants urg2  
              where urg2.usr_id = usr.id  
              and   urg2.rle_id = rle.id);  
      
    -- Make Alexander Hunold User  
    insert into  user_role_grants (id,rle_id,usr_id)  
    select  seq.nextval, rle.id, usr.id  
    from  roles rle,  users usr  
    where rle.short_name='USER'  
    and usr.username='AHUNOLD'  
    and not exists (select '1' from  user_role_grants urg2  
              where urg2.usr_id = usr.id  
              and   urg2.rle_id = rle.id);  
      
    commit;  