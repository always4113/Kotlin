package packages

import packages.printMessage
import packages.Message
// Message is now accessible without qualification
import packages.*
// everything in 'org.example' becomes accessible

/*If there is a name clash, you can disambiguate by using as keyword
to locally rename the clashing entity: */
import packages.Message as testMessage
import packages.printMessage as testPrintMessage