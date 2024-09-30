<?php
    $menu = [
            [ 
                "nama" => "Beranda"
            ],
            [ 
                "nama" => "Berita", 
                    "subMenu" => [
                        [ "nama" => "Wisata", 
                        "subMenu" => [
                        [
                            "nama" => "Pantai"
                        ],
                        [ 
                            "nama" => "Gunung"
                        ]
                    ]
                ],
                [ 
                    "nama" => "Kuliner"
                ],
                [
                    "nama" =>"Hiburan"
                ]
            ]
        ],
        [ 
            "nama" => "Tentang"
        ],
        [ 
            "nama" => "Kontak"    
        ],    
    ];

    function tampilkanMenuBertingkat(array $menu){
        echo "<ul>";
        foreach ($menu as $key => $item) {
            echo "<li>{$item['nama']}</li>";
            if (isset($item['subMenu']) ) {
                echo "<ul>";
                tampilkanMenuBertingkat($item['subMenu']);
                echo "</ul>";
            }
        }
        echo "</ul>";
    }

    tampilkanMenuBertingkat($menu);
?>