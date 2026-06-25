package io.sentry.internal.modules;

import com.adjust.sdk.Constants;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5192e0;
import io.sentry.util.C5288a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f50765d = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ILogger f50766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5288a f50767b = new C5288a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map f50768c = null;

    public d(ILogger iLogger) {
        this.f50766a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    public Map a() {
        if (this.f50768c == null) {
            InterfaceC5192e0 interfaceC5192e0A = this.f50767b.a();
            try {
                if (this.f50768c == null) {
                    this.f50768c = b();
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } catch (Throwable th2) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return this.f50768c;
    }

    protected abstract Map b();

    protected Map c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f50765d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.f50766a.c(EnumC5215i3.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f50766a.b(EnumC5215i3.ERROR, "Error extracting modules.", e10);
            return treeMap;
        } catch (RuntimeException e11) {
            this.f50766a.a(EnumC5215i3.ERROR, e11, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
