(ns {{name}}.views.layout
    (:use [hiccup.page :only [html5 include-css include-js]]))

(defn common-head [head & body]
  (html5 {:lang "en"}
         [:head
          [:meta {:charset "utf-8"}]
          [:title "Bootstrap, from Twitter"]
          [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
          [:meta {:name "description" :content ""}]
          [:meta {:name "author" :content ""}]
          (include-css "/css/bootstrap.css")
          (include-css "/css/bootstrap-responsive.css")
          head]
         [:body body
          (include-js "/js/jquery-1.9.1.min.js")
          (include-js "/js/bootstrap.js")]))

(defn common [& body]
  (common-head nil body))
