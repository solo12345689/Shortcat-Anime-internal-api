.class final LGf/t;
.super LGf/H0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final e:LGf/p;


# direct methods
.method public constructor <init>(LGf/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LGf/H0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGf/t;->e:LGf/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
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
    iget-object p1, p0, LGf/t;->e:LGf/p;

    .line 2
    .line 3
    invoke-virtual {p0}, LGf/H0;->u()LGf/I0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, LGf/p;->t(LGf/C0;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, LGf/p;->K(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
