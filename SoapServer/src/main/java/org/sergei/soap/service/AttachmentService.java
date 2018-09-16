package org.sergei.soap.service;

import com.sun.prism.Image;
import org.sergei.soap.dao.AttachmentDAO;
import org.sergei.soap.ftp.FileOperations;
import org.sergei.soap.model.AttachmentUploadResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import java.awt.*;

@Service
public class AttachmentService {

    @Autowired
    private AttachmentDAO attachmentDAO;

    @Autowired
    private FileOperations fileOperations;

    public AttachmentUploadResponse savePhotoMeta(Long customerId, DataHandler file) {
        AttachmentUploadResponse attachmentUploadResponse = new AttachmentUploadResponse();

        attachmentUploadResponse.setCustomerId(customerId);
        attachmentUploadResponse.setDocName(file.getName());
        attachmentUploadResponse.setDocType(file.getContentType());

        attachmentDAO.savePhotoMeta(attachmentUploadResponse);
        fileOperations.uploadFile(file);

        return attachmentUploadResponse;
    }
}
