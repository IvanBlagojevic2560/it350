-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2016 at 05:39 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pz`
--

-- --------------------------------------------------------

--
-- Table structure for table `evidencija`
--

CREATE TABLE IF NOT EXISTS `evidencija` (
  `ID_evidencija` int(11) NOT NULL,
  `ID_sladoled` int(11) DEFAULT NULL,
  `ID_prodaja` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `evidencija`
--

INSERT INTO `evidencija` (`ID_evidencija`, `ID_sladoled`, `ID_prodaja`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 1, 1),
(4, 1, 1),
(5, 4, 6),
(6, 4, 7),
(7, 3, 5),
(8, 4, 9),
(9, 1, 6),
(10, 1, 10),
(11, 1, 11);

-- --------------------------------------------------------

--
-- Table structure for table `prodaja`
--

CREATE TABLE IF NOT EXISTS `prodaja` (
  `ID_prodaja` int(11) NOT NULL,
  `ID_radnik` int(11) DEFAULT NULL,
  `datum` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prodaja`
--

INSERT INTO `prodaja` (`ID_prodaja`, `ID_radnik`, `datum`) VALUES
(1, 1, '2016-01-09'),
(2, 1, '2016-01-09'),
(3, 1, '2016-01-09'),
(4, 1, '2016-01-09'),
(5, 5, '2016-01-09'),
(6, 3, '2016-01-09'),
(7, 5, '2016-01-09'),
(8, 5, '2016-01-19'),
(9, 5, '2016-01-19'),
(10, 7, '2016-01-26'),
(11, 1, '2016-01-23');

-- --------------------------------------------------------

--
-- Table structure for table `prodajnalokacija`
--

