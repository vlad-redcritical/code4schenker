-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2018 at 10:23 PM
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
-- Table structure for table `delivery`
--

CREATE TABLE `delivery` (
  `id` bigint(20) NOT NULL,
  `client_name` varchar(255) NOT NULL,
  `delivery_nr` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `delivery`
--

INSERT INTO `delivery` (`id`, `client_name`, `delivery_nr`) VALUES
(1, 'Schenker Code ', '14342');

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

-- --------------------------------------------------------

--
-- Table structure for table `location_log`
--

CREATE TABLE `location_log` (
  `id` bigint(20) NOT NULL,
  `latitude` varchar(255) NOT NULL,
  `longitude` varchar(255) NOT NULL,
  `timestamp` datetime NOT NULL,
  `delivery_entity_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `location_log`
--

INSERT INTO `location_log` (`id`, `latitude`, `longitude`, `timestamp`, `delivery_entity_id`) VALUES
(1, '52.089896', '20.358171', '2018-12-08 00:00:00', 1),
(2, '52.039170', '20.017667', '2018-12-08 00:20:00', 1),
(3, '51.889253', '19.575543', '2018-12-08 00:40:00', 1),
(4, '52.147483', '18.516344', '2018-12-08 01:00:00', 1),
(5, '52.301246', '17.162046', '2018-12-08 01:20:00', 1),
(6, '52.391429', '16.283705', '2018-12-08 01:40:00', 1),
(7, '52.305019', '15.274704', '2018-12-08 01:40:00', 1),
(8, '52.319417', '13.539470', '2018-12-08 02:00:00', 1),
(9, '52.330636', '12.682946', '2018-12-08 02:20:00', 1),
(10, '52.333920', '12.528761', '2018-12-08 02:40:00', 1),
(11, '52.262702', '12.376962', '2018-12-08 03:00:00', 1),
(12, '52.173213', '11.545104', '2018-12-08 03:20:00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `param_log`
--

CREATE TABLE `param_log` (
  `id` bigint(20) NOT NULL,
  `value` varchar(255) NOT NULL,
  `delivery_param_entity_id` bigint(20) DEFAULT NULL,
  `point_entity_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `param_log`
--

INSERT INTO `param_log` (`id`, `value`, `delivery_param_entity_id`, `point_entity_id`) VALUES
(4, '25', 1, 1),
(5, '26', 1, 2),
(6, '27', 1, 3),
(7, '28', 1, 4),
(8, '29', 1, 5),
(9, '25', 1, 6),
(10, '24', 1, 7),
(11, '23', 1, 8),
(12, '22', 1, 9),
(13, '21', 1, 10),
(14, '15', 2, 1),
(15, '16', 2, 2),
(16, '17', 2, 3),
(17, '18', 2, 4),
(18, '19', 2, 5),
(19, '15', 2, 6),
(20, '14', 2, 7),
(21, '13', 2, 8),
(22, '12', 2, 9),
(23, '11', 2, 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `delivery`
--
ALTER TABLE `delivery`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `delivery_param`
--
ALTER TABLE `delivery_param`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `location_log`
--
ALTER TABLE `location_log`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKgsijly8qwfxltt1xh6vcalyad` (`delivery_entity_id`);

--
-- Indexes for table `param_log`
--
ALTER TABLE `param_log`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK48kghhkyuiymu4trj1po72hef` (`delivery_param_entity_id`),
  ADD KEY `FKeqqel9adhy9mk7gvfxs4x7rbv` (`point_entity_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `delivery`
--
ALTER TABLE `delivery`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `delivery_param`
--
ALTER TABLE `delivery_param`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `location_log`
--
ALTER TABLE `location_log`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `param_log`
--
ALTER TABLE `param_log`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `location_log`
--
ALTER TABLE `location_log`
  ADD CONSTRAINT `FKgsijly8qwfxltt1xh6vcalyad` FOREIGN KEY (`delivery_entity_id`) REFERENCES `delivery` (`id`);

--
-- Constraints for table `param_log`
--
ALTER TABLE `param_log`
  ADD CONSTRAINT `FK48kghhkyuiymu4trj1po72hef` FOREIGN KEY (`delivery_param_entity_id`) REFERENCES `delivery_param` (`id`),
  ADD CONSTRAINT `FKeqqel9adhy9mk7gvfxs4x7rbv` FOREIGN KEY (`point_entity_id`) REFERENCES `location_log` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
