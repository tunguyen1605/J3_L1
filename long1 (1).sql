-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2020 at 09:24 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `long1`
--

-- --------------------------------------------------------

--
-- Table structure for table `answer`
--

CREATE TABLE `answer` (
  `answer` varchar(1000) NOT NULL,
  `correct` int(11) NOT NULL,
  `questionid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `answer`
--

INSERT INTO `answer` (`answer`, `correct`, `questionid`) VALUES
('1 ', 2, 1),
('2 ', 1, 1),
('3', 2, 1),
('4', 2, 1),
('Ban', 1, 2),
('ghe ', 2, 2),
('tu', 2, 2),
('Cay', 2, 2),
('200', 2, 3),
('202', 1, 3),
('201 ', 2, 3),
('203', 2, 3),
('cay', 1, 4),
('Quat', 2, 4),
('xe', 2, 4),
('Tu', 2, 4),
('tu lanh', 2, 5),
('Xe dap', 2, 5),
('xe ', 1, 5),
('chen', 2, 5),
('1009', 2, 6),
('1006', 2, 6),
('1007', 1, 6),
('1008', 2, 6),
('Man', 2, 7),
('Xoai', 2, 7),
('Tao', 1, 7),
('TU', 2, 7),
('43', 2, 8),
('42', 1, 8),
('44', 2, 8),
('46', 2, 8),
('81', 1, 9),
('83', 2, 9),
('82', 2, 9),
('84', 2, 9),
('cua', 2, 10),
('Nha', 1, 10),
('Tu', 2, 10),
('Xe', 2, 10),
('10', 2, 11),
('20', 1, 11),
('30', 2, 11),
('40', 2, 11),
('18', 1, 12),
('19', 2, 12),
('20', 2, 12),
('21', 2, 12),
('50', 2, 13),
('51', 2, 13),
('40', 1, 13),
('10', 2, 13),
('14', 2, 14),
('15', 2, 14),
('18', 1, 14),
('13', 2, 14);

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `questionid` int(11) NOT NULL,
  `question` varchar(1000) NOT NULL,
  `created` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`questionid`, `question`, `created`) VALUES
(1, '1+1 = ?', '18-11-2020'),
(2, 'Table Is mean ?', '18-11-2020'),
(3, '(10 * 20) + 2 =?', '18-11-2020'),
(4, 'Tree Is mean ?', '18-11-2020'),
(5, 'Car is Mean ?', '18-11-2020'),
(6, '999+9 = ?', '18-11-2020'),
(7, 'What apple Mean ?', '18-11-2020'),
(8, '7 * 3 + 21 = ?', '18-11-2020'),
(9, '75 + 6 = ?', '18-11-2020'),
(10, 'What House Mean ?', '19-11-2020'),
(11, '10 + 10 = ?', '19-11-2020'),
(12, '9 + 9 = ?', '19-11-2020'),
(13, '20 +20 = ?', '19-11-2020'),
(14, '7+6 = ?', '19-11-2020');

-- --------------------------------------------------------

--
-- Table structure for table `question1`
--

CREATE TABLE `question1` (
  `ID` int(11) NOT NULL,
  `question` varchar(200) NOT NULL,
  `op1` varchar(200) NOT NULL,
  `op2` varchar(200) NOT NULL,
  `op3` varchar(200) NOT NULL,
  `op4` varchar(200) NOT NULL,
  `Answer` int(11) NOT NULL,
  `date` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `uUsername` varchar(50) NOT NULL,
  `uPassword` varchar(100) NOT NULL,
  `uEmail` varchar(100) NOT NULL,
  `uType` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uUsername`, `uPassword`, `uEmail`, `uType`) VALUES
('tu', '202cb962ac59075b964b07152d234b70', 'tutu@gmail.com', 1),
('tu1', '202cb962ac59075b964b07152d234b70', 'tutu1@gmail.com', 1),
('tutu11', '202cb962ac59075b964b07152d234b70', 'sangmagic123@gmail.com', 1),
('tutu113', '123', 'sangmagic123@gmail.com', 1),
('tuyet11', '202cb962ac59075b964b07152d234b70', 'asdzxczx@gmail.com', 1),
('tu2', '202cb962ac59075b964b07152d234b70', 'sangmagic123@gmail.com', 1),
('tu3', '202cb962ac59075b964b07152d234b70', 'sangmagic12qwe3@gmail.com', 2),
('tu11', '202cb962ac59075b964b07152d234b70', 'mmmmc@gmail.com', 2),
('', 'd41d8cd98f00b204e9800998ecf8427e', 'sangmagic123@asdl.com', 1),
('adasdasdasdasd', '3d08520ef755628356a53d9c7d0ed9ae', 'sangmagic123@gmail.com', 1),
('asasdasdas=', 'd41d8cd98f00b204e9800998ecf8427e', '', 1),
('tu1234567', '4dfd3690262c4780042e9f0f705ca0c0', 'asdasd@gmail.com', 1),
('tutu1234', '4dfd3690262c4780042e9f0f705ca0c0', 'asdjasd@gmail.com', 2),
('tu222222', 'e1db50e5753692e42d46b4d60e290af6', 'asdhjasd@gmail.com', 2),
('tu12345678', 'e1db50e5753692e42d46b4d60e290af6', 'asdkasd@gmail.com', 1),
('tu12345679', 'e1db50e5753692e42d46b4d60e290af6', 'asjdkasd2@gmail.com', 1),
('tutu', '202cb962ac59075b964b07152d234b70', 'sangmagic1qweqwe23@gmail.com', 1),
('tut', '202cb962ac59075b964b07152d234b70', 'qweqweqw@gmail.com', 1),
('tu111112', 'e1db50e5753692e42d46b4d60e290af6', 'asdhasd@gmail.com', 1),
('tutuaqrqwrqwr', 'e1db50e5753692e42d46b4d60e290af6', 'sangmagqrqwric123@gmail.com', 1),
('tu1234567wqrqwrqwrq', '202cb962ac59075b964b07152d234b70', 'sangmaqrqwwrqwrqwrgic123@gmail.com', 1),
('tu123456712124124124', '202cb962ac59075b964b07152d234b70', 'sanqweqweassxzaxagmagic123@gmail.com', 1),
('tu1234567123123', '202cb962ac59075b964b07152d234b70', 'saqqqngqqmagic123@gmail.com', 1),
('tu4', 'e1db50e5753692e42d46b4d60e290af6', 'sangmagic123222@gmail.com', 1),
('tu5', '202cb962ac59075b964b07152d234b70', '123@fpt.vn', 1),
('tu9', 'e1db50e5753692e42d46b4d60e290af6', 'asdjasd@gmail.com', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `answer`
--
ALTER TABLE `answer`
  ADD KEY `questionId_ibkf1` (`questionid`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`questionid`);

--
-- Indexes for table `question1`
--
ALTER TABLE `question1`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Date` (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `questionid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `question1`
--
ALTER TABLE `question1`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
