Feature: Contacts page

  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1

    Scenario: Verify Create Calendar Event
      Given the user is on the login page
      And the user enters the sales manager information
      When the user navigates to "Activities" "Calendar Events"
      Then the title contains "Calendars"
    Scenario: Menu Options
      Given the user logged in as "sales manager"
      Then the user should see following options
        |Dashboards|
        |Fleet|
        |Customers|
        |Sales|
        |Activities|
        |Marketing|
        |Reports & Segments|
        |System|

  Scenario Outline: login as a given user <user>
        Given the user is on the login page
        When the user logs in using following credentials
          |username |<user>      |
          |password |UserUser123 |
          |firstname|<firstName> |
          |lastname |<lastName>  |
        Then the user should be able to login
    Examples:
    |user           |firstName |lastName  |
    |user10         |Brenden   |Schenider |
    |storemanager85 |Stephan   |Haley     |
    @db
    Scenario: Contacts test with email
      Given the user logged in as "sales manager"
      And the user navigates to "Customers" "Contacts"
      When the user clicks the "mbrackstone9@example.com" from contacts
      Then the information should be same with database

  @db
  Scenario: Contacts test with email
    Given the user logged in as "sales manager"
    And the user navigates to "Customers" "Contacts"
    When the user clicks the "mike.jorden@hotmail.com" from contacts
    Then the information for "mike.jorden@hotmail.com" should be same with database
    @wip @db
    Scenario Outline: Contacts Test
      Given the user logged in as "sales manager"
      And the user navigates to "Customers" "Contacts"
      When the user clicks the "<email>" from contacts
      Then the information for "<email>" should be same with database
      Examples:
      |email|
      |mbrackstone9@example.com|
      |mike.jorden@hotmail.com|

