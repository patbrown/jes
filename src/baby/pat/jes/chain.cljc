(ns baby.pat.jes.chain
  (:require [baby.pat.jes.prim :refer [as-prim]]
            [baby.pat.jes.vt :as vt]))

(def function (as-prim "chain" ::vt/idents))
