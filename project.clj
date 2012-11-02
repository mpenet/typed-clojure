(defproject typed "0.1.1"
  :description "Gradual typing for Clojure"
  :dependencies [[analyze "0.2"]
                 [net.intensivesystems/arrows "1.3.0"] ;for testing conduit, lein test wants it here?
                 [trammel "0.7.0"]
                 [org.clojure/math.combinatorics "0.0.2"]]
  :dev-dependencies [[org.clojure/tools.macro "0.1.0"] ;for algo.monads
                     [org.clojure/tools.trace "0.7.3"]
                     ])
