# JS-Explorer

This is a project to explore js packages with
[ShadowCljs](https://github.com/thheller/shadow-cljs).

## Workflow

Follow below instruction:

1. First, open `src/dev/cljs/user.cljs` with `emacs`, then
   `M-x cider-jack-in-cljs`.

2. Open in one terminal to run `pnpm run dev`.

3. Open browser `http://localhost:5173`.

4. Back to `emacs`, do: `c-x c-z`. Now the REPL is yours!.

## How to create patch for an npm package?

Below are example patching `@thi.ng/errors` to remove the references of
`import.meta.url`.

```sh
# Patch @thi.ng/errors remove
pnpm patch @thi.ng/errors

# Follow the insruction
pnpm patch-commit /../5be86a912efe8505f193740fcc6930b1
```

Successful patch-commit will modify `package.json` with the following entry:

```jsonc
{
	// ,,,
	"pnpm": {
		"patchedDependencies": {
			"@thi.ng/errors@2.2.17": "patches/@thi.ng__errors@2.2.17.patch"
		}
	}
}
```
