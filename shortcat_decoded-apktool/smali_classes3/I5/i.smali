.class public LI5/i;
.super LI5/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LI5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static w()LI5/i;
    .locals 1

    .line 1
    new-instance v0, LI5/i;

    .line 2
    .line 3
    invoke-direct {v0}, LI5/i;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public o(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    invoke-super {p0, p1}, LI5/a;->o(Ljava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
