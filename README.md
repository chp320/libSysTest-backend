# 도서관 대출 시스템
- springboot 프로젝트 안에 vue.js 생성한 front 소스를 넣어서 하나의 jar 파일로 배포함을 목적으로 함
- 데이터는 sqlite 를 활용하여 관리

## 백엔드
- 상세 로직 구현하기에 앞서서 기본 환경 구성

### 메모
- vue 프로젝트 생성을 위해 ``vue create frontend`` 프로젝트 생성하였고, 수행 로그 기록
```
Vue CLI v4.5.11
Failed to check for updates
? Please pick a preset: Manually select features
? Check the features needed for your project: Choose Vue version, Babel, Linter
? Choose a version of Vue.js that you want to start the project with 3.x (Preview)
? Pick a linter / formatter config: Standard
? Pick additional lint features: Lint on save
? Where do you prefer placing config for Babel, ESLint, etc.? In dedicated config files
? Save this as a preset for future projects? No
```
