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
        schools.save(listOf(School("Adirondack Community College", 43.3540, -73.6550),
                School("Albany, University at", 42.6849, -73.8252),
                School("Alfred State College", 42.2552, -77.7947),
                School("Alfred University, NYS College of Ceramics at", 42.2533, -77.7875),
                School("Baruch College", 40.74019910000001, -73.98337449999997),
                School("Binghamton University", 42.0893, -75.9697),
                School("Borough of Manhattan Community College", 40.7187801, -74.01187770000001),
                School("Brockport, State University College at", 43.2100, -77.9507),
                School("Bronx Community College", 40.85648190000001, -73.91057999999998),
                School("Brooklyn College", 40.63099489999999, -73.95441240000002),
                School("Buffalo, University at", 43.0008, -78.7890),
                School("Buffalo State College", 42.9336, -78.8821),
                School("Canton, College of Technology at", 44.6033751, -75.18384420000001),
                School("Cayuga Community College", 42.943276, -76.543026),
                School("Clinton Community College", 44.64819199999999, -73.439933),
                School("Cobleskill, College of Agriculture & Technology at", 42.67254440000001, -74.498087),
                School("College of Staten Island", 40.6018152, -74.14849040000001),
                School("Columbia-Greene Community College", 42.2176509, -73.81868800000001),
                School("Corning Community College", 42.117514, -77.07234199999999),
                School("Cortland, State University College at", 42.5918072, -76.19737450000002),
                School("Delhi, College of Technology at", 42.2704551, -74.92411279999999),
                School("Downstate Medical Center", 40.6552459, -73.94573400000002),
                School("Dutchess Community College", 41.7222178, -73.90678960000002),
                School("Empire State College", 40.7803909, -73.5781958),
                School("Environmental Science and Forestry, College of", 43.0344612, -76.1369148),
                School("Erie Community College", 42.96016399999999, -78.72360700000002),
                School("Farmingdale State College", 40.7525499, -73.42873880000002),
                School("Fashion Institute of Technology", 40.74748400000001, -73.99508200000002),
                School("Finger Lakes Community College", 42.8671792, -77.2410241),
                School("Fredonia, State University College at", 42.4540996, -79.3349581),
                School("Fulton-Montgomery Community College", 42.98302049999999, -74.29528549999998),
                School("Genesee Community College", 43.0158611, -78.140445),
                School("Geneseo, State University College at", 42.796092, -77.8237029),
                School("Guttman Community College", 40.75290080000001, -73.98403840000003),
                School("Herkimer Community College", 43.03239979999999, -75.00635269999998),
                School("Hostos Community College", 40.818265, -73.92814450000003),
                School("Hudson Valley Community College", 42.6961586, -73.68814629999997),
                School("Hunter College", 40.76854060000001, -73.96462509999998),
                School("Jamestown Community College", 42.1159682, -79.22008729999999),
                School("Jefferson Community College", 43.99223099999999, -75.93469099999999),
                School("John Jay College of Criminal Justice", 40.7703931, -73.98849949999999),
                School("Kingsborough Community College", 40.5785218, -73.93468969999998),
                School("LaGuardia Community College", 40.7432143, -73.93397340000001),
                School("Lehman College", 40.87331830000001, -73.8941395),
                School("Macaulay Honors College", 40.7346008, -73.81851699999999),
                School("Maritime College", 40.8091766, -73.80113690000002),
                School("Medgar Evers College", 40.6664998, -73.9575858),
                School("Mohawk Valley Community College", 43.07700699999999, -75.21821699999998),
                School("Monroe Community College", 43.1013617, -77.6102381),
                School("Morrisville State College", 42.8911782, -75.6412775),
                School("Nassau Community College", 40.72975909999999, -73.59238119999998),
                School("New Paltz, State University College at", 41.7385417, -74.08524499999999),
                School("New York City College of Technology", 40.6955339, -73.98745889999998),
                School("Niagara County Community College", 43.1471961, -78.87724459999998),
                School("North Country Community College", 44.3188396, -74.12112660000003),
                School("Old Westbury, State University College at", 40.7959845, -73.57266340000001),
                School("Oneonta, State University College at", 42.465096, -75.06515100000001),
                School("Onondaga Community College", 43.00335370000001, -76.19673840000002),
                School("Orange County Community College", 41.43861639999999, -74.42610430000002),
                School("Oswego, State University College at", 43.450851, -76.54343799999998),
                School("Plattsburgh, State University College at", 44.6930943, -73.46669279999998),
                School("Potsdam, State University College at", 44.6643102, -74.9761059),
                School("Purchase, State University College at", 41.0466485, -73.69776609999997),
                School("Queensborough Community College", 40.75547069999999, -73.75699179999998),
                School("Queens College", 40.7362689, -73.81613419999996),
                School("Rockland Community College", 41.1334696, -74.09022600000003),
                School("Schenectady County Community College", 42.81472, -73.94943),
                School("School of Professional Studies", 40.7483743, -73.99008300000003),
                School("Stony Brook University", 40.9123761, -73.12338890000001),
                School("Suffolk County Community College", 40.8469782, -73.05385990000002),
                School("Sullivan County Community College", 41.76389699999999, -74.66886199999999),
                School("SUNY Broome Community College", 42.1358, -75.9089),
                School("SUNY Polytechnic Institute", 43.1355755, -75.22989150000001),
                School("The City College of New York", 40.8200471, -73.94927239999998),
                School("Tompkins Cortland Community College", 42.59553079999999, -76.17968710000002),
                School("Ulster County Community College", 41.851499, -74.12899900000002),
                School("Upstate Medical University", 43.0425431, -76.13969429999997),
                School("Westchester Community College", 41.0635793, -73.7913921),
                School("York College", 40.70162570000001, -73.79677349999997)))

        for (i in 0..99) {
            scholarships.save(Scholarship(name = "Scholarship $i", description = "Description $i", applicableSchools = randomSchools(schools)))
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(ScholarshipConnectApplication::class.java, *args)
}