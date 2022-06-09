package com.boratuzun.kotlindersleri.nesnetabanli1

fun main() {
    var f = Odev2()

    //Dereceyi Fahreneit'a çevirme
    var result = f.soru1(30.0)
    println("Fahreneit karşılığı : $result")

    //Dereceyi Fahreneit'a çevirme
    f.soru2(12.0, 28.0)

    //Faktöriyel Hesaplama
    var result2 = f.soru3(5)
    println("Girilen sayının faktöriyeli : $result2")

    //Girilen kelimede belirtilen harften kaç adet olduğunu bulma
    f.soru4("Merhaba Dünya", 'a')

    //Kenar sayısı girilen çokgenin iç açıları toplamı
    var result3 = f.soru5(5)
    println("Kenar sayısı girilen çokgenin iç açıları toplamı : $result3")

    //Maaş hesabı
    var result4 = f.soru6(21)
    println("Hesaplanan Maaş : $result4₺")

    //Kota miktarına göre ücret hesaplama
    var result5 = f.soru7(51)
    println("Kullanılan kotaya göre belirlenen ücret : $result5₺")
}
