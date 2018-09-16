package org.sergei.soap.service;

import org.sergei.soap.dao.AttachmentDAO;
import org.sergei.soap.ftp.FileOperations;
import org.sergei.soap.model.AttachmentUploadResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;

@Service
public class AttachmentService {

    @Autowired
    private AttachmentDAO attachmentDAO;

    @Autowired
    private FileOperations fileOperations;

    public AttachmentUploadResponse savePhotoMeta(Long customerId, String fileName, DataHandler file) {
        AttachmentUploadResponse attachmentUploadResponse = new AttachmentUploadResponse();

        String contentType = file.getContentType();

        attachmentUploadResponse.setCustomerId(customerId);
        attachmentUploadResponse.setDocName(contentType.substring(contentType.indexOf("name=") + 5).trim());
        attachmentUploadResponse.setDocType(contentType);

        attachmentDAO.savePhotoMeta(attachmentUploadResponse);
        fileOperations.uploadFile(file);

        return attachmentUploadResponse;
    }
}
