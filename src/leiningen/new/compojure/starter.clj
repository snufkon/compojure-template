 (ns {{name}}.views.starter
   (:use [hiccup.element :only [link-to]]
         [{{name}}.views.common :only [navbar]])
   (:require [{{name}}.views.layout :as layout]))

(defn index []
  (layout/common-head
   [:style "body {padding-top: 60px;}"]
   (navbar
    (link-to {:class "brand"} "#" "Project name")
    [:div.nav-collapse.collapse
     [:ul.nav
      [:li.active (link-to "#" "Home")]
      [:li (link-to "#about" "About")]
      [:li (link-to "#contact" "Contact")]]])
   [:div.container
    [:h1 "Bootstrap starter template"]
    [:p "Use this document as a way to quick start any new project.<br> All you get is this message and a barebones HTML document."]]))
