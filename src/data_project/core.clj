(ns data-manipuation.core
  (:gen-class))

(require '[clojure.string :as str])
(require '[clojure.java.io :as io])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "use read-data file in the repl"))



(defn processLine  
  [line]
  (println (str "test:" line (empty? line)))
  (if (empty? line)
      (println "skip") 
   (let  [splitline (str/split line #":")]
        { (keyword (nth splitline 0)) (nth splitline 1)})
  ))

(defn read-data 
  [file]
  (with-open [rdr (io/reader file)]
         (doall(map processLine (line-seq rdr))))
  )