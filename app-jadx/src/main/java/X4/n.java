package x4;

import Ud.a0;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f63912a = a0.h("image/jpeg", "image/webp", "image/heic", "image/heif");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63913a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63913a = iArr;
        }
    }

    public static final boolean a(j jVar) {
        return jVar.a() > 0;
    }

    public static final boolean b(j jVar) {
        return jVar.a() == 90 || jVar.a() == 270;
    }

    public static final boolean c(l lVar, String str) {
        int i10 = a.f63913a[lVar.ordinal()];
        if (i10 == 1) {
            return str != null && f63912a.contains(str);
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw new Td.r();
    }
}
