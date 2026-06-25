package com.android.billingclient.api;

import N4.C1961a;
import N4.C1966f;
import N4.C1968h;
import N4.InterfaceC1962b;
import N4.InterfaceC1964d;
import N4.InterfaceC1965e;
import N4.InterfaceC1967g;
import N4.InterfaceC1969i;
import N4.InterfaceC1971k;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.android.billingclient.api.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3156a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0594a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile C3162g f35358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f35359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile N4.m f35360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile boolean f35361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f35362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f35363f;

        /* synthetic */ C0594a(Context context, N4.K k10) {
            this.f35359b = context;
        }

        private final boolean d() {
            try {
                Context context = this.f35359b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }

        public AbstractC3156a a() {
            Context context = this.f35359b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f35360c == null) {
                if (this.f35361d || this.f35362e) {
                    return d() ? new T(null, context, null, null, this) : new C3157b(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f35358a == null || !this.f35358a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f35360c == null) {
                C3162g c3162g = this.f35358a;
                return d() ? new T(null, c3162g, context, null, null, null, this) : new C3157b(null, c3162g, context, null, null, null, this);
            }
            C3162g c3162g2 = this.f35358a;
            N4.m mVar = this.f35360c;
            return d() ? new T(null, c3162g2, context, mVar, null, null, null, this) : new C3157b(null, c3162g2, context, mVar, null, null, null, this);
        }

        public C0594a b(C3162g c3162g) {
            this.f35358a = c3162g;
            return this;
        }

        public C0594a c(N4.m mVar) {
            this.f35360c = mVar;
            return this;
        }
    }

    public static C0594a h(Context context) {
        return new C0594a(context, null);
    }

    public abstract void a(C1961a c1961a, InterfaceC1962b interfaceC1962b);

    public abstract void b(C1966f c1966f, InterfaceC1967g interfaceC1967g);

    public abstract void c();

    public abstract void d(C1968h c1968h, InterfaceC1965e interfaceC1965e);

    public abstract C3160e e(String str);

    public abstract boolean f();

    public abstract C3160e g(Activity activity, C3159d c3159d);

    public abstract void i(C3164i c3164i, InterfaceC1971k interfaceC1971k);

    public abstract void j(N4.o oVar, N4.l lVar);

    public abstract C3160e k(Activity activity, C3161f c3161f, InterfaceC1969i interfaceC1969i);

    public abstract void l(InterfaceC1964d interfaceC1964d);
}
