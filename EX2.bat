@echo off
:inicializar
set/a corr=0
set/a fall=0
cls
goto inicio
:inicio
cls
echo.
set/a toterr=5-fall
set/a num1= %RANDOM% %% 8 + 2 
set/a num2= %RANDOM% %% 8 + 2 
set/a resp2=%num1%*%num2%
echo.
echo Te quedan %toterr% equivocaciones
if %fall% == 5 goto final
set/p resp= Resultado de %num1% * %num2% 
if %resp%==%resp2% goto ok
if not %resp%==%resp2% goto nok
goto inicio
:ok
set/a corr=corr+1
goto inicio
:nok
set/a fall=fall+1
goto inicio
:final
echo %corr% aciertos  
echo %fall% errores

echo ¿Repetir proceso? "S o N"

SET /p opcion=

if "%opcion%"=="S" goto inicializar
pause
exit