;; Package definitions
(require 'package)

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
	org-mode
        )
)

;; Add el-get package manager
(setq package-check-signature nil)

(add-to-list 'package-archives '("gnu" . "http://elpa.gnu.org/packages/") t)
(add-to-list 'package-archives '("org" . "http://orgmode.org/elpa/") t)
(add-to-list 'package-archives '("melpa" . "http://melpa.milkbox.net/packages/") t)
(package-initialize)
(add-to-list 'load-path "~/.emacs.d/el-get/el-get")

(unless (require 'el-get nil t)
  (package-refresh-contents)
  (package-install 'el-get)
  (package-install 'async)
  (package-install 'memoize)
  (message "require is")
  (require 'el-get)
  (el-get 'sync))

(add-to-list 'el-get-recipe-path "~/.emacs.d/settings/recipes")
(el-get 'sync my-packages)

;; Go language
(when (executable-find "go")
  (add-to-list 'my-packages 'go-mode)
  (add-to-list 'my-packages 'go-company)
  (add-to-list 'my-packages 'go-eldoc)
  (add-to-list 'my-packages 'flycheck-gometalinter)
)

(el-get 'sync my-packages)

(provide 'my-packages)
