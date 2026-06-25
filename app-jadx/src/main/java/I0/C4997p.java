package i0;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i0.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4997p implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48509e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C4997p f48510f = new C4997p(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f48514d;

    /* JADX INFO: renamed from: i0.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4997p a() {
            return C4997p.f48510f;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: i0.p$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f48515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f48516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f48518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f48519e;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Cf.k kVar, Zd.e eVar) {
            return ((b) create(kVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = C4997p.this.new b(eVar);
            bVar.f48519e = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.d(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        
            if (r13.d(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.C4997p.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private C4997p(long j10, long j11, long j12, long[] jArr) {
        this.f48511a = j10;
        this.f48512b = j11;
        this.f48513c = j12;
        this.f48514d = jArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Cf.l.b(new b(null)).iterator();
    }

    public final C4997p l(C4997p c4997p) {
        C4997p c4997pN;
        C4997p c4997p2 = f48510f;
        if (c4997p == c4997p2) {
            return this;
        }
        if (this == c4997p2) {
            return c4997p2;
        }
        long j10 = c4997p.f48513c;
        long j11 = this.f48513c;
        if (j10 == j11) {
            long[] jArr = c4997p.f48514d;
            long[] jArr2 = this.f48514d;
            if (jArr == jArr2) {
                return new C4997p((~c4997p.f48511a) & this.f48511a, (~c4997p.f48512b) & this.f48512b, j11, jArr2);
            }
        }
        long[] jArr3 = c4997p.f48514d;
        if (jArr3 != null) {
            c4997pN = this;
            for (long j12 : jArr3) {
                c4997pN = c4997pN.n(j12);
            }
        } else {
            c4997pN = this;
        }
        if (c4997p.f48512b != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((c4997p.f48512b & (1 << i10)) != 0) {
                    c4997pN = c4997pN.n(c4997p.f48513c + ((long) i10));
                }
            }
        }
        if (c4997p.f48511a != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((c4997p.f48511a & (1 << i11)) != 0) {
                    c4997pN = c4997pN.n(c4997p.f48513c + ((long) i11) + ((long) 64));
                }
            }
        }
        return c4997pN;
    }

    public final C4997p n(long j10) {
        long[] jArr;
        int iA;
        long j11 = j10 - this.f48513c;
        long j12 = 0;
        if (AbstractC5504s.j(j11, j12) >= 0 && AbstractC5504s.j(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f48512b;
            if ((j14 & j13) != 0) {
                return new C4997p(this.f48511a, j14 & (~j13), this.f48513c, this.f48514d);
            }
        } else if (AbstractC5504s.j(j11, 64) >= 0 && AbstractC5504s.j(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f48511a;
            if ((j16 & j15) != 0) {
                return new C4997p(j16 & (~j15), this.f48512b, this.f48513c, this.f48514d);
            }
        } else if (AbstractC5504s.j(j11, j12) < 0 && (jArr = this.f48514d) != null && (iA = AbstractC4998q.a(jArr, j10)) >= 0) {
            return new C4997p(this.f48511a, this.f48512b, this.f48513c, AbstractC4998q.e(jArr, iA));
        }
        return this;
    }

    public final boolean p(long j10) {
        long[] jArr;
        long j11 = j10 - this.f48513c;
        long j12 = 0;
        return (AbstractC5504s.j(j11, j12) < 0 || AbstractC5504s.j(j11, (long) 64) >= 0) ? (AbstractC5504s.j(j11, (long) 64) < 0 || AbstractC5504s.j(j11, (long) 128) >= 0) ? AbstractC5504s.j(j11, j12) <= 0 && (jArr = this.f48514d) != null && AbstractC4998q.a(jArr, j10) >= 0 : ((1 << (((int) j11) - 64)) & this.f48511a) != 0 : ((1 << ((int) j11)) & this.f48512b) != 0;
    }

    public final long r(long j10) {
        long[] jArr = this.f48514d;
        if (jArr != null) {
            return jArr[0];
        }
        long j11 = this.f48512b;
        if (j11 != 0) {
            return this.f48513c + ((long) Long.numberOfTrailingZeros(j11));
        }
        long j12 = this.f48511a;
        return j12 != 0 ? this.f48513c + ((long) 64) + ((long) Long.numberOfTrailingZeros(j12)) : j10;
    }

    public final C4997p t(C4997p c4997p) {
        C4997p c4997pU;
        C4997p c4997p2 = f48510f;
        if (c4997p == c4997p2) {
            return this;
        }
        if (this == c4997p2) {
            return c4997p;
        }
        long j10 = c4997p.f48513c;
        long j11 = this.f48513c;
        if (j10 == j11) {
            long[] jArr = c4997p.f48514d;
            long[] jArr2 = this.f48514d;
            if (jArr == jArr2) {
                return new C4997p(c4997p.f48511a | this.f48511a, c4997p.f48512b | this.f48512b, j11, jArr2);
            }
        }
        int i10 = 0;
        if (this.f48514d == null) {
            long[] jArr3 = this.f48514d;
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    c4997p = c4997p.u(j12);
                }
            }
            if (this.f48512b != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.f48512b & (1 << i11)) != 0) {
                        c4997p = c4997p.u(this.f48513c + ((long) i11));
                    }
                }
            }
            if (this.f48511a != 0) {
                while (i10 < 64) {
                    if ((this.f48511a & (1 << i10)) != 0) {
                        c4997p = c4997p.u(this.f48513c + ((long) i10) + ((long) 64));
                    }
                    i10++;
                }
            }
            return c4997p;
        }
        long[] jArr4 = c4997p.f48514d;
        if (jArr4 != null) {
            c4997pU = this;
            for (long j13 : jArr4) {
                c4997pU = c4997pU.u(j13);
            }
        } else {
            c4997pU = this;
        }
        if (c4997p.f48512b != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((c4997p.f48512b & (1 << i12)) != 0) {
                    c4997pU = c4997pU.u(c4997p.f48513c + ((long) i12));
                }
            }
        }
        if (c4997p.f48511a != 0) {
            while (i10 < 64) {
                if ((c4997p.f48511a & (1 << i10)) != 0) {
                    c4997pU = c4997pU.u(c4997p.f48513c + ((long) i10) + ((long) 64));
                }
                i10++;
            }
        }
        return c4997pU;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        sb2.append(AbstractC4984c.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    public final C4997p u(long j10) {
        long j11;
        long j12;
        long[] jArrB;
        long j13 = j10 - this.f48513c;
        long j14 = 0;
        if (AbstractC5504s.j(j13, j14) < 0 || AbstractC5504s.j(j13, 64) >= 0) {
            long j15 = 64;
            if (AbstractC5504s.j(j13, j15) < 0 || AbstractC5504s.j(j13, 128) >= 0) {
                long j16 = 128;
                if (AbstractC5504s.j(j13, j16) < 0) {
                    long[] jArr = this.f48514d;
                    if (jArr == null) {
                        return new C4997p(this.f48511a, this.f48512b, this.f48513c, new long[]{j10});
                    }
                    int iA = AbstractC4998q.a(jArr, j10);
                    if (iA < 0) {
                        return new C4997p(this.f48511a, this.f48512b, this.f48513c, AbstractC4998q.d(jArr, -(iA + 1), j10));
                    }
                } else if (!p(j10)) {
                    long j17 = this.f48511a;
                    long j18 = this.f48512b;
                    long j19 = this.f48513c;
                    long j20 = 1;
                    long j21 = ((j10 + j20) / j15) * j15;
                    if (AbstractC5504s.j(j21, j14) < 0) {
                        j21 = (Long.MAX_VALUE - j16) + j20;
                    }
                    C4996o c4996o = null;
                    long j22 = j17;
                    while (true) {
                        if (AbstractC5504s.j(j19, j21) >= 0) {
                            j11 = j18;
                            j12 = j19;
                            break;
                        }
                        if (j18 != 0) {
                            if (c4996o == null) {
                                c4996o = new C4996o(this.f48514d);
                            }
                            int i10 = 0;
                            while (i10 < 64) {
                                long j23 = j18;
                                if ((j18 & (1 << i10)) != 0) {
                                    c4996o.a(((long) i10) + j19);
                                }
                                i10++;
                                j18 = j23;
                            }
                        }
                        if (j22 == 0) {
                            j12 = j21;
                            j11 = 0;
                            break;
                        }
                        j19 += j15;
                        j18 = j22;
                        j22 = 0;
                    }
                    if (c4996o == null || (jArrB = c4996o.b()) == null) {
                        jArrB = this.f48514d;
                    }
                    return new C4997p(j22, j11, j12, jArrB).u(j10);
                }
            } else {
                long j24 = 1 << (((int) j13) - 64);
                long j25 = this.f48511a;
                if ((j25 & j24) == 0) {
                    return new C4997p(j25 | j24, this.f48512b, this.f48513c, this.f48514d);
                }
            }
        } else {
            long j26 = 1 << ((int) j13);
            long j27 = this.f48512b;
            if ((j27 & j26) == 0) {
                return new C4997p(this.f48511a, j27 | j26, this.f48513c, this.f48514d);
            }
        }
        return this;
    }
}
