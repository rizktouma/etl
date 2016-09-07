package com.linkedpipes.plugin.transformer.filesToRdfGraph;

import com.linkedpipes.etl.component.api.service.RdfToPojo;

/**
 *
 * @author Škoda Petr
 */
@RdfToPojo.Type(uri = FilesToRdfGraphVocabulary.CONFIG)
public class FilesToRdfGraphConfiguration {

    @RdfToPojo.Property(uri = FilesToRdfGraphVocabulary.HAS_COMMIT_SIZE)
    private int commitSize = 10000;

    @RdfToPojo.Property(uri = FilesToRdfGraphVocabulary.HAS_MIME_TYPE)
    private String mimeType = null;

    public FilesToRdfGraphConfiguration() {
    }

    public int getCommitSize() {
        return commitSize;
    }

    public void setCommitSize(int commitSize) {
        this.commitSize = commitSize;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

}