CREATE TABLE IF NOT EXISTS `prodajnalokacija` (
  `ID_prodajnaLokacija` int(11) NOT NULL,
  `adresa` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prodajnalokacija`
--

INSERT INTO `prodajnalokacija` (`ID_prodajnaLokacija`, `adresa`) VALUES
(1, 'Aleksinac'),
(2, 'Beograd'),
(3, 'Paracin\r\n'),
(4, 'Zemun');

-- --------------------------------------------------------

--
-- Table structure for table `radnik`
--

CREATE TABLE IF NOT EXISTS `radnik` (
  `ID_radnik` int(11) NOT NULL,
  `ID_prodajnaLokacija` int(11) DEFAULT NULL,
  `imeRadnika` text,
  `prezime` text,
  `jmbg` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `radnik`
--

INSERT INTO `radnik` (`ID_radnik`, `ID_prodajnaLokacija`, `imeRadnika`, `prezime`, `jmbg`) VALUES
(1, 1, 'Milos', 'Savic', '32132121'),
(2, 1, 'Sasa', 'Savic', '94883281'),
(3, 2, 'Petar', 'Ilic', '03992881'),
(4, 2, 'Marko', 'Ilic', '039201393'),
(5, 3, 'Mario', 'Petrovic', '0392093'),
(6, 3, 'Nenad', 'Petrovic', '039203029'),
(7, 4, 'Marija', 'Djuric', '03920092'),
(8, 4, 'Jelena', 'Marinkovic', '920173910');

-- --------------------------------------------------------

--
-- Table structure for table `recept`
--

CREATE TABLE IF NOT EXISTS `recept` (
  `ID_recept` int(11) NOT NULL,
  `ID_sastojak` int(11) DEFAULT NULL,
  `ID_sladoled` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `recept`
--

INSERT INTO `recept` (`ID_recept`, `ID_sastojak`, `ID_sladoled`) VALUES
(1, 2, 1),
(2, 3, 1),
(3, 3, 3),
(4, 1, 4),
(5, 3, 5),
(6, 4, 6);

-- --------------------------------------------------------

--
-- Table structure for table `sastojci`
--

CREATE TABLE IF NOT EXISTS `sastojci` (
  `ID_sastojak` int(11) NOT NULL,
  `kolicina` text,
  `imeSastojka` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sastojci`
--

INSERT INTO `sastojci` (`ID_sastojak`, `kolicina`, `imeSastojka`) VALUES
(1, '100gr', 'cokolada'),
(2, '300gr', 'jagoda'),
(3, '100 ml', 'mleka'),
(4, '300gr', 'visnja'),
(5, '210gr', 'cokolada');

-- --------------------------------------------------------

--
-- Table structure for table `sladoled`
--

CREATE TABLE IF NOT EXISTS `sladoled` (
  `ID_sladoled` int(11) NOT NULL,
  `ID_tip` int(11) DEFAULT NULL,
  `ime` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sladoled`
--

INSERT INTO `sladoled` (`ID_sladoled`, `ID_tip`, `ime`) VALUES
(1, 1, 'rumenko'),
(2, 1, 'Macho'),
(3, 2, 'Vanila'),
(4, 2, 'cokolada'),
(5, 3, 'plazma'),
(6, 3, 'visnja');

-- --------------------------------------------------------

--
-- Table structure for table `tipsladoleda`
--

CREATE TABLE IF NOT EXISTS `tipsladoleda` (
  `ID_tip` int(11) NOT NULL,
  `ime` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipsladoleda`
--

INSERT INTO `tipsladoleda` (`ID_tip`, `ime`) VALUES
(1, 'stapic'),
(2, 'kornet'),
(3, 'porodicni');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `evidencija`
--
ALTER TABLE `evidencija`
 ADD PRIMARY KEY (`ID_evidencija`), ADD KEY `FK_Relationship_10` (`ID_sladoled`), ADD KEY `FK_Relationship_8` (`ID_prodaja`);

--
-- Indexes for table `prodaja`
--
ALTER TABLE `prodaja`
 ADD PRIMARY KEY (`ID_prodaja`), ADD KEY `FK_Relationship_5` (`ID_radnik`);

--
-- Indexes for table `prodajnalokacija`
--
ALTER TABLE `prodajnalokacija`
 ADD PRIMARY KEY (`ID_prodajnaLokacija`);

--
-- Indexes for table `radnik`
--
ALTER TABLE `radnik`
 ADD PRIMARY KEY (`ID_radnik`), ADD KEY `FK_Relationship_1` (`ID_prodajnaLokacija`);

--
-- Indexes for table `recept`
--
ALTER TABLE `recept`
 ADD PRIMARY KEY (`ID_recept`), ADD KEY `FK_Relationship_6` (`ID_sladoled`), ADD KEY `FK_Relationship_7` (`ID_sastojak`);

--
-- Indexes for table `sastojci`
--
ALTER TABLE `sastojci`
 ADD PRIMARY KEY (`ID_sastojak`);

--
-- Indexes for table `sladoled`
--
ALTER TABLE `sladoled`
 ADD PRIMARY KEY (`ID_sladoled`), ADD KEY `FK_Relationship_9` (`ID_tip`);

--
-- Indexes for table `tipsladoleda`
--
ALTER TABLE `tipsladoleda`
 ADD PRIMARY KEY (`ID_tip`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `evidencija`
--
ALTER TABLE `evidencija`
ADD CONSTRAINT `FK_Relationship_10` FOREIGN KEY (`ID_sladoled`) REFERENCES `sladoled` (`ID_sladoled`),
ADD CONSTRAINT `FK_Relationship_8` FOREIGN KEY (`ID_prodaja`) REFERENCES `prodaja` (`ID_prodaja`);

--
-- Constraints for table `prodaja`
--
ALTER TABLE `prodaja`
ADD CONSTRAINT `FK_Relationship_5` FOREIGN KEY (`ID_radnik`) REFERENCES `radnik` (`ID_radnik`);

--
-- Constraints for table `radnik`
--
ALTER TABLE `radnik`
ADD CONSTRAINT `FK_Relationship_1` FOREIGN KEY (`ID_prodajnaLokacija`) REFERENCES `prodajnalokacija` (`ID_prodajnaLokacija`);

--
-- Constraints for table `recept`
--
ALTER TABLE `recept`
ADD CONSTRAINT `FK_Relationship_6` FOREIGN KEY (`ID_sladoled`) REFERENCES `sladoled` (`ID_sladoled`),
ADD CONSTRAINT `FK_Relationship_7` FOREIGN KEY (`ID_sastojak`) REFERENCES `sastojci` (`ID_sastojak`);

--
-- Constraints for table `sladoled`
--
ALTER TABLE `sladoled`
ADD CONSTRAINT `FK_Relationship_9` FOREIGN KEY (`ID_tip`) REFERENCES `tipsladoleda` (`ID_tip`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
