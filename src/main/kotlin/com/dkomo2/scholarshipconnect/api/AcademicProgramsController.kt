package com.dkomo2.scholarshipconnect.api

import com.dkomo2.scholarshipconnect.model.AcademicProgram
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by david on 2/28/17.
 */
@CrossOrigin
@RestController
@RequestMapping("academicPrograms")
@Api(value = "Academic Programs")
class AcademicProgramsController {
    @GetMapping
    @ApiOperation(value = "Get All Academic Programs")
    fun getAllAcademicPrograms() = AcademicProgram.values()
}