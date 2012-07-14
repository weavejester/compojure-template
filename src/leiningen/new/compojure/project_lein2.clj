(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]]
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler {{name}}.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.2"]]}})
