package expo.modules.video.records;

import Ef.a;
import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\b\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lexpo/modules/video/records/PlayerBuilderOptions;", "Ljc/b;", "Ljava/io/Serializable;", "LEf/a;", "seekBackwardIncrement", "seekForwardIncrement", "<init>", "(LEf/a;LEf/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LEf/a;", "getSeekBackwardIncrement-FghU774", "()LEf/a;", "setSeekBackwardIncrement-BwNAW2A", "(LEf/a;)V", "getSeekBackwardIncrement-FghU774$annotations", "()V", "getSeekForwardIncrement-FghU774", "setSeekForwardIncrement-BwNAW2A", "getSeekForwardIncrement-FghU774$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlayerBuilderOptions implements InterfaceC5364b, Serializable {
    private a seekBackwardIncrement;
    private a seekForwardIncrement;

    public /* synthetic */ PlayerBuilderOptions(a aVar, a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2);
    }

    /* JADX INFO: renamed from: getSeekBackwardIncrement-FghU774, reason: not valid java name and from getter */
    public final a getSeekBackwardIncrement() {
        return this.seekBackwardIncrement;
    }

    /* JADX INFO: renamed from: getSeekForwardIncrement-FghU774, reason: not valid java name and from getter */
    public final a getSeekForwardIncrement() {
        return this.seekForwardIncrement;
    }

    /* JADX INFO: renamed from: setSeekBackwardIncrement-BwNAW2A, reason: not valid java name */
    public final void m944setSeekBackwardIncrementBwNAW2A(a aVar) {
        this.seekBackwardIncrement = aVar;
    }

    /* JADX INFO: renamed from: setSeekForwardIncrement-BwNAW2A, reason: not valid java name */
    public final void m945setSeekForwardIncrementBwNAW2A(a aVar) {
        this.seekForwardIncrement = aVar;
    }

    private PlayerBuilderOptions(a aVar, a aVar2) {
        this.seekBackwardIncrement = aVar;
        this.seekForwardIncrement = aVar2;
    }

    public /* synthetic */ PlayerBuilderOptions(a aVar, a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : aVar2, null);
    }

    @InterfaceC5363a
    /* JADX INFO: renamed from: getSeekBackwardIncrement-FghU774$annotations, reason: not valid java name */
    public static /* synthetic */ void m940getSeekBackwardIncrementFghU774$annotations() {
    }

    @InterfaceC5363a
    /* JADX INFO: renamed from: getSeekForwardIncrement-FghU774$annotations, reason: not valid java name */
    public static /* synthetic */ void m941getSeekForwardIncrementFghU774$annotations() {
    }
}
