(ns minimalistic-frontend-cljs.events
    (:require [re-frame.core :as re-frame]
              [minimalistic-frontend-cljs.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
