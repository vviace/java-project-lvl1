run-dist:
	./build/install/app/bin/app
build:
	./gradlew clean build
test:
	./gradlew test
.PHONY: build