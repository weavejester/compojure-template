(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler {{name}}.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
