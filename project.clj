(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2127"]]

  :plugins [[lein-cljsbuild "1.0.1"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds [{:id "hello-world"
              :source-paths ["src"]
              :compiler {
                :output-to "hello_world.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
