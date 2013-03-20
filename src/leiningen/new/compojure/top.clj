(ns {{name}}.views.top
  (:use [hiccup.element :only [link-to]])
  (:require [{{name}}.views.layout :as layout]))

(defn index []
  (layout/common-head
   [:style "body {padding-top: 30px; padding-left: 10px;}"]
   [:h3 (link-to "/starter" "Starter template")]
   [:h3 (link-to "/hero" "Basic marketing site")]
   [:h3 (link-to "/fluid" "Fluid layout")]))