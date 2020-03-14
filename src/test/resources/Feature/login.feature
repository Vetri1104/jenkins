Feature: Verifying adactin hotel details

  Scenario: verify logindetails with valid credentials
    Given user is on hotel page
    When user enter details
      | username   | password   | Location | Hotels         | Room Type    | Number of Rooms | CheckInDate | CheckOutDate | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No   | Credit Card Type | Expiry Date | Expiry Year | CVV Number |
      | VetriVetri  |vetri.1104| London   | Hotel Sunshine | Super Deluxe | 4-Five          | 02/03/2020  | 03/03/2020   | 2 - Two         | 2 - fTwo          | vetri      | Vj        | Pondicherry     | 1234567890123456 | VISA             | April       |        2021 |        123 |
    Then user should verify the message
