package E0;

import I0.InterfaceC1690p;
import android.os.SystemClock;
import android.view.MotionEvent;
import be.AbstractC3048a;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M implements J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f4068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U f4069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I f4071e = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4072a = new a("Unknown", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f4073b = new a("Dispatching", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4074c = new a("NotDispatching", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f4075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f4076e;

        static {
            a[] aVarArrA = a();
            f4075d = aVarArrA;
            f4076e = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f4072a, f4073b, f4074c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f4075d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f4077b = a.f4072a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C1307q f4078c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f4081b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M m10) {
                super(1);
                this.f4081b = m10;
            }

            public final void a(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f4081b.c().invoke(motionEvent);
                } else {
                    b.this.f4077b = ((Boolean) this.f4081b.c().invoke(motionEvent)).booleanValue() ? a.f4073b : a.f4074c;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: renamed from: E0.M$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0046b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f4082a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0046b(M m10) {
                super(1);
                this.f4082a = m10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f4082a.c().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f4083a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M m10) {
                super(1);
                this.f4083a = m10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f4083a.c().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Td.L.f17438a;
            }
        }

        b() {
        }

        private final void h(C1307q c1307q, boolean z10) {
            List listC = c1307q.c();
            int size = listC.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((C) listC.get(i11)).p()) {
                    j(c1307q);
                    return;
                }
            }
            InterfaceC1690p interfaceC1690pB = b();
            if (interfaceC1690pB == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            O.c(c1307q, interfaceC1690pB.E0(C6224f.f58329b.c()), new a(M.this));
            if (this.f4077b == a.f4073b) {
                if (!l0.h.f52338k) {
                    int size2 = listC.size();
                    while (i10 < size2) {
                        ((C) listC.get(i10)).a();
                        i10++;
                    }
                } else if (z10) {
                    int size3 = listC.size();
                    while (i10 < size3) {
                        ((C) listC.get(i10)).a();
                        i10++;
                    }
                }
                C1297g c1297gD = c1307q.d();
                if (c1297gD != null) {
                    c1297gD.e(!M.this.a());
                }
            }
        }

        private final void i() {
            this.f4077b = a.f4072a;
            M.this.h(false);
            this.f4078c = null;
        }

        private final void j(C1307q c1307q) {
            if (this.f4077b == a.f4073b) {
                InterfaceC1690p interfaceC1690pB = b();
                if (interfaceC1690pB == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                O.b(c1307q, interfaceC1690pB.E0(C6224f.f58329b.c()), new c(M.this));
            }
            this.f4077b = a.f4074c;
        }

        @Override // E0.I
        public boolean c() {
            return true;
        }

        @Override // E0.I
        public void d() {
            if (this.f4077b == a.f4073b) {
                O.a(SystemClock.uptimeMillis(), new C0046b(M.this));
                i();
            }
        }

        @Override // E0.I
        public void e(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            List listC = c1307q.c();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                C c10 = (C) listC.get(i10);
                if (r.b(c10) || r.d(c10)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (!z10) {
                z11 = false;
                break;
            }
            int size2 = listC.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (((C) listC.get(i11)).p()) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (M.this.a()) {
                z12 = true;
            } else {
                int size3 = listC.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size3) {
                        C c11 = (C) listC.get(i12);
                        if (r.b(c11) || r.d(c11)) {
                            break;
                        } else {
                            i12++;
                        }
                    } else if (!z11 || !l0.h.f52338k) {
                        z12 = false;
                    }
                }
                z12 = true;
            }
            if (this.f4077b != a.f4074c) {
                if (enumC1308s == EnumC1308s.f4178a && z12) {
                    this.f4078c = c1307q;
                    h(c1307q, !z10 || M.this.a());
                }
                if (enumC1308s == EnumC1308s.f4179b && z10 && AbstractC5504s.c(c1307q, this.f4078c) && M.this.a() && l0.h.f52338k) {
                    int size4 = listC.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        ((C) listC.get(i13)).a();
                    }
                }
                if (!l0.h.f52338k ? !(enumC1308s != EnumC1308s.f4180c || z12) : !(enumC1308s != EnumC1308s.f4180c || z12 || AbstractC5504s.c(c1307q, this.f4078c))) {
                    h(c1307q, true);
                }
            }
            if (enumC1308s == EnumC1308s.f4180c) {
                int size5 = listC.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        i();
                        break;
                    } else if (!r.d((C) listC.get(i14))) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (AbstractC5504s.c(c1307q, this.f4078c) && z10 && l0.h.f52338k) {
                    int size6 = listC.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size6) {
                            break;
                        }
                        if (!((C) listC.get(i15)).p()) {
                            i15++;
                        } else if (!M.this.a()) {
                            j(c1307q);
                            return;
                        }
                    }
                    int size7 = listC.size();
                    for (int i16 = 0; i16 < size7; i16++) {
                        ((C) listC.get(i16)).a();
                    }
                }
            }
        }
    }

    public final boolean a() {
        return this.f4070d;
    }

    public final Function1 c() {
        Function1 function1 = this.f4068b;
        if (function1 != null) {
            return function1;
        }
        AbstractC5504s.u("onTouchEvent");
        return null;
    }

    @Override // E0.J
    public I g() {
        return this.f4071e;
    }

    public final void h(boolean z10) {
        this.f4070d = z10;
    }

    public final void i(Function1 function1) {
        this.f4068b = function1;
    }

    public final void j(U u10) {
        U u11 = this.f4069c;
        if (u11 != null) {
            u11.b(null);
        }
        this.f4069c = u10;
        if (u10 != null) {
            u10.b(this);
        }
    }
}
