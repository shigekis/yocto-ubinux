# ubinux-2020.07 Release Notes

FUJITSU COMPUTER TECHNOLOGIES LIMITED
Solution Development Dept. Software Div.

## 1. Basic Information
### 1.1 Version Information
- Yocto: 3.1
- Kernel: 5.4.51
- Kernel for Layerscape: 5.4.3
- Toolchain
  - GCC: 10.1.0
  - Binutils: 2.34
  - glibc: 2.31
  - GDB: 9.2
- License Files Format: SPDX 2.1

### 1.2 CPU Architecture Support
- x86 (64bit)
- Armv8 (64bit EL, 32bit EL)
- Armv7

### 1.3 Host OS Support
- Ubuntu 18.04.4 LTS (64bit)

### 1.4 U-Boot for Layerscape Support
- NXP Layerscape SDK v20.04 (U-Boot v2019.10)

## 2. Features
### 2.1 Security Fixes
Following security issues have been fixed from ubinux-2020.06.

ffmpeg:
- CVE-2020-12284

json-c:
- CVE-2020-12762

libjpeg-turbo:
- CVE-2020-13790

perl:
- CVE-2020-10543
- CVE-2020-10878
- CVE-2020-12723

ubinux-kernel:
- CVE-2019-19947
- CVE-2019-19965
- CVE-2019-20636
- CVE-2019-20812
- CVE-2019-3016
- CVE-2020-10690
- CVE-2020-10711
- CVE-2020-10942
- CVE-2020-11494
- CVE-2020-11565
- CVE-2020-11608
- CVE-2020-11609
- CVE-2020-11668
- CVE-2020-12464
- CVE-2020-12465
- CVE-2020-12652
- CVE-2020-12653
- CVE-2020-12654
- CVE-2020-12657
- CVE-2020-12659
- CVE-2020-12769
- CVE-2020-12770
- CVE-2020-12826
- CVE-2020-13143
- CVE-2020-8428
- CVE-2020-8647
- CVE-2020-8648
- CVE-2020-8649
- CVE-2020-8992
- CVE-2020-9383

## 3. Release Contents
### 3.1 Kernel

- Kernel
  - File: ubinux-kernel-5.4.51_2020.07_r001.tar.xz
  - Checksum file(sha256): ubinux-kernel-5.4.51_2020.07_r001.sum
- Kernel for Layerscape
  - File: ubinux-kernel-lsdk-5.4.3_2020.07_r001.tar.xz
  - Checksum file(sha256): ubinux-kernel-lsdk-5.4.3_2020.07_r001.sum
  
### 3.2 Userland Packages
- Packages for x86 (64bit)
  - File: x86_64-packages_2020.07_r001.tar.xz
  - Checksum file(sha256): x86_64-packages_2020.07_r001.sum
- Packages for Armv8 (64bit EL)
  - File: armv8_64el-packages_2020.07_r001.tar.xz
  - Checksum file(sha256): armv8_64el-packages_2020.07_r001.sum
- Packages for Armv7 and Armv8 (32bit EL)
  - File: armv7-packages_2020.07_r001.tar.xz
  - Checksum file(sha256): armv7-packages_2020.07_r001.sum
- Source Packages
  - File: 2020.07-src-packages_r001.tar.xz
  - Checksum file(sha256): 2020.07-src-packages_r001.sum

### 3.3 Toolchain
- Toolchain installer for x86 (64bit)
  - File: ubinux-glibc-x86_64-meta-toolchain-core2-64-ubinux-x86-64-toolchain-2020.07.sh
  - Checksum file(sha256): ubinux-glibc-x86_64-meta-toolchain-core2-64-ubinux-x86-64-toolchain-2020.07_r001.sum
- Toolchain installer for Armv8 (64bit EL)
  - File: ubinux-glibc-x86_64-meta-toolchain-aarch64-ubinux-armv8-toolchain-2020.07.sh
  - Checksum file(sha256): ubinux-glibc-x86_64-meta-toolchain-aarch64-ubinux-armv8-toolchain-2020.07_r001.sum
- Toolchain installer for Armv7 and Armv8 (32bit EL)
  - File: ubinux-glibc-x86_64-meta-toolchain-cortexa9t2hf-neon-ubinux-armv7-toolchain-2020.07.sh
  - Checksum file(sha256): ubinux-glibc-x86_64-meta-toolchain-cortexa9t2hf-neon-ubinux-armv7-toolchain-2020.07_r001.sum

### 3.4 License Files
- SPDX Formatted License Files
  - File: spdx-2020.07_r001.tar.xz
  - Checksum file(sha256): spdx-2020.07_r001.sum

## 4. Installation guide
### 4.1 Install Toolchain
Run as root privilege the Toolchain installer at arbitrary directory, and Toolchain will be installed into /opt/ubinux/2020.07 directory.


[TYPE1] in the description, please read as shown below.


