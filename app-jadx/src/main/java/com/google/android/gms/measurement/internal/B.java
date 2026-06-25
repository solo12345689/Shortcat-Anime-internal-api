package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f40625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f40626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f40627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f40628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f40629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final E f40630f;

    B(X2 x22, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        E e10;
        AbstractC2115p.f(str2);
        AbstractC2115p.f(str3);
        this.f40625a = str2;
        this.f40626b = str3;
        this.f40627c = true == TextUtils.isEmpty(str) ? null : str;
        this.f40628d = j10;
        this.f40629e = j11;
        if (j11 != 0 && j11 > j10) {
            x22.a().r().b("Event created with reverse previous/current timestamps. appId", C3887q2.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            e10 = new E(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    x22.a().o().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objS = x22.C().s(next, bundle2.get(next));
                    if (objS == null) {
                        x22.a().r().b("Param value can't be null", x22.D().b(next));
                        it.remove();
                    } else {
                        x22.C().A(bundle2, next, objS);
                    }
                }
            }
            e10 = new E(bundle2);
        }
        this.f40630f = e10;
    }

    final B a(X2 x22, long j10) {
        return new B(x22, this.f40627c, this.f40625a, this.f40626b, this.f40628d, j10, this.f40630f);
    }

    public final String toString() {
        String string = this.f40630f.toString();
        String str = this.f40625a;
        int length = String.valueOf(str).length();
        String str2 = this.f40626b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    private B(X2 x22, String str, String str2, String str3, long j10, long j11, E e10) {
        AbstractC2115p.f(str2);
        AbstractC2115p.f(str3);
        AbstractC2115p.l(e10);
        this.f40625a = str2;
        this.f40626b = str3;
        this.f40627c = true == TextUtils.isEmpty(str) ? null : str;
        this.f40628d = j10;
        this.f40629e = j11;
        if (j11 != 0 && j11 > j10) {
            x22.a().r().c("Event created with reverse previous/current timestamps. appId, name", C3887q2.x(str2), C3887q2.x(str3));
        }
        this.f40630f = e10;
    }
}
