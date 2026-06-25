package oc;

import Td.B;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import oc.InterfaceC5856e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements j, InterfaceC5856e, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaScriptTypedArray f55361a;

    public o(JavaScriptTypedArray rawArray) {
        AbstractC5504s.h(rawArray, "rawArray");
        this.f55361a = rawArray;
    }

    @Override // oc.i
    public JavaScriptTypedArray b() {
        return this.f55361a;
    }

    @Override // oc.j
    public int d() {
        return this.f55361a.d();
    }

    public byte e(int i10) {
        if (i10 < 0 || i10 >= getLength()) {
            throw new IndexOutOfBoundsException();
        }
        return B.b(f(i10));
    }

    public byte f(int i10) {
        return this.f55361a.readByte(i10);
    }

    @Override // oc.InterfaceC5856e
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return B.a(e(i10));
    }

    @Override // oc.j
    public int getLength() {
        return this.f55361a.getLength();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return InterfaceC5856e.a.a(this);
    }

    @Override // oc.j
    public ByteBuffer toDirectBuffer() {
        return this.f55361a.toDirectBuffer();
    }

    @Override // oc.j
    public void write(byte[] buffer, int i10, int i11) {
        AbstractC5504s.h(buffer, "buffer");
        this.f55361a.write(buffer, i10, i11);
    }
}
