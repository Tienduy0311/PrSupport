@echo cd %1

@echo git checkout -b temp

@echo git branch -D %2
@echo git fetch origin %2:%2
@echo git checkout %2
@echo git checkout -b %3

@echo git branch -D temp

@echo source - %2
@echo target - %3

@REM exit