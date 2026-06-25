.class public abstract LE2/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE2/k$d;,
        LE2/k$c;,
        LE2/k$b;,
        LE2/k$a;,
        LE2/k$e;
    }
.end annotation


# instance fields
.field final a:LE2/i;

.field final b:J

.field final c:J


# direct methods
.method public constructor <init>(LE2/i;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE2/k;->a:LE2/i;

    .line 5
    .line 6
    iput-wide p2, p0, LE2/k;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, LE2/k;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(LE2/j;)LE2/i;
    .locals 0

    .line 1
    iget-object p1, p0, LE2/k;->a:LE2/i;

    .line 2
    .line 3
    return-object p1
.end method

.method public b()J
    .locals 6

    .line 1
    iget-wide v0, p0, LE2/k;->c:J

    .line 2
    .line 3
    const-wide/32 v2, 0xf4240

    .line 4
    .line 5
    .line 6
    iget-wide v4, p0, LE2/k;->b:J

    .line 7
    .line 8
    invoke-static/range {v0 .. v5}, Lt2/a0;->m1(JJJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method
