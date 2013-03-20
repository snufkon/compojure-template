(ns {{name}}.views.common)

(defn navbar [& body]
  [:div.navbar.navbar-inverse.navbar-fixed-top
   [:div.navbar-inner
    [:div.container
     [:botton.btn.btn-navbar {:type "button" :data-toggle "collapse" :data-target ".nav-collapse"}
      [:span.icon-bar]
      [:span.icon-bar]
      [:span.icon-bar]]
     body]]])

(defn navbar-fluid [& body]
  [:div.navbar.navbar-inverse.navbar-fixed-top
   [:div.navbar-inner
    [:div.container-fluid
     [:botton.btn.btn-navbar {:type "button" :data-toggle "collapse" :data-target ".nav-collapse"}
      [:span.icon-bar]
      [:span.icon-bar]
      [:span.icon-bar]]
     body]]])