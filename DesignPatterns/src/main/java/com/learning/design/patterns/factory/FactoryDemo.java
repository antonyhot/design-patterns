package com.learning.design.patterns.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebSiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());
        site = WebSiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
