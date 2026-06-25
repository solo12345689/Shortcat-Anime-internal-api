package io.sentry.clientreport;

import io.sentry.util.w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50616b;

    d(String str, String str2) {
        this.f50615a = str;
        this.f50616b = str2;
    }

    public String a() {
        return this.f50616b;
    }

    public String b() {
        return this.f50615a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return w.a(b(), dVar.b()) && w.a(a(), dVar.a());
    }

    public int hashCode() {
        return w.b(b(), a());
    }
}
