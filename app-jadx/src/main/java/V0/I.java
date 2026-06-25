package V0;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class I implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f19603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19606d;

    public I(CharSequence charSequence, int i10, int i11) {
        this.f19603a = charSequence;
        this.f19604b = i10;
        this.f19605c = i11;
        this.f19606d = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f19606d;
        if (i10 == this.f19605c) {
            return (char) 65535;
        }
        return this.f19603a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f19606d = this.f19604b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f19604b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f19605c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f19606d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f19604b;
        int i11 = this.f19605c;
        if (i10 == i11) {
            this.f19606d = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f19606d = i12;
        return this.f19603a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f19606d + 1;
        this.f19606d = i10;
        int i11 = this.f19605c;
        if (i10 < i11) {
            return this.f19603a.charAt(i10);
        }
        this.f19606d = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f19606d;
        if (i10 <= this.f19604b) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f19606d = i11;
        return this.f19603a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f19604b;
        if (i10 > this.f19605c || i11 > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f19606d = i10;
        return current();
    }
}
