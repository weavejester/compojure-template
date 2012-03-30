(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.0.1"]]
  :plugins [[lein-ring "0.6.2"]]
  :ring {:handler {{name}}.handler/app})
