DROP TABLE IF EXISTS `book`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` varchar(45) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `revision` tinyint(4) DEFAULT '0',
  `published_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `isbn_UNIQUE` (`isbn`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
INSERT INTO `book` VALUES (1,'893e2d97-d950-4402-b71b-d49f5fd6c841','In search of Lost Time','Marcel Proust',NULL,0,NULL),(2,'3664486c-c23f-446c-b2f5-8fa639379e69','Ulysses','James Joyce',NULL,0,NULL),(3,'965b5c38-4db0-4f2a-a2a2-17aba51327a5','Don Quixote','Miguel de Cervantes',NULL,0,NULL),(4,'8d599793-bac3-4c96-b8ed-fef771bf8427','Moby Dick','Herman Melville',NULL,0,NULL),(5,'11359a70-570d-45f4-b19e-58980f20f3bd','Hamlet','William Shakespeare',NULL,0,NULL),(6,'91d0af71-ebb1-48b8-9450-f45594aa92e1','War and Peace','Leo Tolstoy','Story publisher house',1,'2019-01-16 13:37:27');
UNLOCK TABLES;

-- Dump completed on 2019-01-16 16:26:17
