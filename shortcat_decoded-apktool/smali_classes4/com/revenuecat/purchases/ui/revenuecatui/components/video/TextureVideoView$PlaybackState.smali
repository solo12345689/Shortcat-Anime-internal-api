.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PlaybackState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;",
        "",
        "positionMs",
        "",
        "playWhenReady",
        "",
        "(IZ)V",
        "getPlayWhenReady",
        "()Z",
        "getPositionMs",
        "()I",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final playWhenReady:Z

.field private final positionMs:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;->positionMs:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;->playWhenReady:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getPlayWhenReady()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;->playWhenReady:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getPositionMs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;->positionMs:I

    .line 2
    .line 3
    return v0
.end method
