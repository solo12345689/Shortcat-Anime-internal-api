package v;

import Y.InterfaceC2464z0;
import Y.W0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.animation.h f61640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.compose.animation.j f61641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2464z0 f61642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w f61643d;

    public j(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, float f10, w wVar) {
        this.f61640a = hVar;
        this.f61641b = jVar;
        this.f61642c = W0.a(f10);
        this.f61643d = wVar;
    }

    public final androidx.compose.animation.j a() {
        return this.f61641b;
    }

    public final w b() {
        return this.f61643d;
    }

    public final androidx.compose.animation.h c() {
        return this.f61640a;
    }

    public final float d() {
        return this.f61642c.c();
    }

    public /* synthetic */ j(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, float f10, w wVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, jVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? androidx.compose.animation.a.d(false, null, 3, null) : wVar);
    }
}
