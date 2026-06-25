package com.revenuecat.purchases.ui.revenuecatui.components.video;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoPlaybackState;", "Landroid/os/Parcelable;", "", "positionMs", "", "playWhenReady", "<init>", "(IZ)V", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoPlaybackState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LTd/L;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getPositionMs", "Z", "getPlayWhenReady", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class VideoPlaybackState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VideoPlaybackState> CREATOR = new Creator();
    private final boolean playWhenReady;
    private final int positionMs;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoPlaybackState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoPlaybackState createFromParcel(Parcel parcel) {
            AbstractC5504s.h(parcel, "parcel");
            return new VideoPlaybackState(parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoPlaybackState[] newArray(int i10) {
            return new VideoPlaybackState[i10];
        }
    }

    public VideoPlaybackState(int i10, boolean z10) {
        this.positionMs = i10;
        this.playWhenReady = z10;
    }

    public static /* synthetic */ VideoPlaybackState copy$default(VideoPlaybackState videoPlaybackState, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = videoPlaybackState.positionMs;
        }
        if ((i11 & 2) != 0) {
            z10 = videoPlaybackState.playWhenReady;
        }
        return videoPlaybackState.copy(i10, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPositionMs() {
        return this.positionMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final VideoPlaybackState copy(int positionMs, boolean playWhenReady) {
        return new VideoPlaybackState(positionMs, playWhenReady);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPlaybackState)) {
            return false;
        }
        VideoPlaybackState videoPlaybackState = (VideoPlaybackState) other;
        return this.positionMs == videoPlaybackState.positionMs && this.playWhenReady == videoPlaybackState.playWhenReady;
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final int getPositionMs() {
        return this.positionMs;
    }

    public int hashCode() {
        return (Integer.hashCode(this.positionMs) * 31) + Boolean.hashCode(this.playWhenReady);
    }

    public String toString() {
        return "VideoPlaybackState(positionMs=" + this.positionMs + ", playWhenReady=" + this.playWhenReady + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC5504s.h(parcel, "out");
        parcel.writeInt(this.positionMs);
        parcel.writeInt(this.playWhenReady ? 1 : 0);
    }
}
