package W0;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f20603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BreakIterator f20604b;

    public e(CharSequence charSequence) {
        this.f20603a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f20604b = characterInstance;
    }

    @Override // W0.b
    public int e(int i10) {
        return this.f20604b.following(i10);
    }

    @Override // W0.b
    public int f(int i10) {
        return this.f20604b.preceding(i10);
    }
}
