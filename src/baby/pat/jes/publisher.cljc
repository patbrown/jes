(ns baby.pat.jes.publisher
  (:require [baby.pat.jes.card :as card]
            [baby.pat.jes.tag :as tag]
            [baby.pat.jes.trait :as trait]
            [baby.pat.jes.vt :as vt]))

(def id {::id   ::id
         ::card card/one
         ::vt   ::vt/qkw})

(def reporter {::id   ::reporter
               ::card card/one
               ::vt   ::vt/ident})

(def rule {::id   ::rule
           ::card card/one
           ::vt   ::vt/ident-or-qkw})

(def tags (tag/tags-for "publisher"))
(def traits (trait/traits-for "publisher"))

(def attrs [id reporter rule tags traits])

(def dt {:baby.pat.jes.dt/id       :baby.pat.jes.dt/publisher
         :baby.pat.jes.dt/parent   [:baby.pat.jes.dt/id :baby.pat.jes.dt/id]
         :baby.pat.jes.dt/attrs    attrs})
