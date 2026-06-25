package io.sentry.android.ndk;

import io.sentry.AbstractC5226l;
import io.sentry.C5191e;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.H1;
import io.sentry.T3;
import io.sentry.Y;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.I;
import io.sentry.util.w;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f50094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.ndk.a f50095b;

    public i(C5322z3 c5322z3) {
        this(c5322z3, new NativeScope());
    }

    public static /* synthetic */ void m(i iVar, I i10) {
        if (i10 == null) {
            iVar.f50095b.e();
        } else {
            iVar.f50095b.g(i10.i(), i10.h(), i10.j(), i10.k());
        }
    }

    public static /* synthetic */ void q(i iVar, C5191e c5191e) {
        iVar.getClass();
        String strF = null;
        String lowerCase = c5191e.u() != null ? c5191e.u().name().toLowerCase(Locale.ROOT) : null;
        String strH = AbstractC5226l.h(c5191e.x());
        try {
            Map mapT = c5191e.t();
            if (!mapT.isEmpty()) {
                strF = iVar.f50094a.getSerializer().f(mapT);
            }
        } catch (Throwable th2) {
            iVar.f50094a.getLogger().a(EnumC5215i3.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
        }
        iVar.f50095b.a(lowerCase, c5191e.v(), c5191e.r(), c5191e.y(), strH, strF);
    }

    @Override // io.sentry.Z
    public void a(final C5191e c5191e) {
        try {
            this.f50094a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    i.q(this.f50080a, c5191e);
                }
            });
        } catch (Throwable th2) {
            this.f50094a.getLogger().a(EnumC5215i3.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void b(final String str, final String str2) {
        try {
            this.f50094a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50087a.f50095b.b(str, str2);
                }
            });
        } catch (Throwable th2) {
            this.f50094a.getLogger().a(EnumC5215i3.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void c(final String str) {
        try {
            this.f50094a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50090a.f50095b.c(str);
                }
            });
        } catch (Throwable th2) {
            this.f50094a.getLogger().a(EnumC5215i3.ERROR, th2, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void d(final String str, final String str2) {
        try {
            this.f50094a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50082a.f50095b.d(str, str2);
                }
            });
        } catch (Throwable th2) {
            this.f50094a.getLogger().a(EnumC5215i3.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void f(final String str) {
        try {
            this.f50094a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50085a.f50095b.f(str);
                }
            });
        } catch (Throwable th2) {
            this.f50094a.getLogger().a(EnumC5215i3.ERROR, th2, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.Z
    public void h(final T3 t32, Y y10) {
        if (t32 == null) {
            return;
        }
        try {
            this.f50094a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.h
                @Override // java.lang.Runnable
                public final void run() {
                    i iVar = this.f50092a;
                    T3 t33 = t32;
                    iVar.f50095b.h(t33.p().toString(), t33.m().toString());
                }
            });
        } catch (Throwable th2) {
            this.f50094a.getLogger().a(EnumC5215i3.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.Z
    public void i(final I i10) {
        try {
            this.f50094a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.b
                @Override // java.lang.Runnable
                public final void run() {
                    i.m(this.f50078a, i10);
                }
            });
        } catch (Throwable th2) {
            this.f50094a.getLogger().a(EnumC5215i3.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    i(C5322z3 c5322z3, io.sentry.ndk.a aVar) {
        this.f50094a = (C5322z3) w.c(c5322z3, "The SentryOptions object is required.");
        this.f50095b = (io.sentry.ndk.a) w.c(aVar, "The NativeScope object is required.");
    }
}
