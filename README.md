## About

This project exposes REST Api built on spring boot with jpa

## Demo 
Hosted on AWS

- [RESTApi](http://ec2-18-220-31-226.us-east-2.compute.amazonaws.com:3007/events)

## Technology Stack 
- Spring-Boot
	- Spring-Boot-JPA
	- Apache Tomcat
- Lombok
- H2 Database


## Supported Service calls

* /events  [GET]<br/> 
					- get all events & its inventory details

* /events/{eventcode} [GET]<br/>
					- get only request event & its inventory detail

* /events [POST]<br/>
```
REQUEST

{
  "type": "object",
  "required": [],
  "properties": {
    "eventCode": {
      "description": "filter by event code",
      "type": "string"
    },
    "aisle": {
      "description": "filter by aisle seats ?",
      "type": "boolean"
    },
    "available": {
      "description": "filter by available seats ?",
      "type": "boolean"
    },
    "seatType": {
      "description": "filter by seat type (adult|child) ?",
      "type": "string"
    }
  }
}

```
<br/>

```
RESPONSE
	int (Count based on supplied filter)
```
