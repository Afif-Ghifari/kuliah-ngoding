<?php
   $nilaiNumerik = 92;
   
   if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100) {
    echo "Nilai huruf A";
   } elseif ($nilaiNumerik >= 80 && $nilaiNumerik <= 90) {
    echo "Nilai huruf B";
   } elseif ($nilaiNumerik >= 70 && $nilaiNumerik <= 80) {
    echo "Nilai huruf C";
   } elseif ($nilaiNumerik < 70) {
    echo "Nilai huruf D";
   }
   echo "<br><br>";
   
   $jarakSaatIni = 0;
   $jarakTarget = 500;
   $peningkatanHarian = 30;
   $hari = 0;

   while ($jarakSaatIni<$jarakTarget) {
    $jarakSaatIni += $peningkatanHarian;
    $hari++;
   }
   echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 km";
   echo "<br><br>";

   $jumlahLahan = 10;
   $tanamanPErLahan = 5;
   $buahPerTanaman = 10;
   $jumlahBuah = 0;

   for ($i=0; $i < $jumlahLahan; $i++) { 
    $jumlahBuah += ($tanamanPErLahan * $buahPerTanaman);
   }
   echo "Jumlah buah yang akan dipanen adalah: $jumlahBuah";
   echo "<br><br>";

   $skorUjian = [85, 92, 78, 96, 88];
   $totalSkor = 0;

   foreach ($skorUjian as $skor) {
    $totalSkor += $skor;
   }
   echo "Total skor ujian adalah: $totalSkor";
   echo "<br><br>";

   $nilaiSiswa = [85,92,58,64,90,55,88,79,70,96];

   foreach ($nilaiSiswa as $nilai) {
    if ($nilai < 60) {
        echo "Nilai: $nilai (tidak lulus)<br>";
        continue;
    }
    echo "Nilai: $nilai (lulus)<br>";
   }
   echo "<br><br>";

   $nilaiSiswa2 = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];
   $hasilHitung = 0;

   foreach ($nilaiSiswa2 as $nilai) {
    if ($nilai > 71 && $nilai < 91) {
        $hasilHitung += $nilai;
    }
   }
   echo "Total skor ujian adalah: $hasilHitung";
   echo "<br><br>";

   $harga = 120000;
   $diskon = 0.20;
   $total = $harga - ($harga * $diskon);
   echo "Total belanja: $total";
   echo "<br><br>";


   $poin = [100, 150, 100, 200, 50];
   $totalPoin = 0;
   
   
   for ($i=0; $i < 5 ; $i++) { 
       $totalPoin += $poin[$i];
    }
    echo "Total poin pemain adalah: $totalPoin <br>";
    echo "Apakah pemain mendapatkan hadiah tambahan? <br>";
    if ($totalPoin > 500) {
        echo "Pemain mendapatkan hadiah tambahan";
    } else {
        echo "Pemain tidak mendapatkan hadiah tambahan";
    }
    
?>