.class public abstract LGf/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LGf/n;LGf/h0;)V
    .locals 1

    .line 1
    new-instance v0, LGf/i0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LGf/i0;-><init>(LGf/h0;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, LGf/r;->c(LGf/n;LGf/m;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final b(LZd/e;)LGf/p;
    .locals 2

    .line 1
    instance-of v0, p0, LLf/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LGf/p;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, LLf/i;

    .line 14
    .line 15
    invoke-virtual {v0}, LLf/i;->k()LGf/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0}, LGf/p;->O()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    return-object v0

    .line 33
    :cond_3
    :goto_1
    new-instance v0, LGf/p;

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    invoke-direct {v0, p0, v1}, LGf/p;-><init>(LZd/e;I)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static final c(LGf/n;LGf/m;)V
    .locals 1

    .line 1
    instance-of v0, p0, LGf/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LGf/p;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LGf/p;->F(LGf/m;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    const-string p1, "third-party implementation of CancellableContinuation is not supported"

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method
