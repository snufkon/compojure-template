(ns {{name}}.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [{{name}}.views.top :as top]
            [{{name}}.views.starter :as starter]
            [{{name}}.views.hero :as hero]
            [{{name}}.views.fluid :as fluid]))

(defroutes app-routes
  (GET "/" [] (top/index))
  (GET "/starter" [] (starter/index))
  (GET "/hero" [] (hero/index))
  (GET "/fluid" [] (fluid/index))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
