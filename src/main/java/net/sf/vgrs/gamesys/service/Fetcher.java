package net.sf.vgrs.gamesys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URI;


@Component
public abstract class Fetcher {

    private final URI uri;

    public URI getUri() {
        return uri;
    }

    @Autowired
    public Fetcher(@Value("${app.data.source.url}") URI uri) {
        this.uri = uri;
    }

    public abstract byte[] fetch();

}
