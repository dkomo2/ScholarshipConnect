package com.dkomo2.scholarshipconnect

import com.dkomo2.scholarshipconnect.data.ScholarshipRepository
import com.dkomo2.scholarshipconnect.data.SchoolRepository
import com.dkomo2.scholarshipconnect.data.randomSchools
import com.dkomo2.scholarshipconnect.model.Scholarship
import com.dkomo2.scholarshipconnect.model.School

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ScholarshipConnectApplication {
    @Bean
    fun init(schools: SchoolRepository, scholarships: ScholarshipRepository) = CommandLineRunner {
        schools.save(listOf(School("Adirondack Community College", 43.3540, -73.6550, "http://www.sunyacc.edu/"),
                School("Albany, University at", 42.6849, -73.8252, "http://www.albany.edu/"),
                School("Alfred State College", 42.2552, -77.7947, "http://www.alfredstate.edu/"),
                School("Alfred University, NYS College of Ceramics at", 42.2533, -77.7875, "http://www.alfred.edu/college-of-ceramics/"),
                School("Baruch College", 40.74019910000001, -73.98337449999997, "http://www.baruch.cuny.edu/"),
                School("Binghamton University", 42.0893, -75.9697, "http://www.binghamton.edu/"),
                School("Borough of Manhattan Community College", 40.7187801, -74.01187770000001, "http://www.bmcc.cuny.edu/j2ee/index.jsp"),
                School("Brockport, State University College at", 43.2100, -77.9507, "https://www.brockport.edu/"),
                School("Bronx Community College", 40.85648190000001, -73.91057999999998, "http://www.bcc.cuny.edu/"),
                School("Brooklyn College", 40.63099489999999, -73.95441240000002, "http://www.brooklyn.cuny.edu/web/home.php"),
                School("Buffalo, University at", 43.0008, -78.7890, "http://www.buffalo.edu/"),
                School("Buffalo State College", 42.9336, -78.8821, "http://suny.buffalostate.edu/"),
                School("Canton, College of Technology at", 44.6033751, -75.18384420000001, "http://www.canton.edu/"),
                School("Cayuga Community College", 42.943276, -76.543026, "http://www.cayuga-cc.edu/"),
                School("Clinton Community College", 44.64819199999999, -73.439933, "http://www.clinton.edu/"),
                School("Cobleskill, College of Agriculture & Technology at", 42.67254440000001, -74.498087, "http://www.cobleskill.edu/home.asp"),
                School("College of Staten Island", 40.6018152, -74.14849040000001, "http://www.csi.cuny.edu/"),
                School("Columbia-Greene Community College", 42.2176509, -73.81868800000001, "http://www.sunycgcc.edu/"),
                School("Corning Community College", 42.117514, -77.07234199999999, "https://www.corning-cc.edu/"),
                School("Cortland, State University College at", 42.5918072, -76.19737450000002, "http://www2.cortland.edu/home/"),
                School("Delhi, College of Technology at", 42.2704551, -74.92411279999999, "http://www.delhi.edu/"),
                School("Downstate Medical Center", 40.6552459, -73.94573400000002, "http://www.downstate.edu/"),
                School("Dutchess Community College", 41.7222178, -73.90678960000002, "http://www.sunydutchess.edu/"),
                School("Empire State College", 40.7803909, -73.5781958, "https://www.esc.edu/"),
                School("Environmental Science and Forestry, College of", 43.0344612, -76.1369148, "http://www.esf.edu/"),
                School("Erie Community College", 42.96016399999999, -78.72360700000002, "https://www.ecc.edu/"),
                School("Farmingdale State College", 40.7525499, -73.42873880000002, "https://www.farmingdale.edu/"),
                School("Fashion Institute of Technology", 40.74748400000001, -73.99508200000002, "http://www.fitnyc.edu/"),
                School("Finger Lakes Community College", 42.8671792, -77.2410241, "http://www.flcc.edu/"),
                School("Fredonia, State University College at", 42.4540996, -79.3349581, "http://home.fredonia.edu/"),
                School("Fulton-Montgomery Community College", 42.98302049999999, -74.29528549999998, "http://www.fmcc.edu/why-fm/"),
                School("Genesee Community College", 43.0158611, -78.140445, "http://www.genesee.edu/"),
                School("Geneseo, State University College at", 42.796092, -77.8237029, "https://www.geneseo.edu/"),
                School("Guttman Community College", 40.75290080000001, -73.98403840000003, "http://guttman.cuny.edu/"),
                School("Herkimer Community College", 43.03239979999999, -75.00635269999998, "http://www.herkimer.edu/"),
                School("Hostos Community College", 40.818265, -73.92814450000003, "http://www.hostos.cuny.edu/"),
                School("Hudson Valley Community College", 42.6961586, -73.68814629999997, "http://www.hvcc.edu/"),
                School("Hunter College", 40.76854060000001, -73.96462509999998, "http://www.hunter.cuny.edu/main/"),
                School("Jamestown Community College", 42.1159682, -79.22008729999999, "http://www.sunyjcc.edu/"),
                School("Jefferson Community College", 43.99223099999999, -75.93469099999999, "http://www.sunyjefferson.edu/"),
                School("John Jay College of Criminal Justice", 40.7703931, -73.98849949999999, "http://www.jjay.cuny.edu/"),
                School("Kingsborough Community College", 40.5785218, -73.93468969999998, "http://www.kbcc.cuny.edu/Pages/default.aspx"),
                School("LaGuardia Community College", 40.7432143, -73.93397340000001, "http://www.laguardia.edu/home/Default.aspx"),
                School("Lehman College", 40.87331830000001, -73.8941395, "http://www.lehman.cuny.edu/"),
                School("Macaulay Honors College", 40.7346008, -73.81851699999999, "http://macaulay.cuny.edu/"),
                School("Maritime College", 40.8091766, -73.80113690000002, "http://www.sunymaritime.edu/"),
                School("Medgar Evers College", 40.6664998, -73.9575858, "http://www.mec.cuny.edu/"),
                School("Mohawk Valley Community College", 43.07700699999999, -75.21821699999998, "http://www.mvcc.edu/"),
                School("Monroe Community College", 43.1013617, -77.6102381, "http://www.monroecc.edu/"),
                School("Morrisville State College", 42.8911782, -75.6412775, "http://www.morrisville.edu/"),
                School("Nassau Community College", 40.72975909999999, -73.59238119999998, "http://www.ncc.edu/"),
                School("New Paltz, State University College at", 41.7385417, -74.08524499999999, "http://www.newpaltz.edu/"),
                School("New York City College of Technology", 40.6955339, -73.98745889999998, "http://www.citytech.cuny.edu/"),
                School("Niagara County Community College", 43.1471961, -78.87724459999998, "http://www.niagaracc.suny.edu/"),
                School("North Country Community College", 44.3188396, -74.12112660000003, "http://www.nccc.edu/"),
                School("Old Westbury, State University College at", 40.7959845, -73.57266340000001, "https://www.oldwestbury.edu/"),
                School("Oneonta, State University College at", 42.465096, -75.06515100000001, "http://suny.oneonta.edu/"),
                School("Onondaga Community College", 43.00335370000001, -76.19673840000002, "http://www.sunyocc.edu/"),
                School("Orange County Community College", 41.43861639999999, -74.42610430000002, "http://www.sunyorange.edu/"),
                School("Oswego, State University College at", 43.450851, -76.54343799999998, "https://www.oswego.edu/"),
                School("Plattsburgh, State University College at", 44.6930943, -73.46669279999998, "http://web.plattsburgh.edu/"),
                School("Potsdam, State University College at", 44.6643102, -74.9761059, "http://www.potsdam.edu/"),
                School("Purchase, State University College at", 41.0466485, -73.69776609999997, "https://www.purchase.edu/"),
                School("Queensborough Community College", 40.75547069999999, -73.75699179999998, "http://www.qcc.cuny.edu/"),
                School("Queens College", 40.7362689, -73.81613419999996, "http://www.qc.cuny.edu/Pages/home.aspx"),
                School("Rockland Community College", 41.1334696, -74.09022600000003, "http://www.sunyrockland.edu/"),
                School("Schenectady County Community College", 42.81472, -73.94943, "http://sunysccc.edu/"),
                School("School of Professional Studies", 40.7483743, -73.99008300000003, "https://sps.cuny.edu/"),
                School("Stony Brook University", 40.9123761, -73.12338890000001, "http://www.stonybrook.edu/"),
                School("Suffolk County Community College", 40.8469782, -73.05385990000002, "http://www.sunysuffolk.edu/"),
                School("Sullivan County Community College", 41.76389699999999, -74.66886199999999, "http://sunysullivan.edu/"),
                School("SUNY Broome Community College", 42.1358, -75.9089, "https://www1.sunybroome.edu/"),
                School("SUNY Polytechnic Institute", 43.1355755, -75.22989150000001, "https://sunypoly.edu/"),
                School("The City College of New York", 40.8200471, -73.94927239999998, "https://www.ccny.cuny.edu/"),
                School("Tompkins Cortland Community College", 42.59553079999999, -76.17968710000002, "http://www.tompkinscortland.edu/"),
                School("Ulster County Community College", 41.851499, -74.12899900000002, "http://www.sunyulster.edu/"),
                School("Upstate Medical University", 43.0425431, -76.13969429999997, "http://www.upstate.edu/"),
                School("Westchester Community College", 41.0635793, -73.7913921, "http://www.sunywcc.edu/"),
                School("York College", 40.70162570000001, -73.79677349999997, "http://www.york.cuny.edu/")))

        for (i in 0..99) {
            scholarships.save(Scholarship(name = "Scholarship $i", description = "Description $i", applicableSchools = randomSchools(schools)))
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(ScholarshipConnectApplication::class.java, *args)
}