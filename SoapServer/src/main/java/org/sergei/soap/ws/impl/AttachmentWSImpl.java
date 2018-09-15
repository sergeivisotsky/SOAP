package org.sergei.soap.ws.impl;

import org.sergei.soap.model.AttachmentUploadResponse;
import org.sergei.soap.service.AttachmentService;
import org.sergei.soap.ws.AttachmentWS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.activation.DataHandler;
import javax.jws.WebService;

@Component
@WebService(endpointInterface = "org.sergei.soap.ws.AttachmentWS",
        serviceName = "AttachmentService", portName = "AttachmentUpload")
public class AttachmentWSImpl implements AttachmentWS {

    @Autowired
    private AttachmentService attachmentService;

    public void setAttachmentService(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @Override
    public AttachmentUploadResponse saveAttachment(Long customerId, DataHandler file) {
        return attachmentService.savePhotoMeta(customerId, file);
    }
}
