package androidx.activity;

import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f24155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f24156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f24157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f24161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f24162h;

    public E(Executor executor, InterfaceC5082a reportFullyDrawn) {
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(reportFullyDrawn, "reportFullyDrawn");
        this.f24155a = executor;
        this.f24156b = reportFullyDrawn;
        this.f24157c = new Object();
        this.f24161g = new ArrayList();
        this.f24162h = new Runnable() { // from class: androidx.activity.D
            @Override // java.lang.Runnable
            public final void run() {
                E.d(this.f24154a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(E this$0) {
        AbstractC5504s.h(this$0, "this$0");
        synchronized (this$0.f24157c) {
            try {
                this$0.f24159e = false;
                if (this$0.f24158d == 0 && !this$0.f24160f) {
                    this$0.f24156b.invoke();
                    this$0.b();
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f24157c) {
            try {
                this.f24160f = true;
                Iterator it = this.f24161g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5082a) it.next()).invoke();
                }
                this.f24161g.clear();
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f24157c) {
            z10 = this.f24160f;
        }
        return z10;
    }
}
