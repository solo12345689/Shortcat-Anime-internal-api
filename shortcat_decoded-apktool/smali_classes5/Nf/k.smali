.class final LNf/k;
.super LGf/K;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final c:LNf/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LNf/k;

    .line 2
    .line 3
    invoke-direct {v0}, LNf/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LNf/k;->c:LNf/k;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LGf/K;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public D1(LZd/i;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, LNf/c;->i:LNf/c;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, p2, v0, v1}, LNf/f;->d2(Ljava/lang/Runnable;ZZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public O1(LZd/i;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, LNf/c;->i:LNf/c;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, p2, v0, v0}, LNf/f;->d2(Ljava/lang/Runnable;ZZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public Z1(ILjava/lang/String;)LGf/K;
    .locals 1

    .line 1
    invoke-static {p1}, LLf/m;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, LNf/j;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    invoke-static {p0, p2}, LLf/m;->b(LGf/K;Ljava/lang/String;)LGf/K;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-super {p0, p1, p2}, LGf/K;->Z1(ILjava/lang/String;)LGf/K;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method
