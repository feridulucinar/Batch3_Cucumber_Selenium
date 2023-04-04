Feature: Login with Scenario Outline

  @scenarioOutline
  Scenario Outline: Positive Login Test with Different Users
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then Verify that "<name>" is visible on the dashboard
    Examples:
      | userEmail               | password  | name           |
      | mike@gmail.com          | mike1234  | mike           |
      | john@gmail.com          | John1234. | John           |
      | eddiem@kraft.com        | eddiem12  | Eddie Murphy   |
      | morganfreeman@kraft.com | mfreeman  | Morgan Freeman |

  @odev
  Scenario Outline: Negative Login Test with Different Users
    Given The user is on the login page
    When The user doesn't log in using incorrect "<userEmail>"  and incorrect "<password>"
    Then Verify that "<message>" is visible on the dashboard
    Examples:
      | userEmail        | password  | message                                  |
      | mikegmail.com    | mike1234  | Email address is incorrect. Please check |
      | john@gmail.com   | @ohn1234. | Password is incorrect. Please check      |
      | eddiem@kraft.com |           | Please enter your password!              |
      |                  | mfreeman  | Please enter your email.                 |
      |                  |           | Please enter your password!              |
