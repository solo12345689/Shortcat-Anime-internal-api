package h5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import h5.InterfaceC4905b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o5.AbstractC5829f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile r f47632d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f47633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f47634b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47635c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements AbstractC5829f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f47636a;

        a(Context context) {
            this.f47636a = context;
        }

        @Override // o5.AbstractC5829f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f47636a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements InterfaceC4905b.a {
        b() {
        }

        @Override // h5.InterfaceC4905b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            o5.l.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f47634b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC4905b.a) it.next()).a(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        void a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f47639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final InterfaceC4905b.a f47640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC5829f.b f47641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f47642d = new a();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: h5.r$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            class RunnableC0766a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f47644a;

                RunnableC0766a(boolean z10) {
                    this.f47644a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f47644a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                o5.l.w(new RunnableC0766a(z10));
            }

            void a(boolean z10) {
                o5.l.b();
                d dVar = d.this;
                boolean z11 = dVar.f47639a;
                dVar.f47639a = z10;
                if (z11 != z10) {
                    dVar.f47640b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(AbstractC5829f.b bVar, InterfaceC4905b.a aVar) {
            this.f47641c = bVar;
            this.f47640b = aVar;
        }

        @Override // h5.r.c
        public void a() {
            ((ConnectivityManager) this.f47641c.get()).unregisterNetworkCallback(this.f47642d);
        }

        @Override // h5.r.c
        public boolean b() {
            this.f47639a = ((ConnectivityManager) this.f47641c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f47641c.get()).registerDefaultNetworkCallback(this.f47642d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private r(Context context) {
        this.f47633a = new d(AbstractC5829f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f47632d == null) {
            synchronized (r.class) {
                try {
                    if (f47632d == null) {
                        f47632d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f47632d;
    }

    private void b() {
        if (this.f47635c || this.f47634b.isEmpty()) {
            return;
        }
        this.f47635c = this.f47633a.b();
    }

    private void c() {
        if (this.f47635c && this.f47634b.isEmpty()) {
            this.f47633a.a();
            this.f47635c = false;
        }
    }

    synchronized void d(InterfaceC4905b.a aVar) {
        this.f47634b.add(aVar);
        b();
    }

    synchronized void e(InterfaceC4905b.a aVar) {
        this.f47634b.remove(aVar);
        c();
    }
}
