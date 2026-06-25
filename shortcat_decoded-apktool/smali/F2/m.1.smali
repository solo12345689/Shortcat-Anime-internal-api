.class public interface abstract LF2/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF2/m$a;
    }
.end annotation


# direct methods
.method public static e(LF2/m;LF2/m;)V
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1, v0}, LF2/m;->g(LF2/t$a;)V

    .line 8
    .line 9
    .line 10
    :cond_1
    if-eqz p0, :cond_2

    .line 11
    .line 12
    invoke-interface {p0, v0}, LF2/m;->h(LF2/t$a;)V

    .line 13
    .line 14
    .line 15
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/UUID;
.end method

.method public abstract b()Z
.end method

.method public abstract c()LF2/m$a;
.end method

.method public abstract d()Lz2/b;
.end method

.method public abstract f()Ljava/util/Map;
.end method

.method public abstract g(LF2/t$a;)V
.end method

.method public abstract getState()I
.end method

.method public abstract h(LF2/t$a;)V
.end method

.method public abstract i(Ljava/lang/String;)Z
.end method
