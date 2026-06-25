package c5;

import U4.v;
import o5.k;

/* JADX INFO: renamed from: c5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3077b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f33514a;

    public C3077b(byte[] bArr) {
        this.f33514a = (byte[]) k.e(bArr);
    }

    @Override // U4.v
    public Class a() {
        return byte[].class;
    }

    @Override // U4.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f33514a;
    }

    @Override // U4.v
    public int getSize() {
        return this.f33514a.length;
    }

    @Override // U4.v
    public void recycle() {
    }
}
