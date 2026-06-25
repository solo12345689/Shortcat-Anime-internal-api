package w;

import kotlin.jvm.internal.C5498l;

/* JADX INFO: renamed from: w.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6890b {

    /* JADX INFO: renamed from: a */
    private static final C6909m f62473a = r.a(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    private static final C6910n f62474b = r.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    private static final C6911o f62475c = r.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    private static final C6912p f62476d = r.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    private static final C6909m f62477e = r.a(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    private static final C6910n f62478f = r.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    private static final C6911o f62479g = r.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    private static final C6912p f62480h = r.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final C6888a a(float f10, float f11) {
        return new C6888a(Float.valueOf(f10), u0.f(C5498l.f52289a), Float.valueOf(f11), null, 8, null);
    }

    public static /* synthetic */ C6888a b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return a(f10, f11);
    }
}
