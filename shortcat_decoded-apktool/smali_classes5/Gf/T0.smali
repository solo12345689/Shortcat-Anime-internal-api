.class final LGf/T0;
.super LGf/H0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final e:LZd/e;


# direct methods
.method public constructor <init>(LZd/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LGf/H0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGf/T0;->e:LZd/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public v()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public w(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, LGf/T0;->e:LZd/e;

    .line 2
    .line 3
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 4
    .line 5
    sget-object v0, LTd/L;->a:LTd/L;

    .line 6
    .line 7
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
