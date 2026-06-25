package Sc;

import Gf.AbstractC1613i;
import Gf.C1608f0;
import Gf.K;
import Gf.O;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f16072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f16073b;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16072a = obj;
            this.f16073b |= Integer.MIN_VALUE;
            return b.a(null, 0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: Sc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0277b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f16075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f16076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f16077d;

        /* JADX INFO: renamed from: Sc.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f16078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f16079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f16080c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f16081d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Uri uri, long j10, long j11, e eVar) {
                super(2, eVar);
                this.f16079b = uri;
                this.f16080c = j10;
                this.f16081d = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new a(this.f16079b, this.f16080c, this.f16081d, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws IOException {
                AbstractC2605b.f();
                if (this.f16078a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                URLConnection uRLConnectionOpenConnection = new URL(this.f16079b.toString()).openConnection();
                uRLConnectionOpenConnection.setConnectTimeout((int) this.f16080c);
                uRLConnectionOpenConnection.setReadTimeout((int) this.f16081d);
                return BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0277b(Uri uri, long j10, long j11, e eVar) {
            super(2, eVar);
            this.f16075b = uri;
            this.f16076c = j10;
            this.f16077d = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C0277b(this.f16075b, this.f16076c, this.f16077d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C0277b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f16074a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            K kB = C1608f0.b();
            a aVar = new a(this.f16075b, this.f16076c, this.f16077d, null);
            this.f16074a = 1;
            Object objG = AbstractC1613i.g(kB, aVar, this);
            return objG == objF ? objF : objG;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.net.Uri r14, long r15, long r17, Zd.e r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof Sc.b.a
            if (r1 == 0) goto L15
            r1 = r0
            Sc.b$a r1 = (Sc.b.a) r1
            int r2 = r1.f16073b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16073b = r2
            goto L1a
        L15:
            Sc.b$a r1 = new Sc.b$a
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f16072a
            java.lang.Object r2 = ae.AbstractC2605b.f()
            int r3 = r1.f16073b
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            Td.v.b(r0)     // Catch: java.lang.Throwable -> L54
            goto L4d
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L33:
            Td.v.b(r0)
            Td.u$a r0 = Td.u.f17466b     // Catch: java.lang.Throwable -> L54
            long r5 = r15 + r17
            Sc.b$b r7 = new Sc.b$b     // Catch: java.lang.Throwable -> L54
            r13 = 0
            r8 = r14
            r9 = r15
            r11 = r17
            r7.<init>(r8, r9, r11, r13)     // Catch: java.lang.Throwable -> L54
            r1.f16073b = r4     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = Gf.d1.c(r5, r7, r1)     // Catch: java.lang.Throwable -> L54
            if (r0 != r2) goto L4d
            return r2
        L4d:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L54
            java.lang.Object r14 = Td.u.b(r0)     // Catch: java.lang.Throwable -> L54
            goto L60
        L54:
            r0 = move-exception
            r14 = r0
            Td.u$a r0 = Td.u.f17466b
            java.lang.Object r14 = Td.v.a(r14)
            java.lang.Object r14 = Td.u.b(r14)
        L60:
            boolean r0 = Td.u.g(r14)
            if (r0 == 0) goto L67
            r14 = 0
        L67:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Sc.b.a(android.net.Uri, long, long, Zd.e):java.lang.Object");
    }

    public static /* synthetic */ Object b(Uri uri, long j10, long j11, e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 8000;
        }
        if ((i10 & 4) != 0) {
            j11 = 8000;
        }
        return a(uri, j10, j11, eVar);
    }
}
