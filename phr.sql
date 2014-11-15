-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 15, 2014 at 12:33 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `phr`
--

-- --------------------------------------------------------

--
-- Table structure for table `organization`
--

CREATE TABLE IF NOT EXISTS `organization` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `organization`
--

INSERT INTO `organization` (`oid`, `name`, `type`) VALUES
(1, 'ABC Hospital', 'hospital'),
(2, 'DEF Hospital', 'hospital'),
(3, 'IABC Insurance Co.', 'insurance'),
(4, 'IXYZ Insurance Co.', 'insurance'),
(5, 'Healthy Mens Club A', 'health club'),
(6, 'Healthy Life Club B', 'health club');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(100) NOT NULL,
  `date_of_birth` varchar(20) NOT NULL,
  `address` text NOT NULL,
  `master_key_checksum` text NOT NULL,
  `public_key_checksum` text NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`pid`, `full_name`, `date_of_birth`, `address`, `master_key_checksum`, `public_key_checksum`) VALUES
(1, 'Sandip Pandey', '1991/12/01', 'Haaksbergerstraat 82', 'd1ab830bda76a099caeeeed73db37ef27956b3f8', '57d9e1a941e347ce28c96a4690ad4a7a27d67649');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(100) NOT NULL,
  `orgn_id` int(11) NOT NULL,
  `attributes` text NOT NULL,
  `secret_key_checksum` text NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uid`, `full_name`, `orgn_id`, `attributes`, `secret_key_checksum`) VALUES
(1, ' Herson', 1, 'type:doctor hospital:Hospital_A', '4e8dc49dbf69a6e17ca5723ca621ed247f381ffd'),
(2, 'Yazan', 2, 'type:doctor hospital:Hospital_DEF', '2d12ec2c731f4c8bb09cc6f7b9673e0b275f802a');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
