package fb;

import androidx.fragment.app.U;
import com.swmansion.rnscreens.C4546y;
import com.swmansion.rnscreens.r;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: fb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4793c {

    /* JADX INFO: renamed from: fb.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46993a;

        static {
            int[] iArr = new int[C4546y.d.values().length];
            try {
                iArr[C4546y.d.f44796a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C4546y.d.f44797b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C4546y.d.f44798c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C4546y.d.f44800e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C4546y.d.f44801f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C4546y.d.f44799d.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C4546y.d.f44802g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C4546y.d.f44803h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C4546y.d.f44804i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f46993a = iArr;
        }
    }

    public static final void a(U u10, C4546y.d stackAnimation, boolean z10) {
        AbstractC5504s.h(u10, "<this>");
        AbstractC5504s.h(stackAnimation, "stackAnimation");
        if (z10) {
            switch (a.f46993a[stackAnimation.ordinal()]) {
                case 1:
                    u10.s(r.f44681a, r.f44682b);
                    return;
                case 2:
                    int i10 = r.f44697q;
                    u10.s(i10, i10);
                    return;
                case 3:
                    u10.s(r.f44686f, r.f44687g);
                    return;
                case 4:
                    u10.s(r.f44703w, r.f44705y);
                    return;
                case 5:
                    u10.s(r.f44702v, r.f44706z);
                    return;
                case 6:
                    u10.s(r.f44701u, r.f44700t);
                    return;
                case 7:
                    u10.s(r.f44685e, r.f44699s);
                    return;
                case 8:
                    u10.s(r.f44696p, r.f44694n);
                    return;
                case 9:
                    u10.s(r.f44692l, r.f44690j);
                    return;
                default:
                    throw new Td.r();
            }
        }
        switch (a.f46993a[stackAnimation.ordinal()]) {
            case 1:
                u10.s(r.f44683c, r.f44684d);
                return;
            case 2:
                int i11 = r.f44697q;
                u10.s(i11, i11);
                return;
            case 3:
                u10.s(r.f44686f, r.f44687g);
                return;
            case 4:
                u10.s(r.f44702v, r.f44706z);
                return;
            case 5:
                u10.s(r.f44703w, r.f44705y);
                return;
            case 6:
                u10.s(r.f44700t, r.f44704x);
                return;
            case 7:
                u10.s(r.f44698r, r.f44688h);
                return;
            case 8:
                u10.s(r.f44693m, r.f44695o);
                return;
            case 9:
                u10.s(r.f44689i, r.f44691k);
                return;
            default:
                throw new Td.r();
        }
    }
}
