package com.swmansion.reanimated.keyboard;

import androidx.core.view.L0;
import com.facebook.react.uimanager.B;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class Keyboard {
    private static final int CONTENT_TYPE_MASK = L0.p.d();
    private static final int SYSTEM_BAR_TYPE_MASK = L0.p.i();
    private KeyboardState mState = KeyboardState.UNKNOWN;
    private int mHeight = 0;
    private int mActiveTransitionCounter = 0;

    public int getHeight() {
        return this.mHeight;
    }

    public KeyboardState getState() {
        return this.mState;
    }

    public void onAnimationEnd() {
        int i10 = this.mActiveTransitionCounter - 1;
        this.mActiveTransitionCounter = i10;
        if (i10 == 0) {
            this.mState = this.mHeight <= 0 ? KeyboardState.CLOSED : KeyboardState.OPEN;
        }
    }

    public void onAnimationStart() {
        int i10 = this.mActiveTransitionCounter;
        if (i10 > 0) {
            KeyboardState keyboardState = this.mState;
            KeyboardState keyboardState2 = KeyboardState.OPENING;
            if (keyboardState == keyboardState2) {
                keyboardState2 = KeyboardState.CLOSING;
            }
            this.mState = keyboardState2;
        } else {
            this.mState = this.mHeight <= 0 ? KeyboardState.OPENING : KeyboardState.CLOSING;
        }
        this.mActiveTransitionCounter = i10 + 1;
    }

    public void updateHeight(L0 l02, boolean z10) {
        int iG = (int) B.g(Math.max(0, l02.f(CONTENT_TYPE_MASK).f107d - (z10 ? 0 : l02.f(SYSTEM_BAR_TYPE_MASK).f107d)));
        if (iG > 0 || this.mState != KeyboardState.OPEN) {
            this.mHeight = iG;
        }
    }
}
