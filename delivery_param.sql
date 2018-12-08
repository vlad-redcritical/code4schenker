-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2018 at 10:22 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schenker`
--

-- --------------------------------------------------------

--
-- Table structure for table `delivery_param`
--

CREATE TABLE `delivery_param` (
  `id` bigint(20) NOT NULL,
  `max_value` varchar(255) DEFAULT NULL,
  `min_value` varchar(255) DEFAULT NULL,
  `param_name` varchar(255) NOT NULL,
  `param_unit` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `delivery_param`
--

INSERT INTO `delivery_param` (`id`, `max_value`, `min_value`, `param_name`, `param_unit`) VALUES
(1, '90', '10', 'Temperature', 'C'),
(2, '20', '10', 'Air pressure', 'Bar');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `delivery_param`
--
ALTER TABLE `delivery_param`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `delivery_param`
--
ALTER TABLE `delivery_param`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
