package C9;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import o9.AbstractC5838a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f2896a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f2897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f2898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f2899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f2900e;

    public a(View view) {
        this.f2897b = view;
        Context context = view.getContext();
        this.f2898c = d.f(context, AbstractC5838a.f54650n0, 300);
        this.f2899d = d.f(context, AbstractC5838a.f54656q0, 150);
        this.f2900e = d.f(context, AbstractC5838a.f54654p0, 100);
    }
}
