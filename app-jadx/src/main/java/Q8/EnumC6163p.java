package q8;

import android.util.SparseArray;

/* JADX INFO: renamed from: q8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6163p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseArray f57846h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57848a;

    static {
        EnumC6163p enumC6163p = DEFAULT;
        EnumC6163p enumC6163p2 = UNMETERED_ONLY;
        EnumC6163p enumC6163p3 = UNMETERED_OR_DAILY;
        EnumC6163p enumC6163p4 = FAST_IF_RADIO_AWAKE;
        EnumC6163p enumC6163p5 = NEVER;
        EnumC6163p enumC6163p6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f57846h = sparseArray;
        sparseArray.put(0, enumC6163p);
        sparseArray.put(1, enumC6163p2);
        sparseArray.put(2, enumC6163p3);
        sparseArray.put(3, enumC6163p4);
        sparseArray.put(4, enumC6163p5);
        sparseArray.put(-1, enumC6163p6);
    }

    EnumC6163p(int i10) {
        this.f57848a = i10;
    }
}
