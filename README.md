# av2geobau - map ITF-DM01 to DXF-GEOBAU

## Features
- converts INTERLIS 1 transfer (DM01) files to DXF (SN SN 612 020)

## License
av2geobau is licensed under the LGPL 2.1 (Lesser GNU Public License).

## System Requirements
For the current version of av2geobau, you will need a JRE (Java Runtime Environment) installed on your system, version 1.8 or later.
The JRE (Java Runtime Environment) can be downloaded for free from the Website <http://www.java.com/>.

## Software Download 
<https://github.com/claeis/av2geobau/releases>

## Installing av2geobau
To install the av2geobau, choose a directory and extract the distribution file there. 

## Running av2geobau
The av2geobau can be started with

    java -jar av2geobau.jar [options] in.itf out.dxf

## Building from source
To build the `av2geobau.jar`, use

    gradle build

To build a binary distribution, use

    gradle bindist

## Documentation
[docs/av2geobau_de.rst](docs/av2geobau_de.rst)

