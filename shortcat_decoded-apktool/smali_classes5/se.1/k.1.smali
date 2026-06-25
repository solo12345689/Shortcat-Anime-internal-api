.class public final Lse/k;
.super Lse/d0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final d:Lse/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lse/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lse/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lse/k;->d:Lse/k;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lse/d0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final T()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Lse/Y0;

    .line 2
    .line 3
    const-string v1, "Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lse/Y0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method


# virtual methods
.method public I()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-direct {p0}, Lse/k;->T()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public J(LXe/f;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lse/k;->T()Ljava/lang/Void;

    .line 7
    .line 8
    .line 9
    new-instance p1, LTd/k;

    .line 10
    .line 11
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 12
    .line 13
    .line 14
    throw p1
.end method

.method public K(I)Lye/Z;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public N(LXe/f;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lse/k;->T()Ljava/lang/Void;

    .line 7
    .line 8
    .line 9
    new-instance p1, LTd/k;

    .line 10
    .line 11
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 12
    .line 13
    .line 14
    throw p1
.end method

.method public j()Ljava/lang/Class;
    .locals 1

    .line 1
    invoke-direct {p0}, Lse/k;->T()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method
