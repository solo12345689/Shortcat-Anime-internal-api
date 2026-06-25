package bh;

import Fg.q;
import Hg.h;
import bh.AbstractC3054c;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
public class d implements Fg.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final short[] f33366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final short[] f33367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final short[] f33368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f33369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f33370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f33371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f33372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f33373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f33374o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3052a f33380f;

    static {
        short[] sArr = {4643, 13363, 20579, 25843, 29227, 31145, 32103, 32525, 32689, 32745, 32762, 32766, Short.MAX_VALUE};
        f33366g = sArr;
        short[] sArr2 = {5638, 15915, 23689, 28571, 31116, 32217, 32613, 32731, 32760, 32766, Short.MAX_VALUE};
        f33367h = sArr2;
        short[] sArr3 = {9142, 23462, 30338, 32361, 32725, 32765, Short.MAX_VALUE};
        f33368i = sArr3;
        f33369j = new d("frodokem640aes", 640, 15, 2, sArr, new h(128), new AbstractC3054c.a(640, 32768));
        f33370k = new d("frodokem640shake", 640, 15, 2, sArr, new h(128), new AbstractC3054c.b(640, 32768));
        f33371l = new d("frodokem976aes", 976, 16, 3, sArr2, new h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), new AbstractC3054c.a(976, 65536));
        f33372m = new d("frodokem976shake", 976, 16, 3, sArr2, new h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), new AbstractC3054c.b(976, 65536));
        f33373n = new d("frodokem1344aes", 1344, 16, 4, sArr3, new h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), new AbstractC3054c.a(1344, 65536));
        f33374o = new d("frodokem1344shake", 1344, 16, 4, sArr3, new h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER), new AbstractC3054c.b(1344, 65536));
    }

    private d(String str, int i10, int i11, int i12, short[] sArr, q qVar, AbstractC3054c abstractC3054c) {
        this.f33375a = str;
        this.f33376b = i10;
        this.f33377c = i11;
        this.f33378d = i12;
        this.f33379e = i12 * 64;
        this.f33380f = new C3052a(i10, i11, i12, sArr, qVar, abstractC3054c);
    }
}
