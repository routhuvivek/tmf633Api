package io.swagger.api;

import io.swagger.dao.ServiceCategoryDao;
import io.swagger.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.Error;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-07T05:22:45.795Z")

@Controller
public class ServiceCategoryApiController implements ServiceCategoryApi {

    private static final Logger log = LoggerFactory.getLogger(ServiceCategoryApiController.class);

    private final ObjectMapper objectMapper;
    private final ModelMapper modelMapper;
    private final ServiceCategoryDao serviceCategoryDao;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServiceCategoryApiController(ModelMapper modelMapper, ObjectMapper objectMapper, HttpServletRequest request, ServiceCategoryDao serviceCategoryDao) {
        this.modelMapper = modelMapper;
        this.objectMapper = objectMapper;
        this.request = request;
        this.serviceCategoryDao=serviceCategoryDao;
    }

    public ResponseEntity<ServiceCategory> createServiceCategory(@ApiParam(value = "The ServiceCategory to be created" ,required=true )  @Valid @RequestBody ServiceCategoryCreate serviceCategory) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ServiceCategory serviceCategoryrequest = modelMapper.map(serviceCategory, ServiceCategory.class);
                serviceCategoryDao.save(serviceCategoryrequest);
                return new ResponseEntity<ServiceCategory>(serviceCategoryrequest, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCategory>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCategory>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteServiceCategory(@ApiParam(value = "Identifier of the ServiceCategory",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        serviceCategoryDao.delete(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    public ResponseEntity<List<ServiceCategory>> listServiceCategory(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ServiceCategory>>(serviceCategoryDao.findAll(), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ServiceCategory>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ServiceCategory>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceCategory> patchServiceCategory(@ApiParam(value = "Identifier of the ServiceCategory",required=true) @PathVariable("id") String id,@ApiParam(value = "The ServiceCategory to be updated" ,required=true )  @Valid @RequestBody ServiceCategoryUpdate serviceCategory) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ServiceCategory serviceCategoryDb= serviceCategoryDao.findOne(id);
                if(Objects.nonNull(serviceCategory.getName())&& !"".equalsIgnoreCase(serviceCategory.getName())){
                    serviceCategoryDb.setName(serviceCategory.getName());
                }
                if(Objects.nonNull(serviceCategory.getDescription())&& !"".equalsIgnoreCase(serviceCategory.getDescription())){
                    serviceCategoryDb.setDescription(serviceCategory.getDescription());
                }
                if(Objects.nonNull(serviceCategory.getVersion())&& !"".equalsIgnoreCase(serviceCategory.getVersion())){
                    serviceCategoryDb.setVersion(serviceCategory.getVersion());
                }
//                if(Objects.nonNull(serviceCategory.getValidFor())&& !"".equalsIgnoreCase(serviceCategory.getValidFor().toString())){
//                    serviceCategoryDb.setValidFor(serviceCategory.getValidFor());
//                }
                ServiceCategory serviceCategoryResponse = serviceCategoryDao.findOne(id);
                return new ResponseEntity<ServiceCategory>(serviceCategoryResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCategory>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCategory>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceCategory> retrieveServiceCategory(@ApiParam(value = "Identifier of the ServiceCategory",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceCategory>(serviceCategoryDao.findOne(id), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCategory>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCategory>(HttpStatus.NOT_IMPLEMENTED);
    }

}
