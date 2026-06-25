package ci;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f33765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f33766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class f33767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f33768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f33769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f33770f;

    public o(Method method, Class cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f33765a = method;
        this.f33766b = threadMode;
        this.f33767c = cls;
        this.f33768d = i10;
        this.f33769e = z10;
    }

    private synchronized void a() {
        if (this.f33770f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f33765a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f33765a.getName());
            sb2.append('(');
            sb2.append(this.f33767c.getName());
            this.f33770f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        a();
        o oVar = (o) obj;
        oVar.a();
        return this.f33770f.equals(oVar.f33770f);
    }

    public int hashCode() {
        return this.f33765a.hashCode();
    }
}
