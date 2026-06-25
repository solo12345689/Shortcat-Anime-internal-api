package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class P3 extends AbstractC3495j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O9.t f39540b;

    P3(Context context, O9.t tVar) {
        this.f39539a = context;
        this.f39540b = tVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3495j4
    final Context a() {
        return this.f39539a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3495j4
    final O9.t b() {
        return this.f39540b;
    }

    public final boolean equals(Object obj) {
        O9.t tVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3495j4) {
            AbstractC3495j4 abstractC3495j4 = (AbstractC3495j4) obj;
            if (this.f39539a.equals(abstractC3495j4.a()) && ((tVar = this.f39540b) != null ? tVar.equals(abstractC3495j4.b()) : abstractC3495j4.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f39539a.hashCode() ^ 1000003;
        O9.t tVar = this.f39540b;
        return (iHashCode * 1000003) ^ (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        String string = this.f39539a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f39540b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
