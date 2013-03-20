 (ns {{name}}.views.hero
   (:use [hiccup.element :only [link-to]]
         [{{name}}.views.common :only [navbar]])
   (:require [{{name}}.views.layout :as layout]))

(defn index []
  (layout/common-head
   [:style "body {padding-top: 60px; padding-bottom: 40px;}"]
   (navbar
    (link-to {:class "brand"} "#" "Project name")
    [:div.nav-collapse.collapse
     [:ul.nav
      [:li.active (link-to "#" "Home")]
      [:li (link-to "#about" "About")]
      [:li (link-to "#contact" "Contact")]
      [:li.dropdown
       (link-to {:class "dropdown-toggle" :data-toggle "dropdown"} "#" "Dropdown " [:b.caret])
       [:ul.dropdown-menu
        [:li (link-to "#" "Action")]
        [:li (link-to "#" "Another action")]
        [:li (link-to "#" "Something else here")]
        [:li.divider]
        [:li.nav-header "Nav header"]
        [:li (link-to "#" "Separated link")]
        [:li (link-to "#" "One more separated link")]]]]
     [:form.navbar-form.pull-right
      [:input.span2 {:type "text" :placeholder "Email"}]
      " "                             
      [:input.span2 {:type "password" :placeholder "Password"}]
      " "
      [:button.btn {:type "submit"} "Sign in"]]])

   [:div.container
    [:div.hero-unit
     [:h1 "Hello, world!"]
     [:p "This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique."]
     [:p (link-to {:class "btn btn-primary btn-large"} "#" "Learn more &raquo;")]]
    [:div.row
     [:div.span4
      [:h2 "Heading"]
      [:p "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. "]
      [:p (link-to {:class "btn"} "#" "View details &raquo;")]]
     [:div.span4
      [:h2 "Heading"]
      [:p "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. "]
      [:p (link-to {:class "btn"} "#" "View details &raquo;")]]
     [:div.span4
      [:h2 "Heading"]
      [:p "Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus."]
      [:p (link-to {:class "btn"} "#" "View details &raquo;")]]]
    [:hr]
    [:footer
     [:p "&copy; Company 2013"]]]))