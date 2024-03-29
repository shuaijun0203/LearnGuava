package com.shuaijun.LearnGuava.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "employee")
public class Employee {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String employeeID;

    @DynamoDBAttribute
    private String firstName,lastName,email;
    
    @DynamoDBAttribute
    private Department department;
}
