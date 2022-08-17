package id.camelliaalfina.dicoding_submission

object SepatuData {
    private val sepatuNames = arrayOf(
        "Mingyu Shoes",
        "Jeonghan Shoes",
        "Stone Kronikel",
        "Lana Shoes",
        "Casual Shoes",
        "PVN Taeyong",
        "Kelsey",
        "Sneakers white cream",
        "Sneakers canvas",
        "Sneakers white cream"
    )

    private val sepatuDetails = arrayOf(
        "Tinggi Sol : 5 cm. Material Sepatu  : High Quality kulit Sintetis. Material Sole: Karet Non Slip",
        "PVN sneakers adalah sepatu sneakers yang nyaman di gunakan untuk jalan-jalan, untuk kuliah dll. Sneakers merupakan sepatu casual yang menarik untuk dijadi koleksi dengan berbagai jenis dan motif yang beragam. ",
        "THIS IS LANA! THE NO-WORRIES SNEAKERS BY KRONIKEL!. Simply sepatu nyaman untuk keseharian mu, dengan fitur 3-strap yang gak hanya memudahkan pemakaian sepatumu, tapi juga upgrade ootd kamu banget!",
        "THIS IS LANA! THE NO-WORRIES SNEAKERS BY KRONIKEL!. Simply sepatu nyaman untuk keseharian mu, dengan fitur 3-strap yang gak hanya memudahkan pemakaian sepatumu, tapi juga upgrade ootd kamu banget!",
        "SEPATU SNEAKERS WANITA IMPORTd HIGH QUALITY PREMIUM IMPORT 100%. KUALITAS JAMIN BAGUS DAN JAHITAN RAPI. MODEL TERBARU GANTUNGAN DIDEPAN YG UNIK",
        "PVN Official Shop adalah akun resmi PVN Shoes di Platform Shopee Mall. PVN Shoes Desainnya menarik serta bahan yang nyaman buat dipakai. Terima kasih dan Happy shopping :)",
        "Kelsey series sepatu statement pertama dari Kronikel. Kini hadir dengan warna2 keren lainnya lhoo!!. Sepatu ini memberikan kesan Sporty Feminin yang cocok digunakan untuk OOTD kamu sehari-hari.",
        "SEPATU SNEAKERS WANITA IMPORTd HIGH QUALITY PREMIUM IMPORT 100%. KUALITAS JAMIN BAGUS DAN JAHITAN RAPI. MODEL TERBARU GANTUNGAN DIDEPAN YG UNIK",
        "SEPATU SNEAKERS WANITA IMPORTd HIGH QUALITY PREMIUM IMPORT 100%. KUALITAS JAMIN BAGUS DAN JAHITAN RAPI. MODEL TERBARU GANTUNGAN DIDEPAN YG UNIK",
        "SEPATU SNEAKERS WANITA IMPORTd HIGH QUALITY PREMIUM IMPORT 100%. KUALITAS JAMIN BAGUS DAN JAHITAN RAPI. MODEL TERBARU GANTUNGAN DIDEPAN YG UNIK"
    )

    private val sepatuImages = intArrayOf(
        R.drawable.sepatu_1,
        R.drawable.sepatu_2,
        R.drawable.sepatu_3,
        R.drawable.sepatu_4,
        R.drawable.sepatu_5,
        R.drawable.sepatu_6,
        R.drawable.sepatu_7,
        R.drawable.sepatu_8,
        R.drawable.sepatu_9,
        R.drawable.sepatu_10
    )

    val listData: ArrayList<Sepatu>
        get() {
            val list = arrayListOf<Sepatu>()
            for (position in sepatuNames.indices) {
                val sepatu = Sepatu()
                sepatu.name = sepatuNames[position]
                sepatu.detail = sepatuDetails[position]
                sepatu.photo = sepatuImages[position]
                list.add(sepatu)
            }
            return list
        }
}