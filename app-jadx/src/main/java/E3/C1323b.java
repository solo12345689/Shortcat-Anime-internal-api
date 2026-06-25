package E3;

import P9.AbstractC2011u;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import q2.InterfaceC6084P;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: E3.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1323b {

    /* JADX INFO: renamed from: j */
    private static final String f5132j = t2.a0.H0(0);

    /* JADX INFO: renamed from: k */
    private static final String f5133k = t2.a0.H0(1);

    /* JADX INFO: renamed from: l */
    private static final String f5134l = t2.a0.H0(2);

    /* JADX INFO: renamed from: m */
    private static final String f5135m = t2.a0.H0(3);

    /* JADX INFO: renamed from: n */
    private static final String f5136n = t2.a0.H0(4);

    /* JADX INFO: renamed from: o */
    private static final String f5137o = t2.a0.H0(5);

    /* JADX INFO: renamed from: p */
    private static final String f5138p = t2.a0.H0(6);

    /* JADX INFO: renamed from: q */
    private static final String f5139q = t2.a0.H0(7);

    /* JADX INFO: renamed from: r */
    private static final String f5140r = t2.a0.H0(8);

    /* JADX INFO: renamed from: a */
    public final T6 f5141a;

    /* JADX INFO: renamed from: b */
    public final int f5142b;

    /* JADX INFO: renamed from: c */
    public final int f5143c;

    /* JADX INFO: renamed from: d */
    public final int f5144d;

    /* JADX INFO: renamed from: e */
    public final Uri f5145e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f5146f;

    /* JADX INFO: renamed from: g */
    public final Bundle f5147g;

    /* JADX INFO: renamed from: h */
    public final S9.e f5148h;

    /* JADX INFO: renamed from: i */
    public final boolean f5149i;

    /* JADX INFO: renamed from: E3.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0050b {

        /* JADX INFO: renamed from: a */
        private final int f5150a;

        /* JADX INFO: renamed from: b */
        private T6 f5151b;

        /* JADX INFO: renamed from: c */
        private int f5152c;

        /* JADX INFO: renamed from: d */
        private int f5153d;

        /* JADX INFO: renamed from: e */
        private Uri f5154e;

        /* JADX INFO: renamed from: f */
        private CharSequence f5155f;

        /* JADX INFO: renamed from: g */
        private Bundle f5156g;

        /* JADX INFO: renamed from: h */
        private boolean f5157h;

        /* JADX INFO: renamed from: i */
        private S9.e f5158i;

        public C0050b() {
            this(0);
        }

        public C1323b a() {
            AbstractC6614a.h((this.f5151b == null) != (this.f5152c == -1), "Exactly one of sessionCommand and playerCommand should be set");
            if (this.f5158i == null) {
                this.f5158i = S9.e.h(C1323b.g(this.f5152c, this.f5150a));
            }
            return new C1323b(this.f5151b, this.f5152c, this.f5150a, this.f5153d, this.f5154e, this.f5155f, this.f5156g, this.f5157h, this.f5158i);
        }

        public C0050b b(int i10) {
            this.f5153d = i10;
            return this;
        }

        public C0050b c(CharSequence charSequence) {
            this.f5155f = charSequence;
            return this;
        }

        public C0050b d(boolean z10) {
            this.f5157h = z10;
            return this;
        }

        public C0050b e(Bundle bundle) {
            this.f5156g = new Bundle(bundle);
            return this;
        }

        public C0050b f(int i10) {
            return b(i10);
        }

        public C0050b g(Uri uri) {
            AbstractC6614a.b(Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"), "Only content or resource Uris are supported for CommandButton");
            this.f5154e = uri;
            return this;
        }

        public C0050b h(int i10) {
            AbstractC6614a.b(this.f5151b == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            this.f5152c = i10;
            return this;
        }

        public C0050b i(T6 t62) {
            AbstractC6614a.f(t62, "sessionCommand should not be null.");
            AbstractC6614a.b(this.f5152c == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
            this.f5151b = t62;
            return this;
        }

        public C0050b j(int... iArr) {
            AbstractC6614a.a(iArr.length != 0);
            this.f5158i = S9.e.b(iArr);
            return this;
        }

        public C0050b(int i10) {
            this(i10, C1323b.h(i10));
        }

        C0050b(int i10, int i11) {
            this.f5150a = i10;
            this.f5153d = i11;
            this.f5155f = "";
            this.f5156g = Bundle.EMPTY;
            this.f5152c = -1;
            this.f5157h = true;
        }
    }

    /* synthetic */ C1323b(T6 t62, int i10, int i11, int i12, Uri uri, CharSequence charSequence, Bundle bundle, boolean z10, S9.e eVar, a aVar) {
        this(t62, i10, i11, i12, uri, charSequence, bundle, z10, eVar);
    }

    static boolean a(List list, int i10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((C1323b) list.get(i11)).f5148h.c(0) == i10) {
                return true;
            }
        }
        return false;
    }

    static AbstractC2011u d(List list, U6 u62, InterfaceC6084P.b bVar) {
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1323b c1323b = (C1323b) list.get(i10);
            if (j(c1323b, u62, bVar)) {
                aVar.a(c1323b);
            } else {
                aVar.a(c1323b.b(false));
            }
        }
        return aVar.k();
    }

    public static C1323b e(Bundle bundle, int i10) {
        Bundle bundle2 = bundle.getBundle(f5132j);
        T6 t6A = bundle2 == null ? null : T6.a(bundle2);
        int i11 = bundle.getInt(f5133k, -1);
        int i12 = bundle.getInt(f5134l, 0);
        CharSequence charSequence = bundle.getCharSequence(f5135m, "");
        Bundle bundle3 = bundle.getBundle(f5136n);
        boolean z10 = i10 < 3 || bundle.getBoolean(f5137o, true);
        Uri uri = (Uri) bundle.getParcelable(f5138p);
        int i13 = bundle.getInt(f5139q, 0);
        int[] intArray = bundle.getIntArray(f5140r);
        C0050b c0050b = new C0050b(i13, i12);
        if (t6A != null) {
            c0050b.i(t6A);
        }
        if (i11 != -1) {
            c0050b.h(i11);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            c0050b.g(uri);
        }
        C0050b c0050bC = c0050b.c(charSequence);
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        C0050b c0050bD = c0050bC.e(bundle3).d(z10);
        if (intArray == null) {
            intArray = new int[]{6};
        }
        return c0050bD.j(intArray).a();
    }

    static AbstractC2011u f(List list, boolean z10, boolean z11) {
        T6 t62;
        T6 t63;
        int iC;
        if (list.isEmpty()) {
            return AbstractC2011u.A();
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            C1323b c1323b = (C1323b) list.get(i12);
            if (c1323b.f5149i && (t63 = c1323b.f5141a) != null && t63.f4974a == 0) {
                int i13 = 0;
                while (true) {
                    if (i13 >= c1323b.f5148h.f() || (iC = c1323b.f5148h.c(i13)) == 6) {
                        break;
                    }
                    if (z10 && i10 == -1 && iC == 2) {
                        i10 = i12;
                        break;
                    }
                    if (z11 && i11 == -1 && iC == 3) {
                        i11 = i12;
                        break;
                    }
                    i13++;
                }
            }
        }
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        if (i10 != -1) {
            aVarT.a(((C1323b) list.get(i10)).c(S9.e.h(2)));
        }
        if (i11 != -1) {
            aVarT.a(((C1323b) list.get(i11)).c(S9.e.h(3)));
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            C1323b c1323b2 = (C1323b) list.get(i14);
            if (c1323b2.f5149i && (t62 = c1323b2.f5141a) != null && t62.f4974a == 0 && i14 != i10 && i14 != i11 && c1323b2.f5148h.a(6)) {
                aVarT.a(c1323b2.c(S9.e.h(6)));
            }
        }
        return aVarT.k();
    }

    public static int g(int i10, int i11) {
        if (i10 == 1 || i11 == 57399 || i11 == 57396) {
            return 1;
        }
        if (i10 == 11 || i10 == 7 || i10 == 6 || i11 == 57413 || i11 == 57376 || i11 == 57410 || i11 == 57435 || i11 == 57433 || i11 == 1040473 || i11 == 57434) {
            return 2;
        }
        return (i10 == 12 || i10 == 9 || i10 == 8 || i11 == 57412 || i11 == 57375 || i11 == 63220 || i11 == 57432 || i11 == 57430 || i11 == 1040470 || i11 == 57431) ? 3 : 6;
    }

    public static int h(int i10) {
        switch (i10) {
            case 57369:
                return P6.f4813a;
            case 57370:
                return P6.f4815b;
            case 57372:
                return P6.f4829i;
            case 57375:
                return P6.f4833k;
            case 57376:
                return P6.f4805S;
            case 57396:
                return P6.f4853u;
            case 57399:
                return P6.f4855v;
            case 57403:
                return P6.f4791E;
            case 57408:
                return P6.f4802P;
            case 57409:
                return P6.f4804R;
            case 57410:
                return P6.f4812Z;
            case 57411:
                return P6.f4809W;
            case 57412:
                return P6.f4851t;
            case 57413:
                return P6.f4796J;
            case 57415:
                return P6.f4836l0;
            case 57416:
                return P6.f4838m0;
            case 57421:
                return P6.f4852t0;
            case 57423:
                return P6.f4854u0;
            case 57424:
                return P6.f4856v0;
            case 57430:
                return P6.f4824f0;
            case 57431:
                return P6.f4828h0;
            case 57432:
                return P6.f4830i0;
            case 57433:
                return P6.f4814a0;
            case 57434:
                return P6.f4818c0;
            case 57435:
                return P6.f4820d0;
            case 57436:
                return P6.f4798L;
            case 57446:
                return P6.f4799M;
            case 57447:
                return P6.f4800N;
            case 57448:
                return P6.f4857w;
            case 57573:
                return P6.f4835l;
            case 57669:
                return P6.f4793G;
            case 57671:
                return P6.f4795I;
            case 57675:
                return P6.f4817c;
            case 57683:
                return P6.f4839n;
            case 57691:
                return P6.f4845q;
            case 58409:
                return P6.f4797K;
            case 58654:
                return P6.f4801O;
            case 58919:
                return P6.f4842o0;
            case 59405:
                return P6.f4807U;
            case 59448:
                return P6.f4834k0;
            case 59494:
                return P6.f4821e;
            case 59500:
                return P6.f4825g;
            case 59517:
                return P6.f4843p;
            case 59576:
                return P6.f4806T;
            case 59611:
                return P6.f4846q0;
            case 59612:
                return P6.f4850s0;
            case 60288:
                return P6.f4792F;
            case 61298:
                return P6.f4840n0;
            case 61389:
                return P6.f4861z;
            case 61512:
                return P6.f4811Y;
            case 61916:
                return P6.f4831j;
            case 62688:
                return P6.f4788B;
            case 62689:
                return P6.f4787A;
            case 62690:
                return P6.f4859x;
            case 62699:
                return P6.f4790D;
            case 63220:
                return P6.f4822e0;
            case 1040448:
                return P6.f4803Q;
            case 1040451:
                return P6.f4810X;
            case 1040452:
                return P6.f4808V;
            case 1040470:
                return P6.f4826g0;
            case 1040473:
                return P6.f4816b0;
            case 1040711:
                return P6.f4794H;
            case 1040712:
                return P6.f4847r;
            case 1040713:
                return P6.f4849s;
            case 1040723:
                return P6.f4837m;
            case 1042488:
                return P6.f4832j0;
            case 1042534:
                return P6.f4819d;
            case 1042540:
                return P6.f4823f;
            case 1042557:
                return P6.f4841o;
            case 1042651:
                return P6.f4844p0;
            case 1042652:
                return P6.f4848r0;
            case 1045728:
                return P6.f4789C;
            case 1045730:
                return P6.f4860y;
            default:
                return 0;
        }
    }

    static AbstractC2011u i(List list, InterfaceC6084P.b bVar, Bundle bundle) {
        if (list.isEmpty()) {
            return AbstractC2011u.A();
        }
        boolean zD = bVar.d(7, 6);
        boolean zD2 = bVar.d(9, 8);
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i10 = (zD || z10) ? -1 : 0;
        int i11 = (zD2 || z11) ? -1 : i10 == 0 ? 1 : 0;
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        for (int i12 = 0; i12 < list.size(); i12++) {
            C1323b c1323b = (C1323b) list.get(i12);
            if (i12 == i10) {
                if (i11 == -1) {
                    aVarT.a(c1323b.c(S9.e.i(2, 6)));
                } else {
                    aVarT.a(c1323b.c(S9.e.j(2, 3, 6)));
                }
            } else if (i12 == i11) {
                aVarT.a(c1323b.c(S9.e.i(3, 6)));
            } else {
                aVarT.a(c1323b.c(S9.e.h(6)));
            }
        }
        return aVarT.k();
    }

    static boolean j(C1323b c1323b, U6 u62, InterfaceC6084P.b bVar) {
        T6 t62 = c1323b.f5141a;
        if (t62 != null && u62.c(t62)) {
            return true;
        }
        int i10 = c1323b.f5142b;
        return i10 != -1 && bVar.c(i10);
    }

    C1323b b(boolean z10) {
        return this.f5149i == z10 ? this : new C1323b(this.f5141a, this.f5142b, this.f5143c, this.f5144d, this.f5145e, this.f5146f, new Bundle(this.f5147g), z10, this.f5148h);
    }

    C1323b c(S9.e eVar) {
        return this.f5148h.equals(eVar) ? this : new C1323b(this.f5141a, this.f5142b, this.f5143c, this.f5144d, this.f5145e, this.f5146f, new Bundle(this.f5147g), this.f5149i, eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1323b)) {
            return false;
        }
        C1323b c1323b = (C1323b) obj;
        return Objects.equals(this.f5141a, c1323b.f5141a) && this.f5142b == c1323b.f5142b && this.f5143c == c1323b.f5143c && this.f5144d == c1323b.f5144d && Objects.equals(this.f5145e, c1323b.f5145e) && TextUtils.equals(this.f5146f, c1323b.f5146f) && this.f5149i == c1323b.f5149i && this.f5148h.equals(c1323b.f5148h);
    }

    public int hashCode() {
        return Objects.hash(this.f5141a, Integer.valueOf(this.f5142b), Integer.valueOf(this.f5143c), Integer.valueOf(this.f5144d), this.f5146f, Boolean.valueOf(this.f5149i), this.f5145e, this.f5148h);
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        T6 t62 = this.f5141a;
        if (t62 != null) {
            bundle.putBundle(f5132j, t62.b());
        }
        int i10 = this.f5142b;
        if (i10 != -1) {
            bundle.putInt(f5133k, i10);
        }
        int i11 = this.f5143c;
        if (i11 != 0) {
            bundle.putInt(f5139q, i11);
        }
        int i12 = this.f5144d;
        if (i12 != 0) {
            bundle.putInt(f5134l, i12);
        }
        CharSequence charSequence = this.f5146f;
        if (charSequence != "") {
            bundle.putCharSequence(f5135m, charSequence);
        }
        if (!this.f5147g.isEmpty()) {
            bundle.putBundle(f5136n, this.f5147g);
        }
        Uri uri = this.f5145e;
        if (uri != null) {
            bundle.putParcelable(f5138p, uri);
        }
        boolean z10 = this.f5149i;
        if (!z10) {
            bundle.putBoolean(f5137o, z10);
        }
        if (this.f5148h.f() == 1 && this.f5148h.c(0) == 6) {
            return bundle;
        }
        bundle.putIntArray(f5140r, this.f5148h.k());
        return bundle;
    }

    private C1323b(T6 t62, int i10, int i11, int i12, Uri uri, CharSequence charSequence, Bundle bundle, boolean z10, S9.e eVar) {
        this.f5141a = t62;
        this.f5142b = i10;
        this.f5143c = i11;
        this.f5144d = i12;
        this.f5145e = uri;
        this.f5146f = charSequence;
        this.f5147g = new Bundle(bundle);
        this.f5149i = z10;
        this.f5148h = eVar;
    }
}
