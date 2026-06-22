# trigger
AccuKnox SAST SonarCloud Integration

Overview

This repository demonstrates the integration of SonarCloud-based Static Application Security Testing (SAST) with AccuKnox using GitHub Actions.

The workflow automatically:

* Scans source code using SonarCloud
* Identifies security vulnerabilities and code quality issues
* Uploads findings to AccuKnox SaaS
* Associates findings with the label arpisast
* Enables centralized visibility and remediation through AccuKnox

⸻

Repository Structure

accuknox-sast-sonar-cust/
├── requirements.txt
├── sonar-project.properties
├── src/
│   ├── app.py
│   ├── payment_service.py
│   ├── UserController.java
│   └── config.json
└── .github/
    └── workflows/
        └── accuknox-sast.yml

⸻

Prerequisites

SonarCloud

Create a SonarCloud project and collect:

* SONAR_TOKEN
* SONAR_PROJECT_KEY
* SONAR_ORG_ID

SonarCloud URL:

https://sonarcloud.io

AccuKnox

Generate an API token from:

Settings → Tokens

Collect:

* ACCUKNOX_TOKEN
* ACCUKNOX_ENDPOINT

Example endpoint:

https://cspm.demo.accuknox.com

⸻

GitHub Secrets

Configure the following repository secrets:

Secret	Description
SONAR_TOKEN	SonarCloud API Token
SONAR_HOST_URL	https://sonarcloud.io
SONAR_PROJECT_KEY	SonarCloud Project Key
SONAR_ORG_ID	SonarCloud Organization Key
ACCUKNOX_TOKEN	AccuKnox API Token
ACCUKNOX_ENDPOINT	AccuKnox API Endpoint
ACCUKNOX_LABEL	arpisast

⸻

Sonar Configuration

sonar-project.properties

sonar.sources=src
sonar.python.version=3

⸻

GitHub Workflow

Location:

.github/workflows/accuknox-sast.yml

The workflow:

1. Checks out source code
2. Executes SonarCloud SAST scan
3. Retrieves findings
4. Uploads findings to AccuKnox
5. Tags findings with label arpisast

⸻

Running the Scan

The workflow triggers automatically on:

Push to main branch

It can also be executed manually:

GitHub → Actions → AccuKnox SAST Sonar Customer Validation → Run Workflow

⸻

Sample Findings

The repository intentionally contains insecure coding patterns to validate detection capabilities.

Examples include:

* SQL Injection
* Command Injection
* Weak Cryptographic Hashing
* Insecure Deserialization
* Open Redirect
* Debug Mode Enabled
* Security Misconfigurations

⸻

Viewing Results in AccuKnox

Navigate to:

Issues → Findings

Recommended filters:

Label: arpisast
Source: SQ-SAST
Branch: main

You can review:

* Severity
* File path
* Vulnerability description
* Remediation guidance
* AI-assisted recommendations

⸻

Validation Outcome

The integration validates:

* SonarCloud connectivity
* GitHub Actions execution
* AccuKnox findings ingestion
* Label-based categorization
* End-to-end SAST visibility

Label used:

arpisast
