setlocal enabledelayedexpansion
:menu

echo 1. Create Directory Structure
echo 2. Edit Directory Structure
echo 3. Display Directory Structure
echo 4. Quit
set /P userchoice=Pick an option: 
IF "%userchoice%" EQU "1" (
    goto :initialise_creation    
) ELSE IF "%userchoice%" EQU "2" (
    set /p "torename=Enter the path of the folder/file you want to rename: "
    set /p "torenameto=Enter the new name for the folder/file: "
    ren !torename! !torenameto!
    goto :menu
) ELSE IF "%userchoice%" EQU "3" (
    tree /f MYMODULES
    goto :menu
) ELSE IF "%userchoice%" EQU "4" (
    EXIT /b 1

) ELSE (
    echo "Invalid Option Please Try Again"
    goto :menu
)


:initialise_creation

set /P userin=Would you like to create a root directory? (y/n): 
IF /I "%userin%" EQU "y" (
    set /P rootdirname=Enter name for the root directory: 
    call :createdirectory "!rootdirname!" "y"
)
pause
goto :eof

:createdirectory
IF "%~2" EQU "y" (
    mkdir %~1
    cd %~1
)
set /P create_subfolder=Would you like to create a subfolder in %cd%? : 
IF /I "%create_subfolder%" EQU "y" (
    set /P subfolder=Enter name for the subfolder: 
    call :createdirectory "!subfolder!" "y"
) ELSE (
    :loop
    set /P create_file=Would You Like To Create A File In %cd%? y/n/x: 
    IF "!create_file!" EQU "y" (
        set /P filename=Enter filename: 
        echo > "!filename!.txt"
        goto :loop
    ) ELSE IF "!create_file!" EQU "x" (
        goto :menu
    ) ELSE (
        cd ..
        call :createdirectory "%cd%" "n"

    )
    
)

goto :eof
