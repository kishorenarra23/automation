clear
sudo apt-get update
sudo apt-get install default-jdk
wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt update
sudo apt install jenkins
systemctl status jenkins
cd /var
ls
cd lib/
ls
cd jenkins/
ls
cd secrets/
sudo vi secrets
cat secrets
cat /var/lib/jenkins/secrets/initialAdminPassword
sudo vi /var/lib/jenkins/secrets/initialAdminPassword
cd
sudo apt-get install maven
docker
sudo apt install docker.io
sudo usermod -aG docker $USER
sudo chmod 666 /var/run/docker.sock
