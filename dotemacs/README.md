# Emacs

## TLDR;

Steps:

1. Install emacs using your default package manager, e.g. `brew` or `dnf`, etc.

For Fedora, this will install `emacs-29`.

```bash
sudo dnf copr enable deathwish/emacs-pgtk-nativecomp

sudo dnf install emacs
```

2. Optionally, install `Fira Code` font.

For Fedora, use:

```bash
sudo dnf install fira-code-fonts
```

For other OS/distros, follow instruction here:
https://github.com/tonsky/FiraCode/wiki/Installing.

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
