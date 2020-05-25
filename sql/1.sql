CREATE DATABASE  IF NOT EXISTS `taobao` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `taobao`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: taobao
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `comment_id` int(10) NOT NULL AUTO_INCREMENT,
  `goodsid` int(10) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `comment_content` varchar(1000) NOT NULL,
  `comment_good` int(10) DEFAULT NULL,
  `comment_bad` int(10) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,1,'joker','这本书很好，很优秀1',1210,230),(2,2,'joker','这本书23很好，很优秀1',120,301),(3,1,'joker','这本书2133很3好，很优秀1',110,302),(4,1,'joker','这本书213很213好，很优秀1',120,330),(5,1,'joker','这本书3121很好，很优秀1',1320,330),(6,1,'joker','这本书3很好，很优秀1',10,30),(7,1,'joker','这本书122331212很好，很优秀1',540,330),(8,2,'joker','这本书4很好，很优秀1',130,30),(9,2,'joker','这本书很13好，很优秀1',130,30);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goods`
--

DROP TABLE IF EXISTS `goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goods` (
  `goods_id` int(10) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(100) NOT NULL,
  `goods_type` int(100) NOT NULL,
  `seller_id` int(11) NOT NULL,
  `banner_img` varchar(100) DEFAULT NULL,
  `priviewInformation` text,
  `sell_price` double DEFAULT NULL,
  `original_price` double DEFAULT NULL,
  `surplus` int(10) DEFAULT NULL,
  `sale` int(10) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goods`
--

LOCK TABLES `goods` WRITE;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` VALUES (1,'小王子',1,2,'8644ebf81a4c510fbd910c636e59252dd42aa576.jpg','《小王子》是法国作家安托万·德·圣·埃\n克苏佩里于1942年写成的著名儿童文学短篇小说。',20,10,88,2),(2,'围城',1,1,'d62a6059252dd42afe9d48d4033b5bb5c9eab83d.jpg','《围城故事发生于1920到1940年代。主角方鸿\n渐是个从中国南方乡绅家庭走出的青年人，迫于家庭压力与同乡周家女子订亲。',25,15,85,5),(3,'了不起的盖茨比',1,1,'b58f8c5494eef01f685e6f0de1fe9925bd317dab.jpg','《了不起的盖茨比》是美国作家弗·司各特·菲茨杰拉德创作的一部以以20世纪20年代的纽约市及长岛为背景的中篇小说，出版于1925年。',30,15,99,1),(4,'果冻',2,1,'5bafa40f4bfbfbede08aa7047cf0f736aec31ffd.jpg','《果冻是一种西方甜食，呈半固体状，由食用明胶加水、糖、果汁制成。亦称啫喱，外观晶莹，色泽鲜艳，口感软滑。\n果冻里也包含布丁一类。',20,15,995,5),(5,'辣条',3,1,'e61190ef76c6a7efdfaaf361f0faaf51f2de66ec.jpg','辣条又叫大面筋、素牛筋等，它是以小麦粉或其他谷物、豆类为主要原料做成的一种食品。 [1]  辣条是一种零食。\n辣条含有大量食品添加剂（十几种、二十种）。 [1]  尚无统一制作标准，市面上辣条厂家一般按照地标执行生产，',5,2.5,999,0),(6,'三只松鼠',3,1,'7acb0a46f21fbe09d4268ae761600c338644adcd.png','三只松鼠股份有限公司成立于2012年，公司总部在芜湖，位于安徽省，是中国第一家定位于纯互联网食品品牌的企业，也是当前中国销售规模最大的食品电商企业。',40,25,9998,1),(7,'电磁炉',3,2,'10dfa9ec8a136327bf1ab11a998fa0ec08fac720.jpg','电磁炉又称为电磁灶，1957年第一台家用电磁炉诞生于德国。1972年，美国开始生产电磁炉，20世纪80年代初电磁炉在欧美及日本开始热销。',600,288,999,0),(8,'辣子鸡',3,2,'622762d0f703918f3048993a5c3d269758eec4a1.jpg','辣子鸡，是一道经典的川渝地区的特色传统名肴。一般以整鸡为主料，加上葱、干辣椒、花椒、盐、胡椒、味精等多种材料精制而成，虽然是同一道菜，各地制作也各有特色。\n辣子鸡因各地的不同制作方法也有不同的特色，深受各地人们的喜爱。此菜成菜色泽棕红油亮，麻辣味浓。',30,20,87,0),(9,'溜溜球',4,2,'u=2960164578,3390200428&fm=27&gp=0.jpg','悠悠球（YO-YO），相传16世纪，菲律宾的狩猎民族在狩猎和格斗使用的器具中，在绳子的前端挂着重物似悠悠的武器。在公元1700年的时候，悠悠由中国东传至日本的长崎，向西传至印度，并由印度传至欧洲。在日本，悠悠被形象地叫作“独轮车”或“钱轮”，深受亚洲年轻人的欢迎。18世纪初叶，悠悠在英国以“王子财宝”',60,20,86,1),(10,'口红',5,2,'54fbb2fb43166d22d1ccad024b2309f79152d2e9.jpg','口红的色调与女性的发型、指甲油色调和服装变化密切相关，变得更具有潮流色彩。特别是近年来各种珠光粉和处理颜料的使用，使口红的色调更加多样化，质感更加舒适。与其他美容化妆品的发展趋势相似，它继续保持美容为主，兼顾保湿、滋养和防晒功能。',300,200,87,0),(11,'马铃薯',1,1,'/1/12/74db0f5c-812b-4b74-af5f-e6d9b81413df.jpg','智者，无疑是他当之无愧的冠冕：希望和失望、亢奋和凄冷、轩冕荣华和踽踽独处，在他生命的历程中交替更迭，如环无端，不知所终，促使他领悟宇宙人生的真相，探索生活的底蕴。无尽无休的苦难，没有使他厌倦人生，变得冷漠；',231,12,213,0),(12,'小王',1,1,'8644ebf81a4c510fbd910c636e59252dd42aa576.jpg','xiao',20,22,3,1);
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goodstype`
--

