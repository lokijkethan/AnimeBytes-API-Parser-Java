# AnimeBytes API Parser Java
A Java library for parsing responses from the AnimeBytes API.

## Getting Started

To use the AnimeBytes API Parser, you will need to have a valid AnimeBytes API key.

### Prerequisites

In order to use the AnimeBytes API Parser, you will need to have the following software installed on your machine:

- Java 8 or higher
- Maven 3.0 or higher

### Installing

To install the AnimeBytes API Parser, follow these steps:

Clone the repository to your local machine: `git clone https://github.com/lokijkethan/AnimeBytes-API-Parser-Java.git`
Navigate to the root directory of the repository: `cd animebytes-api-parser-java`
Build the project with Maven: `mvn clean install`

### Using the library

To use the AnimeBytes API Parser in your own project, you can include it as a dependency in your pom.xml file:

```xml
<dependency>
  <groupId>moe.yakumo</groupId>
  <artifactId>fucl</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```
You can then use the library in your code by importing the appropriate classes:

```java
import moe.yakumo.animebytes.api.AnimeBytesAPI;
import moe.yakumo.animebytes.api.model.Torrent;
import moe.yakumo.animebytes.api.model.User;
```

### Examples

Here are some examples of how you might use the AnimeBytes API Parser:

```java
AnimeBytesAPI api = new AnimeBytesAPI("YOUR_API_KEY", "YOUR_USERNAME");

// Get a list of the user's torrents
List<Torrent> torrents = api.getTorrents();

// Get the user's profile information
User user = api.getUser();

// Search for torrents with the query "one punch man"
List<Torrent> searchResults = api.searchTorrents("one punch man");

// Download a torrent
api.downloadTorrent(torrentId);
```

## Built With

- [Java](https://www.java.com/) - The programming language used
- [Maven](https://maven.apache.org/) - Dependency management

## Contributing

To contribute to the project, please follow these steps:

1. Fork the repository
2. Create a new branch for your changes (git checkout -b my-changes)
3. Make your changes
4. Commit your changes (git commit -am 'Added some features')
5. Push your changes to the branch (git push origin my-changes)
6. Create a new pull request

## Versioning

We use [SemVer](https://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/lokijkethan/AnimeBytes-API-Parser-Java/tags).

## Authors

7 - Initial work - 7
See also the list of [contributors](https://github.com/lokijkethan/AnimeBytes-API-Parser-Java/graphs/contributors)

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- The AnimeBytes team for creating and maintaining the API.
