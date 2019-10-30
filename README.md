## About

This project exposes REST Api built on spring boot with jpa

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
					- get only list of events matching the provided filters
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

## Donation
If this project help you reduce time to develop, you can buy me a cup of coffee :) 

[![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=QUXLCYKAULHJW&currency_code=USD&source=url)
