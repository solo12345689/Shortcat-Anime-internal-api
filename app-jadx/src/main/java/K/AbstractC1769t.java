package K;

import android.view.KeyEvent;

/* JADX INFO: renamed from: K.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1769t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f10337a = new a();

    /* JADX INFO: renamed from: K.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements r {
        a() {
        }

        @Override // K.r
        public EnumC1766p a(KeyEvent keyEvent) {
            EnumC1766p enumC1766p = null;
            if (C0.d.f(keyEvent) && C0.d.d(keyEvent)) {
                long jA = C0.d.a(keyEvent);
                B b10 = B.f9726a;
                if (C0.a.r(jA, b10.i())) {
                    enumC1766p = EnumC1766p.SELECT_LINE_LEFT;
                } else if (C0.a.r(jA, b10.j())) {
                    enumC1766p = EnumC1766p.SELECT_LINE_RIGHT;
                } else if (C0.a.r(jA, b10.k())) {
                    enumC1766p = EnumC1766p.SELECT_HOME;
                } else if (C0.a.r(jA, b10.h())) {
                    enumC1766p = EnumC1766p.SELECT_END;
                }
            } else if (C0.d.d(keyEvent)) {
                long jA2 = C0.d.a(keyEvent);
                B b11 = B.f9726a;
                if (C0.a.r(jA2, b11.i())) {
                    enumC1766p = EnumC1766p.LINE_LEFT;
                } else if (C0.a.r(jA2, b11.j())) {
                    enumC1766p = EnumC1766p.LINE_RIGHT;
                } else if (C0.a.r(jA2, b11.k())) {
                    enumC1766p = EnumC1766p.HOME;
                } else if (C0.a.r(jA2, b11.h())) {
                    enumC1766p = EnumC1766p.END;
                }
            }
            return enumC1766p == null ? AbstractC1768s.b().a(keyEvent) : enumC1766p;
        }
    }

    public static final r a() {
        return f10337a;
    }
}
