const esbuild = require("esbuild")

esbuild.build({
	entryPoints: ["pkgs/web/src/index.ts"],
	bundle: true,
	outfile: "out.js",
})
