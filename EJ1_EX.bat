@echo off
echo Calculo Área total
echo.
echo Elige el tipo de figura:
echo 1 - Rectangulo
echo 2 - cuadrado
echo 3 - Circulo
echo.
SET /p opcion= ^> Seleccione una opcion [1-3]:
if "%opcion%"=="1" goto rect
if "%opcion%"=="2" goto cuad
if "%opcion%"=="3" goto circ
echo.

:rect
echo Introduce la base del Rectangulo:
set/p baseRectangulo1=
echo.
echo Introduce la altura del Rectangulo:
set/p alturaRectangulo1=
set/a areaRectangulo1=%baseRectangulo1%*%alturaRectangulo1%
echo.
goto next1

:cuad
echo Introduce el lado del cuadrado:
set/p ladoCuadrado=
echo.
set/a areaCuadrado=%ladoCuadrado%*%ladoCuadrado%
echo.
goto next2

:circ
echo Introduce el radio del circulo:
set/p radioCirculo=
echo.
set/a areaCirculo=%radioCirculo%*%radioCirculo%*3,14
echo.
goto next3

:next1
echo Ahora introduce el perimetro del pentagono:
set/p perimetro=
echo Introduce el apotema del pentagono:
set/p apotema=
set/a areaPentagono=%perimetro%*%apotema%/2
echo.
echo Ahora introduce la base del rectangulo:
set/p baseRectangulo=
echo.
echo Introduce la altura del rectangulo:
set/p alturaRectangulo=
set/a areaRectangulo=%baseRectangulo%*%alturaRectangulo%
echo.
set/a areaResultante=%areaRectangulo%-%areaPentagono%-%areaRectangulo1%
echo El area resultante es: %areaResultante%
goto fin

:next2
echo Ahora introduce el perimetro del pentagono:
set/p perimetro=
echo Introduce el apotema del pentagono:
set/p apotema=
set/a areaPentagono=%perimetro%*%apotema%/2
echo.
echo Ahora introduce la base del rectangulo:
set/p baseRectangulo=
echo.
echo Introduce la altura del rectangulo:
set/p alturaRectangulo=
set/a areaRectangulo=%baseRectangulo%*%alturaRectangulo%
echo.
set/a areaResultante=%areaRectangulo%-%areaPentagono%-%areaCuadrado%
echo El area resultante es: %areaResultante%
goto fin

:next3
echo Ahora introduce el perimetro del pentagono:
set/p perimetro=
echo Introduce el apotema del pentagono:
set/p apotema=
set/a areaPentagono=%perimetro%*%apotema%/2
echo.
echo Ahora introduce la base del rectangulo:
set/p baseRectangulo=
echo.
echo Introduce la altura del rectangulo:
set/p alturaRectangulo=
set/a areaRectangulo=%baseRectangulo%*%alturaRectangulo%
echo.
set/a areaResultante=%areaRectangulo%-%areaPentagono%-%areaCirculo%
echo El area resultante es: %areaResultante%
goto fin

:fin
pause
exit