DESCRIPTION = "Create Image of ubinux${PV}"
ALLOW_EMPTY = "1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

LSB_IMAGE_FEATURES = " splash ssh-server-openssh hwcodecs package-management "
IMAGE_FEATURES += " ${LSB_IMAGE_FEATURES} "
IMAGE_FEATURES += " dev-pkgs staticdev-pkgs "

BASE_PKG_GROUPS = " \
	packagegroup-core-boot \
	${CORE_IMAGE_EXTRA_INSTALL} \
"

LSB_PKG_GROUPS = " \
	packagegroup-core-full-cmdline \
"

IMAGE_INSTALL = " \
	${BASE_PKG_GROUPS} \
	${LSB_PKG_GROUPS} \
	${UBINUX_PKGS} \
"

UBINUX_PKGS = " \
	adcli \
	acpid \
	alsa-utils \
	anthy \
	atk \
	audit \
	auditd \
	audispd-plugins \
	bastille \
	bdftopcf \
	bind \
	bind-utils \
	babeld \
	blktool \
	bluez5 \
	bmap-tools \
	boost \
	byacc \
	pbzip2 \
	busybox-httpd \
	cairo \
	ccs-tools \
	checksec \
	chkconfig \
	cifs-utils \
	cluster-glue \
	cluster-glue-plugin-interfacemgr \
	consolekit \
	coreutils-doc \
	cpufrequtils \
	crash \
	cryptodev-linux \
	czmq \
	daq \
	devmem2 \
	dfu-util \
	dhcp-server \
	dialog \
	dosfstools \
	edac-utils \
	encodings \
	expat-bin \
	fatresize \
	flex \
	fio \
	firewalld \
	font-alias \
	font-util \
	fontconfig \
	foomatic-filters \
	freetype \
	f2fs-tools \
	fscryptctl \
	fuse3 \
	geoip \
	geoipupdate \
	geoip-database \
	gcc \
	gconf \
	gdb \
	gdbserver \
	ghostscript \
	glib-2.0-utils \
	gmime \
	gnutls \
	gobject-introspection \
	groff \
	grpc \
	gtk+ \
	hdf5 \
	hdparm \
	hexedit \
	hicolor-icon-theme \
	icu \
	init-ifupdown \
	initscripts \
	inotify-tools \
	iputils-clockdiff \
	irqbalance \
	ifenslave \
	iozone3 \
	ipc-run \
	iptraf-ng \
	libjpeg-turbo \
	libhugetlbfs \
	iwd \
	kbd \
	kexec-tools \
	less \
	libcap-ng \
	libdmx \
	libdrm \
	libffi \
	libfontenc \
	libgcrypt \
	libgpg-error \
	libice \
	libidn \
	libnewt \
	libnl \
	libnss-nis \
	libpcap \
	libpipeline \
	libpciaccess \
	libpeas \
	libpng \
	libsdl \
	libsm \
	libasound \
	libtirpc \
	libtool \
	libuio \
	libuser \
	libx11 \
	libxau \
	libxcb \
	libxcomposite \
	libxcursor \
	libxdamage \
	libxdmcp \
	libxext \
	libxfixes \
	libxfont \
	libxft \
	libxi \
	libxinerama \
	libxkbfile \
	libxml-perl \
	libxmu \
	libxpm \
	libxrandr \
	libxrender \
	libxres \
	libxslt \
	libxt \
	libxtst \
	libxv \
	libxxf86vm \
	libzip \
	linux-libc-headers-dev \
	lksctp-tools \
	ltp \
	lrzsz \
	lsof \
	lxc \
	lynis \
	man-db \
	man-pages \
	makedumpfile \
	mesa-demos \
	minicom \
	mingetty \
	mmc-utils \
	mkfontscale \
	mmc-utils \
	mpfr \
	mtr \
	esmtp \
	mtd-utils \
	mtd-utils-jffs2 \
	nautilus \
	netkit-telnet \
	netkit-rsh-client \
	netkit-rsh-server \
	nfs-export-root \
	openhpi \
	openssh \
	paxctl \
	paho-mqtt-c \
	pango \
	pbzip2 \
	pcregrep \
	pcmciautils \
	php \
	pixman \
	pkgconfig \
	pm-utils \
	polkit \
	powertop \
	ppp \
	xorgproto-dev \
	rp-pppoe \
	rp-pppoe-server \
	rp-pppoe-relay \
	rpcsvc-proto \
	ruby \
	prelink \
	resource-agents \
	rgb \
	rsync \
	samba \
	screen \
	setserial \
	setxkbmap \
	slang \
	spitools \
	strace \
	stress \
	strongswan \
	stunnel \
	subversion \
	sysprof \
	sysstat \
	tiff \
	udev \
	util-macros \
	usbutils \
	watchdog \
	xdg-utils \
	wpa-supplicant \
	xauth \
	xcb-proto-dev \
	xdelta3 \
	xdpyinfo \
	xf86-input-evdev \
	xf86-input-keyboard \
	xf86-input-mouse \
	xf86-input-synaptics \
	xf86-video-fbdev \
	xhost \
	xinit \
	xkbcomp \
	xinit \
	xkbcomp \
	xkeyboard-config \
	xmodmap \
	xmlsec1 \
	xorg-minimal-fonts \
	xorgxrdp \
	xprop \
	xrandr \
	xrdp \
	xrestop \
	xserver-xorg \
	xset \
	xtrans-dev \
	xvinfo \
	xwd \
	xwininfo \
	xwud \
	bridge-utils \
	ca-certificates \
	corosync \
	crda \
	cryptsetup \
	ctapi-common \
	cyrus-sasl \
	cyrus-sasl-bin \
	daemontools \
	dash \
	ttf-dejavu-sans \
	ttf-dejavu-sans-mono \
	ttf-dejavu-sans-condensed \
	ttf-dejavu-serif \
	ttf-dejavu-serif-condensed \
	ttf-dejavu-common \
	multipath-tools \
	dovecot \
	dracut \
	ecryptfs-utils \
	eject \
	fbset \
	fetchmail \
	fuse \
	fuse-utils \
	drbd-utils \
	heartbeat \
	hostapd \
	hwdata \
	i2c-tools \
	imsettings \
	indent \
	iperf3 \
	iw \
	kbd \
	keyutils \
	libconfig \
	libdbi \
	libedit \
	libesmtp \
	libgxim \
	liblockfile \
	libnet \
	libnih \
	libnotify \
	libol \
	libp11 \
	libsmi \
	libssh2 \
	libutempter \
	libunwind \
	libxaw6 \
	libxaw7 \
	libxvmc \
	linux-atm \
	lldpd \
	rrdtool \
	lockfile-progs \
	logcheck \
	logfsprogs \
	logwatch \
	ltrace \
	lua \
	lvm2 \
	mailcap \
	mcpp \
	monit \
	nana \
	nana-dev \
	ncftp \
	net-snmp-client \
	net-snmp-server \
	net-snmp-mibs \
	nmap \
	nss-pam-ldapd \
	ntp \
	ntp-utils \
	openct \
	opensc \
	openipmi \
	openl2tp \
	openldap \
	openldap-slapd \
	openvpn \
	openvpn-sample \
	openwsman \
	passwdqc \
	pam-plugin-access \
	pam-plugin-cracklib \
	pam-plugin-debug \
	pam-plugin-deny \
	pam-plugin-echo \
	pam-plugin-env \
	pam-plugin-exec \
	pam-plugin-faildelay \
	pam-plugin-filter \
	pam-plugin-ftp \
	pam-plugin-group \
	pam-plugin-issue \
	pam-plugin-keyinit \
	pam-plugin-lastlog \
	pam-plugin-limits \
	pam-plugin-listfile \
	pam-plugin-localuser \
	pam-plugin-loginuid \
	pam-plugin-mail \
	pam-plugin-mkhomedir \
	pam-plugin-motd \
	pam-plugin-namespace \
	pam-plugin-nologin \
	pam-plugin-permit \
	pam-plugin-pwhistory \
	pam-plugin-rhosts \
	pam-plugin-rootok \
	pam-plugin-securetty \
	pam-plugin-shells \
	pam-plugin-stress \
	pam-plugin-succeed-if \
	pam-plugin-tally \
	pam-plugin-tally2 \
	pam-plugin-time \
	pam-plugin-timestamp \
	pam-plugin-umask \
	pam-plugin-unix \
	pam-plugin-warn \
	pam-plugin-xauth \
	perf \
	pcsc-lite \
	pkcs11-helper \
	postfix \
	procmail \
	ptpd \
	quagga \
	radvd \
	rarpd \
	samhain-client \
	sblim-sfcb \
	sblim-sfcc \
	sessreg \
	sgpio \
	smartmontools \
	smem \
	sshfs-fuse \
	stress \
	syslog-ng \
	takao-fonts \
	tcpdump \
	tcsh \
	tftp-hpa \
	tftp-hpa-server \
	tk \
	tomoyo-tools \
	vlan \
	vsftpd \
	wireshark \
	xf86-input-void \
	xfsprogs \
	xkbevd \
	xkbprint \
	xkbutils \
	iceauth \
	xgamma \
	xlsatoms \
	xlsclients \
	xlsfonts \
	xrdb \
	xrefresh \
	xsetmode \
	xsetroot \
	xstdcmap \
	twm \
	xterm \
	zabbix \
	libcgroup \
	alsa-conf \
	alsa-server \
	alsa-state \
	avahi-autoipd \
	avahi-utils \
	base-passwd-update \
	catchsegv \
	cpp \
	cpp-symlinks \
	cxpm \
	db-bin \
	dhcp-omshell \
	dhcp-relay \
	e2fsprogs-e2fsck \
	e2fsprogs-mke2fs \
	e2fsprogs-tune2fs \
	elfutils-binutils \
	g++ \
	g++-symlinks \
	gcc-symlinks \
	gcov \
	gdbserver \
	gtk-demo \
	gtk-immodule-am-et \
	gtk-immodule-cedilla \
	gtk-immodule-cyrillic-translit \
	gtk-immodule-inuktitut \
	gtk-immodule-ipa \
	gtk-immodule-multipress \
	gtk-immodule-thai \
	gtk-immodule-ti-er \
	gtk-immodule-ti-et \
	gtk-immodule-viqr \
	gtk-immodule-xim \
	gtk-printbackend-file \
	gtk-printbackend-lpr \
	gdk-pixbuf \
	gdk-pixbuf-loader-ani \
	gdk-pixbuf-loader-bmp \
	gdk-pixbuf-loader-ico \
	gtk3-immodule-viqr \
	kbd-consolefonts \
	kbd-consoletrans \
	kbd-keymaps \
	kbd-unimaps \
	kdump \
	kexec \
	libdrm-tests \
	libgail \
	libjs-sizzle \
	libjs-jquery \
	libkcapi \
	libmemusage \
	libpam-xtests \
	libpulsecore \
	libsegfault \
	libsotruss \
	libulockmgr \
	libxslt-bin \
	lmsensors-sensors \
	lmsensors-sensord \
	lmsensors-config-sensord \
	lmsensors-sensorsdetect \
	babeltrace \
	mesa-megadriver \
	nano \
	ncurses-terminfo \
	ncurses-tools \
	nfs-utils-stats \
	nscd \
	ntpdate \
	openssh-misc \
	openssh-sftp \
	openssh-sftp-server \
	openssl-engines \
	openssl-misc \
	opkg \
	opkg-config-base \
	pango-modules \
	gawk \
	ppp-l2tp \
	ppp-minconn \
	ppp-oa \
	ppp-password \
	ppp-radius \
	ppp-tools \
	ppp-winbind \
	prelink-cron \
	psmisc-extras \
	qtbase \
	qttools \
	qttools-tools \
	qtdeclarative \
	qtchooser \
	qtxmlpatterns \
	qtsensors \
	qtsvg \
	qtwebchannel \
	qtwebkit \
	qtwebsockets \
	qtlocation \
	qtmultimedia \
	qtquickcontrols \
	qtscript \
	pulseaudio-lib-alsa-util \
	pulseaudio-lib-avahi-wrap \
	pulseaudio-lib-bluez5-util \
	pulseaudio-lib-cli \
	pulseaudio-lib-oss-util \
	pulseaudio-lib-protocol-cli \
	pulseaudio-lib-protocol-esound \
	pulseaudio-lib-protocol-http \
	pulseaudio-lib-protocol-native \
	pulseaudio-lib-protocol-simple \
	pulseaudio-lib-rtp \
	pulseaudio-misc \
	pulseaudio-server \
	quagga-bgpd \
	quagga-isisd \
	quagga-ospf6d \
	quagga-ospfclient \
	quagga-ospfd \
	quagga-ripd \
	quagga-ripngd \
	quagga-doc \
	rpm-build \
	shared-mime-info-data \
	sln \
	smack \
	snappy \
	sxpm \
	tslib-calibrate \
	tslib-tests \
	tzdata-africa \
	tzdata-americas \
	tzdata-antarctica \
	tzdata-arctic \
	tzdata-asia \
	tzdata-atlantic \
	tzdata-australia \
	tzdata-europe \
	tzdata-misc \
	tzdata-pacific \
	tzdata-posix \
	tzdata-right \
	uftrace \
	uhubctl \
	uim \
	upm \
	util-linux-hwclock \
	util-linux-agetty \
	util-linux-blkid \
	util-linux-cfdisk \
	util-linux-fdisk \
	util-linux-fsck \
	util-linux-losetup \
	util-linux-lscpu \
	util-linux-mcookie \
	util-linux-mkfs \
	util-linux-mount \
	util-linux-sfdisk \
	util-linux-swaponoff \
	util-linux-umount \
	util-linux-uuidgen \
	util-linux-uuidd \
	xserver-xorg-extension-glx \
	xserver-xorg-module-libwfb \
	xserver-xorg-xvfb \
	xev \
	gradm \
	libxml-simple-perl \
	\
	nicstat \
	dstat \
	tiptop \
	blktrace \
	systemtap \
	iotop \
	iptraf \
	\
	btrfs-tools \
	openvswitch \
	\
	openlmi-tools \
	opensaf \
	\
	python-cachetools \
	python-configparser \
	python-fail2ban \
	python-heat \
	python-heatclient \
	python-pyinotify \
	python-dbus \
	python-linecache2 \
	python-pywbem \
	python-pycodestyle \
	python-stevedore \
	python-traceback2 \
	python-pyasn1-modules \
	\
	python3-cachetools \
	python3-configparser \
	python3-editor \
	python3-fail2ban \
	python3-pyinotify \
	python3-dbus \
	python3-pycodestyle \
	python3-pywbem \
	python3-scapy \
	python3-stevedore \
	python3-xxhash \
	python3-wtforms \
	\
	xmlto \
	expect \
	cim-schema-exper \
	upm \
	trace-cmd \
"


DEPENDS = ""
RDEPENDS = ""

inherit core-image
