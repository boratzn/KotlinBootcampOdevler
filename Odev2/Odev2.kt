package com.boratuzun.kotlindersleri.nesnetabanli1

class Odev2 {

    fun soru1(derece:Double) : Double {
        val result = (derece*1.8) +32
        return result
    }

    fun soru2(kk:Double, uk:Double) {
        val cevre = (kk + uk) * 2
        println("Dikdörtgenin Çevresi : $cevre")
    }

    fun soru3(sayi:Int) : Int {
        var faktoriyel:Int = 1

        for(i in 1..sayi){
            faktoriyel *= i
        }

        return faktoriyel
    }

    fun soru4(kelime:String, harf:Char) {
        var sayac = 0
        for(ch in kelime){
            if(harf == ch)
                sayac++
        }
        println("$harf harfi kelime içinde $sayac adet bulunmaktadır.")
    }

    fun soru5(kenarSayisi:Int) : Int {
        var acilarToplami = (kenarSayisi - 2) * 180

        return acilarToplami
    }

    fun soru6(calisilanGunSayisi:Int) : Int {
        var calisilanSaat = 8 * calisilanGunSayisi

        if(calisilanSaat > 160){
            return ((calisilanSaat - 160) * 20) + (160 * 10)
        }

        return  calisilanSaat * 10
    }

    fun soru7(kota:Int) : Int {
        var ucret : Int

        if(kota > 50){
            ucret = ((kota - 50) * 4) + 100
            return ucret
        }

        return 100
    }
}
