package org.sergei.soap.dao;

import org.sergei.soap.model.PhotoUploadResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.activation.DataHandler;

@Repository
public class PhotoDAO {

    private static final String SQL_SAVE_PHOTO_META = "INSERT INTO photos(customer_id, file_name, file_url, file_type, file_size) " +
            "VALUES (?, ?, ?, ?, ?)";
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void savePhotoMeta(PhotoUploadResponse photoUploadResponse) {
        try {
            jdbcTemplate.update(SQL_SAVE_PHOTO_META, photoUploadResponse.getCustomerId(), photoUploadResponse.getFileName(),
                    "Test", photoUploadResponse.getFileType(), 1);
        } catch (DataAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }

}
