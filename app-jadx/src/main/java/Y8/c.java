package Y8;

import R8.AbstractC2115p;
import android.content.Context;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f22867b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    protected c(String str) {
        this.f22866a = str;
    }

    protected abstract Object a(IBinder iBinder);

    protected final Object b(Context context) throws a {
        if (this.f22867b == null) {
            AbstractC2115p.l(context);
            Context contextD = com.google.android.gms.common.d.d(context);
            if (contextD == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f22867b = a((IBinder) contextD.getClassLoader().loadClass(this.f22866a).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new a("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new a("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new a("Could not instantiate creator.", e12);
            }
        }
        return this.f22867b;
    }
}
