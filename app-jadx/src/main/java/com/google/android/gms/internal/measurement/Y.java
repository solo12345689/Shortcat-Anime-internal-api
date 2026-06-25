package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y extends AbstractC3455f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39683e;

    /* synthetic */ Y(String str, boolean z10, int i10, V v10, W w10, int i11, byte[] bArr) {
        this.f39681c = str;
        this.f39682d = i10;
        this.f39683e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3455f0
    public final String a() {
        return this.f39681c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3455f0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3455f0
    public final V c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3455f0
    public final W d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3455f0
    public final int e() {
        return this.f39682d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3455f0) {
            AbstractC3455f0 abstractC3455f0 = (AbstractC3455f0) obj;
            if (this.f39681c.equals(abstractC3455f0.a())) {
                abstractC3455f0.b();
                int i10 = this.f39682d;
                int iE = abstractC3455f0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    abstractC3455f0.c();
                    abstractC3455f0.d();
                    int i11 = this.f39683e;
                    int iF = abstractC3455f0.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3455f0
    public final int f() {
        return this.f39683e;
    }

    public final int hashCode() {
        int iHashCode = this.f39681c.hashCode() ^ 1000003;
        int i10 = this.f39682d;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f39683e != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f39682d;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f39683e == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f39681c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
