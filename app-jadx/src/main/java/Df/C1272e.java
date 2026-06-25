package Df;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: renamed from: Df.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1272e implements Cf.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f3726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f3729d;

    /* JADX INFO: renamed from: Df.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3730a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C5870f f3733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3734e;

        a() {
            int iM = AbstractC5874j.m(C1272e.this.f3727b, 0, C1272e.this.f3726a.length());
            this.f3731b = iM;
            this.f3732c = iM;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f3732c
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f3730a = r1
                r0 = 0
                r6.f3733d = r0
                return
            Lb:
                Df.e r0 = Df.C1272e.this
                int r0 = Df.C1272e.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f3734e
                int r0 = r0 + r3
                r6.f3734e = r0
                Df.e r4 = Df.C1272e.this
                int r4 = Df.C1272e.e(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f3732c
                Df.e r4 = Df.C1272e.this
                java.lang.CharSequence r4 = Df.C1272e.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                oe.f r0 = new oe.f
                int r1 = r6.f3731b
                Df.e r4 = Df.C1272e.this
                java.lang.CharSequence r4 = Df.C1272e.d(r4)
                int r4 = Df.F.d0(r4)
                r0.<init>(r1, r4)
                r6.f3733d = r0
                r6.f3732c = r2
                goto L9b
            L46:
                Df.e r0 = Df.C1272e.this
                kotlin.jvm.functions.Function2 r0 = Df.C1272e.c(r0)
                Df.e r4 = Df.C1272e.this
                java.lang.CharSequence r4 = Df.C1272e.d(r4)
                int r5 = r6.f3732c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L76
                oe.f r0 = new oe.f
                int r1 = r6.f3731b
                Df.e r4 = Df.C1272e.this
                java.lang.CharSequence r4 = Df.C1272e.d(r4)
                int r4 = Df.F.d0(r4)
                r0.<init>(r1, r4)
                r6.f3733d = r0
                r6.f3732c = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.getFirst()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.getSecond()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f3731b
                oe.f r4 = oe.AbstractC5874j.x(r4, r2)
                r6.f3733d = r4
                int r2 = r2 + r0
                r6.f3731b = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f3732c = r2
            L9b:
                r6.f3730a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Df.C1272e.a.b():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C5870f next() {
            if (this.f3730a == -1) {
                b();
            }
            if (this.f3730a == 0) {
                throw new NoSuchElementException();
            }
            C5870f c5870f = this.f3733d;
            AbstractC5504s.f(c5870f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f3733d = null;
            this.f3730a = -1;
            return c5870f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3730a == -1) {
                b();
            }
            return this.f3730a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1272e(CharSequence input, int i10, int i11, Function2 getNextMatch) {
        AbstractC5504s.h(input, "input");
        AbstractC5504s.h(getNextMatch, "getNextMatch");
        this.f3726a = input;
        this.f3727b = i10;
        this.f3728c = i11;
        this.f3729d = getNextMatch;
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a();
    }
}
