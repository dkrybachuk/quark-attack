(package-initialize)

(add-to-list 'load-path (expand-file-name "settings" user-emacs-directory))
(require 'tomorrow-night-bright-theme)
(require 'my-contact-info)
(require 'my-extras)
(require 'my-packages)
(require 'my-hooks)
(require 'my-keybindings)

(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(package-selected-packages
   (quote
    (all-the-icons rainbow-mode nasm-mode gnuplot-mode gnuplot autopair))))
(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 )
