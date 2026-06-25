package K0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G0 {
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!(i10 >= 0 && i10 < 32768)) {
            H0.a.a("Start must be in the range of 0 .. 32767");
        }
        if (!(i11 >= 0 && i11 < 32768)) {
            H0.a.a("Top must be in the range of 0 .. 32767");
        }
        if (!(i12 >= 0 && i12 < 32768)) {
            H0.a.a("End must be in the range of 0 .. 32767");
        }
        if (!(i13 >= 0 && i13 < 32768)) {
            H0.a.a("Bottom must be in the range of 0 .. 32767");
        }
        return F0.d(F0.f10418a.c(i10, i11, i12, i13, true));
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return a(i10, i11, i12, i13);
    }
}
