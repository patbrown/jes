(ns baby.pat.jes.reporter
  (:require [baby.pat.jes.prim :refer [as-prim]]
            [baby.pat.jes.vt :as vt]))

(def function (as-prim "reporter" ::vt/core-async-channel))

