.class public abstract LGf/X0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LGf/C0;)LGf/A;
    .locals 1

    .line 1
    new-instance v0, LGf/W0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LGf/W0;-><init>(LGf/C0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(LGf/C0;ILjava/lang/Object;)LGf/A;
    .locals 0

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    invoke-static {p0}, LGf/X0;->a(LGf/C0;)LGf/A;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
