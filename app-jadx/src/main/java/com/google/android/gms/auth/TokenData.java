package com.google.android.gms.auth;

import R8.AbstractC2113n;
import R8.AbstractC2115p;
import S8.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class TokenData extends S8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f38843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f38845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f38847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f38848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f38849g;

    TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f38843a = i10;
        this.f38844b = AbstractC2115p.f(str);
        this.f38845c = l10;
        this.f38846d = z10;
        this.f38847e = z11;
        this.f38848f = list;
        this.f38849g = str2;
    }

    public final String c() {
        return this.f38844b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f38844b, tokenData.f38844b) && AbstractC2113n.a(this.f38845c, tokenData.f38845c) && this.f38846d == tokenData.f38846d && this.f38847e == tokenData.f38847e && AbstractC2113n.a(this.f38848f, tokenData.f38848f) && AbstractC2113n.a(this.f38849g, tokenData.f38849g);
    }

    public final int hashCode() {
        return AbstractC2113n.b(this.f38844b, this.f38845c, Boolean.valueOf(this.f38846d), Boolean.valueOf(this.f38847e), this.f38848f, this.f38849g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.j(parcel, 1, this.f38843a);
        c.q(parcel, 2, this.f38844b, false);
        c.o(parcel, 3, this.f38845c, false);
        c.c(parcel, 4, this.f38846d);
        c.c(parcel, 5, this.f38847e);
        c.r(parcel, 6, this.f38848f, false);
        c.q(parcel, 7, this.f38849g, false);
        c.b(parcel, iA);
    }
}
