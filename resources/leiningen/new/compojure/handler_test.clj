(ns {{namespace}}.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [{{namespace}}.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :get "/"))]
      (is (= 200 (:status response)))
      (is (= "Hello World" (:body response)))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= 404 (:status response))))))
