.class final LE3/S1$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/S1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE3/S1$c;->a:I

    .line 5
    .line 6
    iput-wide p2, p0, LE3/S1$c;->b:J

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a(LE3/S1$c;)I
    .locals 0

    .line 1
    iget p0, p0, LE3/S1$c;->a:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic b(LE3/S1$c;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LE3/S1$c;->b:J

    .line 2
    .line 3
    return-wide v0
.end method
