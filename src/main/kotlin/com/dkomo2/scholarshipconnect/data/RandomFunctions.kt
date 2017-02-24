package com.dkomo2.scholarshipconnect.data

import com.dkomo2.scholarshipconnect.model.AcademicProgram
import com.dkomo2.scholarshipconnect.model.School
import com.dkomo2.scholarshipconnect.model.SchoolRank
import java.util.Random


/**
 * Created by david on 2/23/17.
 */

fun <T> shuffle(items: MutableList<T>): List<T> {
    val rg: Random = Random()
    for (i in 0..items.size - 1) {
        val randomPosition = rg.nextInt(items.size)
        val tmp: T = items[i]
        items[i] = items[randomPosition]
        items[randomPosition] = tmp
    }
    return items
}

fun randomSchools(repo: SchoolRepository): Set<School> =
        shuffle(repo.findAll()).subList(0, Random().nextInt(9) + 1).toSet()

fun randomAcademicPrograms(): Set<AcademicProgram> =
        shuffle(mutableListOf(
                AcademicProgram.ACCOUNTING,
                AcademicProgram.ADAPTED_AQUATICS,
                AcademicProgram.AFRICANA_STUDIES,
                AcademicProgram.AMERICAN_STUDIES,
                AcademicProgram.ANTHROPOLOGY,
                AcademicProgram.APPLIED_MATHEMATICS_AND_STATISTICS,
                AcademicProgram.ART_HISTORY_AND_CRITICISM,
                AcademicProgram.ART_STUDIO,
                AcademicProgram.ASIAN_AND_ASIAN_AMERICAN_STUDIES,
                AcademicProgram.ASTRONOMY_AND_PLANETARY_SCIENCES,
                AcademicProgram.ATHLETIC_TRAINING,
                AcademicProgram.ATMOSPHERIC_AND_OCEANIC_SCIENCES,
                AcademicProgram.BIOCHEMISTRY,
                AcademicProgram.BIOENGINEERING,
                AcademicProgram.BIOLOGY,
                AcademicProgram.BIOMATERIALS,
                AcademicProgram.BIOMEDICAL_ENGINEERING,
                AcademicProgram.BUSINESS_MANAGEMENT,
                AcademicProgram.CHEMICAL_AND_MOLECULAR_ENGINEERING,
                AcademicProgram.CHEMISTRY,
                AcademicProgram.CHINA_STUDIES,
                AcademicProgram.CINEMA_AND_CULTURAL_STUDIES,
                AcademicProgram.CIVIL_ENGINEERING,
                AcademicProgram.CLASSICAL_CIVILIZATION,
                AcademicProgram.CLINICAL_LABORATORY_SCIENCES,
                AcademicProgram.COASTAL_ENVIRONMENTAL_STUDIES,
                AcademicProgram.COMPARATIVE_LITERATURE,
                AcademicProgram.COMPUTER_ENGINEERING,
                AcademicProgram.COMPUTER_SCIENCE,
                AcademicProgram.CREATIVE_WRITING_AND_LITERATURE,
                AcademicProgram.DANCE,
                AcademicProgram.DIGITAL_ARTS,
                AcademicProgram.EARTH_AND_SPACE_SCIENCES,
                AcademicProgram.ECONOMICS,
                AcademicProgram.ECOSYSTEMS_AND_HUMAN_IMPACT,
                AcademicProgram.EDUCATION_AND_TEACHER_CERTIFICATION,
                AcademicProgram.ELECTRICAL_ENGINEERING,
                AcademicProgram.ENERGY_SCIENCE_TECHNOLOGY_AND_POLICY,
                AcademicProgram.ENGINEERING_CHEMISTRY,
                AcademicProgram.ENGINEERING_COMPOSITES,
                AcademicProgram.ENGINEERING_SCIENCE,
                AcademicProgram.ENGINEERING_AND_TECHNOLOGY_ENTREPRENEURSHIP,
                AcademicProgram.ENGLISH,
                AcademicProgram.ENTREPRENEURSHIP,
                AcademicProgram.ENVIRONMENTAL_DESIGN_POLICY_AND_PLANNING,
                AcademicProgram.ENVIRONMENTAL_ENGINEERING,
                AcademicProgram.ENVIRONMENTAL_HUMANITIES,
                AcademicProgram.ENVIRONMENTAL_STUDIES,
                AcademicProgram.ETHNOMUSICOLOGY,
                AcademicProgram.EUROPEAN_STUDIES,
                AcademicProgram.FRENCH_LANGUAGE_AND_LITERATURE,
                AcademicProgram.GEOLOGY,
                AcademicProgram.GEOSPATIAL_SCIENCE,
                AcademicProgram.GERMAN_LANGUAGE,
                AcademicProgram.HEALTH_SCIENCE,
                AcademicProgram.HEALTH_AND_WELLNESS,
                AcademicProgram.HELLENIC_STUDIES,
                AcademicProgram.HISPANIC_LANGUAGES_AND_LITERATURE,
                AcademicProgram.HISTORY,
                AcademicProgram.HUMAN_EVOLUTIONARY_BIOLOGY,
                AcademicProgram.INFORMATION_SYSTEMS,
                AcademicProgram.INTERNATIONAL_STUDIES,
                AcademicProgram.ITALIAN_AMERICAN_STUDIES,
                AcademicProgram.ITALIAN_STUDIES,
                AcademicProgram.JAPANESE_STUDIES,
                AcademicProgram.JAZZ_STUDIES,
                AcademicProgram.JOURNALISM,
                AcademicProgram.JUDAIC_STUDIES,
                AcademicProgram.KOREAN_STUDIES,
                AcademicProgram.LATIN_AMERICAN_AND_CARIBBEAN_STUDIES,
                AcademicProgram.LEADERSHIP_DEVELOPMENT,
                AcademicProgram.LIBERAL_ARTS,
                AcademicProgram.LINGUISTICS,
                AcademicProgram.MANUFACTURING_ENGINEERING,
                AcademicProgram.MARINE_SCIENCES,
                AcademicProgram.MARINE_VERTEBRATE_BIOLOGY,
                AcademicProgram.MATERIALS_SCIENCE,
                AcademicProgram.MATHEMATICS,
                AcademicProgram.MECHANICAL_ENGINEERING,
                AcademicProgram.MEDIA_ARTS,
                AcademicProgram.MEDIEVAL_STUDIES,
                AcademicProgram.MIDDLE_EASTERN_STUDIES,
                AcademicProgram.MULTIDISCIPLINARY_STUDIES,
                AcademicProgram.MUSIC,
                AcademicProgram.MUSIC_THEORY,
                AcademicProgram.MUSIC_AND_TECHNOLOGY,
                AcademicProgram.NANOTECHNOLOGY_STUDIES,
                AcademicProgram.NURSING,
                AcademicProgram.OPTICS,
                AcademicProgram.PHARMACOLOGY,
                AcademicProgram.PHILOSOPHY,
                AcademicProgram.PHYSICS,
                AcademicProgram.POLITICAL_SCIENCE,
                AcademicProgram.PSYCHOLOGY,
                AcademicProgram.RELIGIOUS_STUDIES,
                AcademicProgram.RESPIRATORY_CARE,
                AcademicProgram.RUSSIAN_STUDIES,
                AcademicProgram.SOCIAL_WORK,
                AcademicProgram.SOCIOLOGY,
                AcademicProgram.SOUTH_ASIAN_STUDIES,
                AcademicProgram.SPANISH_LANGUAGE_AND_LITERATURE,
                AcademicProgram.SUSTAINABILITY_STUDIES,
                AcademicProgram.TECHNOLOGICAL_SYSTEMS_MANAGEMENT,
                AcademicProgram.THEATRE_ARTS,
                AcademicProgram.WOMENS_AND_GENDER_STUDIES,
                AcademicProgram.WRITING_AND_RHETORIC)).
                subList(0, Random().nextInt(9) + 1).toSet()

fun randomSchoolRank(): Set<SchoolRank> =
        shuffle(
                mutableListOf(
                        SchoolRank.INCOMING_FRESHMAN,
                        SchoolRank.RISING_SOPHOMORE,
                        SchoolRank.RISING_JUNIOR,
                        SchoolRank.RISING_SENIOR,
                        SchoolRank.GRADUATE
                )
        ).subList(0, Random().nextInt(4) + 1).toSet()