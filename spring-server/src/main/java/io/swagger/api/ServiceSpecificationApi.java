/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.32).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.ServiceSpecification;
import io.swagger.model.ServiceSpecificationCreate;
import io.swagger.model.ServiceSpecificationUpdate;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-07T05:22:45.795Z")

@Validated
@Api(value = "serviceSpecification", description = "the serviceSpecification API")
@RequestMapping(value = "/tmf-api/serviceCatalogManagement/v4/")
@CrossOrigin
public interface ServiceSpecificationApi {

    @ApiOperation(value = "Creates a ServiceSpecification", nickname = "createServiceSpecification", notes = "This operation creates a ServiceSpecification entity.", response = ServiceSpecification.class, tags={ "serviceSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ServiceSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/serviceSpecification",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<ServiceSpecification> createServiceSpecification(@ApiParam(value = "The ServiceSpecification to be created" ,required=true )  @Valid @RequestBody ServiceSpecificationCreate serviceSpecification);


    @ApiOperation(value = "Deletes a ServiceSpecification", nickname = "deleteServiceSpecification", notes = "This operation deletes a ServiceSpecification entity.", tags={ "serviceSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/serviceSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteServiceSpecification(@ApiParam(value = "Identifier of the ServiceSpecification",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "List or find ServiceSpecification objects", nickname = "listServiceSpecification", notes = "This operation list or find ServiceSpecification entities", response = ServiceSpecification.class, responseContainer = "List", tags={ "serviceSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ServiceSpecification.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/serviceSpecification",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<List<ServiceSpecification>> listServiceSpecification(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Updates partially a ServiceSpecification", nickname = "patchServiceSpecification", notes = "This operation updates partially a ServiceSpecification entity.", response = ServiceSpecification.class, tags={ "serviceSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = ServiceSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/serviceSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.PATCH)
    ResponseEntity<ServiceSpecification> patchServiceSpecification(@ApiParam(value = "Identifier of the ServiceSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "The ServiceSpecification to be updated" ,required=true )  @Valid @RequestBody ServiceSpecificationUpdate serviceSpecification);


    @ApiOperation(value = "Retrieves a ServiceSpecification by ID", nickname = "retrieveServiceSpecification", notes = "This operation retrieves a ServiceSpecification entity. Attribute selection is enabled for all first level attributes.", response = ServiceSpecification.class, tags={ "serviceSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ServiceSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/serviceSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<ServiceSpecification> retrieveServiceSpecification(@ApiParam(value = "Identifier of the ServiceSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields);

}
