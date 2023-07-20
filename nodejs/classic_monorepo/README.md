# TLDR;

```bash
$ pnpm install
$ npx tsc -b tsconfig-packages.json
$ node pkgs/web/dist/index.js
$ node -e 'console.log(require("./pkgs/api").getVersion())'

$ pnpm run build # build and bundle pkgs/web package to out.js
$ node out.js
```

