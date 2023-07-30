(ns cljs.user
  (:require ["nanoid" :as nanoid]
            ["@thi.ng/random" :as thing-random]))

(defn ^:export start []
  (println "Hello from /src/dev/cljs/user.cljs")
  )


(comment

  ;; nanoid
  (nanoid/nanoid)

  ;; @thi.ng/random
  (let [x (thing-random/Smush32. 0xdecafbad)]
    (vector
      (.int x)
      (.float x)
      (.norm x 100)
      (.minmax x 10 20)
      (.minmaxInt x 10 20)
      )
    )

  )
