package accesspoint.config.swagger;

import java.util.Arrays;
import java.util.List;

import io.swagger.v3.oas.models.servers.Server;
import lombok.Getter;

@Getter
public enum ServerList {

    ORIGIN_SERVER("본 서버", new Server()
        .url("http://3.37.125.9:8808")
        .description("본 서버")
    );

    private final String description;
    private final Server server;

    ServerList(final String description, final Server server){
        this.description = description;
        this.server = server;
    }

    public static List<Server> toList(){
        return Arrays.stream(values()).map(serverList -> serverList.getServer()).toList();
    }
}
