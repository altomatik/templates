# TLDR;

There are 2 project in this workspace:

1. `math` -> `./packages/math`
2. `hello` -> `./apps/hello`

Project `hello` depends on `math`. So, to build `hello`, we have to build `math`
project first.

```sh
$ pnpm run -r clean  # clean all proj
$ pnpm run -C packages/math build  # compile math
$ pnpm run -C apps/hello build  # compile hello
$ node apps/hello/dist/index.js  # run the output
```

Note the `"references"` setting in `apps/hello/tsconfig.json` which tell that it
refer the `math` project on the specified path.

Also note the "composit" setting in `./tsconfig.base.json` which tell this
config is part of references of the whole projects.
