package f5;

import P4.a;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: f5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4775b implements a.InterfaceC0215a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V4.d f46862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V4.b f46863b;

    public C4775b(V4.d dVar, V4.b bVar) {
        this.f46862a = dVar;
        this.f46863b = bVar;
    }

    @Override // P4.a.InterfaceC0215a
    public void a(Bitmap bitmap) {
        this.f46862a.c(bitmap);
    }

    @Override // P4.a.InterfaceC0215a
    public byte[] b(int i10) {
        V4.b bVar = this.f46863b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // P4.a.InterfaceC0215a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f46862a.e(i10, i11, config);
    }

    @Override // P4.a.InterfaceC0215a
    public int[] d(int i10) {
        V4.b bVar = this.f46863b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // P4.a.InterfaceC0215a
    public void e(byte[] bArr) {
        V4.b bVar = this.f46863b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // P4.a.InterfaceC0215a
    public void f(int[] iArr) {
        V4.b bVar = this.f46863b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
