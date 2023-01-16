## Recalling Java

#### Recalling Java by following along [this beginner tutorial](https://www.youtube.com/watch?v=grEKMHGYyns&ab_channel=freeCodeCamp.org).

#### Tutorial includes: 

⌨️ (0:00:00)  1 - Basic Java keywords explained  
⌨️ (0:21:59)  2 - Basic Java keywords explained - Coding Session    
⌨️ (0:35:45)  3 - Basic Java keywords explained - Debriefing  
⌨️ (0:43:41)  4 - Packages, import statements, instance members, default constructor  
⌨️ (0:59:01)  5 - Access and non-access modifiers  
⌨️ (1:11:59)  6 - Tools: IntelliJ Idea, Junit, Maven  
⌨️ (1:22:53)  7 - If/else statements and booleans  
⌨️ (1:42:20)  8 - Loops: for, while and do while loop  
⌨️ (1:56:57)  9 - For each loop and arrays  
⌨️ (2:14:21)  10 - Arrays and enums  
⌨️ (2:41:37)  11 - Enums and switch statement  
⌨️ (3:07:21)  12 - Switch statement cont.  
⌨️ (3:20:39)  13 - Logging using slf4j and logback  
⌨️ (3:51:19)  14 - Public static void main  
⌨️ (4:11:35)  15 - Checked and Unchecked Exceptions  
⌨️ (5:05:36)  16 - Interfaces  
⌨️ (5:46:54)  17 - Inheritance  
⌨️ (6:20:20)  18 - Java Object finalize() method  
⌨️ (6:36:57)  19 - Object clone method.      [No lesson 20]  
⌨️ (7:16:04)  21 - Number ranges, autoboxing, and more    
⌨️ (7:53:00)  22 - HashCode and Equals  
⌨️ (8:38:16)  23 - Java Collections  
⌨️ (9:01:12)  24 - ArrayList  

## Obstacles

### 1. Unsupported JRE version 

#### Error message: 
>Incompatible java.lang.UnsupportedClassVersionError: ch/qos/logback/classic/spi/LogbackServiceProvider has been compiled by a more recent version of the Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class file versions up to 52.0

#### Solution:  
1. File -> Project Structure -> Add New SDK -> Download JDK 19 (1.8 previously)
2. Run -> Edit Configurations -> In Build and run select java 19 (java 8 previously)

### 2. No SLF4J providers found on the class path

#### Warning message:
>SLF4J: No SLF4J providers were found.  
>SLF4J: Defaulting to no-operation (NOP) logger implementation SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.

#### Solution: 

[Specify](https://stackoverflow.com/questions/54652836/slf4j-found-slf4j-api-dependency-but-no-providers-were-found) the dependency on preferred logging library - for standard jdk1.4 logging:

```xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-jdk14</artifactId>
    <version>2.0.5</version>
    <scope>runtime</scope>
</dependency>
```

### 3. Multiple SLF4J providers

#### Warning message:
>SLF4J: Class path contains multiple SLF4J providers.  
>SLF4J: Found provider [org.slf4j.jul.JULServiceProvider@7dc36524]  
>SLF4J: Found provider [ch.qos.logback.classic.spi.LogbackServiceProvider@35bbe5e8]  
>SLF4J: See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.  
>SLF4J: Actual provider is of type [org.slf4j.jul.JULServiceProvider@7dc36524]  

#### Solution: 

Comment out solution for issue no.2. 
