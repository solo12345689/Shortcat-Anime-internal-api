package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.r;
import androidx.loader.app.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p2.AbstractC5918b;
import t.j0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c */
    static boolean f30285c = false;

    /* JADX INFO: renamed from: a */
    private final r f30286a;

    /* JADX INFO: renamed from: b */
    private final c f30287b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends A implements AbstractC5918b.a {

        /* JADX INFO: renamed from: l */
        private final int f30288l;

        /* JADX INFO: renamed from: m */
        private final Bundle f30289m;

        /* JADX INFO: renamed from: n */
        private final AbstractC5918b f30290n;

        /* JADX INFO: renamed from: o */
        private r f30291o;

        /* JADX INFO: renamed from: p */
        private C0520b f30292p;

        /* JADX INFO: renamed from: q */
        private AbstractC5918b f30293q;

        a(int i10, Bundle bundle, AbstractC5918b abstractC5918b, AbstractC5918b abstractC5918b2) {
            this.f30288l = i10;
            this.f30289m = bundle;
            this.f30290n = abstractC5918b;
            this.f30293q = abstractC5918b2;
            abstractC5918b.r(i10, this);
        }

        @Override // p2.AbstractC5918b.a
        public void a(AbstractC5918b abstractC5918b, Object obj) {
            if (b.f30285c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(obj);
                return;
            }
            if (b.f30285c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        @Override // androidx.lifecycle.AbstractC2870y
        protected void j() {
            if (b.f30285c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f30290n.u();
        }

        @Override // androidx.lifecycle.AbstractC2870y
        protected void k() {
            if (b.f30285c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f30290n.v();
        }

        @Override // androidx.lifecycle.AbstractC2870y
        public void m(B b10) {
            super.m(b10);
            this.f30291o = null;
            this.f30292p = null;
        }

        @Override // androidx.lifecycle.A, androidx.lifecycle.AbstractC2870y
        public void n(Object obj) {
            super.n(obj);
            AbstractC5918b abstractC5918b = this.f30293q;
            if (abstractC5918b != null) {
                abstractC5918b.s();
                this.f30293q = null;
            }
        }

        AbstractC5918b o(boolean z10) {
            if (b.f30285c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f30290n.b();
            this.f30290n.a();
            C0520b c0520b = this.f30292p;
            if (c0520b != null) {
                m(c0520b);
                if (z10) {
                    c0520b.d();
                }
            }
            this.f30290n.w(this);
            if ((c0520b == null || c0520b.c()) && !z10) {
                return this.f30290n;
            }
            this.f30290n.s();
            return this.f30293q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f30288l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f30289m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f30290n);
            this.f30290n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f30292p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f30292p);
                this.f30292p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        AbstractC5918b q() {
            return this.f30290n;
        }

        void r() {
            r rVar = this.f30291o;
            C0520b c0520b = this.f30292p;
            if (rVar == null || c0520b == null) {
                return;
            }
            super.m(c0520b);
            h(rVar, c0520b);
        }

        AbstractC5918b s(r rVar, a.InterfaceC0519a interfaceC0519a) {
            C0520b c0520b = new C0520b(this.f30290n, interfaceC0519a);
            h(rVar, c0520b);
            B b10 = this.f30292p;
            if (b10 != null) {
                m(b10);
            }
            this.f30291o = rVar;
            this.f30292p = c0520b;
            return this.f30290n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f30288l);
            sb2.append(" : ");
            Class<?> cls = this.f30290n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C0520b implements B {

        /* JADX INFO: renamed from: a */
        private final AbstractC5918b f30294a;

        /* JADX INFO: renamed from: b */
        private final a.InterfaceC0519a f30295b;

        /* JADX INFO: renamed from: c */
        private boolean f30296c = false;

        C0520b(AbstractC5918b abstractC5918b, a.InterfaceC0519a interfaceC0519a) {
            this.f30294a = abstractC5918b;
            this.f30295b = interfaceC0519a;
        }

        @Override // androidx.lifecycle.B
        public void a(Object obj) {
            if (b.f30285c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f30294a + ": " + this.f30294a.d(obj));
            }
            this.f30296c = true;
            this.f30295b.b(this.f30294a, obj);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f30296c);
        }

        boolean c() {
            return this.f30296c;
        }

        void d() {
            if (this.f30296c) {
                if (b.f30285c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f30294a);
                }
                this.f30295b.c(this.f30294a);
            }
        }

        public String toString() {
            return this.f30295b.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c extends U {

        /* JADX INFO: renamed from: c */
        private static final W.c f30297c = new a();

        /* JADX INFO: renamed from: a */
        private j0 f30298a = new j0();

        /* JADX INFO: renamed from: b */
        private boolean f30299b = false;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a implements W.c {
            a() {
            }

            @Override // androidx.lifecycle.W.c
            public U create(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c c(X x10) {
            return (c) new W(x10, f30297c).a(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f30298a.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f30298a.m(); i10++) {
                    a aVar = (a) this.f30298a.n(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f30298a.i(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void b() {
            this.f30299b = false;
        }

        a d(int i10) {
            return (a) this.f30298a.f(i10);
        }

        boolean e() {
            return this.f30299b;
        }

        void f() {
            int iM = this.f30298a.m();
            for (int i10 = 0; i10 < iM; i10++) {
                ((a) this.f30298a.n(i10)).r();
            }
        }

        void g(int i10, a aVar) {
            this.f30298a.j(i10, aVar);
        }

        void h() {
            this.f30299b = true;
        }

        @Override // androidx.lifecycle.U
        protected void onCleared() {
            super.onCleared();
            int iM = this.f30298a.m();
            for (int i10 = 0; i10 < iM; i10++) {
                ((a) this.f30298a.n(i10)).o(true);
            }
            this.f30298a.c();
        }
    }

    b(r rVar, X x10) {
        this.f30286a = rVar;
        this.f30287b = c.c(x10);
    }

    private AbstractC5918b e(int i10, Bundle bundle, a.InterfaceC0519a interfaceC0519a, AbstractC5918b abstractC5918b) {
        try {
            this.f30287b.h();
            AbstractC5918b abstractC5918bA = interfaceC0519a.a(i10, bundle);
            if (abstractC5918bA == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (abstractC5918bA.getClass().isMemberClass() && !Modifier.isStatic(abstractC5918bA.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + abstractC5918bA);
            }
            a aVar = new a(i10, bundle, abstractC5918bA, abstractC5918b);
            if (f30285c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f30287b.g(i10, aVar);
            this.f30287b.b();
            return aVar.s(this.f30286a, interfaceC0519a);
        } catch (Throwable th2) {
            this.f30287b.b();
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f30287b.a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public AbstractC5918b c(int i10, Bundle bundle, a.InterfaceC0519a interfaceC0519a) {
        if (this.f30287b.e()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarD = this.f30287b.d(i10);
        if (f30285c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarD == null) {
            return e(i10, bundle, interfaceC0519a, null);
        }
        if (f30285c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarD);
        }
        return aVarD.s(this.f30286a, interfaceC0519a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f30287b.f();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f30286a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
