-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 18-Maio-2023 às 01:21
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estacionamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carro`
--

DROP TABLE IF EXISTS `carro`;
CREATE TABLE IF NOT EXISTS `carro` (
  `placa` int(11) NOT NULL AUTO_INCREMENT,
  `cor` varchar(30) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `marca` varchar(25) DEFAULT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `chassi` varchar(17) DEFAULT NULL,
  `calota` varchar(45) DEFAULT NULL,
  `tamanho` varchar(10) DEFAULT NULL,
  `tipo` varchar(35) DEFAULT NULL,
  `horario` varchar(7) DEFAULT NULL,
  `periodo` varchar(20) DEFAULT NULL,
  `senha` int(11) DEFAULT NULL,
  PRIMARY KEY (`placa`)
) ENGINE=MyISAM AUTO_INCREMENT=5898 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carro`
--

INSERT INTO `carro` (`placa`, `cor`, `descricao`, `marca`, `modelo`, `chassi`, `calota`, `tamanho`, `tipo`, `horario`, `periodo`, `senha`) VALUES
(5897, 'Vermelho', 'Carro 4', 'Honda', 'fusca', '12345678998745632', 'Esportiva', 'Grande', 'SUV', '10', 'Manhã', 25),
(3333, 'Azul', 'Carro 1', 'Chevrolet', 'Camaro', '12345678998745632', 'Esportiva', 'Medio', 'esportivo', '10:15', 'Manha', 123);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
