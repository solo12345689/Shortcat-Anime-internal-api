.class public abstract Lwd/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lwd/b;JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p3, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    long-to-double p1, p1

    .line 8
    long-to-double p3, p3

    .line 9
    div-double/2addr p1, p3

    .line 10
    invoke-interface {p0, p1, p2}, Lwd/b;->c(D)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
