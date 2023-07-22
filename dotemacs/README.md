# Emacs

## TLDR;

### \* Steps

1. Install emacs using your default package manager, e.g. `brew` or `dnf`, etc.

```bash
# For Fedora, this will install `emacs-29`.

sudo dnf copr enable deathwish/emacs-pgtk-nativecomp

sudo dnf install emacs
```

2. Optionally, install `Fira Code` font.

```bash
# Fedora

sudo dnf install fira-code-fonts

# For other OS/distros, follow instruction here: https://github.com/tonsky/FiraCode/wiki/Installing.

```

3. Install spacemacs as follow:

```bash
cd $HOME

mkdir .emacs.d

cd .emacs.d

git clone https://github.com/syl20bnr/spacemacs.git ./
```

4. Copy `init.el` from this repo:

```bash
cd $HOME

mkdir .spacemacs.d

curl -L -o init.el https://github.com/altomatik/templates/raw/main/dotemacs/spacemacs__init.el
```

5. Now start emacs, wait and follow the instruction as required.

---

## Tips and Info

### \* Changed settings

Below are settings that are changed from `default` `init.el`:

```elisp
clojure-indent-style                   'align-arguments
clojure-align-forms-automatically      t
clojure-toplevel-inside-comment-form   t
dotspacemacs-scratch-buffer-persistent t
dotspacemacs-scratch-buffer-unkillable t
dotspacemacs-smartparens-strict-mode   t
dotspacemacs-smart-closing-parenthesis t
dotspacemacs-whitespace-cleanup        changed
undo-tree-auto-save-history            nil
```

Use `SPC f e D` to compare between current and default `init.el`. On the
`*Ediff Control Panel*` buffer at the bottom of emacs frame, type `n` or `p` for
jump to next or previous diff. Type `b` to copy from default (`B` window) to
current (`A` window). Type `w a` to save our init.el. Type `q` to quit ediff
session.

### \* Configuration Info

Default `clojure-indent-style` is `always-align`, the other two options is
`always-indent` and `align-arguments`, see example below:

`always-align`:

```clojure
(reduce merge
        some-coll)
(reduce
 merge
 some-coll)
```

`always-indent`:

```clojure
(reduce merge
  some-coll)
(reduce
  merge
  some-coll)
```

`align-arguments`:

```clojure
(reduce merge
        some-coll)
(reduce
  merge
  some-coll)
```

### \* Key Bindings

Basic concept:

-   Key sequences are bound to _commands_ in Emacs in various _keymaps_.
-   The most basic keymap is the `global-map`
-   Use `global-set-key` to update the `global-map`.
-   Use `kbd` macro to define a key sequences with string.
-   The `global-map` is often shadowed by other maps, e.g. `evil-mode`.

Below are example to bind a key `C-k` while we're in `evil-insert` state:

```elisp
(progn
    (define-key evil-insert-state-map (kbd "C-k") 'sp-kill-hybrid-sexp)
    (define-key evil-insert-state-map (kbd "C-w") 'evil-delete)
    )
```
