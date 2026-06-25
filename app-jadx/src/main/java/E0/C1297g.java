package E0;

import android.view.MotionEvent;
import java.util.List;
import t.C6573x;

/* JADX INFO: renamed from: E0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1297g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6573x f4152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f4153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4154c;

    public C1297g(C6573x c6573x, E e10) {
        this.f4152a = c6573x;
        this.f4153b = e10;
    }

    public final boolean a(long j10) {
        Object obj;
        List listB = this.f4153b.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listB.get(i10);
            if (B.d(((F) obj).d(), j10)) {
                break;
            }
            i10++;
        }
        F f10 = (F) obj;
        if (f10 != null) {
            return f10.a();
        }
        return false;
    }

    public final C6573x b() {
        return this.f4152a;
    }

    public final MotionEvent c() {
        return this.f4153b.a();
    }

    public final boolean d() {
        return this.f4154c;
    }

    public final void e(boolean z10) {
        this.f4154c = z10;
    }
}
