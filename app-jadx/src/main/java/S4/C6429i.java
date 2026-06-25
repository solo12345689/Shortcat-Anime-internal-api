package s4;

import android.content.Context;
import app.notifee.core.database.NotifeeCoreDatabase;
import cg.t;
import cg.v;
import com.google.common.util.concurrent.p;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: s4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6429i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C6429i f59217b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f59218a;

    public C6429i(Context context) {
        this.f59218a = NotifeeCoreDatabase.D(context).E();
    }

    public static C6429i j(Context context) {
        C6429i c6429i;
        synchronized (C6429i.class) {
            try {
                if (f59217b == null) {
                    f59217b = new C6429i(context);
                }
                c6429i = f59217b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6429i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q(Boolean bool) {
        return this.f59218a.e(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(v vVar) {
        this.f59218a.c(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(List list) {
        this.f59218a.a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f59218a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(v vVar) {
        this.f59218a.d(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(String str) {
        this.f59218a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ v w(String str) {
        return this.f59218a.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List x() {
        return this.f59218a.a();
    }

    public p i(final Boolean bool) {
        return NotifeeCoreDatabase.f32992q.submit(new Callable() { // from class: s4.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f59204a.q(bool);
            }
        });
    }

    public void k() {
        NotifeeCoreDatabase.f32992q.execute(new Runnable() { // from class: s4.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f59212a.t();
            }
        });
    }

    public void l(final v vVar) {
        NotifeeCoreDatabase.f32992q.execute(new Runnable() { // from class: s4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f59208a.r(vVar);
            }
        });
    }

    public void m(final String str) {
        NotifeeCoreDatabase.f32992q.execute(new Runnable() { // from class: s4.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f59215a.v(str);
            }
        });
    }

    public void n(final List list) {
        NotifeeCoreDatabase.f32992q.execute(new Runnable() { // from class: s4.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f59206a.s(list);
            }
        });
    }

    public p o() {
        return NotifeeCoreDatabase.f32992q.submit(new Callable() { // from class: s4.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f59203a.x();
            }
        });
    }

    public p p(final String str) {
        return NotifeeCoreDatabase.f32992q.submit(new Callable() { // from class: s4.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f59210a.w(str);
            }
        });
    }

    public void y(final v vVar) {
        NotifeeCoreDatabase.f32992q.execute(new Runnable() { // from class: s4.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f59213a.u(vVar);
            }
        });
    }
}
