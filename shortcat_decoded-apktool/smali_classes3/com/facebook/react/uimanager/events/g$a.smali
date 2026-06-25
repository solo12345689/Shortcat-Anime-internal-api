.class public final Lcom/facebook/react/uimanager/events/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/g$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/uimanager/events/g$a;ISS)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/events/g$a;->b(ISS)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method private final b(ISS)J
    .locals 5

    .line 1
    int-to-long v0, p1

    .line 2
    int-to-long p1, p2

    .line 3
    const-wide/32 v2, 0xffff

    .line 4
    .line 5
    .line 6
    and-long/2addr p1, v2

    .line 7
    const/16 v4, 0x20

    .line 8
    .line 9
    shl-long/2addr p1, v4

    .line 10
    or-long/2addr p1, v0

    .line 11
    int-to-long v0, p3

    .line 12
    and-long/2addr v0, v2

    .line 13
    const/16 p3, 0x30

    .line 14
    .line 15
    shl-long/2addr v0, p3

    .line 16
    or-long/2addr p1, v0

    .line 17
    return-wide p1
.end method
