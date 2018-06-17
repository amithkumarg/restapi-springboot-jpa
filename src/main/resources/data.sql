/**
 Author: AmithKumar
 Model : LNEvent
**/ 

/* Event */
insert into event (event_id, event_code, event_name) values
(1, 'MSCLAMKJ', 'Music Concert Live in Los Angeles with Michael Jackson'),
(2, 'MSCLVTYS', 'Music Concert Live in Vegas with Taylor Swift'),
(3, 'NHL2018', 'National Hockey League Season 2018-19');

/* Seat */
insert into seat (seat_id, venue_code, seat_code, aisle, seat_type) values
/* LA */
(1, 'LASTD', 'A1', true, 'adult'),
(2, 'LASTD', 'A2', false, 'adult'),
(3, 'LASTD', 'A3', false, 'child'),
(4, 'LASTD', 'B1', true, 'adult'),
(5, 'LASTD', 'B2', false, 'adult'),
(6, 'LASTD', 'B3', false, 'adult'),

/* Vegas */
(7, 'LVSTD', '1A', true, 'adult'),
(8, 'LVSTD', '1B', false, 'child'),
(9, 'LVSTD', '1C', false, 'adult'),
(10, 'LVSTD', '2A', true, 'adult'),
(11, 'LVSTD', '2B', false, 'adult'),
(12, 'LVSTD', '2C', false, 'child'),

/* Chicago */
(13, 'CHSTD', 'EA1', true, 'child'),
(14, 'CHSTD', 'EA2', false, 'adult'),
(15, 'CHSTD', 'EA3', false, 'adult'),
(16, 'CHSTD', 'VA1', true, 'child'),
(17, 'CHSTD', 'VA2', false, 'adult'),
(18, 'CHSTD', 'VA3', false, 'adult');

/* Inventory */
insert into inventory (inventory_id, event_id, seat_id, available) values
/* LA */
(1, 1, 1, false),
(2, 1, 2, false),
(3, 1, 3, false),
(4, 1, 4, true),
(5, 1, 5, true),
(6, 1, 6, true),

/* Vegas */
(7, 2, 7, false),
(8, 2, 8, false),
(9, 2, 9, true),
(10, 2, 10, true),
(11, 2, 11, true),
(12, 2, 12, true),

/* Chicago */
(13, 3, 13, true),
(14, 3, 14, false),
(15, 3, 15, false),
(16, 3, 16, true),
(17, 3, 17, true),
(18, 3, 18, true);

/* District & School Data */
INSERT INTO district 
VALUES     (1, 
            'test@gmail.com', 
            '602-911-9110', 
            1, 
            'SampleDist', 
            1, 
            'Demo', 
            '2018-06-17'); 

INSERT INTO school 
VALUES     (1, 
            false, 
            'test@yahoo.com', 
            '602-326-9110', 
            1, 
            'AA', 
            'ZZ', 
            'SchoolOfFun', 
            1, 
            1); 

INSERT INTO school 
VALUES     (2, 
            false, 
            'demo@hotmail.com', 
            '602-549-9110', 
            1, 
            'BB', 
            'YY', 
            'SchoolOfAce', 
            2, 
            1); 