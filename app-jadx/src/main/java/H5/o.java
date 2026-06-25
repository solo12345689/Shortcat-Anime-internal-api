package h5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC2842v;
import b5.P;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class o implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f47623f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.k f47624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f47625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6551a f47626c = new C6551a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f47627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f47628e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements b {
        a() {
        }

        @Override // h5.o.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.k(bVar, jVar, pVar, context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f47623f : bVar;
        this.f47625b = bVar;
        this.f47628e = new m(bVar);
        this.f47627d = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (P.f33106f && P.f33105e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.k f(Context context) {
        if (this.f47624a == null) {
            synchronized (this) {
                try {
                    if (this.f47624a == null) {
                        this.f47624a = this.f47625b.a(com.bumptech.glide.b.d(context.getApplicationContext()), new C4904a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f47624a;
    }

    private static boolean g(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public com.bumptech.glide.k d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (o5.l.s() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC2842v) {
                return e((AbstractActivityC2842v) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.k e(AbstractActivityC2842v abstractActivityC2842v) {
        if (o5.l.r()) {
            return d(abstractActivityC2842v.getApplicationContext());
        }
        a(abstractActivityC2842v);
        this.f47627d.a(abstractActivityC2842v);
        boolean zG = g(abstractActivityC2842v);
        return this.f47628e.b(abstractActivityC2842v, com.bumptech.glide.b.d(abstractActivityC2842v.getApplicationContext()), abstractActivityC2842v.getLifecycle(), abstractActivityC2842v.C(), zG);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