|CPU|[TYPE1]|
|---|--------|
|x86 (64bit)|core2-64-ubinux-x86-64|
|Armv8 (64bit EL)|aarch64-ubinux-armv8|
|Armv8 (32bit EL)|cortexa9t2hf-neon-ubinux-armv7|
|Armv7|cortexa9t2hf-neon-ubinux-armv7|


`$ sudo sh ubinux-glibc-x86_64-meta-toolchain-[TYPE1]-toolchain-2020.07.sh`


### 4.2 Set up Environment Variables
Run the following commands.


[TYPE2] in the description, please read as shown below.


|CPU|[TYPE2]|
|---|--------|
|x86 (64bit)|core2-64-ubinux-linux|
|Armv8 (64bit EL)|aarch64-ubinux-linux|
|Armv8 (32bit EL)|cortexa9t2hf-neon-ubinux-linux-gnueabi|
|Armv7|cortexa9t2hf-neon-ubinux-linux-gnueabi|


`$ . /opt/ubinux/2020.07/environment-setup-[TYPE2]`
 
### 4.3 Create rootfs from Userland Packages
To create rootfs, see Section 3.1.2 and 3.1.3 of the dnf-plugin-tui documentation.
https://github.com/ubinux/dnf-plugin-tui/blob/dc41277946edbca76e375a72e4c0babd38d71d35/README.md#312-initialize

## 5. Notice
### 5.1 Removed packages
Package of syslog-ng is removed. Please use systemd-journald to view the log.

### 5.2 Kernel
Enable some kernel configs to use following features.
- systemd
  - CONFIG_CGROUPS
  - CONFIG_FHANDLE
- Booting with UEFI
  - CONFIG_EFI_STUB

### 5.3 validation
The following objects are not validated because the hardware of the test environment does not support them:

#### 5.3.1 X86_64
- ipmi
- tcsd
- edac-util

#### 5.3.2 Armv8
- smartd
- hostapd
- ipmi
- resizecons
- lm_sensors
- cpufreq-aperf
- busybox devmem
- busybox setkeycodes

## 6. Known Security Issues
The following security issues were known in this release:

bash:
- CVE-2016-7543
- CVE-2016-9401
- CVE-2019-18276
- CVE-2019-9924

bind:
- CVE-2017-3139
- CVE-2020-8619

busybox:
- CVE-2018-1000500

cairo:
- CVE-2013-0800
- CVE-2013-6425

coreutils:
- CVE-2009-4135
- CVE-2015-4041
- CVE-2015-4042
- CVE-2017-18018

cpio:
- CVE-2019-14866

cups:
- CVE-2012-6094

db:
- CVE-2016-0682
- CVE-2016-0689
- CVE-2016-0692
- CVE-2016-0694
- CVE-2016-3418

dovecot:
- CVE-2019-19722
- CVE-2020-10957
- CVE-2020-10958
- CVE-2020-10967

exiv2:
- CVE-2019-13108
- CVE-2019-13109
- CVE-2019-13110
- CVE-2019-13111
- CVE-2019-13112
- CVE-2019-13113
- CVE-2019-13114
- CVE-2019-13504
- CVE-2019-14982

ffmpeg:
- CVE-2020-14212

flex:
- CVE-2019-6293

fuse:
- CVE-2019-14860

gdk-pixbuf:
- CVE-2017-6312
- CVE-2017-6313
- CVE-2017-6314

ghostscript:
- CVE-2013-6629
- CVE-2018-18073
- CVE-2019-10216

glibc:
- CVE-2019-1010022
- CVE-2019-1010023
- CVE-2019-1010024
- CVE-2019-1010025
- CVE-2020-10029
- CVE-2020-1752
- CVE-2020-6096

gnutls:
- CVE-2018-10844
- CVE-2018-10845
- CVE-2018-10846
- CVE-2018-16868

groff:
- CVE-2009-5044
- CVE-2009-5080
- CVE-2009-5081

gzip:
- CVE-2010-0001

hdf5:
- CVE-2020-10809
- CVE-2020-10810
- CVE-2020-10811
- CVE-2020-10812

libcroco:
- CVE-2020-12825

libesmtp:
- CVE-2019-19977

librsvg:
- CVE-2019-20446

libuser:
- CVE-2012-5644

libvirt:
- CVE-2014-8135
- CVE-2014-8136
- CVE-2015-5313
- CVE-2018-5748

libxml2:
- CVE-2015-8806
- CVE-2016-4483
- CVE-2016-4614
- CVE-2016-9598

lua:
- CVE-2019-6706

lxc:
- CVE-2019-5736

lynis:
- CVE-2019-13033
- CVE-2020-13882

mcpp:
- CVE-2019-14274

net-snmp:
- CVE-2019-20892

nettle:
- CVE-2016-6489
- CVE-2018-16869

ntp:
- CVE-2019-11331

openjpeg:
- CVE-2019-12973
- CVE-2020-15389

opensc:
- CVE-2019-19479
- CVE-2019-19480
- CVE-2019-19481

openssh:
- CVE-2014-9278

patch:
- CVE-2019-20633

perl:
- CVE-2016-2381
- CVE-2016-6185

