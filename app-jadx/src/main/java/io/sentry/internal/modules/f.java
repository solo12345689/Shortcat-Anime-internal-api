package io.sentry.internal.modules;

import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC5289b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClassLoader f50770e;

    public f(ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        InputStream resourceAsStream;
        TreeMap treeMap = new TreeMap();
        try {
            resourceAsStream = this.f50770e.getResourceAsStream("sentry-external-modules.txt");
        } catch (IOException e10) {
            this.f50766a.b(EnumC5215i3.INFO, "Access to resources failed.", e10);
        } catch (SecurityException e11) {
            this.f50766a.b(EnumC5215i3.INFO, "Access to resources denied.", e11);
        }
        try {
            if (resourceAsStream != null) {
                Map mapC = c(resourceAsStream);
                resourceAsStream.close();
                return mapC;
            }
            this.f50766a.c(EnumC5215i3.INFO, "%s file was not found.", "sentry-external-modules.txt");
            if (resourceAsStream != null) {
                resourceAsStream.close();
                return treeMap;
            }
            return treeMap;
        } catch (Throwable th2) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    f(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.f50770e = AbstractC5289b.a(classLoader);
    }
}
