(ns leiningen.new.compojure
  (:use [leiningen.new.templates :only [renderer sanitize year name-to-path ->files]]))

(defn compojure
  "Create a new Compojure project"
  [name]
  (let [data {:name name
              :sanitized (sanitize name)
              :path (name-to-path name)
              :year (year)}
        render #((renderer "compojure") % data)]
    (->files data
             [".gitignore"  (render "gitignore")]
             ["project.clj" (render "project.clj")]
             ["README.md"   (render "README.md")]
             ["src/{{path}}/handler.clj"       (render "handler.clj")]
             ["test/{{path}}/test/handler.clj" (render "handler_test.clj")]
             "resources/public")))