DROP TABLE IF EXISTS `goodstype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goodstype` (
  `goods_type` int(10) NOT NULL AUTO_INCREMENT,
  `type_information` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`goods_type`),
  UNIQUE KEY `type_information` (`type_information`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goodstype`
--

LOCK TABLES `goodstype` WRITE;
/*!40000 ALTER TABLE `goodstype` DISABLE KEYS */;
INSERT INTO `goodstype` VALUES (1,'书籍'),(2,'家电'),(4,'工具'),(7,'服装'),(6,'汽车'),(9,'没事'),(10,'游戏'),(3,'珠宝'),(8,'运动'),(5,'鲜花');
/*!40000 ALTER TABLE `goodstype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `order_key` int(10) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(100) NOT NULL,
  `user_name` varchar(10) NOT NULL,
  `order_time` timestamp NULL DEFAULT NULL,
  `all_money` double DEFAULT NULL,
  PRIMARY KEY (`order_key`),
  UNIQUE KEY `order_id` (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,'213213123241312','peter','2019-06-08 16:00:00',85),(2,'YczXZbJknh8GLW5','joker','2019-06-26 07:28:35',100),(3,'rIqYYYG9an51OlA','joker','2019-06-26 07:29:34',190);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderitem`
--

DROP TABLE IF EXISTS `orderitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderitem` (
  `orderitem_key` int(10) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(100) NOT NULL,
  `goods_id` int(10) NOT NULL,
  `seller_name` varchar(10) NOT NULL,
  `buy_number` int(10) NOT NULL,
  `item_money` double DEFAULT NULL,
  PRIMARY KEY (`orderitem_key`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderitem`
--

LOCK TABLES `orderitem` WRITE;
/*!40000 ALTER TABLE `orderitem` DISABLE KEYS */;
INSERT INTO `orderitem` VALUES (1,'213213123241312',1,'joker',3,60),(2,'213213123241312',2,'peter',1,25),(3,'YczXZbJknh8GLW5',2,'peter',4,100),(4,'rIqYYYG9an51OlA',1,'joker',2,40),(5,'rIqYYYG9an51OlA',3,'peter',1,30),(6,'rIqYYYG9an51OlA',4,'peter',1,20),(7,'rIqYYYG9an51OlA',6,'peter',1,40),(8,'rIqYYYG9an51OlA',9,'peter',1,60);
/*!40000 ALTER TABLE `orderitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  `user_money` double NOT NULL,
  `user_lev` int(11) NOT NULL DEFAULT '1',
  `user_address` varchar(100) DEFAULT NULL,
  `user_email` varchar(100) DEFAULT NULL,
  `user_banner_img` varchar(1000) DEFAULT NULL,
  `user_telephone` varchar(100) DEFAULT NULL,
  `user_introduce` varchar(1000) DEFAULT NULL,
  `user_gender` int(11) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'joker','123',25,1,'南京','203462009@qq.com','https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590311354953&di=ea3b02c8f9e45664f87794a4c3692e26&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F35%2F34%2F19300001295750130986345801104.jpg','touxiang.jpg','炸鸡店',0),(2,'peter','123456',817,1,'北京','203462009@qq.com','15651771520','touxiang.jpg','新石器烤肉',0),(3,'admin','123wan',888,2,'北京','203462009@qq.com','15651771520','touxiang.jpg','黄焖鸡店',0),(5,'pp','213',0,1,NULL,NULL,NULL,NULL,NULL,1),(6,'dd','123',0,1,NULL,NULL,NULL,NULL,NULL,1);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingcar`
--

DROP TABLE IF EXISTS `shoppingcar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shoppingcar` (
  `shoppingcar_key` int(10) NOT NULL AUTO_INCREMENT,
  `goods_id` int(10) NOT NULL,
  `user_id` int(11) NOT NULL,
  `shopping_goodsnumber` int(10) NOT NULL,
  `shopping_needmoney` double DEFAULT NULL,
  PRIMARY KEY (`shoppingcar_key`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingcar`
--

LOCK TABLES `shoppingcar` WRITE;
/*!40000 ALTER TABLE `shoppingcar` DISABLE KEYS */;
INSERT INTO `shoppingcar` VALUES (3,1,2,2,40),(9,10,1,1,300),(10,7,1,1,600),(11,6,1,1,40),(12,2,3,1,200);
/*!40000 ALTER TABLE `shoppingcar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'taobao'
--

--
-- Dumping routines for database 'taobao'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-25  9:27:12
