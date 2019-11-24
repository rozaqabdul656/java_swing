-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 01, 2019 at 05:57 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_bank_sekolah`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `hapusanggota`(a char(11))
begin
	delete from tb_setoran where nim=a;
	delete from tb_penarikan where nim=a;
	delete from tb_saldo where nim=a;
	delete from tb_pinjaman where nim=a;
	delete from tb_pembayaran where nim=a;
	delete from tb_saldo_peminjaman where nim=a;
	delete from tb_anggota where nim=a;
	
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `hapuspinjaman`(a char(11))
begin
	delete from tb_pinjaman where nim=a;
	delete from tb_saldo_peminjaman where nim=a;
	
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE IF NOT EXISTS `data` (
  `Nama` varchar(25) NOT NULL,
  `Alamat` varchar(35) NOT NULL,
  `Pesan` varchar(45) NOT NULL,
  `TglPesan` date NOT NULL,
  `TglTerima` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`Nama`, `Alamat`, `Pesan`, `TglPesan`, `TglTerima`) VALUES
('Resa', 'Yogyakarta', 'Televisi', '2013-11-01', '2013-11-13'),
('Candra', 'Semarang', 'HP', '2013-11-15', '2013-11-18'),
('Ayu', 'Jakarta', 'Kitchen Set', '2013-11-05', '2013-11-08'),
('Resa', 'Yogyakarta', 'Televisi', '2013-11-01', '2013-11-13'),
('Candra', 'Semarang', 'HP', '2013-11-15', '2013-11-18'),
('Ayu', 'Jakarta', 'Kitchen Set', '2013-11-05', '2013-11-08');

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE IF NOT EXISTS `tb_admin` (
  `kode_admin` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_admin`
--

INSERT INTO `tb_admin` (`kode_admin`) VALUES
('admin');

-- --------------------------------------------------------

--
-- Table structure for table `tb_anggota`
--

