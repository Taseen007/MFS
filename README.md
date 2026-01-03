# Mobile Financial Services (MFS)

## Project Description

A Java-based Mobile Financial Services system that implements four core design patterns: **Factory**, **Strategy**, **Decorator**, and **Template Method**. 

The project demonstrates how to build a scalable financial transaction platform that supports multiple service types (Send Money, Cash Out, Mobile Recharge) with flexible fee calculation and dynamic service enhancements through decorators.

## Design Patterns

- **Factory Pattern**: Creates MFS services based on transaction type
- **Strategy Pattern**: Handles different fee calculation strategies
- **Decorator Pattern**: Adds SMS notifications and transaction insurance dynamically
- **Template Method Pattern**: Defines the transaction processing workflow

## Features

- Multiple transaction types with custom business logic
- Pluggable fee calculation strategies
- Dynamic service enhancement through decorators
- Clean, modular architecture

## How to Run

```bash
cd src
javac *.java factory\*.java service\*.java strategy\*.java decorator\*.java
java Main
```

