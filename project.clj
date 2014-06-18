(defproject clojure-bitly "0.1.4"
  :description "Bit.ly API client for Clojure"
  :url "https://github.com/danielsz/clojure-bitly"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "0.7.7"]
                 [org.clojure/data.json "0.2.3"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dev-dependencies [[lein-clojars "0.6.0"]]
  :repositories [["releases" {:url "https://clojars.org/" :creds :gpg}]
                 ["snapshots" {:url "https://clojars.org/" :creds :gpg}]]
  :scm {:name "git"
        :url "https://github.com/danielsz/clojure-bitly"})
