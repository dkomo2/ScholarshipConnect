package com.dkomo2.scholarshipconnect.data

import com.dkomo2.scholarshipconnect.model.Scholarship
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by david on 2/23/17.
 */
@RepositoryRestResource(exported = false)
interface ScholarshipRepository : JpaRepository<Scholarship, String>, JpaSpecificationExecutor<Scholarship>
