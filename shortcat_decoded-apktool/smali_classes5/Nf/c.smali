.class public final LNf/c;
.super LNf/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final i:LNf/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LNf/c;

    .line 2
    .line 3
    invoke-direct {v0}, LNf/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LNf/c;->i:LNf/c;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 6

    .line 1
    sget v1, LNf/j;->c:I

    .line 2
    .line 3
    sget v2, LNf/j;->d:I

    .line 4
    .line 5
    sget-wide v3, LNf/j;->e:J

    .line 6
    .line 7
    sget-object v5, LNf/j;->a:Ljava/lang/String;

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, LNf/f;-><init>(IIJLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public Z1(ILjava/lang/String;)LGf/K;
    .locals 1

    .line 1
    invoke-static {p1}, LLf/m;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, LNf/j;->c:I

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

.method public close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object v0
.end method