CREATE TABLE IF NOT EXISTS `tb_anggota` (
  `nim` char(11) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `jenis_kelamin` varchar(25) NOT NULL,
  `tanggal` date NOT NULL,
  `alamat` varchar(40) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `saldo_awal` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_anggota`
--

INSERT INTO `tb_anggota` (`nim`, `nama`, `jenis_kelamin`, `tanggal`, `alamat`, `kelas`, `saldo_awal`) VALUES
('12312312311', 'THANOS', 'Perempuan', '2019-01-03', 'JALAN DAKOTA', '7 - G', 0),
('12312312312', 'FIAS', 'laki-laki', '2019-01-02', 'CIMAHI', '7 - A', 10000),
('12324324324', 'Terserah ', 'laki-laki', '2019-08-28', 'Terserah ', '7 - A', 100000),
('21231231231', 'Bayi Thanos', 'laki-laki', '2019-01-10', 'Jalan Dakota 8a', '7 - B', 10000),
('21232321232', 'Iron man', 'laki-laki', '2019-01-09', 'Jalan dakota', '7 - B', 10000),
('22222222222', 'RADAASDSDDS', 'laki-laki', '2019-08-03', 'BANDUNG ', '7 - A', 0),
('23122312312', 'KUYa', 'laki-laki', '2019-08-02', 'Banjarnegara', '7 - B', 10),
('23324223423', 'Thanos', 'laki-laki', '2019-01-01', 'asdasdasdsadadadadaddad', '7 - S', 1),
('32345443443', 'Spiderman', 'laki-laki', '2019-01-03', 'Bandung ', '7 - B', 10990),
('32345656897', 'Mickey', 'laki-laki', '2019-01-03', 'Cimahi', '7 - A', 20000),
('34349098987', 'ASD ', 'Perempuan', '2019-09-06', 'BANDUNG', '7 - A', 1),
('56554565454', 'Hasi', 'laki-laki', '2019-01-08', 'Bandung', '7 - A', 10000),
('77777777777', 'a ghghg ghg', 'laki-laki', '2019-08-06', 'mn', '8 - Z', 90);

--
-- Triggers `tb_anggota`
--
DELIMITER //
CREATE TRIGGER `nambah_anggota` AFTER INSERT ON `tb_anggota`
 FOR EACH ROW begin
	declare total bigint;
    insert into tb_saldo values(' ',new.nim,new.tanggal,'Saldo Awal ',new.saldo_awal,' ',new.saldo_awal);
	
end
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_pembayaran`
--

CREATE TABLE IF NOT EXISTS `tb_pembayaran` (
`id` int(11) NOT NULL,
  `nim` char(11) NOT NULL,
  `saldo` bigint(20) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_pembayaran`
--

INSERT INTO `tb_pembayaran` (`id`, `nim`, `saldo`, `tanggal`) VALUES
(4, '21231231231', 20000, '2019-01-01'),
(5, '32345443443', 19000, '2019-01-09'),
(6, '21232321232', 1, '2019-01-09'),
(7, '12312312311', 2, '2019-01-01'),
(8, '12324324324', 10000, '2019-01-29'),
(9, '21232321232', 10000, '2019-08-08'),
(10, '21232321232', 5000, '2019-08-15'),
(11, '21232321232', 2500, '2019-08-15'),
(12, '12324324324', 0, '2019-08-14');

--
-- Triggers `tb_pembayaran`
--
DELIMITER //
CREATE TRIGGER `nambah_bayar` AFTER INSERT ON `tb_pembayaran`
 FOR EACH ROW begin
	
	
	declare total bigint;
	SELECT saldo into total FROM tb_saldo_peminjaman where nim=new.nim ORDER BY id DESC  LIMIT 0,1 ;
	insert into tb_saldo_peminjaman (nim,tanggal,keterangan,debet,saldo) values(new.nim,new.tanggal,"Pembayaran",new.saldo,total-new.saldo);
	update tb_pinjaman set besar_pinjaman=total-new.saldo where nim=new.nim;
    
end
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_penarikan`
--

CREATE TABLE IF NOT EXISTS `tb_penarikan` (
`id` int(11) NOT NULL,
  `nim` varchar(15) NOT NULL,
  `tanggal_penarikan` date NOT NULL,
  `besar_penarikan` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_penarikan`
--

INSERT INTO `tb_penarikan` (`id`, `nim`, `tanggal_penarikan`, `besar_penarikan`) VALUES
(25, '21232321232', '2019-01-02', 89),
(26, '12312312312', '2019-01-02', 1),
(27, '12312312311', '2019-01-03', 10),
(28, '12324324324', '2019-01-21', 100000),
(29, '12312312311', '2019-09-07', 122);

--
-- Triggers `tb_penarikan`
--
DELIMITER //
CREATE TRIGGER `penarikan` AFTER INSERT ON `tb_penarikan`
 FOR EACH ROW begin
	declare total bigint;
	SELECT saldo into total FROM tb_saldo where nim=new.nim ORDER BY id DESC  LIMIT 0,1 ;
	insert into tb_saldo (nim,tanggal,keterangan,kredit,saldo) values(new.nim,new.tanggal_penarikan,"Penarikan",new.besar_penarikan,total-new.besar_penarikan);
	update tb_anggota set saldo_awal=total-new.besar_penarikan where nim=new.nim;
end
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_pinjaman`
--

CREATE TABLE IF NOT EXISTS `tb_pinjaman` (
  `nim` char(11) NOT NULL,
  `besar_pinjaman` bigint(20) NOT NULL,
  `tanggal` date NOT NULL,
  `jaminan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_pinjaman`
--

INSERT INTO `tb_pinjaman` (`nim`, `besar_pinjaman`, `tanggal`, `jaminan`) VALUES
('12312312311', 10000, '2019-08-08', 'KTP'),
('12324324324', 9000, '2019-08-22', 'k'),
('21232321232', 2500, '2019-01-02', 'surat'),
('32345443443', 10000, '2019-08-09', 'KTP'),
('32345656897', 90000, '2019-01-02', '');

--
-- Triggers `tb_pinjaman`
--
DELIMITER //
CREATE TRIGGER `nambah_peminjaman` AFTER INSERT ON `tb_pinjaman`
 FOR EACH ROW begin
	insert into tb_saldo_peminjaman(nim,tanggal,keterangan,kredit,saldo)values(new.nim,new.tanggal,"Saldo Peminjaman",new.besar_pinjaman,new.besar_pinjaman);
end
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_saldo`
--

CREATE TABLE IF NOT EXISTS `tb_saldo` (
`id` int(11) NOT NULL,
  `nim` char(11) NOT NULL,
  `tanggal` varchar(30) NOT NULL,
  `keterangan` varchar(30) NOT NULL,
  `debit` bigint(20) NOT NULL,
  `kredit` bigint(20) NOT NULL,
  `saldo` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_saldo`
--

INSERT INTO `tb_saldo` (`id`, `nim`, `tanggal`, `keterangan`, `debit`, `kredit`, `saldo`) VALUES
(28, '21231231231', '2019-01-10', 'Saldo Awal ', 10000, 0, 10000),
(29, '21232321232', '2019-01-09', 'Saldo Awal ', 10000, 0, 10000),
(30, '32345443443', '2019-01-03', 'Saldo Awal ', 10000, 0, 10000),
(34, '21232321232', '2019-01-02', 'Setoran Tabungan', 89, 0, 10089),
(35, '32345443443', '2019-01-02', 'Setoran Tabungan', 90, 0, 10090),
(37, '21232321232', '2019-01-02', 'Penarikan', 0, 89, 10000),
(39, '12312312312', '2019-01-02', 'Saldo Awal ', 1, 0, 1),
(40, '23324223423', '2019-01-01', 'Saldo Awal ', 1, 0, 1),
(41, '12312312312', '2019-01-02', 'Penarikan', 0, 1, 0),
(42, '12312312311', '2019-01-03', 'Saldo Awal ', 10, 0, 10),
(43, '12312312311', '2019-01-02', 'Setoran Tabungan', 10, 0, 20),
(44, '12312312311', '2019-01-03', 'Setoran Tabungan', 12, 0, 32),
(45, '12312312311', '2019-01-03', 'Penarikan', 0, 10, 22),
(46, '12324324324', '2019-08-28', 'Saldo Awal ', 100000, 0, 100000),
(47, '12324324324', '2019-01-15', 'Setoran Tabungan', 100000, 0, 200000),
(48, '12324324324', '2019-01-21', 'Penarikan', 0, 100000, 100000),
(49, '12312312312', '2019-08-01', 'Setoran Tabungan', 10000, 0, 10000),
(50, '77777777777', '2019-08-06', 'Saldo Awal ', 90, 0, 90),
(51, '32345443443', '2019-08-02', 'Setoran Tabungan', 900, 0, 10990),
(52, '56554565454', '2019-01-08', 'Saldo Awal ', 10000, 0, 10000),
(53, '23122312312', '2019-08-02', 'Saldo Awal ', 10, 0, 10),
(54, '22222222222', '2019-08-03', 'Saldo Awal ', 0, 0, 0),
(55, '34349098987', '2019-09-06', 'Saldo Awal ', 1, 0, 1),
(56, '12312312311', '2019-09-06', 'Setoran Tabungan', 100, 0, 122),
(57, '12312312311', '2019-09-07', 'Penarikan', 0, 122, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tb_saldo_peminjaman`
--

CREATE TABLE IF NOT EXISTS `tb_saldo_peminjaman` (
`id` int(11) NOT NULL,
  `nim` char(11) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(30) NOT NULL,
  `debet` bigint(20) NOT NULL,
  `kredit` bigint(20) NOT NULL,
  `saldo` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_saldo_peminjaman`
--

INSERT INTO `tb_saldo_peminjaman` (`id`, `nim`, `tanggal`, `keterangan`, `debet`, `kredit`, `saldo`) VALUES
(1, '21232321232', '0000-00-00', '', 0, 0, 20000),
(2, '12312312311', '0000-00-00', 'Saldo Peminjaman', 0, 10000, 10000),
(3, '32345443443', '2019-08-09', 'Saldo Peminjaman', 0, 10000, 10000),
(4, '21232321232', '2019-08-08', 'Pembayaran', 10000, 0, 10000),
(5, '21232321232', '2019-08-15', 'Pembayaran', 5000, 0, 5000),
(6, '21232321232', '2019-08-15', 'Pembayaran', 2500, 0, 2500),
(7, '12324324324', '2019-08-22', 'Saldo Peminjaman', 0, 9000, 9000),
(8, '12324324324', '2019-08-14', 'Pembayaran', 0, 0, 9000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_setoran`
--

CREATE TABLE IF NOT EXISTS `tb_setoran` (
`id` int(11) NOT NULL,
  `nim` varchar(15) NOT NULL,
  `besar_setoran` bigint(20) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_setoran`
--

INSERT INTO `tb_setoran` (`id`, `nim`, `besar_setoran`, `tanggal`) VALUES
(7, '32345656897', 20000, '2019-08-02'),
(20, '21232321232', 89, '2019-01-02'),
(21, '32345443443', 90, '2019-01-02'),
(23, '12312312311', 10, '2019-01-02'),
(24, '12312312311', 12, '2019-01-03'),
(25, '12324324324', 100000, '2019-01-15'),
(26, '12312312312', 10000, '2019-08-01'),
(27, '32345443443', 900, '2019-08-02'),
(28, '12312312311', 100, '2019-09-06');

--
-- Triggers `tb_setoran`
--
DELIMITER //
CREATE TRIGGER `setoran` AFTER INSERT ON `tb_setoran`
 FOR EACH ROW begin
	declare total bigint;
	SELECT saldo into total FROM tb_saldo where nim=new.nim ORDER BY id DESC  LIMIT 0,1 ;
	insert into tb_saldo (nim,tanggal,keterangan,debit,saldo) values(new.nim,new.tanggal,"Setoran Tabungan",new.besar_setoran,total+new.besar_setoran);
	update tb_anggota set saldo_awal=total+new.besar_setoran where nim=new.nim;
end
//
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_anggota`
--
ALTER TABLE `tb_anggota`
 ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tb_pembayaran`
--
ALTER TABLE `tb_pembayaran`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_penarikan`
--
ALTER TABLE `tb_penarikan`
 ADD PRIMARY KEY (`id`), ADD KEY `FK_tb_penarikan` (`nim`);

--
-- Indexes for table `tb_pinjaman`
--
ALTER TABLE `tb_pinjaman`
 ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tb_saldo`
--
ALTER TABLE `tb_saldo`
 ADD PRIMARY KEY (`id`), ADD KEY `FK_tb_saldo` (`nim`);

--
-- Indexes for table `tb_saldo_peminjaman`
--
ALTER TABLE `tb_saldo_peminjaman`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_setoran`
--
ALTER TABLE `tb_setoran`
 ADD PRIMARY KEY (`id`), ADD KEY `FK_tb_setoran` (`nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_pembayaran`
--
ALTER TABLE `tb_pembayaran`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `tb_penarikan`
--
ALTER TABLE `tb_penarikan`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT for table `tb_saldo`
--
ALTER TABLE `tb_saldo`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=58;
--
-- AUTO_INCREMENT for table `tb_saldo_peminjaman`
--
ALTER TABLE `tb_saldo_peminjaman`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `tb_setoran`
--
ALTER TABLE `tb_setoran`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=29;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_penarikan`
--
ALTER TABLE `tb_penarikan`
ADD CONSTRAINT `FK_tb_penarikan` FOREIGN KEY (`nim`) REFERENCES `tb_anggota` (`nim`);

--
-- Constraints for table `tb_pinjaman`
--
ALTER TABLE `tb_pinjaman`
ADD CONSTRAINT `tb_pinjaman_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `tb_anggota` (`nim`);

--
-- Constraints for table `tb_saldo`
--
ALTER TABLE `tb_saldo`
ADD CONSTRAINT `FK_tb_saldo` FOREIGN KEY (`nim`) REFERENCES `tb_anggota` (`nim`);

--
-- Constraints for table `tb_setoran`
--
ALTER TABLE `tb_setoran`
ADD CONSTRAINT `FK_tb_setoran` FOREIGN KEY (`nim`) REFERENCES `tb_anggota` (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
