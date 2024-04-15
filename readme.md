api编写

@Author:  lixianjun  /  mobile: 17621753088

@E-mail:  lixianjun50@icloud.com

数据存储形式：将csv内的数据，读取到内存中，无数据库载体

产出五个接口：

### 获取缺量数据
GET http://localhost:8080/allData

### 单条记录的详情，此返回对象增加【距离】字段
POST http://localhost:8080/detailByLocationId

### 获取设施类型
GET http://localhost:8080/getFacilityType

### 获取所有状态
GET http://localhost:8080/getStatus

### 按条件检索合适的列表，此返回对象增加【距离】字段
POST http://localhost:8080/searchList