INSERT INTO COLLECTIONS (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME)
VALUES (1, now(), now(), 'trumak', 'trumak', 'Kuchnia chińska');

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Zupa z grzybami', 1);

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Hanoi', 1);

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Ośmiornica', 1);

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Robaki', 1);

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Ryż z warzywami', 1);

INSERT INTO COLLECTIONS (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME)
VALUES (2, now(), now(), 'trumak', 'trumak', 'Kuchnia polska');

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Schabowy z ziemniakami', 2);

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Kapusta z grzybami', 2);

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Gołąbki', 2);

INSERT INTO COLLECTIONS (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME)
VALUES (3, now(), now(), 'trumak', 'trumak', 'Kuchnia śródziemnomorska');

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Owoce morza', 3);

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Pizza', 3);

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Spaghetti', 3);

INSERT INTO COLLECTIONS (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME)
VALUES (4, now(), now(), 'trumak', 'trumak', 'Kuchnia włoska');

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Pizza neapolitanska', 4);

INSERT INTO COLLECTIONS (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME)
VALUES (5, now(), now(), 'trumak', 'trumak', 'Kuchnia francuska');

INSERT INTO RECIPES (ID, CREATION_TIME ,UPDATE_TIME, CREATED_BY, UPDATED_BY, NAME, COLLECTION_ID)
VALUES (NEXTVAL('id_seq'), now(), now(), 'trumak', 'trumak', 'Ragu', 5);