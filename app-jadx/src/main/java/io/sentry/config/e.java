package io.sentry.config;

import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f50630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50631c;

    public e(String str, ILogger iLogger) {
        this(str, iLogger, true);
    }

    public Properties a() {
        try {
            File file = new File(this.f50629a.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    this.f50630b.c(EnumC5215i3.ERROR, "Failed to load Sentry configuration since it is not readable: %s", this.f50629a);
                }
            } else if (this.f50631c) {
                this.f50630b.c(EnumC5215i3.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", this.f50629a);
            }
            return null;
        } catch (Throwable th2) {
            this.f50630b.a(EnumC5215i3.ERROR, th2, "Failed to load Sentry configuration from file: %s", this.f50629a);
            return null;
        }
    }

    public e(String str, ILogger iLogger, boolean z10) {
        this.f50629a = str;
        this.f50630b = iLogger;
        this.f50631c = z10;
    }
}
