echo 消除所有build文件夹!!!
#列出所有build文件夹
#find . -name "build"

find . -name "build" -exec rm -rf {} \;

echo Finish !!!
