package io.swagger.api;

import io.swagger.dao.ServiceSpecificationDao;
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
public class ServiceSpecificationApiController implements ServiceSpecificationApi {

    private static final Logger log = LoggerFactory.getLogger(ServiceSpecificationApiController.class);

    private final ObjectMapper objectMapper;
    private final ModelMapper modelMapper;
    private final ServiceSpecificationDao serviceSpecificationDao;
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServiceSpecificationApiController(ObjectMapper objectMapper, HttpServletRequest request, ModelMapper modelMapper, ServiceSpecificationDao serviceSpecificationDao) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.serviceSpecificationDao = serviceSpecificationDao;
    }

    public ResponseEntity<ServiceSpecification> createServiceSpecification(@ApiParam(value = "The ServiceSpecification to be created" ,required=true )  @Valid @RequestBody ServiceSpecificationCreate serviceSpecification) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ServiceSpecification serviceSpecificationrequest = modelMapper.map(serviceSpecification, ServiceSpecification.class);
                serviceSpecificationDao.save(serviceSpecificationrequest);
                return new ResponseEntity<ServiceSpecification>(serviceSpecificationrequest, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteServiceSpecification(@ApiParam(value = "Identifier of the ServiceSpecification",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        serviceSpecificationDao.delete(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    public ResponseEntity<List<ServiceSpecification>> listServiceSpecification(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ServiceSpecification>>(serviceSpecificationDao.findAll(), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ServiceSpecification>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ServiceSpecification>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceSpecification> patchServiceSpecification(@ApiParam(value = "Identifier of the ServiceSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "The ServiceSpecification to be updated" ,required=true )  @Valid @RequestBody ServiceSpecificationUpdate serviceSpecification) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ServiceSpecification serviceSpecificationDb= serviceSpecificationDao.findOne(id);
                if(Objects.nonNull(serviceSpecification.getVersion())&& !"".equalsIgnoreCase(serviceSpecification.getVersion())){
                    serviceSpecificationDb.setVersion(serviceSpecification.getVersion());
                }
                if(Objects.nonNull(serviceSpecification.getValidFor())&& !"".equalsIgnoreCase(serviceSpecification.getValidFor().toString())){
                    serviceSpecificationDb.setValidFor(serviceSpecification.getValidFor());
                }
                ServiceSpecification serviceSpecificationResponse = serviceSpecificationDao.findOne(id);
                return new ResponseEntity<ServiceSpecification>(serviceSpecificationResponse, HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceSpecification> retrieveServiceSpecification(@ApiParam(value = "Identifier of the ServiceSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceSpecification>(serviceSpecificationDao.findOne(id), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

}
