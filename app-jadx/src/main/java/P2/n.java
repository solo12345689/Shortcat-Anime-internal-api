package P2;

import A2.N;
import C2.V;
import M2.D;
import M2.n0;
import P2.A;
import P2.C1984a;
import P2.D;
import P2.n;
import P9.AbstractC2004m;
import P9.AbstractC2011u;
import P9.K;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.O0;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import q2.C6088c;
import q2.C6109x;
import q2.Y;
import q2.a0;
import q2.b0;
import q2.d0;
import t2.AbstractC6614a;
import t2.AbstractC6622i;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class n extends D implements O0.a {

    /* JADX INFO: renamed from: l */
    private static final K f13329l = K.b(new Comparator() { // from class: P2.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.v((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d */
    private final Object f13330d;

    /* JADX INFO: renamed from: e */
    public final Context f13331e;

    /* JADX INFO: renamed from: f */
    private final A.b f13332f;

    /* JADX INFO: renamed from: g */
    private e f13333g;

    /* JADX INFO: renamed from: h */
    private Thread f13334h;

    /* JADX INFO: renamed from: i */
    private g f13335i;

    /* JADX INFO: renamed from: j */
    private C6088c f13336j;

    /* JADX INFO: renamed from: k */
    private Boolean f13337k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends i implements Comparable {

        /* JADX INFO: renamed from: e */
        private final int f13338e;

        /* JADX INFO: renamed from: f */
        private final boolean f13339f;

        /* JADX INFO: renamed from: g */
        private final String f13340g;

        /* JADX INFO: renamed from: h */
        private final e f13341h;

        /* JADX INFO: renamed from: i */
        private final boolean f13342i;

        /* JADX INFO: renamed from: j */
        private final int f13343j;

        /* JADX INFO: renamed from: k */
        private final int f13344k;

        /* JADX INFO: renamed from: l */
        private final int f13345l;

        /* JADX INFO: renamed from: m */
        private final boolean f13346m;

        /* JADX INFO: renamed from: n */
        private final boolean f13347n;

        /* JADX INFO: renamed from: o */
        private final int f13348o;

        /* JADX INFO: renamed from: p */
        private final int f13349p;

        /* JADX INFO: renamed from: q */
        private final boolean f13350q;

        /* JADX INFO: renamed from: r */
        private final int f13351r;

        /* JADX INFO: renamed from: s */
        private final int f13352s;

        /* JADX INFO: renamed from: t */
        private final int f13353t;

        /* JADX INFO: renamed from: u */
        private final int f13354u;

        /* JADX INFO: renamed from: v */
        private final boolean f13355v;

        /* JADX INFO: renamed from: w */
        private final boolean f13356w;

        /* JADX INFO: renamed from: x */
        private final boolean f13357x;

        public b(int i10, a0 a0Var, int i11, e eVar, int i12, boolean z10, O9.o oVar, int i13) {
            int i14;
            int I10;
            int I11;
            super(i10, a0Var, i11);
            this.f13341h = eVar;
            int i15 = eVar.f13398y0 ? 24 : 16;
            this.f13346m = eVar.f13394u0 && (i13 & i15) != 0;
            this.f13340g = n.V(this.f13435d.f57011d);
            this.f13342i = O0.l(i12, false);
            int i16 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i16 >= eVar.f56822p.size()) {
                    I10 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    I10 = n.I(this.f13435d, (String) eVar.f56822p.get(i16), false);
                    if (I10 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f13344k = i16;
            this.f13343j = I10;
            this.f13345l = n.M(this.f13435d.f57013f, eVar.f56823q);
            C6109x c6109x = this.f13435d;
            int i17 = c6109x.f57013f;
            this.f13347n = i17 == 0 || (i17 & 1) != 0;
            this.f13350q = (c6109x.f57012e & 1) != 0;
            this.f13357x = n.Q(c6109x);
            C6109x c6109x2 = this.f13435d;
            int i18 = c6109x2.f56997G;
            this.f13351r = i18;
            this.f13352s = c6109x2.f56998H;
            int i19 = c6109x2.f57017j;
            this.f13353t = i19;
            this.f13339f = (i19 == -1 || i19 <= eVar.f56825s) && (i18 == -1 || i18 <= eVar.f56824r) && oVar.apply(c6109x2);
            String[] strArrT0 = t2.a0.t0();
            int i20 = 0;
            while (true) {
                if (i20 >= strArrT0.length) {
                    I11 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    I11 = n.I(this.f13435d, strArrT0[i20], false);
                    if (I11 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f13348o = i20;
            this.f13349p = I11;
            int i21 = 0;
            while (true) {
                if (i21 < eVar.f56826t.size()) {
                    String str = this.f13435d.f57022o;
                    if (str != null && str.equals(eVar.f56826t.get(i21))) {
                        i14 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f13354u = i14;
            this.f13355v = O0.k(i12) == 128;
            this.f13356w = O0.F(i12) == 64;
            this.f13338e = m(i12, z10, i15);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static AbstractC2011u k(int i10, a0 a0Var, e eVar, int[] iArr, boolean z10, O9.o oVar, int i11) {
            AbstractC2011u.a aVarT = AbstractC2011u.t();
            for (int i12 = 0; i12 < a0Var.f56702a; i12++) {
                aVarT.a(new b(i10, a0Var, i12, eVar, iArr[i12], z10, oVar, i11));
            }
            return aVarT.k();
        }

        private int m(int i10, boolean z10, int i11) {
            if (!O0.l(i10, this.f13341h.f13383A0)) {
                return 0;
            }
            if (!this.f13339f && !this.f13341h.f13393t0) {
                return 0;
            }
            e eVar = this.f13341h;
            if (eVar.f56827u.f56837a == 2 && !n.W(eVar, i10, this.f13435d)) {
                return 0;
            }
            if (!O0.l(i10, false) || !this.f13339f || this.f13435d.f57017j == -1) {
                return 1;
            }
            e eVar2 = this.f13341h;
            if (eVar2.f56804C || eVar2.f56803B) {
                return 1;
            }
            return ((!eVar2.f13385C0 && z10) || eVar2.f56827u.f56837a == 2 || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // P2.n.i
        public int a() {
            return this.f13338e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h */
        public int compareTo(b bVar) {
            K kE = (this.f13339f && this.f13342i) ? n.f13329l : n.f13329l.e();
            AbstractC2004m abstractC2004mF = AbstractC2004m.j().g(this.f13342i, bVar.f13342i).f(Integer.valueOf(this.f13344k), Integer.valueOf(bVar.f13344k), K.c().e()).d(this.f13343j, bVar.f13343j).d(this.f13345l, bVar.f13345l).g(this.f13350q, bVar.f13350q).g(this.f13347n, bVar.f13347n).f(Integer.valueOf(this.f13348o), Integer.valueOf(bVar.f13348o), K.c().e()).d(this.f13349p, bVar.f13349p).g(this.f13339f, bVar.f13339f).f(Integer.valueOf(this.f13354u), Integer.valueOf(bVar.f13354u), K.c().e());
            if (this.f13341h.f56803B) {
                abstractC2004mF = abstractC2004mF.f(Integer.valueOf(this.f13353t), Integer.valueOf(bVar.f13353t), n.f13329l.e());
            }
            AbstractC2004m abstractC2004mF2 = abstractC2004mF.g(this.f13355v, bVar.f13355v).g(this.f13356w, bVar.f13356w).g(this.f13357x, bVar.f13357x).f(Integer.valueOf(this.f13351r), Integer.valueOf(bVar.f13351r), kE).f(Integer.valueOf(this.f13352s), Integer.valueOf(bVar.f13352s), kE);
            if (Objects.equals(this.f13340g, bVar.f13340g)) {
                abstractC2004mF2 = abstractC2004mF2.f(Integer.valueOf(this.f13353t), Integer.valueOf(bVar.f13353t), kE);
            }
            return abstractC2004mF2.i();
        }

        @Override // P2.n.i
        /* JADX INFO: renamed from: n */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if (!this.f13341h.f13396w0 && ((i11 = this.f13435d.f56997G) == -1 || i11 != bVar.f13435d.f56997G)) {
                return false;
            }
            if (!this.f13346m && ((str = this.f13435d.f57022o) == null || !TextUtils.equals(str, bVar.f13435d.f57022o))) {
                return false;
            }
            e eVar = this.f13341h;
            if (!eVar.f13395v0 && ((i10 = this.f13435d.f56998H) == -1 || i10 != bVar.f13435d.f56998H)) {
                return false;
            }
            if (eVar.f13397x0) {
                return true;
            }
            return this.f13355v == bVar.f13355v && this.f13356w == bVar.f13356w;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends i implements Comparable {

        /* JADX INFO: renamed from: e */
        private final int f13358e;

        /* JADX INFO: renamed from: f */
        private final int f13359f;

        public c(int i10, a0 a0Var, int i11, e eVar, int i12) {
            super(i10, a0Var, i11);
            this.f13358e = O0.l(i12, eVar.f13383A0) ? 1 : 0;
            this.f13359f = this.f13435d.g();
        }

        public static int c(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static AbstractC2011u k(int i10, a0 a0Var, e eVar, int[] iArr) {
            AbstractC2011u.a aVarT = AbstractC2011u.t();
            for (int i11 = 0; i11 < a0Var.f56702a; i11++) {
                aVarT.a(new c(i10, a0Var, i11, eVar, iArr[i11]));
            }
            return aVarT.k();
        }

        @Override // P2.n.i
        public int a() {
            return this.f13358e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h */
        public int compareTo(c cVar) {
            return Integer.compare(this.f13359f, cVar.f13359f);
        }

        @Override // P2.n.i
        /* JADX INFO: renamed from: m */
        public boolean b(c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements Comparable {

        /* JADX INFO: renamed from: a */
        private final boolean f13360a;

        /* JADX INFO: renamed from: b */
        private final boolean f13361b;

        public d(C6109x c6109x, int i10) {
            this.f13360a = (c6109x.f57012e & 1) != 0;
            this.f13361b = O0.l(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a */
        public int compareTo(d dVar) {
            return AbstractC2004m.j().g(this.f13361b, dVar.f13361b).g(this.f13360a, dVar.f13360a).i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends d0 {

        /* JADX INFO: renamed from: G0 */
        public static final e f13362G0;

        /* JADX INFO: renamed from: H0 */
        public static final e f13363H0;

        /* JADX INFO: renamed from: I0 */
        private static final String f13364I0;

        /* JADX INFO: renamed from: J0 */
        private static final String f13365J0;

        /* JADX INFO: renamed from: K0 */
        private static final String f13366K0;

        /* JADX INFO: renamed from: L0 */
        private static final String f13367L0;

        /* JADX INFO: renamed from: M0 */
        private static final String f13368M0;

        /* JADX INFO: renamed from: N0 */
        private static final String f13369N0;

        /* JADX INFO: renamed from: O0 */
        private static final String f13370O0;

        /* JADX INFO: renamed from: P0 */
        private static final String f13371P0;

        /* JADX INFO: renamed from: Q0 */
        private static final String f13372Q0;

        /* JADX INFO: renamed from: R0 */
        private static final String f13373R0;

        /* JADX INFO: renamed from: S0 */
        private static final String f13374S0;

        /* JADX INFO: renamed from: T0 */
        private static final String f13375T0;

        /* JADX INFO: renamed from: U0 */
        private static final String f13376U0;

        /* JADX INFO: renamed from: V0 */
        private static final String f13377V0;

        /* JADX INFO: renamed from: W0 */
        private static final String f13378W0;

        /* JADX INFO: renamed from: X0 */
        private static final String f13379X0;

        /* JADX INFO: renamed from: Y0 */
        private static final String f13380Y0;

        /* JADX INFO: renamed from: Z0 */
        private static final String f13381Z0;

        /* JADX INFO: renamed from: a1 */
        private static final String f13382a1;

        /* JADX INFO: renamed from: A0 */
        public final boolean f13383A0;

        /* JADX INFO: renamed from: B0 */
        public final boolean f13384B0;

        /* JADX INFO: renamed from: C0 */
        public final boolean f13385C0;

        /* JADX INFO: renamed from: D0 */
        public final boolean f13386D0;

        /* JADX INFO: renamed from: E0 */
        private final SparseArray f13387E0;

        /* JADX INFO: renamed from: F0 */
        private final SparseBooleanArray f13388F0;

        /* JADX INFO: renamed from: p0 */
        public final boolean f13389p0;

        /* JADX INFO: renamed from: q0 */
        public final boolean f13390q0;

        /* JADX INFO: renamed from: r0 */
        public final boolean f13391r0;

        /* JADX INFO: renamed from: s0 */
        public final boolean f13392s0;

        /* JADX INFO: renamed from: t0 */
        public final boolean f13393t0;

        /* JADX INFO: renamed from: u0 */
        public final boolean f13394u0;

        /* JADX INFO: renamed from: v0 */
        public final boolean f13395v0;

        /* JADX INFO: renamed from: w0 */
        public final boolean f13396w0;

        /* JADX INFO: renamed from: x0 */
        public final boolean f13397x0;

        /* JADX INFO: renamed from: y0 */
        public final boolean f13398y0;

        /* JADX INFO: renamed from: z0 */
        public final boolean f13399z0;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends d0.c {

            /* JADX INFO: renamed from: F */
            private boolean f13400F;

            /* JADX INFO: renamed from: G */
            private boolean f13401G;

            /* JADX INFO: renamed from: H */
            private boolean f13402H;

            /* JADX INFO: renamed from: I */
            private boolean f13403I;

            /* JADX INFO: renamed from: J */
            private boolean f13404J;

            /* JADX INFO: renamed from: K */
            private boolean f13405K;

            /* JADX INFO: renamed from: L */
            private boolean f13406L;

            /* JADX INFO: renamed from: M */
            private boolean f13407M;

            /* JADX INFO: renamed from: N */
            private boolean f13408N;

            /* JADX INFO: renamed from: O */
            private boolean f13409O;

            /* JADX INFO: renamed from: P */
            private boolean f13410P;

            /* JADX INFO: renamed from: Q */
            private boolean f13411Q;

            /* JADX INFO: renamed from: R */
            private boolean f13412R;

            /* JADX INFO: renamed from: S */
            private boolean f13413S;

            /* JADX INFO: renamed from: T */
            private boolean f13414T;

            /* JADX INFO: renamed from: U */
            private final SparseArray f13415U;

            /* JADX INFO: renamed from: V */
            private final SparseBooleanArray f13416V;

            /* synthetic */ a(e eVar, a aVar) {
                this(eVar);
            }

            private static SparseArray r0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void s0() {
                this.f13400F = true;
                this.f13401G = false;
                this.f13402H = true;
                this.f13403I = false;
                this.f13404J = true;
                this.f13405K = false;
                this.f13406L = false;
                this.f13407M = false;
                this.f13408N = false;
                this.f13409O = true;
                this.f13410P = true;
                this.f13411Q = true;
                this.f13412R = false;
                this.f13413S = true;
                this.f13414T = false;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: A0 */
            public a T(String... strArr) {
                super.T(strArr);
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: B0 */
            public a U(int i10) {
                super.U(i10);
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: C0 */
            public a V(int i10, boolean z10) {
                super.V(i10, z10);
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: n0 */
            public a F(b0 b0Var) {
                super.F(b0Var);
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: o0 */
            public e G() {
                return new e(this);
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: p0 */
            public a H() {
                super.H();
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: q0 */
            public a I(int i10) {
                super.I(i10);
                return this;
            }

            protected a t0(d0 d0Var) {
                super.M(d0Var);
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: u0 */
            public a N(Set set) {
                super.N(set);
                return this;
            }

            public a v0(boolean z10) {
                super.O(z10);
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: w0 */
            public a P(int i10) {
                super.P(i10);
                return this;
            }

            public a x0(int i10, int i11) {
                super.Q(i10, i11);
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: y0 */
            public a R(b0 b0Var) {
                super.R(b0Var);
                return this;
            }

            @Override // q2.d0.c
            /* JADX INFO: renamed from: z0 */
            public a S(String str) {
                super.S(str);
                return this;
            }

            public a() {
                this.f13415U = new SparseArray();
                this.f13416V = new SparseBooleanArray();
                s0();
            }

            private a(e eVar) {
                super(eVar);
                this.f13400F = eVar.f13389p0;
                this.f13401G = eVar.f13390q0;
                this.f13402H = eVar.f13391r0;
                this.f13403I = eVar.f13392s0;
                this.f13404J = eVar.f13393t0;
                this.f13405K = eVar.f13394u0;
                this.f13406L = eVar.f13395v0;
                this.f13407M = eVar.f13396w0;
                this.f13408N = eVar.f13397x0;
                this.f13409O = eVar.f13398y0;
                this.f13410P = eVar.f13399z0;
                this.f13411Q = eVar.f13383A0;
                this.f13412R = eVar.f13384B0;
                this.f13413S = eVar.f13385C0;
                this.f13414T = eVar.f13386D0;
                this.f13415U = r0(eVar.f13387E0);
                this.f13416V = eVar.f13388F0.clone();
            }
        }

        static {
            e eVarG = new a().G();
            f13362G0 = eVarG;
            f13363H0 = eVarG;
            f13364I0 = t2.a0.H0(1000);
            f13365J0 = t2.a0.H0(ErrorCodes.SERVER_RETRY_IN);
            f13366K0 = t2.a0.H0(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
            f13367L0 = t2.a0.H0(ErrorCodes.MALFORMED_URL_EXCEPTION);
            f13368M0 = t2.a0.H0(ErrorCodes.PROTOCOL_EXCEPTION);
            f13369N0 = t2.a0.H0(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION);
            f13370O0 = t2.a0.H0(ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            f13371P0 = t2.a0.H0(ErrorCodes.IO_EXCEPTION);
            f13372Q0 = t2.a0.H0(1008);
            f13373R0 = t2.a0.H0(1009);
            f13374S0 = t2.a0.H0(1010);
            f13375T0 = t2.a0.H0(1011);
            f13376U0 = t2.a0.H0(1012);
            f13377V0 = t2.a0.H0(1013);
            f13378W0 = t2.a0.H0(1014);
            f13379X0 = t2.a0.H0(1015);
            f13380Y0 = t2.a0.H0(1016);
            f13381Z0 = t2.a0.H0(1017);
            f13382a1 = t2.a0.H0(1018);
        }

        /* synthetic */ e(a aVar, a aVar2) {
            this(aVar);
        }

        private static boolean N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean O(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !P((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean P(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                n0 n0Var = (n0) entry.getKey();
                if (!map2.containsKey(n0Var) || !Objects.equals(entry.getValue(), map2.get(n0Var))) {
                    return false;
                }
            }
            return true;
        }

        private static int[] R(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        private static void V(Bundle bundle, SparseArray sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                for (Map.Entry entry : ((Map) sparseArray.valueAt(i10)).entrySet()) {
                    android.support.v4.media.session.b.a(entry.getValue());
                    arrayList2.add((n0) entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f13374S0, S9.f.o(arrayList));
                bundle.putParcelableArrayList(f13375T0, AbstractC6622i.h(arrayList2, new O9.f() { // from class: P2.o
                    @Override // O9.f
                    public final Object apply(Object obj) {
                        return ((n0) obj).e();
                    }
                }));
                bundle.putSparseParcelableArray(f13376U0, AbstractC6622i.j(sparseArray2, new O9.f() { // from class: P2.p
                    @Override // O9.f
                    public final Object apply(Object obj) {
                        android.support.v4.media.session.b.a(obj);
                        throw null;
                    }
                }));
            }
        }

        @Override // q2.d0
        public Bundle K() {
            Bundle bundleK = super.K();
            bundleK.putBoolean(f13364I0, this.f13389p0);
            bundleK.putBoolean(f13365J0, this.f13390q0);
            bundleK.putBoolean(f13366K0, this.f13391r0);
            bundleK.putBoolean(f13378W0, this.f13392s0);
            bundleK.putBoolean(f13367L0, this.f13393t0);
            bundleK.putBoolean(f13368M0, this.f13394u0);
            bundleK.putBoolean(f13369N0, this.f13395v0);
            bundleK.putBoolean(f13370O0, this.f13396w0);
            bundleK.putBoolean(f13379X0, this.f13397x0);
            bundleK.putBoolean(f13382a1, this.f13398y0);
            bundleK.putBoolean(f13380Y0, this.f13399z0);
            bundleK.putBoolean(f13371P0, this.f13383A0);
            bundleK.putBoolean(f13372Q0, this.f13384B0);
            bundleK.putBoolean(f13373R0, this.f13385C0);
            bundleK.putBoolean(f13381Z0, this.f13386D0);
            V(bundleK, this.f13387E0);
            bundleK.putIntArray(f13377V0, R(this.f13388F0));
            return bundleK;
        }

        @Override // q2.d0
        /* JADX INFO: renamed from: Q */
        public a I() {
            return new a();
        }

        public boolean S(int i10) {
            return this.f13388F0.get(i10);
        }

        public f T(int i10, n0 n0Var) {
            Map map = (Map) this.f13387E0.get(i10);
            if (map != null) {
                android.support.v4.media.session.b.a(map.get(n0Var));
            }
            return null;
        }

        public boolean U(int i10, n0 n0Var) {
            Map map = (Map) this.f13387E0.get(i10);
            return map != null && map.containsKey(n0Var);
        }

        @Override // q2.d0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f13389p0 == eVar.f13389p0 && this.f13390q0 == eVar.f13390q0 && this.f13391r0 == eVar.f13391r0 && this.f13392s0 == eVar.f13392s0 && this.f13393t0 == eVar.f13393t0 && this.f13394u0 == eVar.f13394u0 && this.f13395v0 == eVar.f13395v0 && this.f13396w0 == eVar.f13396w0 && this.f13397x0 == eVar.f13397x0 && this.f13398y0 == eVar.f13398y0 && this.f13399z0 == eVar.f13399z0 && this.f13383A0 == eVar.f13383A0 && this.f13384B0 == eVar.f13384B0 && this.f13385C0 == eVar.f13385C0 && this.f13386D0 == eVar.f13386D0 && N(this.f13388F0, eVar.f13388F0) && O(this.f13387E0, eVar.f13387E0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // q2.d0
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f13389p0 ? 1 : 0)) * 31) + (this.f13390q0 ? 1 : 0)) * 31) + (this.f13391r0 ? 1 : 0)) * 31) + (this.f13392s0 ? 1 : 0)) * 31) + (this.f13393t0 ? 1 : 0)) * 31) + (this.f13394u0 ? 1 : 0)) * 31) + (this.f13395v0 ? 1 : 0)) * 31) + (this.f13396w0 ? 1 : 0)) * 31) + (this.f13397x0 ? 1 : 0)) * 31) + (this.f13398y0 ? 1 : 0)) * 31) + (this.f13399z0 ? 1 : 0)) * 31) + (this.f13383A0 ? 1 : 0)) * 31) + (this.f13384B0 ? 1 : 0)) * 31) + (this.f13385C0 ? 1 : 0)) * 31) + (this.f13386D0 ? 1 : 0);
        }

        private e(a aVar) {
            super(aVar);
            this.f13389p0 = aVar.f13400F;
            this.f13390q0 = aVar.f13401G;
            this.f13391r0 = aVar.f13402H;
            this.f13392s0 = aVar.f13403I;
            this.f13393t0 = aVar.f13404J;
            this.f13394u0 = aVar.f13405K;
            this.f13395v0 = aVar.f13406L;
            this.f13396w0 = aVar.f13407M;
            this.f13397x0 = aVar.f13408N;
            this.f13398y0 = aVar.f13409O;
            this.f13399z0 = aVar.f13410P;
            this.f13383A0 = aVar.f13411Q;
            this.f13384B0 = aVar.f13412R;
            this.f13385C0 = aVar.f13413S;
            this.f13386D0 = aVar.f13414T;
            this.f13387E0 = aVar.f13415U;
            this.f13388F0 = aVar.f13416V;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g {

        /* JADX INFO: renamed from: a */
        private final Spatializer f13417a;

        /* JADX INFO: renamed from: b */
        private final boolean f13418b;

        /* JADX INFO: renamed from: c */
        private final Handler f13419c;

        /* JADX INFO: renamed from: d */
        private final Spatializer$OnSpatializerStateChangedListener f13420d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ n f13421a;

            a(n nVar) {
                this.f13421a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f13421a.T();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f13421a.T();
            }
        }

        public g(Context context, n nVar, Boolean bool) {
            AudioManager audioManagerC = context == null ? null : r2.m.c(context);
            if (audioManagerC == null || (bool != null && bool.booleanValue())) {
                this.f13417a = null;
                this.f13418b = false;
                this.f13419c = null;
                this.f13420d = null;
                return;
            }
            Spatializer spatializer = audioManagerC.getSpatializer();
            this.f13417a = spatializer;
            this.f13418b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(nVar);
            this.f13420d = aVar;
            Handler handler = new Handler((Looper) AbstractC6614a.i(Looper.myLooper()));
            this.f13419c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new V(handler), aVar);
        }

        public boolean a(C6088c c6088c, C6109x c6109x) {
            int i10;
            if (Objects.equals(c6109x.f57022o, "audio/eac3-joc")) {
                i10 = c6109x.f56997G;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(c6109x.f57022o, "audio/iamf")) {
                i10 = c6109x.f56997G;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(c6109x.f57022o, "audio/ac4")) {
                i10 = c6109x.f56997G;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = c6109x.f56997G;
            }
            int iO = t2.a0.O(i10);
            if (iO == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iO);
            int i11 = c6109x.f56998H;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return u.a(AbstractC6614a.e(this.f13417a)).canBeSpatialized(c6088c.b().f56759a, channelMask.build());
        }

        public boolean b() {
            return u.a(AbstractC6614a.e(this.f13417a)).isAvailable();
        }

        public boolean c() {
            return u.a(AbstractC6614a.e(this.f13417a)).isEnabled();
        }

        public boolean d() {
            return this.f13418b;
        }

        public void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f13417a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f13420d) == null || this.f13419c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f13419c.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends i implements Comparable {

        /* JADX INFO: renamed from: e */
        private final int f13423e;

        /* JADX INFO: renamed from: f */
        private final boolean f13424f;

        /* JADX INFO: renamed from: g */
        private final boolean f13425g;

        /* JADX INFO: renamed from: h */
        private final boolean f13426h;

        /* JADX INFO: renamed from: i */
        private final int f13427i;

        /* JADX INFO: renamed from: j */
        private final int f13428j;

        /* JADX INFO: renamed from: k */
        private final int f13429k;

        /* JADX INFO: renamed from: l */
        private final int f13430l;

        /* JADX INFO: renamed from: m */
        private final boolean f13431m;

        public h(int i10, a0 a0Var, int i11, e eVar, int i12, String str, String str2) {
            int I10;
            super(i10, a0Var, i11);
            int i13 = 0;
            this.f13424f = O0.l(i12, false);
            int i14 = this.f13435d.f57012e & (~eVar.f56831y);
            this.f13425g = (i14 & 1) != 0;
            this.f13426h = (i14 & 2) != 0;
            AbstractC2011u abstractC2011uB = str2 != null ? AbstractC2011u.B(str2) : eVar.f56828v.isEmpty() ? AbstractC2011u.B("") : eVar.f56828v;
            int i15 = 0;
            while (true) {
                if (i15 >= abstractC2011uB.size()) {
                    i15 = Integer.MAX_VALUE;
                    I10 = 0;
                    break;
                } else {
                    I10 = n.I(this.f13435d, (String) abstractC2011uB.get(i15), eVar.f56832z);
                    if (I10 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f13427i = i15;
            this.f13428j = I10;
            int iM = n.M(this.f13435d.f57013f, str2 != null ? 1088 : eVar.f56829w);
            this.f13429k = iM;
            this.f13431m = (1088 & this.f13435d.f57013f) != 0;
            int I11 = n.I(this.f13435d, str, n.V(str) == null);
            this.f13430l = I11;
            boolean z10 = I10 > 0 || (eVar.f56828v.isEmpty() && iM > 0) || this.f13425g || (this.f13426h && I11 > 0);
            if (O0.l(i12, eVar.f13383A0) && z10) {
                i13 = 1;
            }
            this.f13423e = i13;
        }

        public static int c(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static AbstractC2011u k(int i10, a0 a0Var, e eVar, int[] iArr, String str, String str2) {
            AbstractC2011u.a aVarT = AbstractC2011u.t();
            for (int i11 = 0; i11 < a0Var.f56702a; i11++) {
                aVarT.a(new h(i10, a0Var, i11, eVar, iArr[i11], str, str2));
            }
            return aVarT.k();
        }

        @Override // P2.n.i
        public int a() {
            return this.f13423e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h */
        public int compareTo(h hVar) {
            AbstractC2004m abstractC2004mD = AbstractC2004m.j().g(this.f13424f, hVar.f13424f).f(Integer.valueOf(this.f13427i), Integer.valueOf(hVar.f13427i), K.c().e()).d(this.f13428j, hVar.f13428j).d(this.f13429k, hVar.f13429k).g(this.f13425g, hVar.f13425g).f(Boolean.valueOf(this.f13426h), Boolean.valueOf(hVar.f13426h), this.f13428j == 0 ? K.c() : K.c().e()).d(this.f13430l, hVar.f13430l);
            if (this.f13429k == 0) {
                abstractC2004mD = abstractC2004mD.h(this.f13431m, hVar.f13431m);
            }
            return abstractC2004mD.i();
        }

        @Override // P2.n.i
        /* JADX INFO: renamed from: m */
        public boolean b(h hVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class i {

        /* JADX INFO: renamed from: a */
        public final int f13432a;

        /* JADX INFO: renamed from: b */
        public final a0 f13433b;

        /* JADX INFO: renamed from: c */
        public final int f13434c;

        /* JADX INFO: renamed from: d */
        public final C6109x f13435d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public interface a {
            List a(int i10, a0 a0Var, int[] iArr);
        }

        public i(int i10, a0 a0Var, int i11) {
            this.f13432a = i10;
            this.f13433b = a0Var;
            this.f13434c = i11;
            this.f13435d = a0Var.c(i11);
        }

        public abstract int a();

        public abstract boolean b(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends i {

        /* JADX INFO: renamed from: e */
        private final boolean f13436e;

        /* JADX INFO: renamed from: f */
        private final e f13437f;

        /* JADX INFO: renamed from: g */
        private final boolean f13438g;

        /* JADX INFO: renamed from: h */
        private final boolean f13439h;

        /* JADX INFO: renamed from: i */
        private final boolean f13440i;

        /* JADX INFO: renamed from: j */
        private final int f13441j;

        /* JADX INFO: renamed from: k */
        private final int f13442k;

        /* JADX INFO: renamed from: l */
        private final int f13443l;

        /* JADX INFO: renamed from: m */
        private final int f13444m;

        /* JADX INFO: renamed from: n */
        private final int f13445n;

        /* JADX INFO: renamed from: o */
        private final int f13446o;

        /* JADX INFO: renamed from: p */
        private final boolean f13447p;

        /* JADX INFO: renamed from: q */
        private final int f13448q;

        /* JADX INFO: renamed from: r */
        private final boolean f13449r;

        /* JADX INFO: renamed from: s */
        private final int f13450s;

        /* JADX INFO: renamed from: t */
        private final boolean f13451t;

        /* JADX INFO: renamed from: u */
        private final boolean f13452u;

        /* JADX INFO: renamed from: v */
        private final int f13453v;

        /* JADX WARN: Removed duplicated region for block: B:133:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public j(int r5, q2.a0 r6, int r7, P2.n.e r8, int r9, java.lang.String r10, int r11, boolean r12) {
            /*
                Method dump skipped, instruction units count: 317
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: P2.n.j.<init>(int, q2.a0, int, P2.n$e, int, java.lang.String, int, boolean):void");
        }

        public static int k(j jVar, j jVar2) {
            AbstractC2004m abstractC2004mG = AbstractC2004m.j().g(jVar.f13439h, jVar2.f13439h).f(Integer.valueOf(jVar.f13444m), Integer.valueOf(jVar2.f13444m), K.c().e()).d(jVar.f13445n, jVar2.f13445n).d(jVar.f13446o, jVar2.f13446o).g(jVar.f13447p, jVar2.f13447p).d(jVar.f13448q, jVar2.f13448q).g(jVar.f13440i, jVar2.f13440i).g(jVar.f13436e, jVar2.f13436e).g(jVar.f13438g, jVar2.f13438g).f(Integer.valueOf(jVar.f13443l), Integer.valueOf(jVar2.f13443l), K.c().e()).g(jVar.f13451t, jVar2.f13451t).g(jVar.f13452u, jVar2.f13452u);
            if (jVar.f13451t && jVar.f13452u) {
                abstractC2004mG = abstractC2004mG.d(jVar.f13453v, jVar2.f13453v);
            }
            return abstractC2004mG.i();
        }

        public static int m(j jVar, j jVar2) {
            K kE = (jVar.f13436e && jVar.f13439h) ? n.f13329l : n.f13329l.e();
            AbstractC2004m abstractC2004mJ = AbstractC2004m.j();
            if (jVar.f13437f.f56803B) {
                abstractC2004mJ = abstractC2004mJ.f(Integer.valueOf(jVar.f13441j), Integer.valueOf(jVar2.f13441j), n.f13329l.e());
            }
            return abstractC2004mJ.f(Integer.valueOf(jVar.f13442k), Integer.valueOf(jVar2.f13442k), kE).f(Integer.valueOf(jVar.f13441j), Integer.valueOf(jVar2.f13441j), kE).i();
        }

        public static int n(List list, List list2) {
            return AbstractC2004m.j().f((j) Collections.max(list, new Comparator() { // from class: P2.y
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.k((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: P2.y
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.k((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: P2.y
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.k((n.j) obj, (n.j) obj2);
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: P2.z
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.m((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: P2.z
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.m((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: P2.z
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.m((n.j) obj, (n.j) obj2);
                }
            }).i();
        }

        public static AbstractC2011u p(int i10, a0 a0Var, e eVar, int[] iArr, String str, int i11, Point point) {
            int iJ = n.J(a0Var, point != null ? point.x : eVar.f56815i, point != null ? point.y : eVar.f56816j, eVar.f56818l);
            AbstractC2011u.a aVarT = AbstractC2011u.t();
            for (int i12 = 0; i12 < a0Var.f56702a; i12++) {
                int iG = a0Var.c(i12).g();
                aVarT.a(new j(i10, a0Var, i12, eVar, iArr[i12], str, i11, iJ == Integer.MAX_VALUE || (iG != -1 && iG <= iJ)));
            }
            return aVarT.k();
        }

        private int q(int i10, int i11) {
            if ((this.f13435d.f57013f & 16384) != 0 || !O0.l(i10, this.f13437f.f13383A0)) {
                return 0;
            }
            if (!this.f13436e && !this.f13437f.f13389p0) {
                return 0;
            }
            if (!O0.l(i10, false) || !this.f13438g || !this.f13436e || this.f13435d.f57017j == -1) {
                return 1;
            }
            e eVar = this.f13437f;
            return (eVar.f56804C || eVar.f56803B || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // P2.n.i
        public int a() {
            return this.f13450s;
        }

        @Override // P2.n.i
        /* JADX INFO: renamed from: r */
        public boolean b(j jVar) {
            if (!this.f13449r && !Objects.equals(this.f13435d.f57022o, jVar.f13435d.f57022o)) {
                return false;
            }
            if (this.f13437f.f13392s0) {
                return true;
            }
            return this.f13451t == jVar.f13451t && this.f13452u == jVar.f13452u;
        }
    }

    public n(Context context) {
        this(context, new C1984a.b());
    }

    private static void E(D.a aVar, e eVar, A.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            n0 n0VarF = aVar.f(i10);
            if (eVar.U(i10, n0VarF)) {
                eVar.T(i10, n0VarF);
                aVarArr[i10] = null;
            }
        }
    }

    private static void F(D.a aVar, d0 d0Var, A.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            H(aVar.f(i10), d0Var, map);
        }
        H(aVar.h(), d0Var, map);
        for (int i11 = 0; i11 < iD; i11++) {
            b0 b0Var = (b0) map.get(Integer.valueOf(aVar.e(i11)));
            if (b0Var != null) {
                aVarArr[i11] = (b0Var.f56744b.isEmpty() || aVar.f(i11).d(b0Var.f56743a) == -1) ? null : new A.a(b0Var.f56743a, S9.f.o(b0Var.f56744b));
            }
        }
    }

    private static void H(n0 n0Var, d0 d0Var, Map map) {
        b0 b0Var;
        for (int i10 = 0; i10 < n0Var.f12003a; i10++) {
            b0 b0Var2 = (b0) d0Var.f56805D.get(n0Var.b(i10));
            if (b0Var2 != null && ((b0Var = (b0) map.get(Integer.valueOf(b0Var2.b()))) == null || (b0Var.f56744b.isEmpty() && !b0Var2.f56744b.isEmpty()))) {
                map.put(Integer.valueOf(b0Var2.b()), b0Var2);
            }
        }
    }

    protected static int I(C6109x c6109x, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(c6109x.f57011d)) {
            return 4;
        }
        String strV = V(str);
        String strV2 = V(c6109x.f57011d);
        if (strV2 == null || strV == null) {
            return (z10 && strV2 == null) ? 1 : 0;
        }
        if (strV2.startsWith(strV) || strV.startsWith(strV2)) {
            return 3;
        }
        return t2.a0.w1(strV2, "-")[0].equals(t2.a0.w1(strV, "-")[0]) ? 2 : 0;
    }

    public static int J(a0 a0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < a0Var.f56702a; i14++) {
                C6109x c6109xC = a0Var.c(i14);
                int i15 = c6109xC.f57029v;
                if (i15 > 0 && (i12 = c6109xC.f57030w) > 0) {
                    Point pointD = F.d(z10, i10, i11, i15, i12);
                    int i16 = c6109xC.f57029v;
                    int i17 = c6109xC.f57030w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointD.x * 0.98f)) && i17 >= ((int) (pointD.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    private static String L(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return t2.a0.h0(locale);
    }

    public static int M(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int N(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public boolean O(C6109x c6109x, e eVar) {
        int i10;
        g gVar;
        g gVar2;
        if (!eVar.f13399z0) {
            return true;
        }
        Boolean bool = this.f13337k;
        if ((bool != null && bool.booleanValue()) || (i10 = c6109x.f56997G) == -1 || i10 <= 2) {
            return true;
        }
        if (!P(c6109x) || (Build.VERSION.SDK_INT >= 32 && (gVar2 = this.f13335i) != null && gVar2.d())) {
            return Build.VERSION.SDK_INT >= 32 && (gVar = this.f13335i) != null && gVar.d() && this.f13335i.b() && this.f13335i.c() && this.f13335i.a(this.f13336j, c6109x);
        }
        return true;
    }

    private static boolean P(C6109x c6109x) {
        String str = c6109x.f57022o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    public static boolean Q(C6109x c6109x) {
        String str = c6109x.f57022o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    private static void R(e eVar, D.a aVar, int[][][] iArr, N[] nArr, A[] aArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            A a10 = aArr[i12];
            if (iE != 1 && a10 != null) {
                return;
            }
            if (iE == 1 && a10 != null && a10.length() == 1) {
                if (W(eVar, iArr[i12][aVar.f(i12).d(a10.m())][a10.f(0)], a10.q())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = eVar.f56827u.f56838b ? 1 : 2;
            N n10 = nArr[i10];
            if (n10 != null && n10.f149b) {
                z10 = true;
            }
            nArr[i10] = new N(i13, z10);
        }
    }

    private static void S(D.a aVar, int[][][] iArr, N[] nArr, A[] aArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            A a10 = aArr[i12];
            if ((iE == 1 || iE == 2) && a10 != null && X(iArr[i12], aVar.f(i12), a10)) {
                if (iE == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            N n10 = new N(0, true);
            nArr[i11] = n10;
            nArr[i10] = n10;
        }
    }

    public void T() {
        boolean z10;
        g gVar;
        synchronized (this.f13330d) {
            try {
                z10 = this.f13333g.f13399z0 && Build.VERSION.SDK_INT >= 32 && (gVar = this.f13335i) != null && gVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            f();
        }
    }

    private void U(N0 n02) {
        boolean z10;
        synchronized (this.f13330d) {
            z10 = this.f13333g.f13386D0;
        }
        if (z10) {
            g(n02);
        }
    }

    protected static String V(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean W(e eVar, int i10, C6109x c6109x) {
        if (O0.y(i10) == 0) {
            return false;
        }
        if (eVar.f56827u.f56839c && (O0.y(i10) & 2048) == 0) {
            return false;
        }
        if (eVar.f56827u.f56838b) {
            boolean z10 = (c6109x.f57000J == 0 && c6109x.f57001K == 0) ? false : true;
            boolean z11 = (O0.y(i10) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    private static boolean X(int[][] iArr, n0 n0Var, A a10) {
        if (a10 == null) {
            return false;
        }
        int iD = n0Var.d(a10.m());
        for (int i10 = 0; i10 < a10.length(); i10++) {
            if (O0.r(iArr[iD][a10.f(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private Pair d0(int i10, D.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccessB;
        D.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                n0 n0VarF = aVar3.f(i12);
                for (int i13 = 0; i13 < n0VarF.f12003a; i13++) {
                    a0 a0VarB = n0VarF.b(i13);
                    List listA = aVar2.a(i12, a0VarB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[a0VarB.f56702a];
                    int i14 = 0;
                    while (i14 < a0VarB.f56702a) {
                        i iVar = (i) listA.get(i14);
                        int iA = iVar.a();
                        if (zArr[i14] || iA == 0) {
                            i11 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessB = AbstractC2011u.B(iVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i15 = i14 + 1;
                                while (i15 < a0VarB.f56702a) {
                                    i iVar2 = (i) listA.get(i15);
                                    int i16 = iD;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                randomAccessB = arrayList2;
                            }
                            i11 = iD;
                            arrayList.add(randomAccessB);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((i) list.get(i17)).f13434c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new A.a(iVar3.f13433b, iArr2), Integer.valueOf(iVar3.f13432a));
    }

    private void f0(e eVar) {
        boolean zEquals;
        AbstractC6614a.e(eVar);
        synchronized (this.f13330d) {
            zEquals = this.f13333g.equals(eVar);
            this.f13333g = eVar;
        }
        if (zEquals) {
            return;
        }
        if (eVar.f13399z0 && this.f13331e == null) {
            AbstractC6635w.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    public static /* synthetic */ List r(final n nVar, final e eVar, boolean z10, int[] iArr, int i10, a0 a0Var, int[] iArr2) {
        nVar.getClass();
        return b.k(i10, a0Var, eVar, iArr2, z10, new O9.o() { // from class: P2.m
            @Override // O9.o
            public final boolean apply(Object obj) {
                return this.f13327a.O((C6109x) obj, eVar);
            }
        }, iArr[i10]);
    }

    public static /* synthetic */ int v(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public e.a G() {
        return c().I();
    }

    @Override // P2.G
    /* JADX INFO: renamed from: K */
    public e c() {
        e eVar;
        synchronized (this.f13330d) {
            eVar = this.f13333g;
        }
        return eVar;
    }

    protected A.a[] Y(D.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        String str;
        int iD = aVar.d();
        A.a[] aVarArr = new A.a[iD];
        Pair pairZ = Z(aVar, iArr, iArr2, eVar);
        if (pairZ != null) {
            aVarArr[((Integer) pairZ.second).intValue()] = (A.a) pairZ.first;
        }
        if (pairZ == null) {
            str = null;
        } else {
            Object obj = pairZ.first;
            str = ((A.a) obj).f13260a.c(((A.a) obj).f13261b[0]).f57011d;
        }
        Pair pairE0 = e0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        Pair pairA0 = (eVar.f56802A || pairE0 == null) ? a0(aVar, iArr, eVar) : null;
        if (pairA0 != null) {
            aVarArr[((Integer) pairA0.second).intValue()] = (A.a) pairA0.first;
        } else if (pairE0 != null) {
            aVarArr[((Integer) pairE0.second).intValue()] = (A.a) pairE0.first;
        }
        Pair pairC0 = c0(aVar, iArr, eVar, str2);
        if (pairC0 != null) {
            aVarArr[((Integer) pairC0.second).intValue()] = (A.a) pairC0.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4) {
                aVarArr[i10] = b0(iE, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    protected Pair Z(D.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f12003a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return d0(1, aVar, iArr, new i.a() { // from class: P2.i
            @Override // P2.n.i.a
            public final List a(int i11, a0 a0Var, int[] iArr3) {
                return n.r(this.f13320a, eVar, z10, iArr2, i11, a0Var, iArr3);
            }
        }, new Comparator() { // from class: P2.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.c((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.O0.a
    public void a(N0 n02) {
        U(n02);
    }

    protected Pair a0(D.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f56827u.f56837a == 2) {
            return null;
        }
        return d0(4, aVar, iArr, new i.a() { // from class: P2.e
            @Override // P2.n.i.a
            public final List a(int i10, a0 a0Var, int[] iArr2) {
                return n.c.k(i10, a0Var, eVar, iArr2);
            }
        }, new Comparator() { // from class: P2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.c((List) obj, (List) obj2);
            }
        });
    }

    protected A.a b0(int i10, n0 n0Var, int[][] iArr, e eVar) {
        if (eVar.f56827u.f56837a == 2) {
            return null;
        }
        int i11 = 0;
        a0 a0Var = null;
        d dVar = null;
        for (int i12 = 0; i12 < n0Var.f12003a; i12++) {
            a0 a0VarB = n0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < a0VarB.f56702a; i13++) {
                if (O0.l(iArr2[i13], eVar.f13383A0)) {
                    d dVar2 = new d(a0VarB.c(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        a0Var = a0VarB;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (a0Var == null) {
            return null;
        }
        return new A.a(a0Var, i11);
    }

    protected Pair c0(D.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f56827u.f56837a == 2) {
            return null;
        }
        final String strL = eVar.f56830x ? L(this.f13331e) : null;
        return d0(3, aVar, iArr, new i.a() { // from class: P2.k
            @Override // P2.n.i.a
            public final List a(int i10, a0 a0Var, int[] iArr2) {
                return n.h.k(i10, a0Var, eVar, iArr2, str, strL);
            }
        }, new Comparator() { // from class: P2.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair e0(D.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) {
        Context context;
        final Point pointX = null;
        if (eVar.f56827u.f56837a == 2) {
            return null;
        }
        if (eVar.f56817k && (context = this.f13331e) != null) {
            pointX = t2.a0.X(context);
        }
        return d0(2, aVar, iArr, new i.a() { // from class: P2.g
            @Override // P2.n.i.a
            public final List a(int i10, a0 a0Var, int[] iArr3) {
                return n.j.p(i10, a0Var, eVar, iArr3, str, iArr2[i10], pointX);
            }
        }, new Comparator() { // from class: P2.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.n((List) obj, (List) obj2);
            }
        });
    }

    @Override // P2.G
    public boolean h() {
        return true;
    }

    @Override // P2.G
    public void j() {
        g gVar;
        synchronized (this.f13330d) {
            try {
                Thread thread = this.f13334h;
                if (thread != null) {
                    AbstractC6614a.h(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (gVar = this.f13335i) != null) {
            gVar.e();
            this.f13335i = null;
        }
        super.j();
    }

    @Override // P2.G
    public void l(C6088c c6088c) {
        if (this.f13336j.equals(c6088c)) {
            return;
        }
        this.f13336j = c6088c;
        T();
    }

    @Override // P2.G
    public void m(d0 d0Var) {
        if (d0Var instanceof e) {
            f0((e) d0Var);
        }
        f0(new e.a().t0(d0Var).G());
    }

    @Override // P2.D
    protected final Pair q(D.a aVar, int[][][] iArr, int[] iArr2, D.b bVar, Y y10) {
        e eVar;
        Context context;
        synchronized (this.f13330d) {
            this.f13334h = Thread.currentThread();
            eVar = this.f13333g;
        }
        if (this.f13337k == null && (context = this.f13331e) != null) {
            this.f13337k = Boolean.valueOf(t2.a0.P0(context));
        }
        if (eVar.f13399z0 && Build.VERSION.SDK_INT >= 32 && this.f13335i == null) {
            this.f13335i = new g(this.f13331e, this, this.f13337k);
        }
        int iD = aVar.d();
        A.a[] aVarArrY = Y(aVar, iArr, iArr2, eVar);
        F(aVar, eVar, aVarArrY);
        E(aVar, eVar, aVarArrY);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (eVar.S(i10) || eVar.f56806E.contains(Integer.valueOf(iE))) {
                aVarArrY[i10] = null;
            }
        }
        A[] aArrA = this.f13332f.a(aVarArrY, b(), bVar, y10);
        N[] nArr = new N[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            nArr[i11] = (eVar.S(i11) || eVar.f56806E.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && aArrA[i11] == null)) ? null : N.f147c;
        }
        if (eVar.f13384B0) {
            S(aVar, iArr, nArr, aArrA);
        }
        if (eVar.f56827u.f56837a != 0) {
            R(eVar, aVar, iArr, nArr, aArrA);
        }
        return Pair.create(nArr, aArrA);
    }

    public n(Context context, A.b bVar) {
        this(context, e.f13362G0, bVar);
    }

    public n(Context context, d0 d0Var, A.b bVar) {
        this(d0Var, bVar, context);
    }

    private n(d0 d0Var, A.b bVar, Context context) {
        this.f13330d = new Object();
        this.f13331e = context != null ? context.getApplicationContext() : null;
        this.f13332f = bVar;
        if (d0Var instanceof e) {
            this.f13333g = (e) d0Var;
        } else {
            this.f13333g = e.f13362G0.I().t0(d0Var).G();
        }
        this.f13336j = C6088c.f56745h;
        if (this.f13333g.f13399z0 && context == null) {
            AbstractC6635w.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // P2.G
    public O0.a d() {
        return this;
    }
}