php:
- CVE-2019-11048
- CVE-2020-7064
- CVE-2020-7065
- CVE-2020-7067

pixman:
- CVE-2013-0800

procmail:
- CVE-2014-3618
- CVE-2017-16844

python3:
- CVE-2020-14422

qemu:
- CVE-2012-3515
- CVE-2014-3615
- CVE-2014-3689
- CVE-2014-5388
- CVE-2014-7815
- CVE-2014-7840
- CVE-2015-1779
- CVE-2015-3209
- CVE-2015-4106
- CVE-2015-5158
- CVE-2015-6855
- CVE-2015-7295
- CVE-2015-7512
- CVE-2015-8345
- CVE-2015-8504
- CVE-2015-8558
- CVE-2015-8567
- CVE-2015-8568
- CVE-2015-8613
- CVE-2015-8619
- CVE-2015-8666
- CVE-2016-1568
- CVE-2016-2391
- CVE-2016-2857
- CVE-2016-2858
- CVE-2016-4001
- CVE-2016-4002
- CVE-2016-4020
- CVE-2016-4952
- CVE-2016-4964
- CVE-2016-5105
- CVE-2016-5106
- CVE-2016-5107
- CVE-2016-5126
- CVE-2016-5238
- CVE-2016-5337
- CVE-2016-5338
- CVE-2016-6351
- CVE-2016-6833
- CVE-2016-6834
- CVE-2016-6835
- CVE-2016-6836
- CVE-2016-6888
- CVE-2016-7116
- CVE-2016-7155
- CVE-2016-7156
- CVE-2016-7170
- CVE-2016-7421
- CVE-2016-7466
- CVE-2016-7994
- CVE-2016-8576
- CVE-2016-8577
- CVE-2016-8578
- CVE-2016-8667
- CVE-2016-8668
- CVE-2016-8669
- CVE-2016-8909
- CVE-2016-8910
- CVE-2016-9101
- CVE-2016-9102
- CVE-2016-9103
- CVE-2016-9104
- CVE-2016-9105
- CVE-2016-9106
- CVE-2016-9907
- CVE-2016-9911
- CVE-2016-9912
- CVE-2016-9921
- CVE-2016-9923
- CVE-2017-16845
- CVE-2017-18030
- CVE-2017-7377
- CVE-2017-7471
- CVE-2017-8112
- CVE-2017-8309
- CVE-2017-8379
- CVE-2018-11806
- CVE-2018-12617
- CVE-2018-15746
- CVE-2018-17958
- CVE-2018-18438

quagga:
- CVE-2016-4049

samba:
- CVE-2018-1050
- CVE-2018-1057

shadow:
- CVE-2013-4235

tiff:
- CVE-2015-7313

trousers:
- CVE-2019-18898

ubinux-kernel:
- CVE-2014-8171
- CVE-2017-1000377
- CVE-2017-5897
- CVE-2018-1000026
- CVE-2018-10840
- CVE-2018-10876
- CVE-2018-10882
- CVE-2018-10902
- CVE-2018-14625
- CVE-2018-16884
- CVE-2018-5873
- CVE-2019-10126
- CVE-2019-14899
- CVE-2019-20794
- CVE-2019-3819
- CVE-2019-3846
- CVE-2020-11725
- CVE-2020-12656
- CVE-2020-12888
- CVE-2020-8834

ubinux-kernel-lsdk:
- CVE-2014-8171
- CVE-2017-1000377
- CVE-2017-5897
- CVE-2018-1000026
- CVE-2018-10840
- CVE-2018-10876
- CVE-2018-10882
- CVE-2018-10902
- CVE-2018-14625
- CVE-2018-16884
- CVE-2018-5873
- CVE-2019-10126
- CVE-2019-14899
- CVE-2019-20794
- CVE-2019-20810
- CVE-2019-3016
- CVE-2019-3819
- CVE-2019-3846
- CVE-2020-10690
- CVE-2020-10711
- CVE-2020-10732
- CVE-2020-10757
- CVE-2020-10942
- CVE-2020-11494
- CVE-2020-11565
- CVE-2020-11608
- CVE-2020-11609
- CVE-2020-11668
- CVE-2020-11725
- CVE-2020-12464
- CVE-2020-12465
- CVE-2020-12653
- CVE-2020-12654
- CVE-2020-12655
- CVE-2020-12656
- CVE-2020-12657
- CVE-2020-12659
- CVE-2020-12768
- CVE-2020-12770
- CVE-2020-12771
- CVE-2020-12826
- CVE-2020-12888
- CVE-2020-13143
- CVE-2020-13974
- CVE-2020-15393
- CVE-2020-8428
- CVE-2020-8647
- CVE-2020-8648
- CVE-2020-8649
- CVE-2020-8834
- CVE-2020-8992
- CVE-2020-9383

util-linux:
- CVE-2015-5224
- CVE-2016-5011

wireshark:
- CVE-2020-15466

xrdp:
- CVE-2020-4044

zip:
- CVE-2018-13410

## 7. Contact us
If you find an issue in ubinux, you should report it in the issue tracker on GitHub.
