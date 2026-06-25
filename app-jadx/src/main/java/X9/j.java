package X9;

import R8.AbstractC2115p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends Exception {
    protected j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        AbstractC2115p.g(str, "Detail message must not be empty");
    }
}
