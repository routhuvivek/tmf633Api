package io.swagger.api;

import io.swagger.dao.ServiceCatalogDao;
import io.swagger.model.Error;
import io.swagger.model.ServiceCatalog;
import io.swagger.model.ServiceCatalogCreate;
import io.swagger.model.ServiceCatalogUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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
public class ServiceCatalogApiController implements ServiceCatalogApi {

    private static final Logger log = LoggerFactory.getLogger(ServiceCatalogApiController.class);

    private final ObjectMapper objectMapper;
    private final ModelMapper modelMapper;
    private final HttpServletRequest request;
    private final ServiceCatalogDao serviceCatalogDao;
    @org.springframework.beans.factory.annotation.Autowired
    public ServiceCatalogApiController(ModelMapper modelMapper, ObjectMapper objectMapper, HttpServletRequest request, ServiceCatalogDao serviceCatalogDao) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.serviceCatalogDao=serviceCatalogDao;
    }

    public ResponseEntity<ServiceCatalog> createServiceCatalog(@ApiParam(value = "The ServiceCatalog to be created" ,required=true )  @Valid @RequestBody ServiceCatalogCreate serviceCatalog) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                //System.out.println(objectMapper);
                //return new ResponseEntity<ServiceCatalog>(objectMapper.readValue("{\"empty\": false}", ServiceCatalog.class), HttpStatus.NOT_IMPLEMENTED);
                ServiceCatalog serviceCatalogRequest = modelMapper.map(serviceCatalog, ServiceCatalog.class);
                serviceCatalogDao.save(serviceCatalogRequest);
                return new ResponseEntity<ServiceCatalog>(serviceCatalogRequest, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCatalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCatalog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteServiceCatalog(@ApiParam(value = "Identifier of the ServiceCatalog",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        serviceCatalogDao.delete(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    public ResponseEntity<List<ServiceCatalog>> listServiceCatalog(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ServiceCatalog>>(serviceCatalogDao.findAll(), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ServiceCatalog>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ServiceCatalog>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceCatalog> patchServiceCatalog(@ApiParam(value = "Identifier of the ServiceCatalog",required=true) @PathVariable("id") String id,@ApiParam(value = "The ServiceCatalog to be updated" ,required=true )  @Valid @RequestBody ServiceCatalogUpdate serviceCatalog) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                //ServiceCatalog serviceCatalogRequest = modelMapper.map(serviceCatalog, ServiceCatalog.class);
                ServiceCatalog serviceCatalogDb= serviceCatalogDao.findOne(id);
                if(Objects.nonNull(serviceCatalog.getName())&& !"".equalsIgnoreCase(serviceCatalog.getName())){
                    serviceCatalogDb.setName(serviceCatalog.getName());
                }
                if(Objects.nonNull(serviceCatalog.getDescription())&& !"".equalsIgnoreCase(serviceCatalog.getDescription())){
                    serviceCatalogDb.setDescription(serviceCatalog.getDescription());
                }
                if(Objects.nonNull(serviceCatalog.getVersion())&& !"".equalsIgnoreCase(serviceCatalog.getVersion())){
                    serviceCatalogDb.setVersion(serviceCatalog.getVersion());
                }
//                if(Objects.nonNull(serviceCatalog.getValidFor())&& !"".equalsIgnoreCase(serviceCatalog.getValidFor().toString())){
//                    serviceCatalogDb.setValidFor(serviceCatalog.getValidFor());
//                }
                ServiceCatalog serviceCatalogResponse = serviceCatalogDao.findOne(id);
                return new ResponseEntity<ServiceCatalog>(serviceCatalogResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCatalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCatalog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceCatalog> retrieveServiceCatalog(@ApiParam(value = "Identifier of the ServiceCatalog",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceCatalog>(serviceCatalogDao.findOne(id), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceCatalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceCatalog>(HttpStatus.NOT_IMPLEMENTED);
    }

}
