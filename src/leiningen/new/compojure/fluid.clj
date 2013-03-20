 (ns {{name}}.views.fluid
   (:use [hiccup.element :only [link-to]]
         [hiccup.def :only [defhtml]]
         [{{name}}.views.common :only [navbar-fluid]])
   (:require [{{name}}.views.layout :as layout]))

(defn heading []
  [:div.span4
   [:h2 "Heading"]
   [:p "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. "]
   [:p (link-to {:class "btn"} "#" "View details &raquo;")]])

(defhtml headings [n]
  (for [x (range n)]
    (heading)))

(defn index []
  (layout/common-head
   [:style
     "body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }

      @media (max-width: 980px) {
        /* Enable use of floated navbar text */
        .navbar-text.pull-right {
          float: none;
          padding-left: 5px;
          padding-right: 5px;
        }
      }"
    ]
   (navbar-fluid
    (link-to {:class "brand"} "#" "Project name")
    [:div.nav-collapse.collapse
     [:p.navbar-text.pull-right
      "Logged in as "
      (link-to {:class "navbar-link"} "#" "Username")]
     [:ul.nav
      [:li.active (link-to "#" "Home")]
      [:li (link-to "#about" "About")]
      [:li (link-to "#contact" "Contact")]]])
   [:div.container-fluid
    [:div.row-fluid
     [:div.span3
      [:div.well.sidebar-nav
       [:ul.nav.nav-list
        [:li.nav-header "Sidebar"]
        [:li.active (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li.nav-header "Sidebar"]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li.nav-header "Sidebar"]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]
        [:li (link-to "#" "Link")]]]]
     [:div.span9
      [:div.hero-unit
       [:h1 "Hello, world!"]
       [:p "This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique."]
       [:p (link-to {:class "btn btn-primary btn-large"} "#" "Learn more &raquo;")]]
      [:div.row-fluid
       (headings 3)]
      [:div.row-fluid
       (headings 3)]]]
     [:hr]
     [:footer
      [:p "&copy; Company 2013"]]]))

