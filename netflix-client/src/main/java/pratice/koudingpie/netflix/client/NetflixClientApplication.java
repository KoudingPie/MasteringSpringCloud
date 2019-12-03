package pratice.koudingpie.netflix.client;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class NetflixClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixClientApplication.class, args);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(NetflixClientApplication.class);

//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @GetMapping("/ping")
//    public List<InstanceInfo> ping(){
//        List<InstanceInfo> instances = discoveryClient.getInstancesById("CLIENT-SERVICE");
//        return instances;
//    }

}
