build a spring boot 2 image (server-api) with jib

    mvn clean install -Dmaven.test.skip=true; mvn compile jib:dockerBuild

or 

    mvn compile jib:build
    
