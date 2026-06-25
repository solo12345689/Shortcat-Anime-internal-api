package R8;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a */
    private Object f15312a;

    /* JADX INFO: renamed from: b */
    private boolean f15313b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC2102c f15314c;

    public g0(AbstractC2102c abstractC2102c, Object obj) {
        Objects.requireNonNull(abstractC2102c);
        this.f15314c = abstractC2102c;
        this.f15312a = obj;
        this.f15313b = false;
    }

    protected abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f15312a;
                if (this.f15313b) {
                    String string = toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f15313b = true;
        }
        c();
    }

    public final void c() {
        d();
        AbstractC2102c abstractC2102c = this.f15314c;
        synchronized (abstractC2102c.b0()) {
            abstractC2102c.b0().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f15312a = null;
        }
    }
}
