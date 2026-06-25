package tg;

import Ud.AbstractC2263d;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class N extends AbstractC2263d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f60963d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6686k[] f60964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f60965c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, C6683h c6683h, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((C6686k) list.get(i17)).K() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C6686k c6686k = (C6686k) list.get(i11);
            C6686k c6686k2 = (C6686k) list.get(i12 - 1);
            if (i16 == c6686k.K()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                C6686k c6686k3 = (C6686k) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                c6686k = c6686k3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c6686k.m(i16) == c6686k2.m(i16)) {
                int iMin = Math.min(c6686k.K(), c6686k2.K());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && c6686k.m(i20) == c6686k2.m(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(c6683h) + ((long) 2) + ((long) i19) + 1;
                c6683h.writeInt(-i19);
                c6683h.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    c6683h.writeInt(c6686k.m(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((C6686k) list.get(i13)).K()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c6683h.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C6683h c6683h2 = new C6683h();
                    c6683h.writeInt(((int) (c(c6683h2) + jC)) * (-1));
                    a(jC, c6683h2, i21, list, i13, i12, list2);
                    c6683h.O0(c6683h2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((C6686k) list.get(i23 - 1)).m(i16) != ((C6686k) list.get(i23)).m(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(c6683h) + ((long) 2) + ((long) (i22 * 2));
            c6683h.writeInt(i22);
            c6683h.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bM = ((C6686k) list.get(i24)).m(i16);
                if (i24 == i13 || bM != ((C6686k) list.get(i24 - 1)).m(i16)) {
                    c6683h.writeInt(bM & 255);
                }
            }
            C6683h c6683h3 = new C6683h();
            while (i13 < i12) {
                byte bM2 = ((C6686k) list.get(i13)).m(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bM2 != ((C6686k) list.get(i26)).m(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((C6686k) list.get(i13)).K()) {
                    c6683h.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jC2;
                } else {
                    c6683h.writeInt(((int) (c(c6683h3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, c6683h3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            c6683h.O0(c6683h3);
        }

        static /* synthetic */ void b(a aVar, long j10, C6683h c6683h, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, c6683h, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C6683h c6683h) {
            return c6683h.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tg.N d(tg.C6686k... r17) {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.N.a.d(tg.k[]):tg.N");
        }

        private a() {
        }
    }

    public /* synthetic */ N(C6686k[] c6686kArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6686kArr, iArr);
    }

    @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C6686k) {
            return f((C6686k) obj);
        }
        return false;
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f60964b.length;
    }

    public /* bridge */ boolean f(C6686k c6686k) {
        return super.contains(c6686k);
    }

    @Override // Ud.AbstractC2263d, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C6686k get(int i10) {
        return this.f60964b[i10];
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C6686k) {
            return t((C6686k) obj);
        }
        return -1;
    }

    public final C6686k[] l() {
        return this.f60964b;
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C6686k) {
            return u((C6686k) obj);
        }
        return -1;
    }

    public final int[] p() {
        return this.f60965c;
    }

    public /* bridge */ int t(C6686k c6686k) {
        return super.indexOf(c6686k);
    }

    public /* bridge */ int u(C6686k c6686k) {
        return super.lastIndexOf(c6686k);
    }

    private N(C6686k[] c6686kArr, int[] iArr) {
        this.f60964b = c6686kArr;
        this.f60965c = iArr;
    }
}
