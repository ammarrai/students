unfinished business:

core.methods.returnstatement
	fix Inputs.java (create a proper Scanner utility class
	
core.stringbuilder
    solidify understanding / implement toString here properly
	
	
core.exceptions.example
	Test.java does not work as expected.
	
	
	
	Object 
	 |
	Throwable    ----------------------------- Exception (we interact with these more often)------- Checked
    	|                                          |                                                    Exceptions
    	|                                          Runtime Exception (Commonly rep. errors in your program)
    	Error (virtual machine related errors)     |
    	e.g. LinkageError                           e.g. NullPointerException

    	
    	Checked Exceptions are very important:
    	e.g. IOException 
    	You have to handle all checked exceptions
    	
    	Unechecked exceptions/Runtime exceptions - 
    	You can handle these, but the compiler doesn't require that you do so.
    	
    	Any exception class that inherits from RuntimeException is a checked exception
    	
    	Any exception class that inherits from Exception, but not RunTimeException is considered a checked exception
    	
    	Virtual machine errors are treated as unchecked exceptions - The compiler does not require that you handle those.
    	
    	
    	Exceptions can be handlbed by type
    	Each exception type can have a separate catch block.
    	
    	Each catch is tested in order from top to bottom. 
    	
    	First assignable catch is selected
    	
    	Catch blocks should be started with the most specific exception types first and get more general as we go       down.
    	
    	