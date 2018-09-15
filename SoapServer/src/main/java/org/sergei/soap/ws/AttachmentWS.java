package org.sergei.soap.ws;

import org.sergei.soap.model.AttachmentUploadResponse;
import org.springframework.stereotype.Component;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@Component
@WebService(name = "AttachmentUpload", targetNamespace = "http://soap.sergei.org")
public interface AttachmentWS {
    @WebMethod(action = "saveAttachmentMeta")
    @WebResult(name = "inputAttachment")
    AttachmentUploadResponse saveAttachment(@WebParam(name = "inputCustomerId") Long customerId,
                                            @WebParam(name = "inputAttachment") DataHandler file);
}
