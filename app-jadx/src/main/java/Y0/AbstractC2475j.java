package Y0;

import Y0.K;
import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2475j extends AbstractC2468c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L f22666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Typeface f22669g;

    public /* synthetic */ AbstractC2475j(L l10, int i10, K.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, i10, dVar);
    }

    @Override // Y0.InterfaceC2484t
    public final L b() {
        return this.f22666d;
    }

    @Override // Y0.InterfaceC2484t
    public final int c() {
        return this.f22667e;
    }

    public abstract Typeface f(Context context);

    public final Typeface g(Context context) {
        if (!this.f22668f && this.f22669g == null) {
            this.f22669g = f(context);
        }
        this.f22668f = true;
        return this.f22669g;
    }

    public final void h(Typeface typeface) {
        this.f22669g = typeface;
    }

    private AbstractC2475j(L l10, int i10, K.d dVar) {
        super(F.f22590a.b(), C2476k.f22670a, dVar, null);
        this.f22666d = l10;
        this.f22667e = i10;
    }
}
