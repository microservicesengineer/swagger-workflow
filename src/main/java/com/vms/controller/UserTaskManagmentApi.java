/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.vms.controller;

import com.vms.model.CompleteTaskReqVO;
import com.vms.model.QueryTaskReqVO;
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

@Api(value = "UserTaskManagment", description = "the UserTaskManagment API")
public interface UserTaskManagmentApi {

    Logger log = LoggerFactory.getLogger(UserTaskManagmentApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "认领task", nickname = "claimTaskByID", notes = "", response = StandardResponse.class, tags={ "user task managment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "complete user task successfully", response = StandardResponse.class) })
    @RequestMapping(value = "/flowTask/claim/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<StandardResponse> claimTaskByID(@ApiParam(value = "",required=true) @PathVariable("id") Integer id) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserTaskManagmentApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "完成task(e.g. 包含assign,group users)", nickname = "completeTask", notes = "", response = StandardResponse.class, tags={ "user task managment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "complete user task successfully", response = StandardResponse.class) })
    @RequestMapping(value = "/flowTask/complete",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<StandardResponse> completeTask(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CompleteTaskReqVO completeTaskReqVO) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserTaskManagmentApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "根据id删除user task", nickname = "deleteTaskByID", notes = "", response = StandardResponse.class, tags={ "user task managment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "delete task successfully", response = StandardResponse.class) })
    @RequestMapping(value = "/flowTask/tasks/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    default ResponseEntity<StandardResponse> deleteTaskByID(@ApiParam(value = "",required=true) @PathVariable("id") Integer id) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserTaskManagmentApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "查询user task", nickname = "queryTask", notes = "", response = StandardResponse.class, tags={ "user task managment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "upload bpmn file  successfully", response = StandardResponse.class) })
    @RequestMapping(value = "/flowTask/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<StandardResponse> queryTask(@ApiParam(value = "" ,required=true )  @Valid @RequestBody QueryTaskReqVO queryTaskReq) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserTaskManagmentApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "归还之前认领的task", nickname = "unclaimTaskByID", notes = "", response = StandardResponse.class, tags={ "user task managment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "complete user task successfully", response = StandardResponse.class) })
    @RequestMapping(value = "/flowTask/unclaim/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<StandardResponse> unclaimTaskByID(@ApiParam(value = "",required=true) @PathVariable("id") Integer id) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserTaskManagmentApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
