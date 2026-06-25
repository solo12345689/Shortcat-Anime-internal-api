package L4;

import F4.e;
import Td.L;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v4.C6846e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements ComponentCallbacks2, e.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11297f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f11299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F4.e f11300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f11301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f11302e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public t(C6846e c6846e, Context context, boolean z10) {
        F4.e cVar;
        this.f11298a = context;
        this.f11299b = new WeakReference(c6846e);
        if (z10) {
            c6846e.h();
            cVar = F4.f.a(context, this, null);
        } else {
            cVar = new F4.c();
        }
        this.f11300c = cVar;
        this.f11301d = cVar.a();
        this.f11302e = new AtomicBoolean(false);
    }

    @Override // F4.e.a
    public void a(boolean z10) {
        L l10;
        C6846e c6846e = (C6846e) this.f11299b.get();
        if (c6846e != null) {
            c6846e.h();
            this.f11301d = z10;
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            d();
        }
    }

    public final boolean b() {
        return this.f11301d;
    }

    public final void c() {
        this.f11298a.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this.f11302e.getAndSet(true)) {
            return;
        }
        this.f11298a.unregisterComponentCallbacks(this);
        this.f11300c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (((C6846e) this.f11299b.get()) == null) {
            d();
            L l10 = L.f17438a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        L l10;
        C6846e c6846e = (C6846e) this.f11299b.get();
        if (c6846e != null) {
            c6846e.h();
            c6846e.l(i10);
            l10 = L.f17438a;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            d();
        }
    }
}
