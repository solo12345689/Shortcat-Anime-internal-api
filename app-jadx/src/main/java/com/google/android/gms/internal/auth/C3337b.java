package com.google.android.gms.internal.auth;

import P8.a;
import P8.e;
import Q8.AbstractC2070s;
import Q8.InterfaceC2066n;
import R8.AbstractC2115p;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3337b extends P8.e implements InterfaceC3342c1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a.g f39144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a.AbstractC0216a f39145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final P8.a f39146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final U8.a f39147o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f39148k;

    static {
        a.g gVar = new a.g();
        f39144l = gVar;
        V1 v12 = new V1();
        f39145m = v12;
        f39146n = new P8.a("GoogleAuthService.API", v12, gVar);
        f39147o = G8.d.a("GoogleAuthServiceClient");
    }

    C3337b(Context context) {
        super(context, f39146n, a.d.f13552O, e.a.f13564c);
        this.f39148k = context;
    }

    static /* bridge */ /* synthetic */ void y(Status status, Object obj, n9.j jVar) {
        if (AbstractC2070s.b(status, obj, jVar)) {
            return;
        }
        f39147o.e("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3342c1
    public final n9.i d(final C3352g c3352g) {
        return m(Q8.r.a().d(G8.e.f7408l).b(new InterfaceC2066n() { // from class: com.google.android.gms.internal.auth.U1
            @Override // Q8.InterfaceC2066n
            public final void accept(Object obj, Object obj2) {
                C3337b c3337b = this.f39128a;
                ((S1) ((P1) obj).C()).J3(new X1(c3337b, (n9.j) obj2), c3352g);
            }
        }).e(1513).a());
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3342c1
    public final n9.i f(final Account account, final String str, final Bundle bundle) {
        AbstractC2115p.m(account, "Account name cannot be null!");
        AbstractC2115p.g(str, "Scope cannot be null!");
        return m(Q8.r.a().d(G8.e.f7408l).b(new InterfaceC2066n() { // from class: com.google.android.gms.internal.auth.T1
            @Override // Q8.InterfaceC2066n
            public final void accept(Object obj, Object obj2) {
                C3337b c3337b = this.f39124a;
                ((S1) ((P1) obj).C()).K3(new W1(c3337b, (n9.j) obj2), account, str, bundle);
            }
        }).e(1512).a());
    }
}
