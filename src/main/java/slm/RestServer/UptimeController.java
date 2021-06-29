package slm.RestServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.InetAddress;

@Path("/api/uptime")
public class UptimeController {

    @GET
    @Path("/{uptime}")
    @Produces(MediaType.TEXT_PLAIN)
    public String isOnline(String ip) {

        try {
            InetAddress inet = InetAddress.getByName(ip);
            if(inet.isReachable(5000))
                return "-";
            else
                return "";
        }catch (Exception e) {
            return e.getMessage();
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateUptime() {
        return this.isOnline("127.0.0.1");
    }
}