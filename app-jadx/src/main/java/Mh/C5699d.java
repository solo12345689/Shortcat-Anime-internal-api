package mh;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: mh.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5699d implements Fg.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C5699d f53719e = new C5699d("lightsaberkem128r3", 2, 128, false, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5699d f53720f = new C5699d("saberkem128r3", 3, 128, false, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5699d f53721g = new C5699d("firesaberkem128r3", 4, 128, false, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5699d f53722h = new C5699d("lightsaberkem192r3", 2, JfifUtil.MARKER_SOFn, false, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5699d f53723i = new C5699d("saberkem192r3", 3, JfifUtil.MARKER_SOFn, false, false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C5699d f53724j = new C5699d("firesaberkem192r3", 4, JfifUtil.MARKER_SOFn, false, false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5699d f53725k = new C5699d("lightsaberkem256r3", 2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, false, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5699d f53726l = new C5699d("saberkem256r3", 3, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, false, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5699d f53727m = new C5699d("firesaberkem256r3", 4, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, false, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5699d f53728n = new C5699d("lightsaberkem90sr3", 2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, true, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5699d f53729o = new C5699d("saberkem90sr3", 3, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, true, false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5699d f53730p = new C5699d("firesaberkem90sr3", 4, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, true, false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5699d f53731q = new C5699d("ulightsaberkemr3", 2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, false, true);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5699d f53732r = new C5699d("usaberkemr3", 3, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, false, true);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5699d f53733s = new C5699d("ufiresaberkemr3", 4, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, false, true);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C5699d f53734t = new C5699d("ulightsaberkem90sr3", 2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, true, true);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C5699d f53735u = new C5699d("usaberkem90sr3", 3, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, true, true);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C5699d f53736v = new C5699d("ufiresaberkem90sr3", 4, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5697b f53740d;

    public C5699d(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f53737a = str;
        this.f53738b = i10;
        this.f53739c = i11;
        this.f53740d = new C5697b(i10, i11, z10, z11);
    }
}
