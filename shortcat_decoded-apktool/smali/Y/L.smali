.class public final LY/L;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/v1;


# instance fields
.field private final a:LGf/O;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LGf/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/L;->a:LGf/O;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()LGf/O;
    .locals 1

    .line 1
    iget-object v0, p0, LY/L;->a:LGf/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/L;->a:LGf/O;

    .line 2
    .line 3
    instance-of v1, v0, LY/x1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LY/x1;

    .line 8
    .line 9
    invoke-virtual {v0}, LY/x1;->f()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, LY/r0;

    .line 14
    .line 15
    invoke-direct {v1}, LY/r0;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, LGf/P;->c(LGf/O;Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/L;->a:LGf/O;

    .line 2
    .line 3
    instance-of v1, v0, LY/x1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LY/x1;

    .line 8
    .line 9
    invoke-virtual {v0}, LY/x1;->f()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, LY/r0;

    .line 14
    .line 15
    invoke-direct {v1}, LY/r0;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, LGf/P;->c(LGf/O;Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
