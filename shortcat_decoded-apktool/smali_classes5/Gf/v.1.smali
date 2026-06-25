.class final LGf/v;
.super LGf/H0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LGf/u;


# instance fields
.field public final e:LGf/w;


# direct methods
.method public constructor <init>(LGf/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LGf/H0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGf/v;->e:LGf/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LGf/H0;->u()LGf/I0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LGf/I0;->K(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public getParent()LGf/C0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LGf/H0;->u()LGf/I0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public v()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public w(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, LGf/v;->e:LGf/w;

    .line 2
    .line 3
    invoke-virtual {p0}, LGf/H0;->u()LGf/I0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, LGf/w;->S(LGf/R0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
