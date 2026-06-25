package me;

import ce.AbstractC3097b;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: me.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5666c {

    /* JADX INFO: renamed from: a */
    public static final a f53326a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final AbstractC5666c f53327b = AbstractC3097b.f33610a.b();

    /* JADX INFO: renamed from: me.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5666c implements Serializable {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // me.AbstractC5666c
        public int b(int i10) {
            return AbstractC5666c.f53327b.b(i10);
        }

        @Override // me.AbstractC5666c
        public int c() {
            return AbstractC5666c.f53327b.c();
        }

        @Override // me.AbstractC5666c
        public int d(int i10) {
            return AbstractC5666c.f53327b.d(i10);
        }

        @Override // me.AbstractC5666c
        public long e() {
            return AbstractC5666c.f53327b.e();
        }

        @Override // me.AbstractC5666c
        public long f(long j10, long j11) {
            return AbstractC5666c.f53327b.f(j10, j11);
        }

        private a() {
        }
    }

    public abstract int b(int i10);

    public abstract int c();

    public abstract int d(int i10);

    public abstract long e();

    public long f(long j10, long j11) {
        long jE;
        long j12;
        long jB;
        int iC;
        AbstractC5667d.b(j10, j11);
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iC = b(AbstractC5667d.c(i10));
                } else if (i11 == 1) {
                    iC = c();
                } else {
                    jB = (((long) b(AbstractC5667d.c(i11))) << 32) + (((long) c()) & 4294967295L);
                }
                jB = ((long) iC) & 4294967295L;
            } else {
                do {
                    jE = e() >>> 1;
                    j12 = jE % j13;
                } while ((jE - j12) + (j13 - 1) < 0);
                jB = j12;
            }
            return j10 + jB;
        }
        while (true) {
            long jE2 = e();
            if (j10 <= jE2 && jE2 < j11) {
                return jE2;
            }
        }
    }
}
