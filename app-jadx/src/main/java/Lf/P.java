package Lf;

import Gf.Y0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zd.i f11559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f11560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y0[] f11561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11562d;

    public P(Zd.i iVar, int i10) {
        this.f11559a = iVar;
        this.f11560b = new Object[i10];
        this.f11561c = new Y0[i10];
    }

    public final void a(Y0 y02, Object obj) {
        Object[] objArr = this.f11560b;
        int i10 = this.f11562d;
        objArr[i10] = obj;
        Y0[] y0Arr = this.f11561c;
        this.f11562d = i10 + 1;
        AbstractC5504s.f(y02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        y0Arr[i10] = y02;
    }

    public final void b(Zd.i iVar) {
        int length = this.f11561c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            Y0 y02 = this.f11561c[length];
            AbstractC5504s.e(y02);
            y02.F0(iVar, this.f11560b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
