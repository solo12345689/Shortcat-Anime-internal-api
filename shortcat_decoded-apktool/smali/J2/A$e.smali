.class final LJ2/A$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# static fields
.field public static final e:LJ2/A$e;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Lt2/N;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LJ2/A$e;

    .line 2
    .line 3
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, LJ2/A$e;-><init>(JJJ)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LJ2/A$e;->e:LJ2/A$e;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LJ2/A$e;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, LJ2/A$e;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, LJ2/A$e;->c:J

    .line 9
    .line 10
    new-instance p1, Lt2/N;

    .line 11
    .line 12
    invoke-direct {p1}, Lt2/N;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LJ2/A$e;->d:Lt2/N;

    .line 16
    .line 17
    return-void
.end method
