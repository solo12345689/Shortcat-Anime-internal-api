.class public Lio/sentry/android/core/performance/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:J

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lio/sentry/android/core/performance/i;->d:J

    .line 6
    .line 7
    return-void
.end method

.method public a(Lio/sentry/android/core/performance/i;)I
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->b:J

    .line 2
    .line 3
    iget-wide v2, p1, Lio/sentry/android/core/performance/i;->b:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/performance/i;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/performance/i;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->d:J

    .line 8
    .line 9
    iget-wide v2, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0

    .line 13
    :cond_0
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    return-wide v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lio/sentry/android/core/performance/i;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/sentry/android/core/performance/i;->a(Lio/sentry/android/core/performance/i;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h()Lio/sentry/o2;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/performance/i;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/android/core/performance/i;->k()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Lio/sentry/l;->i(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-direct {v0, v1, v2}, Lio/sentry/o3;-><init>(J)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method

.method public k()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/performance/i;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->b:J

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/android/core/performance/i;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    add-long/2addr v0, v2

    .line 14
    return-wide v0

    .line 15
    :cond_0
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    return-wide v0
.end method

.method public m()D
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/performance/i;->k()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-double v0, v0

    .line 6
    invoke-static {v0, v1}, Lio/sentry/l;->j(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public n()Lio/sentry/o2;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/performance/i;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lio/sentry/o3;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/android/core/performance/i;->p()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Lio/sentry/l;->i(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-direct {v0, v1, v2}, Lio/sentry/o3;-><init>(J)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method

.method public p()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public q()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->b:J

    .line 2
    .line 3
    long-to-double v0, v0

    .line 4
    invoke-static {v0, v1}, Lio/sentry/l;->j(D)D

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    return-wide v0
.end method

.method public r()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public s()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public t()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->d:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public u()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public v()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->d:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public w()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/sentry/android/core/performance/i;->a:Ljava/lang/String;

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 7
    .line 8
    iput-wide v0, p0, Lio/sentry/android/core/performance/i;->d:J

    .line 9
    .line 10
    iput-wide v0, p0, Lio/sentry/android/core/performance/i;->b:J

    .line 11
    .line 12
    return-void
.end method

.method public x(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    iget-wide v0, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 8
    .line 9
    sub-long/2addr p1, v0

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sub-long/2addr v0, p1

    .line 15
    iput-wide v0, p0, Lio/sentry/android/core/performance/i;->b:J

    .line 16
    .line 17
    return-void
.end method

.method public y(Ljava/lang/String;JJJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/core/performance/i;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-wide p2, p0, Lio/sentry/android/core/performance/i;->b:J

    .line 4
    .line 5
    iput-wide p4, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 6
    .line 7
    iput-wide p6, p0, Lio/sentry/android/core/performance/i;->d:J

    .line 8
    .line 9
    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lio/sentry/android/core/performance/i;->c:J

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Lio/sentry/android/core/performance/i;->b:J

    .line 12
    .line 13
    return-void
.end method
