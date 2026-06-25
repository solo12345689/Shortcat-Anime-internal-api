package com.amazon.device.iap.model;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class CoinsReward {
    private final int amount;

    protected CoinsReward(int i10) {
        this.amount = i10;
    }

    protected static final CoinsReward from(int i10) {
        if (i10 > 0) {
            return new CoinsReward(i10);
        }
        return null;
    }

    public int getAmount() {
        return this.amount;
    }
}
