(ns baby.pat.jes.supalink
  (:require [baby.pat.jes.attr :as attr]
            [baby.pat.jes.card :as card]
            [baby.pat.jes.dt :as dt]
            [baby.pat.jes.tag :as tag]
            [baby.pat.jes.trait :as trait]
            [baby.pat.jes.vt :as vt]))

(def id {::attr/id   ::id
         ::attr/card card/one
         ::attr/vt   ::vt/qkw})

(def source-atom {::attr/id   ::source-atom
                  ::attr/card card/one
                  ::attr/vt   ::vt/atom-or-ident})

(def validate-with {::attr/id   ::validate-with
                    ::attr/card card/one
                    ::attr/vt   ::vt/fn-or-ident})

(def get-with {::attr/id   ::get-with
               ::attr/card card/one
               ::attr/vt   ::vt/fn-or-ident})

(def set-with {::attr/id   ::set-with
               ::attr/card card/one
               ::attr/vt   ::vt/fn-or-ident})

(def watches-atom {::attr/id   ::watches-atom
                   ::attr/card card/one
                   ::attr/vt   ::vt/atom-or-ident})

(def meta {::attr/id   ::meta
           ::attr/card card/one
           ::attr/vt   ::vt/map})

(def supalink {::attr/id   ::supalink
              ::attr/card card/one
              ::attr/vt   ::vt/any})

(def tags (tag/tags-for "supalink"))
(def traits (trait/traits-for "supalink"))

(def attrs [source-atom meta validate-with watches-atom get-with set-with id tags traits])

(def dt {::dt/id       ::dt/supatom
         ::dt/parent   [::dt/id ::dt/id]
         ::dt/attrs    attrs})
