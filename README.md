Create GitHub Actions Configuration for API & Web UI Automation Testing

Configurations is located at .github/workflows/web-api-automation-workflow.yml

The Architecture:

Container
- uses: actions/checkout@v3

Java Set Up
- name: Set up JDK 11
  uses: actions/setup-java@v3
  with:
    java-version: '11'
    distribution: 'temurin'

Browser Set Up 
- name: Setup Chrome
  uses: browser-actions/setup-chrome@v1.4.0

Gradlew Set Up
- name: Setup gradlew
  run: chmod +x gradlew

Execute Web UI Testing
- name: Execute Web Test
  run: ./gradlew webTest

Execute API Testing
- name: Execute API Test      
  run: ./gradlew apiTest


Screenshoot Run Test

  <img width="1440" alt="Screenshot 2023-12-30 at 11 04 43" src="https://github.com/rianardiansari/Tugas-20-Riana-Ardiansari/assets/149749846/b7d0ae2c-26ee-44a5-9cb3-58701406c3da">
