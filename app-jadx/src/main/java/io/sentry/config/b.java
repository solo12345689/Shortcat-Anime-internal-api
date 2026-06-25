package io.sentry.config;

import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC5289b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f50626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f50627c;

    public b(String str, ClassLoader classLoader, ILogger iLogger) {
        this.f50625a = str;
        this.f50626b = AbstractC5289b.a(classLoader);
        this.f50627c = iLogger;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f50626b.getResourceAsStream(this.f50625a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            this.f50627c.a(EnumC5215i3.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", this.f50625a);
            return null;
        }
    }

    public b(ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }
}
