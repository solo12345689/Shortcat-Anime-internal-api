package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import androidx.room.d;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final String f32204a;

    /* JADX INFO: renamed from: b */
    private final androidx.room.c f32205b;

    /* JADX INFO: renamed from: c */
    private final Executor f32206c;

    /* JADX INFO: renamed from: d */
    private final Context f32207d;

    /* JADX INFO: renamed from: e */
    private int f32208e;

    /* JADX INFO: renamed from: f */
    public c.AbstractC0534c f32209f;

    /* JADX INFO: renamed from: g */
    private androidx.room.b f32210g;

    /* JADX INFO: renamed from: h */
    private final androidx.room.a f32211h;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f32212i;

    /* JADX INFO: renamed from: j */
    private final ServiceConnection f32213j;

    /* JADX INFO: renamed from: k */
    private final Runnable f32214k;

    /* JADX INFO: renamed from: l */
    private final Runnable f32215l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends c.AbstractC0534c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0534c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0534c
        public void c(Set tables) {
            AbstractC5504s.h(tables, "tables");
            if (d.this.j().get()) {
                return;
            }
            try {
                androidx.room.b bVarH = d.this.h();
                if (bVarH != null) {
                    bVarH.y1(d.this.c(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends a.AbstractBinderC0531a {
        b() {
        }

        public static final void h(d this$0, String[] tables) {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(tables, "$tables");
            this$0.e().k((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.a
        public void b0(final String[] tables) {
            AbstractC5504s.h(tables, "tables");
            Executor executorD = d.this.d();
            final d dVar = d.this;
            executorD.execute(new Runnable() { // from class: M3.o
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.h(dVar, tables);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(service, "service");
            d.this.m(b.a.c(service));
            d.this.d().execute(d.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC5504s.h(name, "name");
            d.this.d().execute(d.this.g());
            d.this.m(null);
        }
    }

    public d(Context context, String name, Intent serviceIntent, androidx.room.c invalidationTracker, Executor executor) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(serviceIntent, "serviceIntent");
        AbstractC5504s.h(invalidationTracker, "invalidationTracker");
        AbstractC5504s.h(executor, "executor");
        this.f32204a = name;
        this.f32205b = invalidationTracker;
        this.f32206c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f32207d = applicationContext;
        this.f32211h = new b();
        this.f32212i = new AtomicBoolean(false);
        c cVar = new c();
        this.f32213j = cVar;
        this.f32214k = new Runnable() { // from class: M3.m
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.d.n(this.f12140a);
            }
        };
        this.f32215l = new Runnable() { // from class: M3.n
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.d.k(this.f12141a);
            }
        };
        l(new a((String[]) invalidationTracker.i().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    public static final void k(d this$0) {
        AbstractC5504s.h(this$0, "this$0");
        this$0.f32205b.n(this$0.f());
    }

    public static final void n(d this$0) {
        AbstractC5504s.h(this$0, "this$0");
        try {
            androidx.room.b bVar = this$0.f32210g;
            if (bVar != null) {
                this$0.f32208e = bVar.e2(this$0.f32211h, this$0.f32204a);
                this$0.f32205b.c(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f32208e;
    }

    public final Executor d() {
        return this.f32206c;
    }

    public final androidx.room.c e() {
        return this.f32205b;
    }

    public final c.AbstractC0534c f() {
        c.AbstractC0534c abstractC0534c = this.f32209f;
        if (abstractC0534c != null) {
            return abstractC0534c;
        }
        AbstractC5504s.u("observer");
        return null;
    }

    public final Runnable g() {
        return this.f32215l;
    }

    public final androidx.room.b h() {
        return this.f32210g;
    }

    public final Runnable i() {
        return this.f32214k;
    }

    public final AtomicBoolean j() {
        return this.f32212i;
    }

    public final void l(c.AbstractC0534c abstractC0534c) {
        AbstractC5504s.h(abstractC0534c, "<set-?>");
        this.f32209f = abstractC0534c;
    }

    public final void m(androidx.room.b bVar) {
        this.f32210g = bVar;
    }
}
