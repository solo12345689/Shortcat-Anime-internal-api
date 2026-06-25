.class public interface abstract LC2/P$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "f"
.end annotation


# static fields
.field public static final a:LC2/P$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC2/Z;

    .line 2
    .line 3
    invoke-direct {v0}, LC2/Z;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC2/P$f;->a:LC2/P$f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a(LC2/z$a;Lq2/c;ILandroid/content/Context;)Landroid/media/AudioTrack;
.end method

.method public b(I)I
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a0;->O(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
