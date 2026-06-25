package jf;

import jf.C5380d;

/* JADX INFO: renamed from: jf.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5379c {

    /* JADX INFO: renamed from: jf.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5379c {

        /* JADX INFO: renamed from: a */
        public static final a f51756a = new a();

        /* JADX INFO: renamed from: b */
        private static final int f51757b;

        static {
            C5380d.a aVar = C5380d.f51759c;
            f51757b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // jf.AbstractC5379c
        public int a() {
            return f51757b;
        }
    }

    /* JADX INFO: renamed from: jf.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5379c {

        /* JADX INFO: renamed from: a */
        public static final b f51758a = new b();

        private b() {
        }

        @Override // jf.AbstractC5379c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
