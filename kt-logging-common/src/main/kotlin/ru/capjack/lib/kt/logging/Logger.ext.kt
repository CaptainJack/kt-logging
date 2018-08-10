package ru.capjack.lib.kt.logging

inline fun Logger.error(message: () -> String) {
	if (errorEnabled) error(message())
}

inline fun Logger.error(t: Throwable, message: () -> String) {
	if (errorEnabled) error(message(), t)
}


inline fun Logger.warn(message: () -> String) {
	if (errorEnabled) error(message())
}

inline fun Logger.warn(t: Throwable, message: () -> String) {
	if (errorEnabled) error(message(), t)
}


inline fun Logger.info(message: () -> String) {
	if (errorEnabled) error(message())
}

inline fun Logger.info(t: Throwable, message: () -> String) {
	if (errorEnabled) error(message(), t)
}


inline fun Logger.debug(message: () -> String) {
	if (errorEnabled) error(message())
}

inline fun Logger.debug(t: Throwable, message: () -> String) {
	if (errorEnabled) error(message(), t)
}


inline fun Logger.trace(message: () -> String) {
	if (errorEnabled) error(message())
}

inline fun Logger.trace(t: Throwable, message: () -> String) {
	if (errorEnabled) error(message(), t)
}