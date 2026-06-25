.class public abstract Lo2/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a()Lo2/b;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LGf/M0;->b2()LGf/M0;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch LTd/s; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    sget-object v0, LZd/j;->a:LZd/j;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_1
    sget-object v0, LZd/j;->a:LZd/j;

    .line 14
    .line 15
    :goto_0
    new-instance v1, Lo2/b;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {v3, v2, v3}, LGf/X0;->b(LGf/C0;ILjava/lang/Object;)LGf/A;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v0, v2}, LZd/i;->w(LZd/i;)LZd/i;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {v1, v0}, Lo2/b;-><init>(LZd/i;)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method
