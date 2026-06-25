package K4;

import G4.f;
import G4.i;
import G4.q;
import H4.g;
import K4.c;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z4.C7282b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f10867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f10868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10870d;

    public a(d dVar, i iVar, int i10, boolean z10) {
        this.f10867a = dVar;
        this.f10868b = iVar;
        this.f10869c = i10;
        this.f10870d = z10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // K4.c
    public void a() {
        Drawable drawableB = this.f10867a.b();
        Drawable drawableA = this.f10868b.a();
        g gVarJ = this.f10868b.b().J();
        int i10 = this.f10869c;
        i iVar = this.f10868b;
        C7282b c7282b = new C7282b(drawableB, drawableA, gVarJ, i10, ((iVar instanceof q) && ((q) iVar).d()) ? false : true, this.f10870d);
        i iVar2 = this.f10868b;
        if (iVar2 instanceof q) {
            this.f10867a.a(c7282b);
        } else if (iVar2 instanceof f) {
            this.f10867a.d(c7282b);
        }
    }

    public final int b() {
        return this.f10869c;
    }

    public final boolean c() {
        return this.f10870d;
    }

    /* JADX INFO: renamed from: K4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0170a implements c.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f10871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f10872d;

        public C0170a(int i10, boolean z10) {
            this.f10871c = i10;
            this.f10872d = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // K4.c.a
        public c a(d dVar, i iVar) {
            return !(iVar instanceof q) ? c.a.f10876b.a(dVar, iVar) : ((q) iVar).c() == x4.f.MEMORY_CACHE ? c.a.f10876b.a(dVar, iVar) : new a(dVar, iVar, this.f10871c, this.f10872d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0170a)) {
                return false;
            }
            C0170a c0170a = (C0170a) obj;
            return this.f10871c == c0170a.f10871c && this.f10872d == c0170a.f10872d;
        }

        public int hashCode() {
            return (this.f10871c * 31) + Boolean.hashCode(this.f10872d);
        }

        public /* synthetic */ C0170a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }
}
