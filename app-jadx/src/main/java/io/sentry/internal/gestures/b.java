package io.sentry.internal.gestures;

import io.sentry.util.w;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f50754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f50755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f50756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f50757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f50758e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.f50754a = new WeakReference(obj);
        this.f50755b = str;
        this.f50756c = str2;
        this.f50757d = str3;
        this.f50758e = str4;
    }

    public String a() {
        return this.f50755b;
    }

    public String b() {
        String str = this.f50756c;
        return str != null ? str : (String) w.c(this.f50757d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f50758e;
    }

    public String d() {
        return this.f50756c;
    }

    public String e() {
        return this.f50757d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (w.a(this.f50755b, bVar.f50755b) && w.a(this.f50756c, bVar.f50756c) && w.a(this.f50757d, bVar.f50757d)) {
                return true;
            }
        }
        return false;
    }

    public Object f() {
        return this.f50754a.get();
    }

    public int hashCode() {
        return w.b(this.f50754a, this.f50756c, this.f50757d);
    }
}
