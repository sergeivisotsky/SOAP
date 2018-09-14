package org.sergei.soap.service;

import org.sergei.soap.dao.PhotoDAO;
import org.sergei.soap.ftp.FileOperations;
import org.sergei.soap.model.PhotoUploadResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;

@Service
public class PhotoService {

    @Autowired
    private PhotoDAO photoDAO;

    @Autowired
    private FileOperations fileOperations;

    public PhotoUploadResponse savePhotoMeta(Long customerId, DataHandler file) {
        PhotoUploadResponse photoUploadResponse = new PhotoUploadResponse();

        photoUploadResponse.setCustomerId(customerId);
        photoUploadResponse.setFileName(file.getName());
        photoUploadResponse.setFileType(file.getContentType());

        photoDAO.savePhotoMeta(photoUploadResponse);
        fileOperations.uploadFile(file);

        return photoUploadResponse;
    }
}
