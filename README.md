## About

This project exposes REST Api which lets you create event & inventory tickets for it, and then sell seats & manage it.

## Demo 
Hosted on AWS

- [RESTApi](http://ec2-18-220-31-226.us-east-2.compute.amazonaws.com:3007/events)

## Supported Service calls

* /events  [GET]<br/> 
					- get all events & its inventory details

* /events/{eventcode} [GET]<br/>
					- get only request event & its inventory detail

* /events [POST]<br/>
```
RQ.BODY{
	eventCode	:	string nullable,
	aisle		:	boolean nullable,
	available	:	boolean nullable,
	seatType	:	string[adult|child] nullable
} nullable
```
<br/>

```
RS.BODY{
	int (Count based on supplied filter)
}
```
