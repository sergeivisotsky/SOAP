package org.sergei.soap.dao;

import org.sergei.soap.model.AttachmentUploadResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AttachmentDAO {

    private static final String SQL_SAVE_PHOTO_META = "INSERT INTO documents(customer_id, doc_name, doc_type) " +
            "VALUES (?, ?, ?)";
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void savePhotoMeta(AttachmentUploadResponse attachmentUploadResponse) {
        try {
            jdbcTemplate.update(SQL_SAVE_PHOTO_META, attachmentUploadResponse.getCustomerId(),
                    attachmentUploadResponse.getDocName(), attachmentUploadResponse.getDocType());
            LOGGER.info("Attachment entity saved");
        } catch (DataAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }

}
