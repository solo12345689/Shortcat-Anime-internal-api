package io.sentry.featureflags;

import io.sentry.InterfaceC5192e0;
import io.sentry.protocol.C5256f;
import io.sentry.protocol.C5257g;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f50689a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5288a f50690b = new C5288a();

    private d() {
    }

    public static b a() {
        return new d();
    }

    @Override // io.sentry.featureflags.b
    public C5257g n() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50690b.a();
        try {
            Map map = this.f50689a;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f50689a.size());
                for (Map.Entry entry : this.f50689a.entrySet()) {
                    arrayList.add(new C5256f((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                C5257g c5257g = new C5257g(arrayList);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return c5257g;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return null;
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

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m961clone() {
        return a();
    }
}
