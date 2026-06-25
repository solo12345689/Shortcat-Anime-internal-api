package androidx.compose.foundation.layout;

import I0.A;
import I0.AbstractC1675a;
import I0.C;
import K0.E;
import androidx.compose.ui.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b extends e.c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC1675a f26128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f26130c;

    public /* synthetic */ b(AbstractC1675a abstractC1675a, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC1675a, f10, f11);
    }

    public final void E1(float f10) {
        this.f26130c = f10;
    }

    public final void F1(AbstractC1675a abstractC1675a) {
        this.f26128a = abstractC1675a;
    }

    public final void G1(float f10) {
        this.f26129b = f10;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        return a.c(lVar, this.f26128a, this.f26129b, this.f26130c, a10, j10);
    }

    private b(AbstractC1675a abstractC1675a, float f10, float f11) {
        this.f26128a = abstractC1675a;
        this.f26129b = f10;
        this.f26130c = f11;
    }
}
