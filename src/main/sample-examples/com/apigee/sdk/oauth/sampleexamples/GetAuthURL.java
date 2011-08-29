/*
 * Copyright (c) 2011, Apigee Corporation. All rights reserved.
 * Apigee(TM) and the Apigee logo are trademarks or
 * registered trademarks of Apigee Corp. or its subsidiaries. All other
 * trademarks are the property of their respective owners.
 * 
 */
package com.apigee.sdk.oauth.sampleexamples;

import com.apigee.sdk.oauth.api.resource.AppUser;

public class GetAuthURL {

    public static void main(String[] args) {
        String url = AppUser.Factory.newInstance("appusername","userpwd").forApp("appname").getAuthURL("provider","callbackurl");
    }
}
