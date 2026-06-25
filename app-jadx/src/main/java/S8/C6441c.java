package s8;

import android.content.Context;

/* JADX INFO: renamed from: s8.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6441c extends h {

    /* JADX INFO: renamed from: a */
    private final Context f59272a;

    /* JADX INFO: renamed from: b */
    private final B8.a f59273b;

    /* JADX INFO: renamed from: c */
    private final B8.a f59274c;

    /* JADX INFO: renamed from: d */
    private final String f59275d;

    C6441c(Context context, B8.a aVar, B8.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f59272a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f59273b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f59274c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f59275d = str;
    }

    @Override // s8.h
    public Context b() {
        return this.f59272a;
    }

    @Override // s8.h
    public String c() {
        return this.f59275d;
    }

    @Override // s8.h
    public B8.a d() {
        return this.f59274c;
    }

    @Override // s8.h
    public B8.a e() {
        return this.f59273b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f59272a.equals(hVar.b()) && this.f59273b.equals(hVar.e()) && this.f59274c.equals(hVar.d()) && this.f59275d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f59272a.hashCode() ^ 1000003) * 1000003) ^ this.f59273b.hashCode()) * 1000003) ^ this.f59274c.hashCode()) * 1000003) ^ this.f59275d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f59272a + ", wallClock=" + this.f59273b + ", monotonicClock=" + this.f59274c + ", backendName=" + this.f59275d + "}";
    }
}
