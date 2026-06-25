package P3;

import P3.b;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R3.b f13458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.C0214b f13459b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        Bundle a();
    }

    public f(R3.b impl) {
        AbstractC5504s.h(impl, "impl");
        this.f13458a = impl;
    }

    public final Bundle a(String key) {
        AbstractC5504s.h(key, "key");
        return this.f13458a.c(key);
    }

    public final b b(String key) {
        AbstractC5504s.h(key, "key");
        return this.f13458a.d(key);
    }

    public final void c(String key, b provider) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(provider, "provider");
        this.f13458a.j(key, provider);
    }

    public final void d(Class clazz) {
        AbstractC5504s.h(clazz, "clazz");
        if (!this.f13458a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        b.C0214b c0214b = this.f13459b;
        if (c0214b == null) {
            c0214b = new b.C0214b(this);
        }
        this.f13459b = c0214b;
        try {
            clazz.getDeclaredConstructor(null);
            b.C0214b c0214b2 = this.f13459b;
            if (c0214b2 != null) {
                String name = clazz.getName();
                AbstractC5504s.g(name, "getName(...)");
                c0214b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void e(String key) {
        AbstractC5504s.h(key, "key");
        this.f13458a.k(key);
    }
}
