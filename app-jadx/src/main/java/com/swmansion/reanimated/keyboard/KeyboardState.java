package com.swmansion.reanimated.keyboard;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum KeyboardState {
    UNKNOWN(0),
    OPENING(1),
    OPEN(2),
    CLOSING(3),
    CLOSED(4);

    private final int mValue;

    KeyboardState(int i10) {
        this.mValue = i10;
    }

    public int asInt() {
        return this.mValue;
    }
}
