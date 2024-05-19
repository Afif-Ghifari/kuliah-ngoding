SHOW TABLES;

-- Praktikum 2
SELECT kelas.nama_kelas, prodi.nama_prodi
FROM kelas
INNER JOIN prodi ON kelas.kode_prodi = prodi.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi
FROM kelas k
INNER JOIN prodi p ON p.kode_prodi = k.kode_prodi;

SELECT
    j.kode_jadwal,
    d.nama_dosen,
    k.nama_kelas,
    h.nama_hari
FROM
    jadwal j
    INNER JOIN dosen d ON d.kode_dosen = j.kode_dosen
    INNER JOIN kelas k ON k.kode_kelas = j.kode_kelas
    INNER JOIN hari h ON h.kode_hari = j.kode_hari;

SELECT k.nama_kelas, p.nama_prodi
FROM kelas k
    INNER JOIN prodi p ON p.kode_prodi = k.kode_prodi
WHERE
    k.nama_kelas LIKE '%A';

-- Praktikum 3

SELECT
    k.nama_kelas,
    p.nama_prodi
FROM
    kelas k
    LEFT OUTER JOIN prodi p ON k.kode_prodi = p.kode_prodi;

SELECT
    k.nama_kelas,
    p.nama_prodi
FROM
    kelas k
    LEFT OUTER JOIN prodi p ON k.kode_prodi = p.kode_prodi
WHERE
    p.kode_prodi IS NULL;

SELECT
    k.nama_kelas,
    p.nama_prodi
FROM
    kelas k
    RIGHT OUTER JOIN prodi p ON p.kode_prodi = k.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi
FROM kelas k
    LEFT OUTER JOIN prodi p ON k.kode_prodi = p.kode_prodi
UNION ALL
SELECT k.nama_kelas, p.nama_prodi
FROM kelas k
    RIGHT OUTER JOIN prodi p ON p.kode_prodi = k.kode_prodi;

-- Praktikum 4

SELECT kelas.nama_kelas, prodi.nama_prodi
FROM kelas, prodi
WHERE kelas.kode_prodi = prodi.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi
FROM kelas k, prodi p
WHERE k.kode_prodi = p.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi
FROM kelas k CROSS JOIN prodi p;

SELECT k.nama_kelas, p.nama_prodi
FROM kelas k, prodi p;

-- Tugas

SELECT DISTINCT d.nama_dosen 
    AS 'Dosen Pengampu', m.nama_mk AS 'Nama Matakuliah'
FROM jadwal j
    JOIN dosen d ON j.kode_dosen = d.kode_dosen
    JOIN mk m ON j.kode_mk = m.kode_mk
ORDER BY d.nama_dosen ASC;

SELECT
    r.kode_ruang AS 'Kode Ruang',
    r.nama_ruang AS 'Nama Ruang',
    h.nama_hari AS 'Hari Dipakai',
    jm.jp_mulai AS 'Dari Jam',
    js.jp_selesai AS 'Sampai Jam'
FROM jadwal j
INNER JOIN ruang r ON j.kode_ruang = r.kode_ruang
INNER JOIN hari h ON j.kode_hari = h.kode_hari
INNER JOIN jp jm ON j.jp_mulai = jm.kode_jp
INNER JOIN jp js ON j.jp_selesai = js.kode_jp
WHERE h.nama_hari = 'Selasa';

SELECT d.nama_dosen AS 'Nama Dosen', j.kode_jadwal AS 'Kode Jadwal'
FROM dosen d
LEFT JOIN jadwal j ON d.kode_dosen = j.kode_dosen
WHERE j.kode_dosen IS NULL;

SELECT DISTINCT 
    m.nama_mk AS 'Mata Kuliah', 
    d.nama_dosen AS 'Dosen Pengampu'
FROM jadwal j
RIGHT OUTER JOIN dosen d ON d.kode_dosen = j.kode_dosen
RIGHT OUTER JOIN mk m ON m.kode_mk = j.kode_mk;

SELECT d.nama_dosen, 
    COUNT(j.kode_jadwal) AS 'Jumlah_Jadwal_Mengajar'
FROM dosen d
LEFT JOIN jadwal j ON d.kode_dosen = j.kode_dosen
GROUP BY d.kode_dosen, d.nama_dosen;



