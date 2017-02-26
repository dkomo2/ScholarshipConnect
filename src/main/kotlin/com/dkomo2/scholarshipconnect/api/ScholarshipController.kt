package com.dkomo2.scholarshipconnect.api

import com.dkomo2.scholarshipconnect.data.ScholarshipRepository
import com.dkomo2.scholarshipconnect.model.AcademicProgram
import com.dkomo2.scholarshipconnect.model.SchoolRank
import com.dkomo2.scholarshipconnect.model.distance
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

/**
 * Created by david on 2/23/17.
 */
@CrossOrigin
@RestController
@RequestMapping("scholarships")
@Api(value = "Scholarships")
class ScholarshipController(val repository: ScholarshipRepository) {
    @GetMapping
    @ApiOperation(value = "Get All Scholarships I Might Qualify for")
    fun getAllScholarships(
            @RequestParam(required = false) myDesiredAwardAmount: Double?,
            @RequestParam(required = false) myDesiredProgram: AcademicProgram?,
            @RequestParam(required = false) mySchoolRank: SchoolRank?,
            @RequestParam(required = false) myGpa: Double?,
            @RequestParam(required = false) myIncome: Double?,
            @RequestParam(required = false) myLatitude: Double?,
            @RequestParam(required = false) myLongitude: Double?,
            @RequestParam(required = false) myDesiredRadiusInMiles: Double?,
            @RequestParam(defaultValue = "false") mustBeInState: Boolean
    ) = repository.findAll().filter {
        (if (myLatitude != null && myLongitude != null && myDesiredRadiusInMiles != null)
            it.applicableSchools.any { myDesiredRadiusInMiles >= (distance(myLatitude, myLongitude, it.latitude, it.longitude)) }
        else true)
                && (if (mustBeInState) it.mustBeInState else true)
                && (if (myGpa != null) (it.minimumGpaRequirement <= myGpa) else true)
                && (if (myIncome != null) (it.maximumIncomeRequirement >= myIncome) else true)
                && (if (myDesiredAwardAmount != null) (it.awardAmount >= myDesiredAwardAmount) else true)
                && (if (myDesiredProgram != null) (it.applicableAcademicPrograms.any { it == myDesiredProgram }) else true)
                && (if (mySchoolRank != null) (it.applicableSchoolRanks.any { it == mySchoolRank }) else true)
    }

    @GetMapping("{id}")
    @ApiOperation(value = "Get Scholarship By Id")
    fun getScholarshipsById(@PathVariable id: String) = repository.findOne(id)
}