(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.3"]]
  :plugins [[lein-ring "0.7.5"]]
  :ring {:handler {{name}}.handler/app}
  :dev-dependencies [[ring-mock "0.1.3"]])
