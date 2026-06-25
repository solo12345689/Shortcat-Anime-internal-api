package gh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
public class e implements Fg.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f47505d = new e("ML-KEM-512", 2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f47506e = new e("ML-KEM-768", 3, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f47507f = new e("ML-KEM-1024", 4, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47510c;

    private e(String str, int i10, int i11) {
        this.f47508a = str;
        this.f47509b = i10;
        this.f47510c = i11;
    }

    public C4886b a() {
        return new C4886b(this.f47509b);
    }

    public String b() {
        return this.f47508a;
    }
}
