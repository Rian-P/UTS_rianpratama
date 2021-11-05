package com.rianpratama.uts2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.cito,"Paket Pemeriksaan Return to Work Bagi Pekerja","klinik cito","Alamat: Jl. Gajahmada 79 Tegal Timur Kota Tegal Kode Pos 52125 Telp/Fax (0283) 353 402 " +
                "Virus Corona atau Severe Accute Respiratory Syndrome Coronavirus 2 (SARS-CoV-2) adalah virus yang menyerang sistem pernapasan. Penyakit karena infeksi virus ini disebut COVID-19. Virus Corona bisa menyebabkan gangguan ringan pada sistem pernapasan, infeksi paru-paru" ))

        data?.add(DataModel(R.drawable.kimia,"Fasilitas Kesehatan, Apotek / Apotik","kimia farma", "Jl. Mayjend Sutoyo No. 44" +
                "Tegal, Jawa Tengah, Indonesi" +
                "Ini Klinik pertama Kimia Farma di eks-Karesidenan Pekalongan tapi apotiknya sudah berjalan tiga tahun. Di klinik ini, kami akan melayani pemeriksaan oleh dokter umum dan semacamnya, tutur Lintang." +
                "Artikel ini telah tayang di TribunJateng.com dengan judul Kimia Farma Resmikan Klinik di Adiwerna Tegal, Pertama di Eks-Karesidenan Pekalongan, https://jateng.tribunnews.com/2018/07/07/kimia-farma-resmikan-klinik-di-adiwerna-tegal-pertama-di-eks-karesidenan-pekalongan."
                ))

        data?.add(DataModel(R.drawable.mitra,"*Praktek Dokter Spesialis Anak" +
                "*Praktek Dokter Spesialis Bedah" +
                "Praktek Dokter Umum" +
                "Praktek Dokter Spesialis Kulit","Klinik Mitra Sehati Tegal", "Mulai 1 November 2021 Klinik Pratama Rawat Inap Mitra Sehati bisa melayani peserta BPJS kesehatan " +

                "Alamat: Jl. KS. Tubun No.65-69, Slerok, Kec. Tegal Tim., Kota Tegal, Jawa Tengah 52192"))

        data?.add(DataModel(R.drawable.mmc,"","Klinik & Apotek MMC", "Ini adalah klinik dan menyediakan obat obatan " +
                "Jl. Aipda KS Tubun No.44 Sel., 52131, Randugunting, Tegal Sel., Kota Tegal, Jawa Tengah 52192, Indonesia "
                ))

        data?.add(DataModel(R.drawable.pramita,"klinik"
                ,"Laboratorium Klinik Pramita Gajahmada", "Tes untuk mendeteksi virus COVID-19 dengan hasil yang terintegrasi sistem PEDULI LINDUNGI. Tersedia beberapa jenis tes seperti PCR, Antigen, dll " +
                "Laboratorium adalah salah satu instalasi di rumah sakit yang merupakan pelayanan penunjang yang bertujuan untuk membantu mendiagnosis penyakit serta dapat membantu melihat resiko penyakit agar dapat diatasi sejak dini "
                ))

        data?.add(DataModel(R.drawable.prodia,"Laboratorium Klinik Prodia didirikan pertama kali di Solo, Jawa Tengah, pada tanggal 7 Mei 1973 oleh beberapa orang idealis berlatar belakang pendidikan farmasi.","laboraterium prodia", "PEMERIKSAAN LABORATORIUM " +
                "Alamat: Jl. Kapten Sudibyo No.136, Kemandungan, Kec. Tegal Bar., Kota Tegal, Jawa Tengah 52131\n" +
                "Jam: " +
                "Tutup ⋅ Buka pukul 06.30" +
                "dengan adonan yang telah ditarik tipis."))

        data?.add(DataModel(R.drawable.cito,"klinik","Klinik As Syifa plus", "jl. Kh. Zaenal Arifin no 26, kota Tegal" +
                "Buka setiap hari 07.00-21.00" +
                "MELAYANI" +
                " RAPID TEST" +
                "VAKSIN INTERNASIONAL & ICV" +
                " SKINCARE" +
                " KHITAN "
                ))


        data?.add(DataModel(R.drawable.mmc,"layanan kesehatan","Klinik Pratama Dan Apotek Werkudoro", "Jl. Werkudoro, Slerok, Kec. Tegal Tim., Kota Tegal, Jawa Tengah 52192 " +
                "Dapatkan informasi dari pakar kesehatan tentang vaksinasi, pertolongan pertama,hingga tips menjalani hidup bahagia dengan kesehatan yang baik "
                ))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("deskripsi", item?.deskripsi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}