(ns baby.pat.jes.ix
  (:require [baby.pat.jes.attr :as attr]
            [baby.pat.jes.card :as card]
            [baby.pat.jes.dt :as dt]
            [baby.pat.jes.prim :refer [as-prim]]
            [baby.pat.jes.vt :as vt]))

(def requires {::attr/id ::requires
               ::attr/card card/many
               ::attr/vt ::vt/idents})

(def provides {::attr/id ::provides
               ::attr/card card/many
               ::attr/vt ::vt/idents})

(def ix (update-in (as-prim "ix" ::vt/fn) [::dt/attrs] conj requires provides))

