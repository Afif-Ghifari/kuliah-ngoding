/*
 Silahkan membuat studi kasus yang telah mengimplementasikan materi basis data yang 
 telah diajarkan. Meliputi poin-poin dibawah ini: 
 a. Join 
 b. Sorting 
 c. Filtering data 
 d. Subquery 
 f. Grouping 
 g. Operasi Himpunan 
 h. Aggregating 
 */
-- 1 (Join, Sorting, Filtering, Grouping, Subquery)
SELECT doc.judul,
    doc.size_file 'Ukuran',
    doc.tgl_upload 'tanggal upload',
    doc.jenis,
    doc.jenis_tag 'label'
FROM (
        SELECT d.judul,
            d.size_file,
            d.tgl_upload,
            jd.jenis,
            l.jenis_tag
        FROM label_dok ld
            INNER JOIN dokumen d ON d.id_dokumen = ld.id_dokumen
            INNER JOIN jenis_dok jd ON jd.id_Jenis_dok = d.id_Jenis_dok
            INNER JOIN label l ON l.id_label = ld.id_label
    ) AS doc
WHERE doc.judul LIKE 'pengembangan%'
GROUP BY doc.judul,
    doc.jenis_tag
ORDER BY doc.size_file ASC;

-- 2 (Join, Sorting, Filtering, Himpunan, Aggregating)
SELECT label 'id_label',
    COUNT(label) 'Jumlah label'
FROM (
        SELECT id_label AS label
        FROM label
        UNION
        SELECT id_Label AS label
        FROM label_dok
    ) AS labels
WHERE label BETWEEN 4 AND 7
GROUP BY label;