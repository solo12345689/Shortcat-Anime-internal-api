package N8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.common.Constants;
import e9.AbstractC4658a;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.InterfaceC5757a;
import n9.InterfaceC5764h;
import t.i0;

/* JADX INFO: renamed from: N8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1974c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PendingIntent f12715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f12716j = new Executor() { // from class: N8.G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f12717k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f12720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f12721d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Messenger f12723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f12724g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f12718a = new i0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Messenger f12722e = new Messenger(new i(this, Looper.getMainLooper()));

    public C1974c(Context context) {
        this.f12719b = context;
        this.f12720c = new E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f12721d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ n9.i e(Bundle bundle) {
        return m(bundle) ? n9.l.f(null) : n9.l.f(bundle);
    }

    static /* bridge */ /* synthetic */ void g(C1974c c1974c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        c1974c.f12724g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1974c.f12723f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f12717k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c1974c.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(LogEvent.LEVEL_ERROR);
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith(com.amazon.a.a.o.b.f.f34696c)) {
                    synchronized (c1974c.f12718a) {
                        for (int i10 = 0; i10 < c1974c.f12718a.size(); i10++) {
                            try {
                                c1974c.l((String) c1974c.f12718a.g(i10), intent2.getExtras());
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
                    strSubstring = strSubstring.substring(1);
                }
                c1974c.l(str, intent2.putExtra(LogEvent.LEVEL_ERROR, strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final n9.i i(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N8.C1974c.i(android.os.Bundle):n9.i");
    }

    private static synchronized String j() {
        int i10;
        i10 = f12714h;
        f12714h = i10 + 1;
        return Integer.toString(i10);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f12715i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f12715i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC4658a.f45818a);
            }
            intent.putExtra("app", f12715i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f12718a) {
            try {
                n9.j jVar = (n9.j) this.f12718a.remove(str);
                if (jVar != null) {
                    jVar.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public n9.i a() {
        return this.f12720c.a() >= 241100000 ? D.b(this.f12719b).d(5, Bundle.EMPTY).h(f12716j, new InterfaceC5757a() { // from class: N8.f
            @Override // n9.InterfaceC5757a
            public final Object a(n9.i iVar) {
                Intent intent = (Intent) ((Bundle) iVar.k()).getParcelable("notification_data");
                if (intent != null) {
                    return new C1972a(intent);
                }
                return null;
            }
        }) : n9.l.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public n9.i b(C1972a c1972a) {
        if (this.f12720c.a() < 233700000) {
            return n9.l.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c1972a.d());
        Integer numE = c1972a.e();
        if (numE != null) {
            bundle.putInt("google.product_id", numE.intValue());
        }
        return D.b(this.f12719b).c(3, bundle);
    }

    public n9.i c(final Bundle bundle) {
        return this.f12720c.a() < 12000000 ? this.f12720c.b() != 0 ? i(bundle).i(f12716j, new InterfaceC5757a() { // from class: N8.H
            @Override // n9.InterfaceC5757a
            public final Object a(n9.i iVar) {
                return this.f12709a.f(bundle, iVar);
            }
        }) : n9.l.e(new IOException("MISSING_INSTANCEID_SERVICE")) : D.b(this.f12719b).d(1, bundle).h(f12716j, new InterfaceC5757a() { // from class: N8.e
            @Override // n9.InterfaceC5757a
            public final Object a(n9.i iVar) throws IOException {
                if (iVar.o()) {
                    return (Bundle) iVar.k();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(iVar.j())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", iVar.j());
            }
        });
    }

    public n9.i d(boolean z10) {
        if (this.f12720c.a() < 241100000) {
            return n9.l.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return D.b(this.f12719b).c(4, bundle);
    }

    final /* synthetic */ n9.i f(Bundle bundle, n9.i iVar) {
        return (iVar.o() && m((Bundle) iVar.k())) ? i(bundle).p(f12716j, new InterfaceC5764h() { // from class: N8.F
            @Override // n9.InterfaceC5764h
            public final n9.i a(Object obj) {
                return C1974c.e((Bundle) obj);
            }
        }) : iVar;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, n9.i iVar) {
        synchronized (this.f12718a) {
            this.f12718a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
