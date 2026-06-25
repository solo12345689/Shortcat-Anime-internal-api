package C;

import android.os.Build;
import android.view.View;
import androidx.core.view.C2777p0;
import androidx.core.view.L0;
import java.util.List;

/* JADX INFO: renamed from: C.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1147s extends C2777p0.b implements Runnable, androidx.core.view.I, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q f2170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private L0 f2173d;

    public RunnableC1147s(Q q10) {
        super(!q10.c() ? 1 : 0);
        this.f2170a = q10;
    }

    @Override // androidx.core.view.I
    public L0 d(View view, L0 l02) {
        this.f2173d = l02;
        this.f2170a.l(l02);
        if (this.f2171b) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f2172c) {
            this.f2170a.k(l02);
            Q.j(this.f2170a, l02, 0, 2, null);
        }
        return this.f2170a.c() ? L0.f28953b : l02;
    }

    @Override // androidx.core.view.C2777p0.b
    public void onEnd(C2777p0 c2777p0) {
        this.f2171b = false;
        this.f2172c = false;
        L0 l02 = this.f2173d;
        if (c2777p0.b() != 0 && l02 != null) {
            this.f2170a.k(l02);
            this.f2170a.l(l02);
            Q.j(this.f2170a, l02, 0, 2, null);
        }
        this.f2173d = null;
        super.onEnd(c2777p0);
    }

    @Override // androidx.core.view.C2777p0.b
    public void onPrepare(C2777p0 c2777p0) {
        this.f2171b = true;
        this.f2172c = true;
        super.onPrepare(c2777p0);
    }

    @Override // androidx.core.view.C2777p0.b
    public L0 onProgress(L0 l02, List list) {
        Q.j(this.f2170a, l02, 0, 2, null);
        return this.f2170a.c() ? L0.f28953b : l02;
    }

    @Override // androidx.core.view.C2777p0.b
    public C2777p0.a onStart(C2777p0 c2777p0, C2777p0.a aVar) {
        this.f2171b = false;
        return super.onStart(c2777p0, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2171b) {
            this.f2171b = false;
            this.f2172c = false;
            L0 l02 = this.f2173d;
            if (l02 != null) {
                this.f2170a.k(l02);
                Q.j(this.f2170a, l02, 0, 2, null);
                this.f2173d = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
