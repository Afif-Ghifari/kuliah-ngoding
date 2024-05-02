USE jadwal_perkuliahan;

-- Praktikum 1
-- 1
SELECT * FROM jadwal;
-- 2
SELECT * FROM prodi;
-- 3
SELECT * FROM ruang;
-- 4
SELECT * FROM mk;
-- 5
SELECT * FROM dosen;
-- 6
SELECT * FROM jp;
-- 7
SELECT * FROM kelas;
-- 8
SELECT * FROM hari; 

-- Praktikum 2
-- 1
SELECT deskripsi_ruang FROM ruang
    WHERE nama_ruang = 'LKJ1';

-- 2
SELECT DISTINCT kode_hari 
FROM jadwal;

-- 3
SELECT * FROM ruang
WHERE nama_ruang IN ('RT01','RT10');

-- 4
SELECT * FROM ruang WHERE kode_ruang
BETWEEN '0501' AND '0508';

-- 5
SELECT * FROM dosen 
WHERE nama_dosen LIKE 'E%';

-- 6
SELECT kode_dosen, kode_mk, kode_ruang, kode_hari
FROM jadwal GROUP BY kode_hari;

-- 7
SELECT kode_jp, jp_mulai FROM jp
ORDER BY jp_mulai;

-- 8
SELECT * FROM jadwal 
WHERE kode_hari = '001' 
AND jp_mulai = 1;

-- 9
SELECT kode_hari FROM hari
UNION
SELECT kode_hari FROM jadwal;

-- 10
SELECT kode_hari FROM hari
UNION ALL
SELECT kode_hari FROM jadwal;


-- Praktikum 3
-- 1
SELECT kode_dosen, kode_mk, kode_hari, jp_mulai, jp_selesai
FROM jadwal WHERE jp_selesai
IN (SELECT MAX(jp_selesai) FROM jadwal);

-- 2
SELECT kode_dosen, kode_mk, kode_hari, jp_mulai, jp_selesai
FROM jadwal WHERE jp_selesai < ALL
(SELECT jp_selesai FROM jadwal WHERE jp_selesai = 6);

-- Praktikum 4
-- 1
SELECT AVG(jp_selesai-jp_mulai) FROM jadwal;

-- 2
SELECT MAX(jp_mulai) FROM jadwal;

-- 3
SELECT MIN(jp_selesai) FROM jadwal;

-- 4
SELECT SUM(jp_selesai-jp_mulai) FROM jadwal
WHERE kode_dosen = 'D001';

SELECT * FROM jadwal WHERE kode_dosen = 'D001';

-- 5
SELECT COUNT(kode_ruang) FROM ruang;

-- Tugas
-- No.2 
SELECT * FROM jadwal
    WHERE kode_hari = 004 AND jp_mulai = 3;

-- No. 3
SELECT DISTINCT kode_dosen, kode_hari FROM jadwal 
    WHERE kode_hari = 002;

-- No. 4
SELECT kode_dosen FROM jadwal
WHERE kode_hari = 004
INTERSECT
SELECT kode_dosen FROM dosen
WHERE nama_dosen LIKE 'A%';


SELECT * FROM jadwal;

-- No. 5
SELECT kode_ruang, kode_hari, jp_mulai FROM jadwal
WHERE kode_ruang = 0717 AND  kode_hari = 002
ORDER BY jp_mulai;