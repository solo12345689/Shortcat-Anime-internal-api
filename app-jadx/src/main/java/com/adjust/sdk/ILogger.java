package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface ILogger {
    void Assert(String str, Object... objArr);

    void debug(String str, Object... objArr);

    void error(String str, Object... objArr);

    void info(String str, Object... objArr);

    void lockLogLevel();

    void setLogLevel(LogLevel logLevel, boolean z10);

    void setLogLevelString(String str, boolean z10);

    void verbose(String str, Object... objArr);

    void warn(String str, Object... objArr);

    void warnInProduction(String str, Object... objArr);
}
