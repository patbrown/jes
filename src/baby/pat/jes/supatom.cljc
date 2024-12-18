(ns baby.pat.jes.supatom
  (:require [baby.pat.jes.attr :as attr]
            [baby.pat.jes.card :as card]
            [baby.pat.jes.dt :as dt]
            [baby.pat.jes.tag :as tag]
            [baby.pat.jes.trait :as trait]
            [baby.pat.jes.vt :as vt]))

(def id {::attr/id   ::id
         ::attr/card card/one
         ::attr/vt   ::vt/qkw})

(def connection {::attr/id   ::connection
                 ::attr/card card/one
                 ::attr/vt   ::vt/map})

(def variant {::attr/id   ::variant
              ::attr/card card/one
              ::attr/vt   ::vt/qkw})

(def commit-with {::attr/id   ::commit-with
                  ::attr/card card/one
                  ::attr/vt   ::vt/fn-or-ident})

(def snapshot-with {::attr/id   ::snapshot-with
                    ::attr/card card/one
                    ::attr/vt   ::vt/fn-or-ident})

(def read-with {::attr/id   ::read-with
                ::attr/card card/one
                ::attr/vt   ::vt/fn-or-ident})

(def write-with {::attr/id   ::write-with
                 ::attr/card card/one
                 ::attr/vt   ::vt/fn-or-ident})

(def lock {::attr/id   ::lock
           ::attr/card card/one
           ::attr/vt   ::vt/any})

(def source-atom {::attr/id   ::source-atom
                  ::attr/card card/one
                  ::attr/vt   ::vt/atom-or-ident})

(def watches-atom {::attr/id   ::watches-atom
                   ::attr/card card/one
                   ::attr/vt   ::vt/qkw})

(def supatom {::attr/id   ::supatom
              ::attr/card card/one
              ::attr/vt   ::vt/any})

(def tags (tag/tags-for "publisher"))
(def traits (trait/traits-for "publisher"))

(def attrs [id connection variant commit-with snapshot-with read-with write-with watches-atom supatom tags traits])

(def dt {::dt/id       ::dt/supatom
         ::dt/parent   [::dt/id ::dt/id]
         ::dt/attrs    attrs})
