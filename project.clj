(defproject viebel/gadjett "0.2.1"
  :description "Inspector tools for clojurescript"
  :url "https://github.com/viebel/gadjett"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.93"]
                 [org.clojure/test.check "0.9.0"]
                 [com.velisco/herbert "0.7.0"]
                 [figwheel-sidecar "0.5.4-7"]
                 [midje "1.8.3"]]
  :plugins [[lein-cljsbuild "1.1.2"]
            [lein-figwheel "0.5.0-6"]
            [lein-midje "3.2"]]
  :figwheel {:server-port 2512}
  :source-paths ["src" "script"]
  :cljsbuild {
              :builds
              {
               :figwheel {
                          :figwheel true
                          :source-paths ["src"]
                          :compiler {:main "gadjett.test"
                                     :asset-path "js"
                                     :output-to "resources/public/js/main.js"
                                     :output-dir "resources/public/js"
                                     ;:elide-asserts true
                                     :verbose true}}
               :dev {
                :source-paths ["src"]
                :compiler {
                           :output-to "resources/main.js"
                           :optimizations :simple
                           :pretty-print true}}}})
