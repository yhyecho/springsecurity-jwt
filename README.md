#### 1.后台管理员登录

**/manage/user/login

> request

```
String username,
String password
```

> response

success

```
{
    "status": 0,
    "data": {
        "id": 12,
        "username": "echo",
        "email": "yhyecho@kpmg.com",
        "phone": null,
        "role": 0,
        "createTime": 1479048325000,
        "updateTime": 1479048325000
    }
}
```

fail
```
{
    "status": 1,
    "msg": "密码错误"
}
```

------


#### 2.查询后台用户列表

**/manage/user/userlist

> request

```
pageSize(default=10)
pageNum(default=1)
```

> response

success

```
{
    "status": 0,
    "data": {
        "pageNum": 1,
        "pageSize": 3,
        "size": 3,
        "orderBy": null,
        "startRow": 1,
        "endRow": 3,
        "total": 16,
        "pages": 6,
        "list": [
            {
                "id":17,
                "username":"echo",
                "password":"",
                "email":"yhyecho@kpmg.com",
                "phone":"15011111111",
                "question":"啊哈哈",
                "answer":"服不服",
                "role":0,
                "createTime":1489719093000,
                "updateTime":1513682138000
            },
            {
                "id":17,
                "username":"time",
                "password":"",
                "email":"tim@kpmg.com",
                "phone":"15011111111",
                "question":"你好呀",
                "answer":"我好着呢",
                "role":0,
                "createTime":1489719093000,
                "updateTime":1513682138000
            }
        ],
        "firstPage": 1,
        "prePage": 0,
        "nextPage": 2,
        "lastPage": 6,
        "isFirstPage": true,
        "isLastPage": false,
        "hasPreviousPage": false,
        "hasNextPage": true,
        "navigatePages": 8,
        "navigatepageNums": [
          1,
          2,
          3,
          4,
          5,
          6
        ]
    }
}
```

fail
```
{
  "status": 10,
  "msg": "用户未登录,请登录"
}

或

{
  "status": 1,
  "msg": "没有权限"
}

```
------