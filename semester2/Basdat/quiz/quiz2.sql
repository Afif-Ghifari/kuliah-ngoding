USE percobaan_join;

-- Silahkan buat sql code untuk menampilkan nama dosen yang bergelar MT dan M.Kom 
-- (Magister Teknik dan Magister Komputer) urutkan berdasarkan abjad paling awal. 
-- Berikan nama judul kolomnya ( “NAMA DOSEN” )

SELECT nama_dosen AS 'NAMA DOSEN' FROM dosen 
    WHERE nama_dosen LIKE '% MT.%' OR nama_dosen LIKE '%M.Kom.%'
    ORDER BY nama_dosen;

-- Silahkan buat SQL Code untuk menghitung jumlah dosen berdasarkan soal nomor 1
SELECT COUNT(nama_dosen) AS 'NAMA DOSEN' FROM dosen 
    WHERE nama_dosen LIKE '% MT.%' OR nama_dosen LIKE '%M.Kom.%';

-- Silahkan buat SQL Code untuk menampilkan data dari tabel prodi dan tabel 
-- kelas dimana output yang diinginkan adalah nama kelas, dan nama prodi. 
-- Urutkan berdasarkan prodi D4 Teknik Informatika terlebih dahulu
SELECT
    k.nama_kelas AS 'nama kelas',
    p.nama_prodi AS 'nama prodi'
FROM
    kelas k
    LEFT OUTER JOIN prodi p ON k.kode_prodi = p.kode_prodi
ORDER BY nama_prodi = 'D4 Teknik Informatika' DESC;

-- Buatlah SQL Code untuk menghitung jumlah kelas di prodi D4 Teknik Informatika

SELECT 
    COUNT(kode_kelas) AS 'JUMLAH KELAS' 
FROM kelas
WHERE kode_prodi = '002';

-- Buatlah SQL Code untuk menampilkan data yang diwarna pink berikut ini. 
--Urutkan berdasarkan hari terkecil terlebih dahulu
SELECT 
    k.nama_kelas, 
    j.kode_jadwal, 
    r.nama_ruang, 
    m.nama_mk, 
    h.nama_hari,
    p.nama_prodi,
    d.nama_dosen, 
    j.jp_mulai, 
    j.jp_selesai
FROM jadwal j
    JOIN dosen d ON j.kode_dosen = d.kode_dosen
    JOIN kelas k ON j.kode_kelas = k.kode_kelas
    JOIN prodi p ON k.kode_prodi = p.kode_prodi
    JOIN mk m ON j.kode_mk = m.kode_mk
    JOIN hari h ON j.kode_hari = h.kode_hari
    JOIN ruang r ON j.kode_ruang = r.kode_ruang
ORDER BY h.kode_hari ASC, j.jp_mulai ASC;

-- Dari SQL code yang diminta pada soal nomor 5, tampilkan jadwal yang 
-- khusus untuk nama dosen Rosa Andrie Asmara, ST., MT., Dr. Eng.

SELECT 
    k.nama_kelas, 
    j.kode_jadwal, 
    r.nama_ruang, 
    m.nama_mk, 
    h.nama_hari,
    p.nama_prodi,
    d.nama_dosen, 
    j.jp_mulai, 
    j.jp_selesai
FROM jadwal j
    JOIN dosen d ON j.kode_dosen = d.kode_dosen
    JOIN kelas k ON j.kode_kelas = k.kode_kelas
    JOIN prodi p ON k.kode_prodi = p.kode_prodi
    JOIN mk m ON j.kode_mk = m.kode_mk
    JOIN hari h ON j.kode_hari = h.kode_hari
    JOIN ruang r ON j.kode_ruang = r.kode_ruang
WHERE d.nama_dosen = 'Rosa Andrie Asmara, ST., MT., Dr. Eng.'
ORDER BY h.kode_hari ASC, j.jp_mulai ASC;

-- Silahkan buat SQL code untuk menampilkan jumlah matakuliah yang diampu 
-- untuk setiap dosen. Kolom yang harus ditampilkan nama dosen, jumlah 
-- matakuliah (Hint: Anda bisa menggunakan perintah groupby berdasar nama
-- dosen dari hasil seleksi nama dosen, nama matakuliah) 
SELECT 
    d.nama_dosen AS 'nama dosen',
    COUNT(j.kode_mk) AS 'jumlah mk'
FROM jadwal j 
    JOIN dosen d ON j.kode_dosen = d.kode_dosen
GROUP BY d.nama_dosen;