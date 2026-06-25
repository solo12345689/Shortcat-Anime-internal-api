package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j0 {

    /* JADX INFO: renamed from: A */
    private static final String f37697A;

    /* JADX INFO: renamed from: b */
    private final C3308y f37699b;

    /* JADX INFO: renamed from: e */
    private final i f37702e;

    /* JADX INFO: renamed from: f */
    private final ReactApplicationContext f37703f;

    /* JADX INFO: renamed from: k */
    private D7.a f37708k;

    /* JADX INFO: renamed from: o */
    private long f37712o;

    /* JADX INFO: renamed from: p */
    private long f37713p;

    /* JADX INFO: renamed from: q */
    private long f37714q;

    /* JADX INFO: renamed from: r */
    private long f37715r;

    /* JADX INFO: renamed from: s */
    private long f37716s;

    /* JADX INFO: renamed from: t */
    private long f37717t;

    /* JADX INFO: renamed from: u */
    private long f37718u;

    /* JADX INFO: renamed from: v */
    private long f37719v;

    /* JADX INFO: renamed from: w */
    private long f37720w;

    /* JADX INFO: renamed from: x */
    private long f37721x;

    /* JADX INFO: renamed from: y */
    private long f37722y;

    /* JADX INFO: renamed from: z */
    private long f37723z;

    /* JADX INFO: renamed from: a */
    private final int[] f37698a = new int[4];

    /* JADX INFO: renamed from: c */
    private final Object f37700c = new Object();

    /* JADX INFO: renamed from: d */
    private final Object f37701d = new Object();

    /* JADX INFO: renamed from: g */
    private ArrayList f37704g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private ArrayList f37705h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private ArrayList f37706i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayDeque f37707j = new ArrayDeque();

    /* JADX INFO: renamed from: l */
    private boolean f37709l = false;

    /* JADX INFO: renamed from: m */
    private boolean f37710m = false;

    /* JADX INFO: renamed from: n */
    private boolean f37711n = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f37724a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f37725b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ArrayDeque f37726c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ArrayList f37727d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f37728e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ long f37729f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ long f37730g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ long f37731h;

        a(int i10, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j10, long j11, long j12, long j13) {
            this.f37724a = i10;
            this.f37725b = arrayList;
            this.f37726c = arrayDeque;
            this.f37727d = arrayList2;
            this.f37728e = j10;
            this.f37729f = j11;
            this.f37730g = j12;
            this.f37731h = j13;
        }

        @Override // java.lang.Runnable
        public void run() {
            U7.b.a(0L, "DispatchUI").a("BatchId", this.f37724a).c();
            try {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList<g> arrayList = this.f37725b;
                    if (arrayList != null) {
                        for (g gVar : arrayList) {
                            try {
                                gVar.d();
                            } catch (RetryableMountingLayerException e10) {
                                if (gVar.a() == 0) {
                                    gVar.c();
                                    j0.this.f37704g.add(gVar);
                                } else {
                                    ReactSoftExceptionLogger.logSoftException(j0.f37697A, new ReactNoCrashSoftException(e10));
                                }
                            } catch (Throwable th2) {
                                ReactSoftExceptionLogger.logSoftException(j0.f37697A, th2);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = this.f37726c;
                    if (arrayDeque != null) {
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            ((r) it.next()).b();
                        }
                    }
                    ArrayList arrayList2 = this.f37727d;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((r) it2.next()).b();
                        }
                    }
                    if (j0.this.f37711n && j0.this.f37713p == 0) {
                        j0.this.f37713p = this.f37728e;
                        j0.this.f37714q = SystemClock.uptimeMillis();
                        j0.this.f37715r = this.f37729f;
                        j0.this.f37716s = this.f37730g;
                        j0.this.f37717t = jUptimeMillis;
                        j0 j0Var = j0.this;
                        j0Var.f37718u = j0Var.f37714q;
                        j0.this.f37721x = this.f37731h;
                        U7.a.b(0L, "delayBeforeDispatchViewUpdates", 0, j0.this.f37713p * 1000000);
                        U7.a.h(0L, "delayBeforeDispatchViewUpdates", 0, j0.this.f37716s * 1000000);
                        U7.a.b(0L, "delayBeforeBatchRunStart", 0, j0.this.f37716s * 1000000);
                        U7.a.h(0L, "delayBeforeBatchRunStart", 0, j0.this.f37717t * 1000000);
                    }
                    j0.this.f37699b.e();
                    if (j0.this.f37708k != null) {
                        j0.this.f37708k.a();
                    }
                    U7.a.i(0L);
                } catch (Exception e11) {
                    j0.this.f37710m = true;
                    throw e11;
                }
            } catch (Throwable th3) {
                U7.a.i(0L);
                throw th3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            j0.this.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c extends v {

        /* JADX INFO: renamed from: c */
        private final int f37734c;

        /* JADX INFO: renamed from: d */
        private final boolean f37735d;

        /* JADX INFO: renamed from: e */
        private final boolean f37736e;

        public c(int i10, int i11, boolean z10, boolean z11) {
            super(i10);
            this.f37734c = i11;
            this.f37736e = z10;
            this.f37735d = z11;
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            if (this.f37736e) {
                j0.this.f37699b.d();
            } else {
                j0.this.f37699b.x(this.f37788a, this.f37734c, this.f37735d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d implements r {

        /* JADX INFO: renamed from: a */
        private final ReadableMap f37738a;

        /* JADX INFO: renamed from: b */
        private final Callback f37739b;

        /* synthetic */ d(j0 j0Var, ReadableMap readableMap, Callback callback, k0 k0Var) {
            this(readableMap, callback);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            j0.this.f37699b.g(this.f37738a, this.f37739b);
        }

        private d(ReadableMap readableMap, Callback callback) {
            this.f37738a = readableMap;
            this.f37739b = callback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class e extends v {

        /* JADX INFO: renamed from: c */
        private final C3284b0 f37741c;

        /* JADX INFO: renamed from: d */
        private final String f37742d;

        /* JADX INFO: renamed from: e */
        private final Q f37743e;

        public e(C3284b0 c3284b0, int i10, String str, Q q10) {
            super(i10);
            this.f37741c = c3284b0;
            this.f37742d = str;
            this.f37743e = q10;
            U7.a.l(0L, "createView", this.f37788a);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            U7.a.f(0L, "createView", this.f37788a);
            j0.this.f37699b.i(this.f37741c, this.f37788a, this.f37742d, this.f37743e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class f extends v implements g {

        /* JADX INFO: renamed from: c */
        private final int f37745c;

        /* JADX INFO: renamed from: d */
        private final ReadableArray f37746d;

        /* JADX INFO: renamed from: e */
        private int f37747e;

        public f(int i10, int i11, ReadableArray readableArray) {
            super(i10);
            this.f37747e = 0;
            this.f37745c = i11;
            this.f37746d = readableArray;
        }

        @Override // com.facebook.react.uimanager.j0.g
        public int a() {
            return this.f37747e;
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            try {
                j0.this.f37699b.j(this.f37788a, this.f37745c, this.f37746d);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(j0.f37697A, new RuntimeException("Error dispatching View Command", th2));
            }
        }

        @Override // com.facebook.react.uimanager.j0.g
        public void c() {
            this.f37747e++;
        }

        @Override // com.facebook.react.uimanager.j0.g
        public void d() {
            j0.this.f37699b.j(this.f37788a, this.f37745c, this.f37746d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface g {
        int a();

        void c();

        void d();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class h extends v implements g {

        /* JADX INFO: renamed from: c */
        private final String f37749c;

        /* JADX INFO: renamed from: d */
        private final ReadableArray f37750d;

        /* JADX INFO: renamed from: e */
        private int f37751e;

        public h(int i10, String str, ReadableArray readableArray) {
            super(i10);
            this.f37751e = 0;
            this.f37749c = str;
            this.f37750d = readableArray;
        }

        @Override // com.facebook.react.uimanager.j0.g
        public int a() {
            return this.f37751e;
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            try {
                j0.this.f37699b.k(this.f37788a, this.f37749c, this.f37750d);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(j0.f37697A, new RuntimeException("Error dispatching View Command", th2));
            }
        }

        @Override // com.facebook.react.uimanager.j0.g
        public void c() {
            this.f37751e++;
        }

        @Override // com.facebook.react.uimanager.j0.g
        public void d() {
            j0.this.f37699b.k(this.f37788a, this.f37749c, this.f37750d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class i extends AbstractChoreographerFrameCallbackC3296l {

        /* JADX INFO: renamed from: a */
        private final int f37753a;

        /* synthetic */ i(j0 j0Var, ReactContext reactContext, int i10, k0 k0Var) {
            this(reactContext, i10);
        }

        private void a(long j10) throws Exception {
            r rVar;
            while (16 - ((System.nanoTime() - j10) / 1000000) >= this.f37753a) {
                synchronized (j0.this.f37701d) {
                    try {
                        if (j0.this.f37707j.isEmpty()) {
                            return;
                        } else {
                            rVar = (r) j0.this.f37707j.pollFirst();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    rVar.b();
                    j0.this.f37712o += SystemClock.uptimeMillis() - jUptimeMillis;
                } catch (Exception e10) {
                    j0.this.f37710m = true;
                    throw e10;
                }
            }
        }

        @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC3296l
        public void doFrameGuarded(long j10) {
            if (j0.this.f37710m) {
                AbstractC7283a.I("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            U7.a.c(0L, "dispatchNonBatchedUIOperations");
            try {
                a(j10);
                U7.a.i(0L);
                j0.this.R();
                com.facebook.react.modules.core.b.h().k(b.a.f36985c, this);
            } catch (Throwable th2) {
                U7.a.i(0L);
                throw th2;
            }
        }

        private i(ReactContext reactContext, int i10) {
            super(reactContext);
            this.f37753a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class j implements r {

        /* JADX INFO: renamed from: a */
        private final int f37755a;

        /* JADX INFO: renamed from: b */
        private final float f37756b;

        /* JADX INFO: renamed from: c */
        private final float f37757c;

        /* JADX INFO: renamed from: d */
        private final Callback f37758d;

        /* synthetic */ j(j0 j0Var, int i10, float f10, float f11, Callback callback, k0 k0Var) {
            this(i10, f10, f11, callback);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            try {
                j0.this.f37699b.r(this.f37755a, j0.this.f37698a);
                float f10 = j0.this.f37698a[0];
                float f11 = j0.this.f37698a[1];
                int iM = j0.this.f37699b.m(this.f37755a, this.f37756b, this.f37757c);
                try {
                    j0.this.f37699b.r(iM, j0.this.f37698a);
                    this.f37758d.invoke(Integer.valueOf(iM), Float.valueOf(B.g(j0.this.f37698a[0] - f10)), Float.valueOf(B.g(j0.this.f37698a[1] - f11)), Float.valueOf(B.g(j0.this.f37698a[2])), Float.valueOf(B.g(j0.this.f37698a[3])));
                } catch (C3299o unused) {
                    this.f37758d.invoke(new Object[0]);
                }
            } catch (C3299o unused2) {
                this.f37758d.invoke(new Object[0]);
            }
        }

        private j(int i10, float f10, float f11, Callback callback) {
            this.f37755a = i10;
            this.f37756b = f10;
            this.f37757c = f11;
            this.f37758d = callback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class k extends v {

        /* JADX INFO: renamed from: c */
        private final int[] f37760c;

        /* JADX INFO: renamed from: d */
        private final m0[] f37761d;

        /* JADX INFO: renamed from: e */
        private final int[] f37762e;

        public k(int i10, int[] iArr, m0[] m0VarArr, int[] iArr2) {
            super(i10);
            this.f37760c = iArr;
            this.f37761d = m0VarArr;
            this.f37762e = iArr2;
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() throws Throwable {
            j0.this.f37699b.p(this.f37788a, this.f37760c, this.f37761d, this.f37762e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class l implements r {

        /* JADX INFO: renamed from: a */
        private final int f37764a;

        /* JADX INFO: renamed from: b */
        private final Callback f37765b;

        /* synthetic */ l(j0 j0Var, int i10, Callback callback, k0 k0Var) {
            this(i10, callback);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            try {
                j0.this.f37699b.s(this.f37764a, j0.this.f37698a);
                this.f37765b.invoke(Float.valueOf(B.g(j0.this.f37698a[0])), Float.valueOf(B.g(j0.this.f37698a[1])), Float.valueOf(B.g(j0.this.f37698a[2])), Float.valueOf(B.g(j0.this.f37698a[3])));
            } catch (C3299o unused) {
                this.f37765b.invoke(new Object[0]);
            }
        }

        private l(int i10, Callback callback) {
            this.f37764a = i10;
            this.f37765b = callback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class m implements r {

        /* JADX INFO: renamed from: a */
        private final int f37767a;

        /* JADX INFO: renamed from: b */
        private final Callback f37768b;

        /* synthetic */ m(j0 j0Var, int i10, Callback callback, k0 k0Var) {
            this(i10, callback);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            try {
                j0.this.f37699b.r(this.f37767a, j0.this.f37698a);
                this.f37768b.invoke(0, 0, Float.valueOf(B.g(j0.this.f37698a[2])), Float.valueOf(B.g(j0.this.f37698a[3])), Float.valueOf(B.g(j0.this.f37698a[0])), Float.valueOf(B.g(j0.this.f37698a[1])));
            } catch (C3299o unused) {
                this.f37768b.invoke(new Object[0]);
            }
        }

        private m(int i10, Callback callback) {
            this.f37767a = i10;
            this.f37768b = callback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class n extends v {
        public n(int i10) {
            super(i10);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            j0.this.f37699b.t(this.f37788a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class o extends v {

        /* JADX INFO: renamed from: c */
        private final int f37771c;

        /* synthetic */ o(j0 j0Var, int i10, int i11, k0 k0Var) {
            this(i10, i11);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            try {
                j0.this.f37699b.w(this.f37788a, this.f37771c);
            } catch (RetryableMountingLayerException e10) {
                ReactSoftExceptionLogger.logSoftException(j0.f37697A, e10);
            }
        }

        private o(int i10, int i11) {
            super(i10);
            this.f37771c = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class p implements r {

        /* JADX INFO: renamed from: a */
        private final boolean f37773a;

        /* synthetic */ p(j0 j0Var, boolean z10, k0 k0Var) {
            this(z10);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            j0.this.f37699b.y(this.f37773a);
        }

        private p(boolean z10) {
            this.f37773a = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class q implements r {

        /* JADX INFO: renamed from: a */
        private final InterfaceC3288d0 f37775a;

        public q(InterfaceC3288d0 interfaceC3288d0) {
            this.f37775a = interfaceC3288d0;
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            this.f37775a.a(j0.this.f37699b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface r {
        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class s extends v {

        /* JADX INFO: renamed from: c */
        private final int f37777c;

        /* JADX INFO: renamed from: d */
        private final int f37778d;

        /* JADX INFO: renamed from: e */
        private final int f37779e;

        /* JADX INFO: renamed from: f */
        private final int f37780f;

        /* JADX INFO: renamed from: g */
        private final int f37781g;

        /* JADX INFO: renamed from: h */
        private final com.facebook.yoga.h f37782h;

        public s(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
            super(i11);
            this.f37777c = i10;
            this.f37778d = i12;
            this.f37779e = i13;
            this.f37780f = i14;
            this.f37781g = i15;
            this.f37782h = hVar;
            U7.a.l(0L, "updateLayout", this.f37788a);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() throws Throwable {
            U7.a.f(0L, "updateLayout", this.f37788a);
            j0.this.f37699b.z(this.f37777c, this.f37788a, this.f37778d, this.f37779e, this.f37780f, this.f37781g, this.f37782h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class t extends v {

        /* JADX INFO: renamed from: c */
        private final Q f37784c;

        /* synthetic */ t(j0 j0Var, int i10, Q q10, k0 k0Var) {
            this(i10, q10);
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            j0.this.f37699b.B(this.f37788a, this.f37784c);
        }

        private t(int i10, Q q10) {
            super(i10);
            this.f37784c = q10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class u extends v {

        /* JADX INFO: renamed from: c */
        private final Object f37786c;

        public u(int i10, Object obj) {
            super(i10);
            this.f37786c = obj;
        }

        @Override // com.facebook.react.uimanager.j0.r
        public void b() {
            j0.this.f37699b.C(this.f37788a, this.f37786c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private abstract class v implements r {

        /* JADX INFO: renamed from: a */
        public int f37788a;

        public v(int i10) {
            this.f37788a = i10;
        }
    }

    static {
        W6.b.a("UIViewOperationQueue", W6.a.f20778b);
        f37697A = j0.class.getSimpleName();
    }

    public j0(ReactApplicationContext reactApplicationContext, C3308y c3308y, int i10) {
        this.f37699b = c3308y;
        this.f37702e = new i(reactApplicationContext, i10 == -1 ? 8 : i10);
        this.f37703f = reactApplicationContext;
    }

    public void R() {
        if (this.f37710m) {
            AbstractC7283a.I("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f37700c) {
            if (this.f37706i.isEmpty()) {
                return;
            }
            ArrayList arrayList = this.f37706i;
            this.f37706i = new ArrayList();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (this.f37711n) {
                this.f37719v = SystemClock.uptimeMillis() - jUptimeMillis;
                this.f37720w = this.f37712o;
                this.f37711n = false;
                U7.a.b(0L, "batchedExecutionTime", 0, jUptimeMillis * 1000000);
                U7.a.g(0L, "batchedExecutionTime", 0);
            }
            this.f37712o = 0L;
        }
    }

    public void A() {
        this.f37705h.add(new c(0, 0, true, false));
    }

    public void B(ReadableMap readableMap, Callback callback) {
        this.f37705h.add(new d(readableMap, callback));
    }

    public void C(C3284b0 c3284b0, int i10, String str, Q q10) {
        synchronized (this.f37701d) {
            this.f37722y++;
            this.f37707j.addLast(new e(c3284b0, i10, str, q10));
        }
    }

    public void D(int i10, int i11, ReadableArray readableArray) {
        this.f37704g.add(new f(i10, i11, readableArray));
    }

    public void E(int i10, String str, ReadableArray readableArray) {
        this.f37704g.add(new h(i10, str, readableArray));
    }

    public void F(int i10, float f10, float f11, Callback callback) {
        this.f37705h.add(new j(i10, f10, f11, callback));
    }

    public void G(int i10, int[] iArr, m0[] m0VarArr, int[] iArr2) {
        this.f37705h.add(new k(i10, iArr, m0VarArr, iArr2));
    }

    public void H(int i10, Callback callback) {
        this.f37705h.add(new m(i10, callback));
    }

    public void I(int i10, Callback callback) {
        this.f37705h.add(new l(i10, callback));
    }

    public void J(int i10) {
        this.f37705h.add(new n(i10));
    }

    public void K(int i10, int i11) {
        this.f37705h.add(new o(i10, i11));
    }

    public void L(int i10, int i11, boolean z10) {
        this.f37705h.add(new c(i10, i11, false, z10));
    }

    public void M(boolean z10) {
        this.f37705h.add(new p(z10));
    }

    public void N(InterfaceC3288d0 interfaceC3288d0) {
        this.f37705h.add(new q(interfaceC3288d0));
    }

    public void O(int i10, Object obj) {
        this.f37705h.add(new u(i10, obj));
    }

    public void P(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
        this.f37705h.add(new s(i10, i11, i12, i13, i14, i15, hVar));
    }

    public void Q(int i10, String str, Q q10) {
        this.f37723z++;
        this.f37705h.add(new t(i10, q10));
    }

    C3308y S() {
        return this.f37699b;
    }

    public Map T() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.f37713p));
        map.put("CommitEndTime", Long.valueOf(this.f37714q));
        map.put("LayoutTime", Long.valueOf(this.f37715r));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.f37716s));
        map.put("RunStartTime", Long.valueOf(this.f37717t));
        map.put("RunEndTime", Long.valueOf(this.f37718u));
        map.put("BatchedExecutionTime", Long.valueOf(this.f37719v));
        map.put("NonBatchedExecutionTime", Long.valueOf(this.f37720w));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(this.f37721x));
        map.put("CreateViewCount", Long.valueOf(this.f37722y));
        map.put("UpdatePropsCount", Long.valueOf(this.f37723z));
        return map;
    }

    public boolean U() {
        return this.f37705h.isEmpty() && this.f37704g.isEmpty();
    }

    void V() {
        this.f37709l = false;
        com.facebook.react.modules.core.b.h().n(b.a.f36985c, this.f37702e);
        R();
    }

    public void W(InterfaceC3288d0 interfaceC3288d0) {
        this.f37705h.add(0, new q(interfaceC3288d0));
    }

    public void X() {
        this.f37711n = true;
        this.f37713p = 0L;
        this.f37722y = 0L;
        this.f37723z = 0L;
    }

    void Y() {
        this.f37709l = true;
        com.facebook.react.modules.core.b.h().k(b.a.f36985c, this.f37702e);
    }

    public void Z(D7.a aVar) {
        this.f37708k = aVar;
    }

    public void y(int i10, View view) {
        this.f37699b.a(i10, view);
    }

    public void z(int i10, long j10, long j11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        U7.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates").a("batchId", i10).c();
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            ArrayDeque arrayDeque = null;
            if (this.f37704g.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = this.f37704g;
                this.f37704g = new ArrayList();
            }
            if (this.f37705h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList arrayList3 = this.f37705h;
                this.f37705h = new ArrayList();
                arrayList2 = arrayList3;
            }
            synchronized (this.f37701d) {
                try {
                    if (!this.f37707j.isEmpty()) {
                        arrayDeque = this.f37707j;
                        this.f37707j = new ArrayDeque();
                    }
                } finally {
                }
            }
            D7.a aVar = this.f37708k;
            if (aVar != null) {
                aVar.b();
            }
            a aVar2 = new a(i10, arrayList, arrayDeque, arrayList2, j10, j11, jUptimeMillis, jCurrentThreadTimeMillis);
            U7.b.a(0L, "acquiring mDispatchRunnablesLock").a("batchId", i10).c();
            synchronized (this.f37700c) {
                U7.a.i(0L);
                this.f37706i.add(aVar2);
            }
            if (!this.f37709l) {
                UiThreadUtil.runOnUiThread(new b(this.f37703f));
            }
            U7.a.i(0L);
        } catch (Throwable th2) {
            U7.a.i(0L);
            throw th2;
        }
    }
}
