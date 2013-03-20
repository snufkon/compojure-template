(ns leiningen.new.compojure
  (:use [leiningen.new.templates :only [renderer sanitize year ->files]]
        [leinjacker.utils :only [lein-generation]]))

(def project-file
  (if (= (lein-generation) 2)
    "project_lein2.clj"
    "project_lein1.clj"))

(defn compojure
  "Create a new Compojure project"
  [name]
  (let [data {:name name
              :sanitized (sanitize name)
              :year (year)}
        render #((renderer "compojure") % data)]
    (->files data
             [".gitignore"  (render "gitignore")]
             ["project.clj" (render project-file)]
             ["README.md"   (render "README.md")]
             ["src/{{sanitized}}/handler.clj"       (render "handler.clj")]
             ["src/{{sanitized}}/views/layout.clj" (render "layout.clj")]
             ["src/{{sanitized}}/views/common.clj" (render "common.clj")]
             ["src/{{sanitized}}/views/top.clj" (render "top.clj")]
             ["src/{{sanitized}}/views/starter.clj" (render "starter.clj")]
             ["src/{{sanitized}}/views/hero.clj" (render "hero.clj")]
             ["src/{{sanitized}}/views/fluid.clj" (render "fluid.clj")]
             ["resources/public/css/bootstrap-responsive.css" (render "resources/public/css/bootstrap-responsive.css")]
             ["resources/public/css/bootstrap-responsive.min.css" (render "resources/public/css/bootstrap-responsive.min.css")]
             ["resources/public/css/bootstrap.css" (render "resources/public/css/bootstrap.css")]
             ["resources/public/css/bootstrap.min.css" (render "resources/public/css/bootstrap.min.css")]
             ["resources/public/js/jquery-1.9.1.min.js" (render "resources/public/js/jquery-1.9.1.min.js")]
             ["resources/public/js/bootstrap.js" (render "resources/public/js/bootstrap.js")]
             ["resources/public/js/bootstrap.min.js" (render "resources/public/js/bootstrap.min.js")]
             ["test/{{sanitized}}/test/handler.clj" (render "handler_test.clj")])))