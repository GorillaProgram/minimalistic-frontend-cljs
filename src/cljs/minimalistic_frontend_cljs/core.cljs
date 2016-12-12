(ns minimalistic-frontend-cljs.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [minimalistic-frontend-cljs.events]
              [minimalistic-frontend-cljs.subs]
              [minimalistic-frontend-cljs.views :as views]
              [minimalistic-frontend-cljs.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
