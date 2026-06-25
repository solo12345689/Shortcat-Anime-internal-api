package t2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import t2.C6602B;

/* JADX INFO: renamed from: t2.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6602B {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C6602B f60512f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f60513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f60514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f60515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f60517e;

    /* JADX INFO: renamed from: t2.B$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: t2.B$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C6602B f60518a;

            public a(C6602B c6602b) {
                this.f60518a = c6602b;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f60518a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, C6602B c6602b) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC6614a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(c6602b);
                telephonyManager.registerTelephonyCallback(c6602b.f60513a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                c6602b.m(5);
            }
        }
    }

    /* JADX INFO: renamed from: t2.B$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2.B$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f60519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f60520b;

        public d(c cVar, Executor executor) {
            this.f60519a = new WeakReference(cVar);
            this.f60520b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = (c) dVar.f60519a.get();
            if (cVar != null) {
                cVar.a(C6602B.this.g());
            }
        }

        public void b() {
            this.f60520b.execute(new Runnable() { // from class: t2.F
                @Override // java.lang.Runnable
                public final void run() {
                    C6602B.d.a(this.f60523a);
                }
            });
        }

        public boolean c() {
            return this.f60519a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2.B$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            C6602B.this.f60513a.execute(new Runnable() { // from class: t2.G
                @Override // java.lang.Runnable
                public final void run() {
                    C6602B.this.i(context);
                }
            });
        }
    }

    private C6602B(final Context context) {
        Executor executorA = AbstractC6616c.a();
        this.f60513a = executorA;
        this.f60514b = new CopyOnWriteArrayList();
        this.f60515c = new Object();
        this.f60516d = 0;
        executorA.execute(new Runnable() { // from class: t2.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f60510a.j(context);
            }
        });
    }

    public static synchronized C6602B e(Context context) {
        try {
            if (f60512f == null) {
                f60512f = new C6602B(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f60512f;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (Build.VERSION.SDK_INT < 31 || iH != 5) {
            m(iH);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void l() {
        for (d dVar : this.f60514b) {
            if (dVar.c()) {
                this.f60514b.remove(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i10) {
        l();
        synchronized (this.f60515c) {
            try {
                if (this.f60517e && this.f60516d == i10) {
                    return;
                }
                this.f60517e = true;
                this.f60516d = i10;
                Iterator it = this.f60514b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int g() {
        int i10;
        synchronized (this.f60515c) {
            i10 = this.f60516d;
        }
        return i10;
    }

    public void k(c cVar, Executor executor) {
        boolean z10;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f60515c) {
            this.f60514b.add(dVar);
            z10 = this.f60517e;
        }
        if (z10) {
            dVar.b();
        }
    }
}
