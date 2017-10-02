;; Expand region
(global-unset-key (kbd "C-@"))
(global-set-key (kbd "C-@") 'er/expand-region)

;; JavaScript
;;(js2r-add-keybindings-with-prefix "C-c C-r")
;;(define-key js2-mode-map (kbd "C-k") #'js2r-kill)
;;(define-key tern-mode-keymap (kbd "M-.") nil)
;;(define-key tern-mode-keymap (kbd "M-,") nil)

(provide 'my-keybindings)
		
