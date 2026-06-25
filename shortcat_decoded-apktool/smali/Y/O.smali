.class public final LY/O;
.super LY/b1;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:LY/P;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    new-instance v0, LY/N;

    .line 2
    .line 3
    invoke-direct {v0}, LY/N;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, LY/b1;-><init>(Lie/a;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, LY/P;

    .line 10
    .line 11
    invoke-direct {v0, p1}, LY/P;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LY/O;->b:LY/P;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic g()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, LY/O;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final h()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "Unexpected call to default provider"

    .line 2
    .line 3
    invoke-static {v0}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    new-instance v0, LTd/k;

    .line 7
    .line 8
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 9
    .line 10
    .line 11
    throw v0
.end method


# virtual methods
.method public bridge synthetic a()LY/n2;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/O;->i()LY/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Ljava/lang/Object;)LY/c1;
    .locals 8

    .line 1
    new-instance v0, LY/c1;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :goto_0
    move v3, v1

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :goto_1
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    invoke-direct/range {v0 .. v7}, LY/c1;-><init>(LY/D;Ljava/lang/Object;ZLY/T1;LY/C0;Lkotlin/jvm/functions/Function1;Z)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public i()LY/P;
    .locals 1

    .line 1
    iget-object v0, p0, LY/O;->b:LY/P;

    .line 2
    .line 3
    return-object v0
.end method
