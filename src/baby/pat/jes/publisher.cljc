(ns baby.pat.jes.publisher
  (:require [baby.pat.jes.attr :as attr]
            [baby.pat.jes.card :as card]
            [baby.pat.jes.dt :as dt]
            [baby.pat.jes.tag :as tag]
            [baby.pat.jes.trait :as trait]
            [baby.pat.jes.vt :as vt]))

(def id {::attr/id   ::id
         ::attr/card card/one
         ::attr/vt   ::vt/qkw})

(def reporter {::attr/id   ::reporter
               ::attr/card card/one
               ::attr/vt   ::vt/ident})

(def rule {::attr/id   ::rule
           ::attr/card card/one
           ::attr/vt   ::vt/ident-or-qkw})

(def tags (tag/tags-for "publisher"))
(def traits (trait/traits-for "publisher"))

(def attrs [id reporter rule tags traits])

(def dt {::dt/id       ::dt/publisher
         ::dt/parent   [::dt/id ::dt/dt]
         ::dt/attrs    attrs})
