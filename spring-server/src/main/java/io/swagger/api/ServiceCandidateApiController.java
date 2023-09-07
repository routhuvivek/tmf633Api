package io.swagger.api;

import io.swagger.dao.ServiceCandidateDao;
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
public class ServiceCandidateApiController implements ServiceCandidateApi {

    private static final Logger log = LoggerFactory.getLogger(ServiceCandidateApiController.class);

    private final ObjectMapper objectMapper;
    private final ModelMapper modelMapper;
    private final ServiceCandidateDao serviceCandidateDao;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServiceCandidateApiController(ObjectMapper objectMapper, HttpServletRequest request, ModelMapper modelMapper, ServiceCandidateDao serviceCandidateDao) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.serviceCandidateDao = serviceCandidateDao;
    }

    public ResponseEntity<ServiceCandidate> createServiceCandidate(@ApiParam(value = "The ServiceCandidate to be created" ,required=true )  @Valid @RequestBody ServiceCandidateCreate serviceCandidate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ServiceCandidate serviceCandidateRequest = modelMapper.map(serviceCandidate, ServiceCandidate.class);
                serviceCandidateDao.save(serviceCandidateRequest);
                return new ResponseEntity<ServiceCandidate>(serviceCandidateRequest, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCandidate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCandidate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteServiceCandidate(@ApiParam(value = "Identifier of the ServiceCandidate",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        serviceCandidateDao.delete(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    public ResponseEntity<List<ServiceCandidate>> listServiceCandidate(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ServiceCandidate>>(serviceCandidateDao.findAll(), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ServiceCandidate>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ServiceCandidate>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceCandidate> patchServiceCandidate(@ApiParam(value = "Identifier of the ServiceCandidate",required=true) @PathVariable("id") String id,@ApiParam(value = "The ServiceCandidate to be updated" ,required=true )  @Valid @RequestBody ServiceCandidateUpdate serviceCandidate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ServiceCandidate serviceCandidateDb= serviceCandidateDao.findOne(id);
                if(Objects.nonNull(serviceCandidate.getName())&& !"".equalsIgnoreCase(serviceCandidate.getName())){
                    serviceCandidateDb.setName(serviceCandidate.getName());
                }
                if(Objects.nonNull(serviceCandidate.getDescription())&& !"".equalsIgnoreCase(serviceCandidate.getDescription())){
                    serviceCandidateDb.setDescription(serviceCandidate.getDescription());
                }
                if(Objects.nonNull(serviceCandidate.getVersion())&& !"".equalsIgnoreCase(serviceCandidate.getVersion())){
                    serviceCandidateDb.setVersion(serviceCandidate.getVersion());
                }
//                if(Objects.nonNull(serviceCandidate.getValidFor())&& !"".equalsIgnoreCase(serviceCandidate.getValidFor().toString())){
//                    serviceCandidateDb.setValidFor(serviceCandidate.getValidFor());
//                }
                ServiceCandidate serviceCandidateResponse = serviceCandidateDao.findOne(id);
                return new ResponseEntity<ServiceCandidate>(serviceCandidateResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCandidate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCandidate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceCandidate> retrieveServiceCandidate(@ApiParam(value = "Identifier of the ServiceCandidate",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceCandidate>(serviceCandidateDao.findOne(id), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCandidate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCandidate>(HttpStatus.NOT_IMPLEMENTED);
    }

}
