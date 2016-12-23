package com.cloudrain.derecho.ds.zk.discover;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.test.TestingServer;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;

/**
 * Created by lugan on 12/23/2016.
 */
public class DiscoveryExample {
    private static final String PATH = "/discovery/example";

    public static void main(String ...argv) throws Exception{
        TestingServer testingServer = new TestingServer();

        CuratorFramework client = CuratorFrameworkFactory.newClient(testingServer.getConnectString(), new ExponentialBackoffRetry(1000, 3));
        //ServiceDiscovery serviceDiscovery = ServiceDiscoveryBuilder.builder(InstanceDetails.class)

    }
}
