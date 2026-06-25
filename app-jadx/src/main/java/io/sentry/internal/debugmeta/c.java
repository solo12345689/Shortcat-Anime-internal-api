package io.sentry.internal.debugmeta;

import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC5289b;
import io.sentry.util.AbstractC5291d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f50752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f50753b;

    public c(ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f50753b.getResources(AbstractC5291d.f51421a);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.f50752a.c(EnumC5215i3.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (RuntimeException e10) {
                    this.f50752a.a(EnumC5215i3.ERROR, e10, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e11) {
            this.f50752a.a(EnumC5215i3.ERROR, e11, "Failed to load %s", AbstractC5291d.f51421a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f50752a.c(EnumC5215i3.INFO, "No %s file was found.", AbstractC5291d.f51421a);
        return null;
    }

    c(ILogger iLogger, ClassLoader classLoader) {
        this.f50752a = iLogger;
        this.f50753b = AbstractC5289b.a(classLoader);
    }
}
