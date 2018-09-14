package org.sergei.soap.ws.impl;

import org.sergei.soap.model.PhotoUploadResponse;
import org.sergei.soap.service.PhotoService;
import org.sergei.soap.ws.PhotoWS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.activation.DataHandler;
import javax.jws.WebService;

@Component
@WebService(endpointInterface = "org.sergei.soap.ws.PhotoWS",
        serviceName = "PhotoService", portName = "PhotoUploadResponse")
public class PhotoWSImpl implements PhotoWS {

    @Autowired
    private PhotoService photoService;

    public void setPhotoService(PhotoService photoService) {
        this.photoService = photoService;
    }

    @Override
    public PhotoUploadResponse savePhoto(Long customerId, DataHandler file) {
        return photoService.savePhotoMeta(customerId, file);
    }
}
