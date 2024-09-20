<?php
    $nilaiSiswa = [85, 92, 78, 64, 90, 55, 88, 79, 70, 96];
    $nilaiLulus = [];

    foreach ($nilaiSiswa as $nilai) {
        if ($nilai >= 70) {
            $nilaiLulus[] = $nilai;
        }
    }

    echo "Daftar nilai siswa yang lulus: ".implode(", ", $nilaiLulus);
    echo "<br><br>";

    
    $daftarkaryawan = [ 
        ['Alice', 7], 
        ['Bob', 3],
        ['Charlie', 9],
        ['David', 5],
        ['Eva', 6],
    ];
    $karyawanPengalamanLimaTahun = [];

    foreach ($daftarkaryawan as $karyawan) { 
        if ($karyawan[1] > 5) {
            $karyawanPengalamanLimaTahun[] = $karyawan[0];
        }
    }

    echo "Daftar karyawan dengan pengalaman kerja lebih dari 5 tahun: "
    .implode(", ", $karyawanPengalamanLimaTahun);
    echo "<br><br>";


    
    $daftarNilai = [
        'Matematika' => [ 
            ['Alice', 85], 
            ['Bob', 92],
            ['Charlie', 78],
        ],
        'Fisika' => [
            ['Alice', 90],
            ['Bob', 88],
            ['Charlie', 75],
        ],
        'Kimia' => [
            ['Alice', 92],
            ['Bob', 80],
            ['Charlie', 85],
        ],
    ];
    
    $mataKuliah = "Fisika";
    
    echo "Daftar nilai mahasiswa dalam mata kuliah $mataKuliah: <br>";
    
    foreach ($daftarNilai[$mataKuliah] as $nilai) {
        echo "Nama: {$nilai[0]}, Nilai: {$nilai[1]} <br>";
    }
    echo "<br><br>";


    $nilaiMTKSiswa = [
        ['Alice', 85], 
        ['Bob', 92],
        ['Charlie', 78],
        ['David', 64], 
        ['Eva', 90],
    ];

    foreach ($nilaiMTKSiswa as $nilai) {
        echo "Nilai Matematika {$nilai[0]}: {$nilai[1]} <br>";
    }

    $sum = 0;
    $length = 0;
    foreach ($nilaiMTKSiswa as $nilai) {
        $sum += $nilai[1];
        $length++;
    }
    $mean = $sum / $length;
    echo "Rata-rata Nilai Matematika: $mean <br>";

    echo "Siswa yang nilainya di atas rata-rata: <br>";
    foreach ($nilaiMTKSiswa as $nilai) {
        if ($nilai[1] > $mean) {
            echo "Nilai Matematika {$nilai[0]}: {$nilai[1]} <br>";
        }
    }
?>

