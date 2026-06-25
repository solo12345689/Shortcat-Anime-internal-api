package R8;

import R8.InterfaceC2109j;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: R8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2105f extends S8.a {
    public static final Parcelable.Creator<C2105f> CREATOR = new o0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Scope[] f15292o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final O8.c[] f15293p = new O8.c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f15294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f15295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f15296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f15297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IBinder f15298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Scope[] f15299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f15300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Account f15301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    O8.c[] f15302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    O8.c[] f15303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f15304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f15305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f15306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f15307n;

    C2105f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, O8.c[] cVarArr, O8.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f15292o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f15293p : cVarArr;
        cVarArr2 = cVarArr2 == null ? f15293p : cVarArr2;
        this.f15294a = i10;
        this.f15295b = i11;
        this.f15296c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f15297d = "com.google.android.gms";
        } else {
            this.f15297d = str;
        }
        if (i10 < 2) {
            this.f15301h = iBinder != null ? AbstractBinderC2100a.h(InterfaceC2109j.a.e(iBinder)) : null;
        } else {
            this.f15298e = iBinder;
            this.f15301h = account;
        }
        this.f15299f = scopeArr;
        this.f15300g = bundle;
        this.f15302i = cVarArr;
        this.f15303j = cVarArr2;
        this.f15304k = z10;
        this.f15305l = i13;
        this.f15306m = z11;
        this.f15307n = str2;
    }

    public String c() {
        return this.f15307n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        o0.a(this, parcel, i10);
    }
}
