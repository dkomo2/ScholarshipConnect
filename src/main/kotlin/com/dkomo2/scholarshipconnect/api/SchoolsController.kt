package com.dkomo2.scholarshipconnect.api

import com.dkomo2.scholarshipconnect.data.SchoolRepository
import com.dkomo2.scholarshipconnect.model.distance
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

/**
 * Created by david on 2/23/17.
 */

@RestController
@RequestMapping("schools")
@Api(value = "Schools")
class SchoolsController(val repository: SchoolRepository) {
    @GetMapping
    @ApiOperation(value = "Get All Schools, Optionally within the Inputted Radius (in miles) of Inputted Coordinates")
    fun getAllSchools(
            @RequestParam(required = false) latitude: Double?,
            @RequestParam(required = false) longitude: Double?,
            @RequestParam(required = false) radiusInMiles: Double?
    ) = if (latitude != null && longitude != null && radiusInMiles != null)
        repository.findAll().filter { radiusInMiles >= distance(latitude, longitude, it.latitude, it.longitude) }
    else repository.findAll()

    @GetMapping("{id}")
    @ApiOperation(value = "Get School By Id")
    fun getSchoolsById(@PathVariable id: String) = repository.findOne(id)
}