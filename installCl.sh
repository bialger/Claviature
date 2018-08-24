#! /bin/bash
if (git --version)
then
  git clone https://github.com/bialger/Claviature.git clav
else
  sudo apt-get install git
  git clone https://github.com/bialger/Claviature.git .clav
fi
mv ./.clav/ ~/.clav/
sudo ln -s ~/.clav/startCl.sh usr/bin/cl
echo "Настройка программы Claviature от Alexander Bigulov закончена. "
echo "Теперь Вы можете запустить программу через терминал, введя cl."
