package uf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.N0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61515a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.f57999e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.f58000f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.f58001g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61515a = iArr;
        }
    }

    public static final v a(N0 n02) {
        AbstractC5504s.h(n02, "<this>");
        int i10 = a.f61515a[n02.ordinal()];
        if (i10 == 1) {
            return v.f61518d;
        }
        if (i10 == 2) {
            return v.f61516b;
        }
        if (i10 == 3) {
            return v.f61517c;
        }
        throw new Td.r();
    }
}
