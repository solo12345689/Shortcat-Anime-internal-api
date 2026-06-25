.class public final LGf/O0;
.super LZd/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LGf/C0;


# static fields
.field public static final b:LGf/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LGf/O0;

    .line 2
    .line 3
    invoke-direct {v0}, LGf/O0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LGf/O0;->b:LGf/O0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LGf/C0;->K:LGf/C0$b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LZd/a;-><init>(LZd/i$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public C(ZZLkotlin/jvm/functions/Function1;)LGf/h0;
    .locals 0

    .line 1
    sget-object p1, LGf/P0;->a:LGf/P0;

    .line 2
    .line 3
    return-object p1
.end method

.method public D()Ljava/util/concurrent/CancellationException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public H(Lkotlin/jvm/functions/Function1;)LGf/h0;
    .locals 0

    .line 1
    sget-object p1, LGf/P0;->a:LGf/P0;

    .line 2
    .line 3
    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public h0(LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public k(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public start()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public t1(LGf/w;)LGf/u;
    .locals 0

    .line 1
    sget-object p1, LGf/P0;->a:LGf/P0;

    .line 2
    .line 3
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonCancellable"

    .line 2
    .line 3
    return-object v0
.end method
