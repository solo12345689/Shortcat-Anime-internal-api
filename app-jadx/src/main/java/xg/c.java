package Xg;

import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
public class c implements Fg.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f22025j = new c("bike128", 12323, 142, 134, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 5, 3, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f22026k = new c("bike192", 24659, 206, 199, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 5, 3, JfifUtil.MARKER_SOFn);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f22027l = new c("bike256", 40973, TiffUtil.TIFF_TAG_ORIENTATION, 264, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 5, 3, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f22036i;

    private c(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f22028a = str;
        this.f22029b = i10;
        this.f22030c = i11;
        this.f22031d = i12;
        this.f22032e = i13;
        this.f22033f = i14;
        this.f22034g = i15;
        this.f22035h = i16;
        this.f22036i = new a(i10, i11, i12, i13, i14, i15);
    }

    public String a() {
        return this.f22028a;
    }

    public int b() {
        return (this.f22029b + 7) / 8;
    }
}
