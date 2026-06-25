package z6;

import C5.a;
import android.util.Log;
import java.io.Closeable;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: z6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7287a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.c f65698a;

    /* JADX INFO: renamed from: z6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0994a implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ B6.a f65699a;

        C0994a(B6.a aVar) {
            this.f65699a = aVar;
        }

        @Override // C5.a.c
        public void a(C5.i iVar, Throwable th2) {
            this.f65699a.b(iVar, th2);
            Object objF = iVar.f();
            AbstractC7283a.K("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), objF != null ? objF.getClass().getName() : "<value is null>", C7287a.d(th2));
        }

        @Override // C5.a.c
        public boolean b() {
            return this.f65699a.a();
        }
    }

    public C7287a(B6.a aVar) {
        this.f65698a = new C0994a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th2) {
        return th2 == null ? "" : Log.getStackTraceString(th2);
    }

    public C5.a b(Closeable closeable) {
        return C5.a.O(closeable, this.f65698a);
    }

    public C5.a c(Object obj, C5.h hVar) {
        return C5.a.Y(obj, hVar, this.f65698a);
    }
}
