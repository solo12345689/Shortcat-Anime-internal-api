package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Bundle;
import j9.InterfaceC5355l;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3837j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f41379b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f41380c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f41381d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5355l f41382a;

    public C3837j2(InterfaceC5355l interfaceC5355l) {
        this.f41382a = interfaceC5355l;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC2115p.l(strArr);
        AbstractC2115p.l(strArr2);
        AbstractC2115p.l(atomicReference);
        AbstractC2115p.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f41382a.zza() ? str : g(str, j9.w.f51718c, j9.w.f51716a, f41379b);
    }

    protected final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f41382a.zza() ? str : g(str, j9.x.f51721b, j9.x.f51720a, f41380c);
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f41382a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, j9.y.f51725b, j9.y.f51724a, f41381d);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String d(G g10) {
        InterfaceC5355l interfaceC5355l = this.f41382a;
        if (!interfaceC5355l.zza()) {
            return g10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(g10.f40766c);
        sb2.append(",name=");
        sb2.append(a(g10.f40764a));
        sb2.append(",params=");
        E e10 = g10.f40765b;
        sb2.append(e10 == null ? null : !interfaceC5355l.zza() ? e10.toString() : e(e10.l()));
        return sb2.toString();
    }

    protected final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f41382a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append(com.amazon.a.a.o.b.f.f34695b);
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strE);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
