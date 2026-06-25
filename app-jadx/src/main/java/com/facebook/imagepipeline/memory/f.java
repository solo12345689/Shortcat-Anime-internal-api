package com.facebook.imagepipeline.memory;

import H6.E;
import H6.F;
import H6.v;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f35985k;

    f(B5.d dVar, E e10, F f10) {
        super(dVar, e10, f10);
        SparseIntArray sparseIntArray = (SparseIntArray) k.g(e10.f7970c);
        this.f35985k = new int[sparseIntArray.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f35985k;
            if (i10 >= iArr.length) {
                t();
                return;
            } else {
                iArr[i10] = sparseIntArray.keyAt(i10);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void l(v vVar) {
        k.g(vVar);
        vVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int p(v vVar) {
        k.g(vVar);
        return vVar.getSize();
    }

    int D() {
        return this.f35985k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean v(v vVar) {
        k.g(vVar);
        return !vVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f35985k) {
            if (i11 >= i10) {
                return i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int q(int i10) {
        return i10;
    }
}
