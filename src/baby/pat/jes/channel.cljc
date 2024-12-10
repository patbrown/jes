(ns baby.pat.jes.channel
  (:require [baby.pat.jes.card :as card]
            [baby.pat.jes.tag :as tag]
            [baby.pat.jes.trait :as trait]
            [baby.pat.jes.vt :as vt]))

(def id {::id   ::id
         ::card card/one
         ::vt   ::vt/qkw})

(def channel {::id   ::channel
              ::card card/one
              ::vt   ::vt/ident})

(def variant {::id   ::variant
              ::card card/one
              ::vt   ::vt/ident})

(def buffer-type {::id   ::buffer-type
                  ::card card/one
                  ::vt   ::vt/qkw})

(def buffer-size {::id   ::buffer-size
                  ::card card/one
                  ::vt   ::vt/num})

(def xform {::id   ::xform
            ::card card/one
            ::vt   ::vt/ident-or-qkw})

(def process-with {::id   ::process-with
                   ::card card/one
                   ::vt   ::vt/ident-or-qkw})

(def tags (tag/tags-for "channel"))
(def traits (trait/traits-for "channel"))

(def attrs [id channel variant buffer-type buffer-size xform tags traits])

(def dt {:baby.pat.jes.dt/id       :baby.pat.jes.dt/consumer
         :baby.pat.jes.dt/parent   [:baby.pat.jes.dt/id :baby.pat.jes.dt/dt ]
         :baby.pat.jes.dt/attrs    attrs})
