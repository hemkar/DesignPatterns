package com.demo.builder.url;

public class URL {

    public static class Builder {
        private String protocol;
        private String hostname;
        private String port;
        private String pathParam;
        private String queryParam;

        public URL build(){
            return new URL(this);
        }

        public Builder protocol(String protocol){
            this.protocol= protocol;
            return this;
        }

        public Builder hostname(String hostname){
            this.hostname= hostname;
            return this;
        }

        public Builder port(String port){
            this.port= port;
            return this;
        }

        public Builder pathParam(String pathParam){
            this.pathParam= pathParam;
            return this;
        }

        public Builder queryParam(String queryParam){
            this.queryParam= queryParam;
            return this;
        }
    }

    public String protocol;
    public String hostname;
    public String port;
    public String pathParam;
    public String queryParam;

    public URL(Builder builder){
        this.protocol= builder.protocol;
        this.hostname= builder.hostname;
        this.port= builder.port;
        this.pathParam= builder.pathParam;
        this.queryParam= builder.queryParam;
    }
}
