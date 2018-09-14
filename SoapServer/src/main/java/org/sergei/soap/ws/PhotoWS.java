package org.sergei.soap.ws;

import org.sergei.soap.model.PhotoUploadResponse;
import org.springframework.stereotype.Component;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@Component
@WebService(name = "PhotoUploadResponse", targetNamespace = "http://soap.sergei.org")
public interface PhotoWS {
    @WebMethod(action = "savePhotoMeta")
    @WebResult(name = "inputPhoto")
    PhotoUploadResponse savePhoto(@WebParam(name = "inputCustomerId") Long customerId,
                                  @WebParam(name = "inputPhoto") DataHandler file);
}
