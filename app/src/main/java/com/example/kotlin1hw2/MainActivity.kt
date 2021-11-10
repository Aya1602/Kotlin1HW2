package com.example.kotlin1hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.kotlin1hw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var images = mutableListOf(
        "https://www.google.com/imgres?imgurl=https%3A%2F%2F1001sovety.ru%2Fwp-content%2Fuploads%2F2017%2F10%2Fmodnyye-trendy-novinki-foto-30.jpg&imgrefurl=https%3A%2F%2F1001sovety.ru%2Fmodnyye-trendy-odezhdy%2F&tbnid=ECh14dkGfGTBqM&vet=12ahUKEwjQ9ImT5o30AhVUyyoKHUHrD2MQMygHegUIARDVAQ..i&docid=pUaNoBVqQxp_lM&w=550&h=687&itg=1&q=фото%20модной%20одежды&client=safari&ved=2ahUKEwjQ9ImT5o30AhVUyyoKHUHrD2MQMygHegUIARDVAQ",
        "https://www.google.com/imgres?imgurl=http%3A%2F%2Fmodnaya-krasivaya.ru%2Fmoda%2F2020%2F09%2Fmodnye-luki-63.jpg&imgrefurl=http%3A%2F%2Fmodnaya-krasivaya.ru%2Fmodnye-luki-2021-2022-foto%2F&tbnid=QeFlWkkVvpfSOM&vet=12ahUKEwjIuPyr5o30AhVBxyoKHeMpDN8QMygKegUIARDbAQ..i&docid=yioD0tJtgqOYNM&w=650&h=812&itg=1&q=модные%20луки&client=safari&ved=2ahUKEwjIuPyr5o30AhVBxyoKHeMpDN8QMygKegUIARDbAQ",
        "https://www.google.com/imgres?imgurl=https%3A%2F%2Fkrasotka.cc%2Fwp-content%2Fuploads%2F2018%2F09%2Ffile-15.jpg&imgrefurl=https%3A%2F%2Fkrasotka.cc%2Fmoda-i-stil%2Fgarderob%2Fmodnye-luki-osen-zima-3&tbnid=QzNFhaiKnYwysM&vet=12ahUKEwjIuPyr5o30AhVBxyoKHeMpDN8QMygJegUIARDZAQ..i&docid=mIFyYpBLrnnV0M&w=1080&h=1192&itg=1&q=модные%20луки&client=safari&ved=2ahUKEwjIuPyr5o30AhVBxyoKHeMpDN8QMygJegUIARDZAQ",
        "https://www.google.com/imgres?imgurl=https%3A%2F%2Flady-glamor.ru%2Fwp-content%2Fuploads%2F2019%2F02%2Fvesna_obraz-2.jpg&imgrefurl=https%3A%2F%2Flady-glamor.ru%2Fmodnye-obrazy-vesna%2F&tbnid=G2-xFw3ZSfXvVM&vet=12ahUKEwjIuPyr5o30AhVBxyoKHeMpDN8QMygcegUIARCEAg..i&docid=PZhea1u0zYT0wM&w=1080&h=1350&itg=1&q=модные%20луки&client=safari&ved=2ahUKEwjIuPyr5o30AhVBxyoKHeMpDN8QMygcegUIARCEAg",
        "https://www.google.com/imgres?imgurl=https%3A%2F%2Fpostila.ru%2Fresize%3Fw%3D660%26src%3D%252Fdata%252Fbd%252F66%252Fef%252Fa9%252Fbd66efa9b41df006c6372bf76854d20c589462d5c1109faabb0db16c62fef791.jpg&imgrefurl=https%3A%2F%2Fpostila.ru%2Fpost%2F70574376&tbnid=bq3HZDbk7Z1zsM&vet=12ahUKEwjIuPyr5o30AhVBxyoKHeMpDN8QMyg_egQIARBq..i&docid=_yJMxwUjK-GcJM&w=660&h=825&itg=1&q=модные%20луки&client=safari&ved=2ahUKEwjIuPyr5o30AhVBxyoKHeMpDN8QMyg_egQIARBq"
    )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener{
            images.add(binding.etImageUrl.text.toString())
        }

        binding.btnRandomImg.setOnClickListener{
            Glide.with(this).load(images.random()).into(binding.ivPhoto)
        }
    }
}