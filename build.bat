@echo off

@rem Build
@rem this will copy the built resources to the build directory(distribute) ./dist
@rem Run `build.bat`

@rem clean previous build
echo "Clean ./dist"
@rem rm -rf ./dist # unix
rd /s /q dist
@rem mkdir ./dist # unix
mkdir dist 


@rem Build App
echo "Build Client"

@rem pushd %~dp0client\board_ui
cd client
cd board_ui

@rem pwd # unix
@rem cd

@rem fetch the flutter/dart dependencies
@rem flutter pub get
@rem used with Travis flutter
flutter build web

@rem popd
cd..
cd..



@rem Build into the ./dist

@rem Copy the client resource (flutter app)
@rem cp -R ./client/board_ui/web/* ./dist/html # unix

xcopy /E /I ".\client\board_ui\web" ".\dist\html"

echo "Finished building.."



