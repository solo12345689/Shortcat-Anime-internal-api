package com.facebook.imagepipeline.memory;

import H6.E;
import H6.F;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends a implements B5.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f35984k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(B5.d memoryTrimmableRegistry, E poolParams, F poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        AbstractC5504s.h(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        AbstractC5504s.h(poolParams, "poolParams");
        AbstractC5504s.h(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f7970c;
        if (sparseIntArray != null) {
            this.f35984k = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f35984k[i10] = sparseIntArray.keyAt(i10);
            }
        } else {
            this.f35984k = new int[0];
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public byte[] h(int i10) {
        return new byte[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void l(byte[] value) {
        AbstractC5504s.h(value, "value");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int p(byte[] value) {
        AbstractC5504s.h(value, "value");
        return value.length;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f35984k) {
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
