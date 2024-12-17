(ns baby.pat.jes.consumer
  (:require [baby.pat.jes.card :as card]
            [baby.pat.jes.tag :as tag]
            [baby.pat.jes.trait :as trait]
            [baby.pat.jes.vt :as vt]))

(def id {::id   ::id
         ::card card/one
         ::vt   ::vt/qkw})

(def publisher {::id   ::publisher
                ::card card/one
                ::vt   ::vt/ident})

(def variant {::id   ::variant
              ::card card/one
              ::vt   ::vt/ident})

(def topic-fn {::id   ::topic-fn
               ::card card/one
               ::vt   ::vt/ident-or-qkw})

(def process-with {::id   ::process-with
                   ::card card/one
                   ::vt   ::vt/ident-or-qkw})

(def tags (tag/tags-for "consumer"))
(def traits (trait/traits-for "consumer"))

(def attrs [id publisher variant topic-fn process-with tags traits])

(def dt {:baby.pat.jes.dt/id       :baby.pat.jes.dt/consumer
         :baby.pat.jes.dt/parent   [:baby.pat.jes.dt/id :baby.pat.jes.dt/dt ]
         :baby.pat.jes.dt/attrs    attrs})
