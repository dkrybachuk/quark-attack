;; Package definitions
(require 'package)

;; Add el-get package manager
(add-to-list 'load-path "~/.emacs.d/el-get/el-get")

(unless (require 'el-get nil 'noerror)
  (require 'package)
  (add-to-list 'package-archives
               '("melpa" . "http://melpa.org/packages/"))
  (package-refresh-contents)
  (package-initialize)
  (package-install 'el-get)
  (require 'el-get))

(add-to-list 'el-get-recipe-path "~/.emacs.d/settings/recipes")
(el-get 'sync)

;; List of packages
(setq my-packages
      '(
        avy
        company-mode
        el-get
        exec-path-from-shell
        flycheck
        markdown-mode
	rainbow-mode
        )
)

;; Go language
(when (executable-find "go")
  (add-to-list 'my-packages 'go-mode)
  (add-to-list 'my-packages 'go-company)
  (add-to-list 'my-packages 'go-eldoc)
  (add-to-list 'my-packages 'flycheck-gometalinter)
)

(el-get 'sync my-packages)

(provide 'my-packages)
