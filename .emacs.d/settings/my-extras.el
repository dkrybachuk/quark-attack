;; Font settings
(set-default-font "Inconsolata LGC Bold 13")

(blink-cursor-mode 0)

;; If backspace works like DEL
(normal-erase-is-backspace-mode 0)

;; Allow delete non empty folders
(setq dired-recursive-deletes 'top)

;; Set backup directory
(setq backup-directory-alist
      `((".*" . ,temporary-file-directory)))
(setq auto-save-file-name-transforms
      `((".*" ,temporary-file-directory t)))

;; Set the main window size
(when (window-system)
  (set-frame-size (selected-frame) 140 40)
  (add-to-list 'default-frame-alist '(width . 140)
	       'default-frame-alist '(height . 40)))

;; Display the name of the current buffer in the title bar
(setq frame-title-format "GNU Emacs: %b")

;; Inhibit startup/splash screen
(setq inhibit-splash-screen t
      ingibit-startup-message t)

;; Clipboard settings
(setq x-select-enable-clipboard t)

;; Show-paren-mode settings
(show-paren-mode t) 
(setq show-paren-style 'expression) 

;; Highlight search results
(setq search-highlight t)
(setq query-replace-highlight t)

;; Delete selection
(delete-selection-mode t)

;; Disable GUI components
(tooltip-mode -1)
(menu-bar-mode -1) 
(tool-bar-mode -1) 
(scroll-bar-mode -1)
(setq use-dialog-box nil) ;; Disable all dialogs
(setq redisplay-dont-pause t
      scroll-margin 1
      scroll-step 1
      scroll-conservatively 10000
      scroll-preserve-screen-position 1) ;; Smooth scrolling
(setq ring-bell-function 'ignore) ;; Disable system bell

;; Display file size/time in mode-line
(setq display-time-24hr-format t)
(display-time-mode t)
(size-indication-mode t)

;; Easy transition between buffers: M-arrow-keys
(if (equal nil (equal major-mode 'org-mode))
    (windmove-default-keybindings 'meta))

(provide 'my-extras)
