package com.project.moviecatalogue;

import java.util.ArrayList;

public class DataMovie {
            public static String[][] data = new String[][]{
                    {"Joker",
                    "Kisah asli Joker yang belum pernah ada sebelumnya di layar lebar.\n" +
                    "\n" +
                    "Berkisah tentang sosok komedian gagal, Arthur Fleck (Joaquin Phoenix), pria yang diabaikan oleh masyarakat dan berubah menjadi penjahat yang sangat keji.",
                    "4 Oktober 2019",
                    "https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg"},

                    {"Frozen 2",
                            "3 tahun sudah berlalu sejak kejadian di film sebelumnya. Elsa (Idina Menzel) mulai mendengar suara aneh dari Utara yang memanggil dirinya. Ia bersama adiknya Anna, Kristoff, Olaf dan Sven melakukan perjalanan ke kampung halaman mereka Arendelle untuk menemukan asal muasal kekuatan ajaib Elsa dan juga menyelamatkan kerajaan mereka.",
                            "20 November 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2017/04/poster-frozen-2.jpg"},

                    {"The Snow Queen: Mirrorlands",
                            "Raja yang berkuasa hampir saja kehilangan seluruh kelurganya karena kejahatan Ratu Salju. Raja tersebut berhasil menemukan cara untuk melarang semua sihir diseluruh dunia dan menangkap semua yang berkekuatan sihir di Mirrorlands. Satu-satunya yang bisa menyelamatkan mereka adalah Gerda yang dalam petualangannya dibantu oleh Trolls, bajak laut dan bahkan Ratu Salju.",
                            "08 November 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2019/11/poster-the-snow-queen.jpg"},

                    {"Charlie's Angels",
                            "Charlie's Angels selalu melakukan tugas pengamanan dan investigasi untuk klien mereka. Sekarang agensi tersebut mengembangkan sayapnya ke dunia International dengan wanita-wanita terlatih dan pintar dari seluruh dunia. Beberapa Angels dan beberapa Bosley menyelesaikan misi-misi berbahaya dari seluruh dunia. Ketika seorang insinyur muda membongkar teknologi berbahaya, semua Angels dipanggil untuk mengatasinya.",
                            "13 November 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2017/05/poster-charlies-angels.jpg"},

                    {"Mistress of Evil",
                            "5 tahun setelah kejadian difilm sebelumnya, Maleficent (Angelina Jolie) kini hidup damain sebagai pelindung kerajaan Moor. Tetapi ketika Pangeran Phillip (Harris Dickinson) melamar Putri Aurora (Elle Fanning) dan ternyata ia menerimanya semua menjadi berubah. Ibu Phillip yaitu Ratu Ingrith (Michelle Pfeiffer) berencana memanfaatkan pernikahan tersebut untuk memisahkan manusia dan peri untuk selamanya.",
                            "16 Oktober 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2019/10/poster-maleficent.jpg"},

                    {"The Addams Family",
                            "Keluarga misterius dan mengerikan yaitu Addams Family sedang bersiap-siap kedatangan kerabat mereka yang lebih mengerikan dari mereka. Tetapi masalah mulai timbul ketika seseorang bernama Margaux Needler ingin menjual semua rumah di lingkungannya dan rumah keluarga Addams adalah salah satunya yang masih ada.",
                            "25 Oktober 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2019/10/poster-the-addams.jpg"},

                    {"Abominable",
                            "Ketika seorang remaja bernama Yi (Chole Bennet) menemukan Yeti di atap apartemennya di Shanghai ia menamainya dengan Everest. Ia dan teman-temannya melakukan perjalanan ketitik tertinggi di bumi agar Everest bisa bertemu dengan keluarganya. Tetapi mereka mereka diburu juga oleh Burnish (Eddie Izzard) orang kaya yang ingin menangkap Yeti tersebut.",
                            "04 Oktober 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2019/09/poster-abominable.jpg"},

                    {"The Informer",
                            "Mantan penjahat dan mantan pasukan khusus Pete Koslow (Joel Kinnaman) direkrut oleh FBI. Ia direkrut untuk menangkap kriminal paling berbahaya di New York. Ketika seorang polisi yang menyamar terbunuh, Pete terjebak diantara para mafia dan FBI dan kini ia harus masuk penjara lagi. Sekarang ia harus berusaha kabur dan mengalahkan gembong kriminal untuk menyelamatkan dirinya dan keluarganya.",
                            "11 Oktober 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2019/09/poster-the-informer.jpg"},

                    {"Zombieland: Double Tap",
                            "Bertahun-tahun setelah kejadian difilm pertamanya. Columbus (Jesse Eisenberg), Tallahassee (Woody Harrelson), Wichita (Emma Stone) dan Little Rock (Abigail Breslin) pergi ke pusat Amerika dimana mereka berhadapan dengan Zombie, dan bertemu orang-orang yang selamat lainnya.",
                            "19 Oktober 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2019/10/poster-zombieland.jpg"},

                    {"Love is a Bird",
                            "Seorang fotografer ternama Darma (Bront Palarae) sedang mengunjungi Yogyakarta dan ia bertemu Naira (Ibel Tenny) yang merupakan penari. Darma selalu mengikuti Naira hingga mendapatkan perhatiannya, dan ketika hubungan Naira dengan kekasihnya tidak berjalan baik, Naira mencari Darma untuk membawanya ke Jakarta.",
                            "14 November 2019",
                            "https://www.bioskoptoday.com/wp-content/uploads/2019/11/poster-love-is-a-bird.jpg"},


            };
    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            Movie movie = new Movie();
            movie.setName(aData[0]);
            movie.setDeskripsi(aData[1]);
            movie.setWaktu(aData[2]);
            movie.setPhoto(aData[3]);
            list.add(movie);
        }
        return list;
    }
}
