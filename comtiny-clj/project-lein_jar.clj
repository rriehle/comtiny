(defproject comtiny "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://stackoverflow.com/questions/5452665/how-to-call-clojure-code-from-java"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :aot [com.tiny]
  ; :main ^:skip-aot com.tiny
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
