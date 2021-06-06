git 提交代码常用命令

1. git add -A 
   -A 表示将所有的已跟踪的文件的修改与删除和新增的未跟踪的文件都添加到暂存区

2. git commit -m '提交的信息'
     暂存区里的改动给提交到本地的版本库

3. git push origin 分支名

   本地版本库的分支推送到远程服务器上对应的分支
   
git托管代码报错：

1. 检查一下remote内容
  $ git remote -v
  origin  git@github.com/zejun_web (fetch)
  origin  git@github.com/zejun_web (push)

2. git remote rm origin

3. git remote -v 
   如果没有出现origin表示成功与远程分支建立联系

4. git remote add origin git@github.com:git-ze/xxxx.git

5. git push -u origin master

