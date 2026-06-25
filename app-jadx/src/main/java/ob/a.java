package Ob;

import Y4.h;
import Y4.i;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f13113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13114j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, i iVar, String cacheKey) {
        super(str, iVar);
        AbstractC5504s.h(cacheKey, "cacheKey");
        this.f13113i = cacheKey;
    }

    private final String j() {
        String strC = super.c();
        AbstractC5504s.g(strC, "getCacheKey(...)");
        return strC;
    }

    @Override // Y4.h
    public String c() {
        return this.f13113i;
    }

    @Override // Y4.h, S4.f
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return AbstractC5504s.c(j(), aVar.j()) && e().equals(aVar.e());
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (AbstractC5504s.c(j(), hVar.c()) && e().equals(hVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // Y4.h, S4.f
    public int hashCode() {
        if (this.f13114j == 0) {
            int iHashCode = j().hashCode();
            this.f13114j = iHashCode;
            this.f13114j = (iHashCode * 31) + e().hashCode();
        }
        return this.f13114j;
    }
}
