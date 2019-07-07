/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.vms.controller;

import org.springframework.core.io.Resource;
import com.vms.model.StandardResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(value = "Processdefinition", description = "the Processdefinition API")
public interface ProcessdefinitionApi {

    Logger log = LoggerFactory.getLogger(ProcessdefinitionApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "根据deployment ID删除", nickname = "deleteProcessDefinitionById", notes = "", response = StandardResponse.class, tags={ "Processdefinition", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get deployment by id", response = StandardResponse.class) })
    @RequestMapping(value = "/processDefinition/deploy/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<StandardResponse> deleteProcessDefinitionById(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"code\" : 0,  \"data\" : \"{}\",  \"message\" : \"message\"}", StandardResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProcessdefinitionApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "部署预定义的bpmn文件", nickname = "deployPreDefinedProcessDefinition", notes = "", response = StandardResponse.class, tags={ "Processdefinition", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "upload bpmn file  successfully", response = StandardResponse.class) })
    @RequestMapping(value = "/processDefinition/deploy/predefined",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<StandardResponse> deployPreDefinedProcessDefinition(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "bpmnName", required = true) String bpmnName,@ApiParam(value = "") @Valid @RequestParam(value = "category", required = false) String category) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"code\" : 0,  \"data\" : \"{}\",  \"message\" : \"message\"}", StandardResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProcessdefinitionApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "上传 bpmn zip 文件部署", nickname = "deployProcessDefinitionByUploadZip", notes = "", response = StandardResponse.class, tags={ "Processdefinition", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "upload bpmn file  successfully", response = StandardResponse.class) })
    @RequestMapping(value = "/processDefinition/deploy/upload",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    default ResponseEntity<StandardResponse> deployProcessDefinitionByUploadZip(@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file,@ApiParam(value = "") @Valid @RequestParam(value = "bpmnName", required = false) String bpmnName,@ApiParam(value = "") @Valid @RequestParam(value = "category", required = false) String category) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"code\" : 0,  \"data\" : \"{}\",  \"message\" : \"message\"}", StandardResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProcessdefinitionApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "根据deployment ID查询详情", nickname = "getProcessDefinitionById", notes = "", response = StandardResponse.class, tags={ "Processdefinition", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get deployment by id", response = StandardResponse.class) })
    @RequestMapping(value = "/processDefinition/deploy/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<StandardResponse> getProcessDefinitionById(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"code\" : 200,  \"message\" : \"Excepte\",  \"data\" : {    \"entityList\" : [ {      \"name\" : \"alex\"    }, {      \"name\" : \"decimal\"    } ]  }}", StandardResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProcessdefinitionApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "获取部署列表", nickname = "getProcessDefinitionDeploymentList", notes = "", response = StandardResponse.class, tags={ "Processdefinition", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get deployment list", response = StandardResponse.class) })
    @RequestMapping(value = "/processDefinition/deploy",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<StandardResponse> getProcessDefinitionDeploymentList() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"code\" : 0,  \"data\" : \"{}\",  \"message\" : \"message\"}", StandardResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProcessdefinitionApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}