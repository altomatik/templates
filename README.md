# Templates

Our template collection for starting new projects or to be used as reference
when bootstrapping new project.

One possible scenario on how to use templates from this repo, follow below
example instruction.

First clone this repo to some place you prefer, e.g. in `/tmp/1`:

```sh
$ mkdir /tmp/1
$ cd /tmp/1
$ git clone https://github.com/altomatik/templates.git
```

Then, pick a template you wish to copy, for example here we want to use
`./nodejs/pnpm_workspace` template, then:

```sh
$ mkdir ~/projects/p1  # create destination folder
$ cd ./nodejs/pnpm_workspace  # go to template folder we wish to copy
$ git archive main | tar -x -C ~/projects/p1
$ cd ~/projects/p1  # template files are copied here, see readme for more info
$ cat README.md
```
