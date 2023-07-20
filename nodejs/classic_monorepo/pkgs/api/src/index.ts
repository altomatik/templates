import { version } from "common"

export function getVersion() {
	return `v${version().join(".")}`
}
