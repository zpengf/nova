import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jooq.codegen.GenerationTool
import org.jooq.meta.jaxb.*



plugins {
    id ("org.springframework.boot") version "2.6.0"
    id ("io.spring.dependency-management") version "1.0.11.RELEASE"
    id ("org.jetbrains.kotlin.jvm") version "1.6.0"
    id ("org.jetbrains.kotlin.plugin.spring") version "1.6.0"
}

group = "com.zpf"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
    mavenCentral()
    google()
    jcenter()
}
buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        classpath("org.jooq:jooq-codegen:3.14.15")
        classpath("mysql:mysql-connector-java:8.0.27")
    }
}



dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation ("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation ("org.jetbrains.kotlin:kotlin-reflect")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
    runtimeOnly("mysql:mysql-connector-java:8.0.27")
    implementation("org.jooq:jooq:3.14.15")
    implementation("org.jooq:jooq-codegen:3.14.15")
    implementation("org.jooq:jooq-meta:3.14.15")
    implementation("com.xiaoleilu:hutool-core:3.3.2")
    implementation ("org.projectlombok:lombok:1.18.24")
}

tasks.register("JOOQ_Code_Generate") {
    doLast {
        val config: org.jooq.meta.jaxb.Configuration = Configuration()
                .withJdbc(Jdbc()
                        .withDriver("com.mysql.cj.jdbc.Driver")
                        .withUrl("jdbc:mysql://localhost:3306/127local?useSSL=false&characterEncoding=utf-8")
                        .withUsername("root")
                        .withPassword("root"))
                .withGenerator(Generator()
                        .withGenerate(Generate()
                                .withComments(true) // 注释 √
                                .withCommentsOnCatalogs(true)
                                .withRelations(true)
                                .withImmutablePojos(false) // if true, cannot use 'into()' method
                                .withInterfaces(true)
                                .withDaos(true))
                        .withDatabase(Database()
                                .withName("org.jooq.meta.mysql.MySQLDatabase")
                                .withIncludes(".*")
                                .withExcludes("")
                                .withInputSchema("127local")
                        )
                        .withTarget(org.jooq.meta.jaxb.Target()
                                .withPackageName("")
                                .withDirectory("/Users/pengfeizhang/Desktop/javaProject/novademo01/src/main/java"))
                )
        GenerationTool.generate(config)
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
