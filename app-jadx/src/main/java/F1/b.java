package f1;

import android.graphics.Paint;
import s0.G1;
import s0.H1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Paint.Cap a(int i10) {
        G1.a aVar = G1.f58877a;
        return G1.e(i10, aVar.a()) ? Paint.Cap.BUTT : G1.e(i10, aVar.b()) ? Paint.Cap.ROUND : G1.e(i10, aVar.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int i10) {
        H1.a aVar = H1.f58881a;
        return H1.e(i10, aVar.b()) ? Paint.Join.MITER : H1.e(i10, aVar.c()) ? Paint.Join.ROUND : H1.e(i10, aVar.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
