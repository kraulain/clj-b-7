(ns clj-b-7.core
  (:require [cheshire.core :as json]))

(defonce books-raw (slurp "https://raw.githubusercontent.com/joakimskoog/AnApiOfIceAndFire/master/data/books.json"))

(defonce character-raw (slurp "https://raw.githubusercontent.com/joakimskoog/AnApiOfIceAndFire/master/data/characters.json"))

(defonce houses-raw (slurp "https://raw.githubusercontent.com/joakimskoog/AnApiOfIceAndFire/master/data/houses.json"))
