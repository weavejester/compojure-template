(ns leiningen.new.compojure
  (:use leiningen.new.templates))

(defn compojure
  "Create a new Compojure project"
  [name]
  (let [data   {:name name, :sanitized (sanitize name)}
        render #((renderer "compojure") % data)]
    (->files data
             [".gitignore"  (render "gitignore")]
             ["project.clj" (render "project.clj")]
             ["README.md"   (render "README.md")])))
