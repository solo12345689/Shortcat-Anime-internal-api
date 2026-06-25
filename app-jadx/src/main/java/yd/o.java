package yd;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f65051a;

    public o(String str) {
        this.f65051a = str;
    }

    public final String a() {
        return this.f65051a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && AbstractC5504s.c(this.f65051a, ((o) obj).f65051a);
    }

    public int hashCode() {
        String str = this.f65051a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ResponsePartHeaderData(signature=" + this.f65051a + ")";
    }
}
